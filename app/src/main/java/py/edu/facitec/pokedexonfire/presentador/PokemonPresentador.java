package py.edu.facitec.pokedexonfire.presentador;

import java.util.List;

import py.edu.facitec.pokedexonfire.modelo.Pokemon;
import py.edu.facitec.pokedexonfire.servicio.PokemonServicio;
import py.edu.facitec.pokedexonfire.vista.Vista;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class PokemonPresentador extends ParentPresentador<Pokemon> implements Callback<List<Pokemon>> {

    public PokemonPresentador(Vista<Pokemon> vista) {
        super(vista, null);
    }

    @Override
    public void getData() {
        PokemonServicio servicio = restAdapter.create(PokemonServicio.class);
        servicio.obtenerPokemones(this);
    }

    @Override
    public void success(List<Pokemon> pokemon, Response response) {
        vista.showSuccess(pokemon);
    }

    @Override
    public void failure(RetrofitError error) {
        vista.showError(error.getLocalizedMessage());
    }
}
