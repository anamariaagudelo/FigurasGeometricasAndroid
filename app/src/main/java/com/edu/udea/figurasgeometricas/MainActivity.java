package com.edu.udea.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double perimetro, area, numero, volumen;
    private EditText eCuadrado, eCirculo, eTriangulo, eCubo;
    private RadioButton rCuadrado, rCirculo, rTriangulo, rCubo;
    private TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eCuadrado = (EditText) findViewById(R.id.eCuadro);
        eCirculo = (EditText) findViewById(R.id.eCirculo);
        eTriangulo = (EditText) findViewById(R.id.eTriangulo);
        eCubo = (EditText) findViewById(R.id.eCubo);
        rCuadrado = (RadioButton) findViewById(R.id.rCuadrado);
        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCubo = (RadioButton) findViewById(R.id.rCubo);
        tResultado = (TextView) findViewById(R.id.tResultado);
    }

    public void Calcular(View view) {

        if (rCuadrado.isChecked()) {
            eCirculo.setText("");
            eTriangulo.setText("");
            eCubo.setText("");
            if (eCuadrado.getText().equals("")) {
                tResultado.setText("Debe ingresar el valor del lado del cuadrado");
            } else{
                numero = Double.parseDouble(eCuadrado.getText().toString());
                area = numero * numero;
                perimetro = 4 * numero;
                tResultado.setText("Area:" + area + "\nPerimetro:" + perimetro);
            }
        }
        if (rCirculo.isChecked()) {
            eCuadrado.setText("");
            eTriangulo.setText("");
            eCubo.setText("");
            if (eCirculo.getText().equals("")) {
                tResultado.setText("Debe ingresar el radio del circulo");
            } else {
                numero = Double.parseDouble(eCirculo.getText().toString());
                area = 3.14159265358979323846 * (numero * numero);
                perimetro = 2 * 3.14159265358979323846 * numero;
                tResultado.setText("Area:" + area + "\nPerimetro:" + perimetro);

            }
        }

        if (rTriangulo.isChecked()) {
            eCirculo.setText("");
            eCuadrado.setText("");
            eCubo.setText("");
            if (eTriangulo.getText().equals("")) {
                tResultado.setText("Debe ingresar el valor del lado del triangulo equilatero");

            } else {
                numero = Double.parseDouble(eTriangulo.getText().toString());
                perimetro = 3 * numero;
                area = 0.43301270189 * (numero * numero);
                tResultado.setText("Area:" + area + "\nPerimetro:" + perimetro);
            }
        }

        if (rCubo.isChecked()) {
            eCirculo.setText("");
            eTriangulo.setText("");
            eCuadrado.setText("");
            if (eCubo.getText().equals("")) {
                tResultado.setText("Debe ingresar el valor del lado del cubo perfecto");

            } else {
                numero = Double.parseDouble(eCubo.getText().toString());
                area = 6 * (numero * numero);
                volumen = (numero * numero * numero);
                tResultado.setText("Area:" + area + "\nVolumen:" + volumen);
            }

        }
    }

}

