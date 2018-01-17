package com.example.abc.databinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import com.example.abc.databinding.BR;

/**
 * Created by ABC on 1/15/2018.
 */

public class LoginViewModel extends BaseObservable {
    ObservableField<String> userName = new ObservableField<>("");
    ObservableField<String> userLastName = new ObservableField<>("");

    String errorMessage = "dummy";

    @Bindable
    public ObservableField<String> getUserName() {
        return userName;
    }



    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        notifyPropertyChanged(BR.errorMessage);
    }


    @Bindable
    public String getErrorMessage() {
        return errorMessage;
    }

    @Bindable
    public ObservableField<String> getUserLastName() {
        return userLastName;
    }

    public void buttonClick(View v) {
        if (userName.get().length() < 6) {
            errorMessage = "name must contain 6 letters";
            setErrorMessage(errorMessage);
        }
    }


    //<editor-fold desc="this  is used to check the change in the edittextfield">
   /* public TextWatcher firstNameTextWatcher = new TextWatcherListener() {
        @Override
        public void onTextChange(CharSequence charSequence) {
            Log.e("Text after change", charSequence + "");
        }
    };*/
    //</editor-fold>


}
