package py.edu.facitec.pokedexonfire.vista;

import java.util.List;

public interface Vista<T> {

    void showSuccess(List<T> result);
    void showSuccess(T result);
    void showError(String error);

}
