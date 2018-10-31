package py.edu.facitec.pokedexonfire.servicio;

import java.util.List;

import py.edu.facitec.pokedexonfire.modelo.Pokemon;
import retrofit.Callback;
import retrofit.http.GET;

public interface PokemonServicio {
    @GET("/pokemon")
    void obtenerPokemones(Callback<List<Pokemon>> callback);
}
