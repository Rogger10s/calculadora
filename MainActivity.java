package com.example.roger.calculadora;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    TextView entrada;
    double dato1=0.0, dato2, resultado;
    boolean bandera=true;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    //public void inform
    public void cero(View view) {

        entrada = (TextView) findViewById(R.id.txtDatos);
        if(bandera=false)
            entrada.setText("");
        entrada.setText(entrada.getText() + "0");
    }

    public void uno(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "1");
    }

    public void dos(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "2");
    }

    public void tres(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "3");
    }

    public void cuatro(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "4");
    }

    public void cinco(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "5");
    }

    public void seis(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "6");
    }

    public void siete(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);

        // String cadena= entrada.getText().toString();
        entrada.setText(entrada.getText() + "7");

    }

    public void ocho(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "8");
    }

    public void nueve(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "9");
    }

    public void suma(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "+");
    }

    public void resta(View View) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "-");

    }

    public void multiplicacion(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "*");
    }

    public void division(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + "/");
    }

    public void coma(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        entrada.setText(entrada.getText() + ".");
    }

    public void borrar(View view) {

        entrada.setText("");
        dato1 = dato2 = resultado = 0.0;
    }

    public void igual(View view) {
        entrada = (TextView) findViewById(R.id.txtDatos);
        String cadena = entrada.getText().toString();
        String numero1 = "", operador = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != '+' && cadena.charAt(i) != '-' && cadena.charAt(i) != '*' && cadena.charAt(i) != '/' && cadena.charAt(i) != ' ') {

                    numero1 = numero1 + cadena.charAt(i);

            } else {
                    operador = cadena.charAt(i)+"";
                    dato1 = Double.parseDouble(numero1);
                    numero1 = "";
            }
        }
        dato2=Double.parseDouble(numero1);
        if (operador.equals("+")) {
            resultado = dato1 + dato2;
        }
        if (operador.equals("-")) {
            resultado = dato1 - dato2;
        }
        if (operador.equals("*")) {
            resultado = dato1 * dato2;
        }
        if (operador.equals("/")) {
            resultado = dato1 / dato2;
        }
        entrada.setText(resultado+ "");
        bandera=false;

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.roger.calculadora/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.roger.calculadora/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
