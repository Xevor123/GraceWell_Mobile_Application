package com.example.myapplication.ui.rateus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentRateusBinding;

public class RateusFragment extends Fragment {

    private FragmentRateusBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RateusViewModel rateusViewModel =
                new ViewModelProvider(this).get(RateusViewModel.class);

        binding = FragmentRateusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textrateus;
        rateusViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}