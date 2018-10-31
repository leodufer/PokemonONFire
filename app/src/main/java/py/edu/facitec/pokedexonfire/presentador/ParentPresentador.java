package py.edu.facitec.pokedexonfire.presentador;

import py.edu.facitec.pokedexonfire.vista.Vista;
import retrofit.Callback;
import retrofit.RestAdapter;

public abstract class ParentPresentador<T>{

    Vista<T> vista;
    RestAdapter restAdapter;
    private final String END_POINT = "https://simple-pokemon.herokuapp.com";

    public ParentPresentador(Vista<T> vista, String endpointAlt){
        this.vista = vista;
        if(endpointAlt==null)
            restAdapter = new RestAdapter.Builder().setEndpoint(END_POINT).build();
        else
            restAdapter = new RestAdapter.Builder().setEndpoint(endpointAlt).build();

    }
    public abstract void getData();
}
