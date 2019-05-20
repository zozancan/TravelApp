package com.zozancan.travelapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText edt_full_name;
    EditText edt_mail;
    EditText edt_password;
    Button btn_sign_up;
    Button btn_facebook;
    TextView txt_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getCardView();
        getSpannableClick();

        final Button btnSignUp = findViewById(R.id.btn_sign_up);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                Toast.makeText(getApplicationContext(), "Hesabınız başarıyla oluşturuldu , Lütfen giriş yapınız!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    private void getSpannableClick() {
        TextView signIn = findViewById(R.id.txt_sign_in);
        Spannable span = Spannable.Factory.getInstance().newSpannable("Already have an account? Sign In");

// All the rest will have the same spannable.
        ClickableSpan cs = new ClickableSpan() {
            @Override
            public void onClick(View v) {
                Log.d("main", "textview clicked");
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        };


// set the " Sign In" spannable
        span.setSpan(cs, 25, span.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        signIn.setText(span);

        signIn.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void getCardView() {
        edt_full_name = findViewById(R.id.edt_full_name);
        edt_mail = findViewById(R.id.edt_mail);
        edt_password = findViewById(R.id.edt_password);

    }
}
