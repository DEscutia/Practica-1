package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends AppCompatActivity {
    Button btn;
    Contacto obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn = findViewById(R.id.btnGuardar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bitacora", "Presione el boton");
                String nombre = ((EditText) findViewById(R.id.txtNombre)).getText().toString();
                String email = ((EditText) findViewById(R.id.txtEmail)).getText().toString();
                String twitter = ((EditText) findViewById(R.id.txtTwitter)).getText().toString();
                String fechaDeNacimiento = ((EditText) findViewById(R.id.txtNacimiento)).getText().toString();
                String numero = ((EditText) findViewById(R.id.txtTel)).getText().toString();

                obj = new Contacto(nombre,email,twitter,numero,fechaDeNacimiento);

                Intent i = new Intent(second.this,MainActivity.class);
                Bundle b = new Bundle();
                b.putSerializable("contacto",obj);
                i.putExtras(b);

                setResult(RESULT_OK,i);

                finish();
            }
        });
    }
}
