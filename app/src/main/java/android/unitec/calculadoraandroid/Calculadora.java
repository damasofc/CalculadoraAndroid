package android.unitec.calculadoraandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    private EditText n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        n1 = (EditText)findViewById(R.id.n1);
        n2 = (EditText)findViewById(R.id.n2);
    }
    public void sumar(View v){
        try {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int sum = num1 + num2;
            mostrar(sum);
        }
        catch (Exception e){
            mostrarError();
        }
    }
    public void restar(View v){
        try {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int restar = num1 - num2;
            mostrar(restar);
        }
        catch (Exception e){
            mostrarError();
        }
    }
    public void dividir(View v){
        try {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int div = num1 / num2;
            mostrar(div);
        }
        catch (Exception e){
            mostrarError();
        }
    }
    public void multiplicar(View v){
        try {
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            int mult = num1 * num2;
            mostrar(mult);
        }
        catch (Exception e){
            mostrarError();
        }
    }
    private void mostrarError(){
        n1.setText(" ");
        n2.setText(" ");
        Toast.makeText(this,"Porfavor ingrese los valores, o ingrese valores corrrectos",Toast.LENGTH_LONG).show();
    }
    private void mostrar(int res){
        Toast.makeText(this,"Resultado es: " + res,Toast.LENGTH_LONG).show();
    }
}
