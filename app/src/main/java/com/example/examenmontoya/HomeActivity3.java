package com.example.examenmontoya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class HomeActivity3 extends AppCompatActivity {
    private Button snackbarButton;
    private Button dialogButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home3);
        snackbarButton=findViewById(R.id.btn_snackbar);
        dialogButton = findViewById(R.id.btn_alert_dialog);

        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Snackbar snackbar=Snackbar.make(view, "Miau, gracias por querer adoptar", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //
                    }
                });
                snackbar.show();
            }
        });
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(HomeActivity3.this);
                builder.setTitle("Gatos");
                builder.setMessage("Adopta un gato y dale un hogar.");
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.show();
            }
        });
    }
    public void boton(View v){
        Intent intent = new Intent(HomeActivity3.this, HomeActivity2.class);
        startActivity(intent);
        finish();
    }
}