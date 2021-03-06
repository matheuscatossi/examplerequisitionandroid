package br.matheuscatossi.com.examplerequisition.webservices;

import br.matheuscatossi.com.examplerequisition.utils.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by matheuscatossi on 07/10/17.
 */

public class APIClient {

    private static Retrofit retrofit = null;

    public static Retrofit getService() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
