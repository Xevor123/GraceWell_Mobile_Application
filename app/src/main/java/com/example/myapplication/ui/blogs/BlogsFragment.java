package com.example.myapplication.ui.blogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentBlogBinding;

public class BlogsFragment extends Fragment {

    private FragmentBlogBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BlogsViewModel blogsViewModel =
                new ViewModelProvider(this).get(BlogsViewModel.class);

        binding = FragmentBlogBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textblog;
        blogsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}