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
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int sum = num1 + num2;
        mostrar(sum);
    }
    public void restar(View v){
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int restar = num1 - num2;
        mostrar(restar);
    }
    private void mostrar(int res){
        Toast.makeText(this,"Resultado es: " + res,Toast.LENGTH_LONG).show();
    }
}
