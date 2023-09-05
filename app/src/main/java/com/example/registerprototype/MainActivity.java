package com.example.registerprototype;

import androidx.appcompat.app.AppCompatActivity;

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
    public void btnClick(View view){
        TextView txtName=findViewById(R.id.textView1);
        TextView txtDept=findViewById(R.id.textView2);
        TextView txtEmail=findViewById(R.id.textView3);
        EditText editName=findViewById(R.id.name);
        EditText editDept=findViewById(R.id.department);
        EditText editEmail=findViewById(R.id.email);
        txtName.setText(editName.getText().toString());
        txtDept.setText(editDept.getText().toString());
        txtEmail.setText(editEmail.getText().toString());
    }
}