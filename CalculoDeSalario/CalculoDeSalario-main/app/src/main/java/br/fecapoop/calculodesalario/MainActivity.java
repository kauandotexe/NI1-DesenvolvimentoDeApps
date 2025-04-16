package br.fecapoop.calculodesalario;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnSet;
    private RadioGroup RG;
    private RadioButton rb40;
    private RadioButton rb45;
    private RadioButton rb50;
    private TextView textResultado;
    private EditText etSalario;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnSet = findViewById(R.id.btnSet);
        RG = findViewById(R.id.RadioGroup);
        rb40 = findViewById(R.id.rb40);
        rb45 = findViewById(R.id.rb45);
        rb50 = findViewById(R.id.rb50);
        textResultado = findViewById(R.id.textResultado);
        etSalario = findViewById(R.id.editTextSalario);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void enviar(View view){
        RadioButton();
    }

    public void RadioButton(){
        String valorTexto = etSalario.getText().toString();
        float Salario = Float.parseFloat(valorTexto);


        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rb40){
                    textResultado.setText("O novo salário é: R$" + Salario*1.4F);
                }
                if (checkedId == R.id.rb45){
                    textResultado.setText("O novo salário é: R$" + Salario*1.45F);
                }
                if (checkedId == R.id.rb50){
                    textResultado.setText("O novo salário é: R$" + Salario*1.50F);
                }
            }
        });
    }
}
