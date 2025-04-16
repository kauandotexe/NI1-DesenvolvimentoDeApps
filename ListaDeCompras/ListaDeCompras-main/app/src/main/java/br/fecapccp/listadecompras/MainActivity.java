package br.fecapccp.listadecompras;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbArroz;
    private CheckBox cbLeite;
    private CheckBox cbCarne;
    private CheckBox cbFeijao;
    private CheckBox cbRefrigerante;

    private Button btnSet;
    private TextView textTotal;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        cbArroz = findViewById(R.id.cbArroz);
        cbLeite = findViewById(R.id.cbLeite);
        cbCarne = findViewById(R.id.cbCarne);
        cbFeijao = findViewById(R.id.cbFeijao);
        cbRefrigerante = findViewById(R.id.cbRefrigerante);

        btnSet = findViewById(R.id.btnCalcular);
        textTotal = findViewById(R.id.textResult);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void enviar (View view){
        CheckBox();
    }

    public void CheckBox() {
        float Total = 0.0F;
        float precoArroz = 2.69F;
        float precoLeite = 2.70F;
        float precoCarne = 16.70F;
        float precoFeijao = 3.38F;
        float precoRefrigerante = 3.00F;

        if (cbArroz.isChecked()){
            Total += precoArroz;
        }
        if (cbLeite.isChecked()){
            Total += precoLeite;
        }
        if (cbCarne.isChecked()){
            Total += precoCarne;
        }
        if (cbFeijao.isChecked()){
            Total += precoFeijao;
        }
        if (cbRefrigerante.isChecked()){
            Total += precoRefrigerante;
        }

        String totalFormatado = String.format("Total: R$%.2f", Total);
        textTotal.setText(totalFormatado);

    }
}