package br.fecapoop.lanchefacil;

package br.com.lanchefacil.lanchefacilsistema;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormularioDoPedido extends AppCompatActivity {

    private CheckBox cbHamburguer, cbMaladeza, cbTrem, cbXTudo, cbXNada;
    private TextView textTotal;
    private Button buttonConcluir;
    private EditText campoNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_formulario_do_pedido);

        cbHamburguer = findViewById(R.id.cbHamburguer);
        cbMaladeza = findViewById(R.id.cbMaladeza);
        cbTrem = findViewById(R.id.cbTrem);
        cbXTudo = findViewById(R.id.cbXTudo);
        cbXNada = findViewById(R.id.cbXNada);
        buttonConcluir = findViewById(R.id.button);

        campoNome = findViewById(R.id.editTextNome);


        buttonConcluir.setOnClickListener(v -> {

            if(cbHamburguer.isChecked()) {
                Intent tela = new Intent(FormularioDoPedido.this, ResumoDoPedido.class);
                tela.putExtra("pedido", cbHamburguer.getText().toString());
                tela.putExtra("nome", campoNome.getText().toString());
                startActivity(tela);
            }
            else if(cbMaladeza.isChecked()){
                Intent tela = new Intent(FormularioDoPedido.this, ResumoDoPedido.class);
                tela.putExtra("pedido", cbMaladeza.getText().toString());
                tela.putExtra("nome", campoNome.getText().toString());
                startActivity(tela);
            }
            else if(cbTrem.isChecked()){
                Intent tela = new Intent(FormularioDoPedido.this, ResumoDoPedido.class);
                tela.putExtra("pedido", cbTrem.getText().toString());
                tela.putExtra("nome", campoNome.getText().toString());
                startActivity(tela);
            }
            else if(cbXTudo.isChecked()){
                Intent tela = new Intent(FormularioDoPedido.this, ResumoDoPedido.class);
                tela.putExtra("pedido", cbXTudo.getText().toString());
                tela.putExtra("nome", campoNome.getText().toString());
                startActivity(tela);
            }
            else if(cbXNada.isChecked()){
                Intent tela = new Intent(FormularioDoPedido.this, ResumoDoPedido.class);
                tela.putExtra("pedido", cbXNada.getText().toString());
                tela.putExtra("nome", campoNome.getText().toString());
                startActivity(tela);
            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}





