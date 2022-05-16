package com.expert.customdialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class LoginDialog extends Dialog {
    private EditText edtUsername,edtPassword;
    private Button btnSignIn;

    public LoginDialog(@NonNull Context context){
        super(context);
        setContentView(R.layout.login_dialog);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new BtnSignInClickListener()
        );
    }
    private class BtnSignInClickListener implements View.OnClickListener{
        public void onClick(View v){
            if(edtUsername.getText().toString().equals("Chetankolte")&& edtPassword.getText().toString().equals("Chetan@21")){
                mt("Login Success");
                dismiss();
            }
            else{
                mt("Login Failed..");
            }
        }
    }
    private void mt(String text){
        Toast.makeText(getContext(),text,Toast.LENGTH_LONG).show();
    }
}
