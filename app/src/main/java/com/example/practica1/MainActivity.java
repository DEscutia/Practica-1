package com.example.practica1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> nombres = new ArrayList<String>();
    private ListView lv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;

        btn=  findViewById(R.id.btnAgregar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,second.class);

                startActivityForResult(i,1000);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



        if( requestCode == 1000){
            if (resultCode==RESULT_OK){
                Bundle b = data.getExtras();
                Contacto obj;
                if (b != null){
                    obj = (Contacto) b.getSerializable("contacto");
                    nombres.add(obj.getNombre()+ "\n"+ obj.getEmail());
                }else{
                    Log.i("Bitacora", "Objeto vacio");
                }
            }
        }

        lv1 = (ListView) findViewById(R.id.lv1);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_contactos, nombres);
        lv1.setAdapter(adapter);
    }


}
