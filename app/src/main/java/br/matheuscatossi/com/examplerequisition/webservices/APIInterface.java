package br.matheuscatossi.com.examplerequisition.webservices;

import br.matheuscatossi.com.examplerequisition.model.Person;
import br.matheuscatossi.com.examplerequisition.utils.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by matheuscatossi on 07/10/17.
 */


public interface APIInterface {

    @GET(Constants.GET_INFO)
    Call<Person> getInfo();

}
