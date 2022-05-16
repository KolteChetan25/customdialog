package com.expert.customdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtUsername, edtPassword;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.BtnLogin);
        btnLogin.setOnClickListener(new BtnLoginClickListener());

    }
    private class BtnLoginClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Dialog loginDialog = new Dialog(MainActivity.this);
            loginDialog.setContentView(R.layout.login_dialog);

            edtUsername = loginDialog.findViewById(R.id.edtUsername);
            edtPassword = loginDialog.findViewById(R.id.edtPassword);
            btnSignIn = loginDialog.findViewById(R.id.btnSignIn);

            btnSignIn.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(edtUsername.getText().toString().equals("Chetankolte")&& edtPassword.getText().toString().equals("Chetan@21")){
                                mt("Login Success");
                                loginDialog.dismiss();
                            }
                            else{
                                mt("Login Failed..");
                            }
                        }
                    }
            );

            loginDialog.show();
        }
        private void mt(String text){
            Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
        }
    }
}