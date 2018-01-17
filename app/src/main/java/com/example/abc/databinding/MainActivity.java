package com.example.abc.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.abc.databinding.databinding.ActivityMainBinding;
import com.example.abc.databinding.viewmodel.LoginViewModel;
import com.jakewharton.rxbinding.widget.RxTextView;

/**
 * Created by ABC on 1/15/2018.
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(new LoginViewModel());
    }

}
