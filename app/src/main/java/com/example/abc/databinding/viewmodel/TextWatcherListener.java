package com.example.abc.databinding.viewmodel;

import android.text.Editable;

/**
 * Created by ABC on 1/17/2018.
 */

public abstract class TextWatcherListener implements android.text.TextWatcher {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }
    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        onTextChange(charSequence);
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

    public abstract void onTextChange(CharSequence charSequence);
}
