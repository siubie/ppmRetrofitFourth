package id.putraprima.installretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.putraprima.installretrofit.generator.ServiceGenerator;
import id.putraprima.installretrofit.models.Profil;
import id.putraprima.installretrofit.services.ProfilService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText txtNama,txtNim,txtKelas;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (EditText) findViewById(R.id.txtNama);
        txtNim = (EditText) findViewById(R.id.txtNim);
        txtKelas = (EditText) findViewById(R.id.txtKelas);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        final ProfilService service = ServiceGenerator.createService(ProfilService.class);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Profil itemProfil = new Profil(txtNama.getText().toString(),txtNim.getText().toString(),txtKelas.getText().toString());
                Call<Profil> call = service.createProfil(itemProfil);
                call.enqueue(new Callback<Profil>() {
                    @Override
                    public void onResponse(Call<Profil> call, Response<Profil> response) {
                        Toast.makeText(getApplicationContext(),"Sukses Save",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Profil> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),"Gagal Save",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

}
