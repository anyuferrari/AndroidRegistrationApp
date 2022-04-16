package com.example.registration;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("SetTextI18n")
    public void register(View view) {
        TextView nameOutput = findViewById(R.id.nameText);
        EditText name = findViewById(R.id.nameInput);
        String nameString = name.getText().toString();
        nameOutput.setText("Name: " + nameString);

        TextView lastNameOutput = findViewById(R.id.lastNameText);
        EditText lastName = findViewById(R.id.lastNInput);
        String lastNameString = lastName.getText().toString();
        lastNameOutput.setText("Last name: " + lastNameString);

        TextView emailOutput = findViewById(R.id.emailText);
        EditText email = findViewById(R.id.emailInput);
        String emailString = email.getText().toString();
        emailOutput.setText("Email: " + emailString);
    }
}