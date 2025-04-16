package br.fecapoop.lanchefacil;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResumoDoPedido extends AppCompatActivity {

    private TextView text;
    private Button voltar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resumo_do_pedido);

        text = findViewById(R.id.textPedido);
        voltar = findViewById(R.id.btnVoltar);

        Bundle bundle = getIntent().getExtras();
        String nome = bundle.getString("nome");
        String pedido = bundle.getString("pedido");

        text.setText("Olá "+ nome + " seu pedido é um "+ pedido);

        voltar.setOnClickListener(v -> {
            Intent voltar = new Intent(this, MainActivity.class);
            startActivity(voltar);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}