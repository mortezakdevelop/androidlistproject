package com.example.firtstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    CheckBox java;
    CheckBox css;
    CheckBox html;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/iran_sans.ttf");
        bind();
        firstName.setTypeface(typeface);
        lastName.setTypeface(typeface);
        java.setTypeface(typeface);
        css.setTypeface(typeface);
        html.setTypeface(typeface);


        java.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(ProfileActivity.this, String.valueOf(b), Toast.LENGTH_SHORT).show();
            }
        });


        firstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(ProfileActivity.this, editable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        

    }

    void bind() {
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        java = findViewById(R.id.java);
        css = findViewById(R.id.css);
        html = findViewById(R.id.html);


        findViewById(R.id.back_button).setOnClickListener(V -> {
            finish();
        });

        findViewById(R.id.edit).setOnClickListener(V -> {
            Toast.makeText(this, "روی دکمه کلیک شد", Toast.LENGTH_LONG).show();
        });
    }
}