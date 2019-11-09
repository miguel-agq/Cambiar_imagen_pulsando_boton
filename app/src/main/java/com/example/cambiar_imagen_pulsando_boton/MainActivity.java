package com.example.cambiar_imagen_pulsando_boton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView texto = (TextView) findViewById(R.id.textView);
        texto.setText("Pulsa para llamar a Jesse Pinkman");

        final ImageView boton = (ImageView) findViewById(R.id.boton);
        boton.setImageResource(R.drawable.boton1);

        final ImageView imagen = (ImageView) findViewById(R.id.imagen);
        imagen.setImageResource(R.drawable.jesse1);

        boton.setOnClickListener(new View.OnClickListener() {
            boolean click = false;

            public void onClick(View v) {
                click = !click;

                if (click) {
                    texto.setText("Pulsa para llamar a Jesse Pinkman");
                    boton.setImageResource(R.drawable.boton1);
                    imagen.setImageResource(R.drawable.jesse1);

                } else {
                    texto.setText("Llamando a Jesse Pinkman ...");
                    boton.setImageResource(R.drawable.boton2);
                    imagen.setImageResource(R.drawable.jesse2);
                }
            }
        });
    }
}
