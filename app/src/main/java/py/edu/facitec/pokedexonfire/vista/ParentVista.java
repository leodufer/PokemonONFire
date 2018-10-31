package py.edu.facitec.pokedexonfire.vista;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import py.edu.facitec.pokedexonfire.R;
import py.edu.facitec.pokedexonfire.presentador.ParentPresentador;

public class ParentVista<T> extends AppCompatActivity implements Vista<T> {

    public ParentPresentador presentador;
    public ProgressBar progressBar;
    public View statusError;

    @Override
    public void showSuccess(List<T> result) {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showSuccess(T result) {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showError(String error) {
        progressBar.setVisibility(View.GONE);
        statusError.setVisibility(View.VISIBLE);
    }
}
