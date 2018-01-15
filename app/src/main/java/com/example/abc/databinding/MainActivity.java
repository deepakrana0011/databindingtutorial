package com.example.abc.databinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.abc.databinding.databinding.ActivityMainBinding;
import com.example.abc.databinding.model.User;
import com.jakewharton.rxbinding.view.RxView;

/**
 * Created by ABC on 1/15/2018.
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        buttonClick();
    }

    public void buttonClick() {
        RxView.clicks(binding.buttonLogin).subscribe(aVoid -> {
            Toast.makeText(MainActivity.this, "RxView.clicks", Toast.LENGTH_SHORT).show();
        });
    }
}
