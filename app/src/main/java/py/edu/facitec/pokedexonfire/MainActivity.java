package py.edu.facitec.pokedexonfire;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import py.edu.facitec.pokedexonfire.modelo.Pokemon;
import py.edu.facitec.pokedexonfire.presentador.PokemonPresentador;
import py.edu.facitec.pokedexonfire.vista.ParentVista;


public class MainActivity extends ParentVista<Pokemon> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressbar);
        statusError = findViewById(R.id.statuserror);
        presentador = new PokemonPresentador(this);
        presentador.getData();
    }

    @Override
    public void showSuccess(List<Pokemon> result) {
        super.showSuccess(result);
    }
}
