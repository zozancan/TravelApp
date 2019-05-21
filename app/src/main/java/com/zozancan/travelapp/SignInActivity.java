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
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSpannableClick();


        final Button btnSignIn = findViewById(R.id.btn_sign_in);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    private void getSpannableClick() {
        TextView signUp = findViewById(R.id.txt_sign_up);
        Spannable span = Spannable.Factory.getInstance().newSpannable("Don't have an account? Sign Up");

// All the rest will have the same spannable.
        ClickableSpan cs = new ClickableSpan() {
            @Override
            public void onClick(View v) {
                Log.d("main", "textview clicked");
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        };


// set the " Sign In" spannable
        span.setSpan(cs, 23, span.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        signUp.setText(span);

        signUp.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
