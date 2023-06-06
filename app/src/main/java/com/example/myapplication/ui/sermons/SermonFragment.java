package com.example.myapplication.ui.sermons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.myapplication.databinding.FragmentSermonBinding;

public class SermonFragment extends Fragment {

    private FragmentSermonBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SermonViewModel sermonViewModel =
                new ViewModelProvider(this).get(SermonViewModel.class);

        binding = FragmentSermonBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSermon;
        sermonViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}