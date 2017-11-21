package id.putraprima.installretrofit.services;

import java.util.List;

import id.putraprima.installretrofit.models.Profil;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created on 21/11/17.
 */

public interface ProfilService {
    @GET("profil")
    Call<List<Profil>> getProfil();

    @POST("profil")
    Call<Profil> createProfil(@Body Profil profil);
}
