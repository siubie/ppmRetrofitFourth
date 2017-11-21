package id.putraprima.installretrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created on 21/11/17.
 */

public class Profil {

    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("kelas")
    @Expose
    private String kelas;
    @SerializedName("nim")
    @Expose
    private String nim;
    @SerializedName("id")
    @Expose
    private String id;

    public Profil(String nama, String kelas, String nim) {
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
