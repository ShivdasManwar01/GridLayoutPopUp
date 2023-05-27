package com.example.gridlayoutpopup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button hello,hii,adios,hola;
    String name="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup("Hello"+name);
            }
        });
        hii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup("Hii"+name);
            }
        });
        adios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup("Adios"+name);
            }
        });
        hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup("Hola"+name);
            }
        });
    }
    public void init(){
        hello=findViewById(R.id.hello);
        hola=findViewById(R.id.hola);
        hii=findViewById(R.id.hii);
        adios=findViewById(R.id.adios);
    }
    private void showPopup(String str){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Message").setMessage(str).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}