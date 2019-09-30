package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView NamaDesa,NamaKades,LuasArea,PotensiWisata,PotensiWisata2,JumlahPenduduk;
    private ApiInterface apiInterface;
    private List<penduduk>penduduks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NamaDesa=(TextView)findViewById(R.id.nama_desa);
        NamaKades=(TextView)findViewById(R.id.nama_kades);
        LuasArea=(TextView)findViewById(R.id.luas_area);
        PotensiWisata=(TextView)findViewById(R.id.potensi_wisata);
        PotensiWisata2=(TextView)findViewById(R.id.potensi_wisata2);
        JumlahPenduduk=(TextView)findViewById(R.id.jumlah_penduduk);

        apiInterface=ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<penduduk>> call=apiInterface.getpenduduk();
        call.enqueue(new Callback<List<penduduk>>() {
            @Override
            public void onResponse(Call<List<penduduk>> call, Response<List<penduduk>> response ) {
                penduduks=response.body();
                NamaDesa.setText(penduduks.get(0).getNama_desa());
                NamaKades.setText(penduduks.get(0).getNama_kades());
                LuasArea.setText(penduduks.get(0).getLuas_area());
                List <String> potensi=penduduks.get(0).getPotensi_wisata();
                PotensiWisata.setText(potensi.get(0));
                PotensiWisata2.setText(potensi.get(1));
                JumlahPenduduk.setText(penduduks.get(0).getJml_penduduk());

            }

            @Override
            public void onFailure(Call<List<penduduk>> call, Throwable t) {

            }
        });
    }
}
