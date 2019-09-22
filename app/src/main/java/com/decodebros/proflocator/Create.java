package com.decodebros.proflocator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class Create extends AppCompatActivity {

    EditText name, college, location;
    Button submit;
    Spinner department, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        name = findViewById(R.id.name);
        college = findViewById(R.id.college);
        department = findViewById(R.id.department);
        location = findViewById(R.id.location);
        year = findViewById(R.id.year);
        final account acc = new account(this);


        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acc.name = name.getText().toString();
                acc.department = department.getSelectedItem().toString();
                acc.college = college.getText().toString();
                acc.location = location.getText().toString();
                acc.year = year.getSelectedItem().toString();
                acc.write();
            }
        });

    }
}
