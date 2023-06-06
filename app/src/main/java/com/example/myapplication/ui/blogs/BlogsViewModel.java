package com.example.myapplication.ui.blogs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BlogsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BlogsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Blogs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}