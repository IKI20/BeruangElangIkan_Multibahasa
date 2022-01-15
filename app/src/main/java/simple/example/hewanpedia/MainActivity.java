package simple.example.hewanpedia;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnBeruang,btnElang,btnIkan;
    Button btn1;
    ActionBar actionBar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
        View btn1activity = findViewById(R.id.btn1);

        btn1activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1keProfilkuActivity = new Intent(MainActivity.this,ProfilkuActivity.class);
                startActivity(btn1keProfilkuActivity);
            }
        });
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed(){super.onBackPressed();

    }

    private void inisialisasiView() {
        btnBeruang = findViewById(R.id.btn_buka_ras_beruang);
        btnElang = findViewById(R.id.btn_buka_ras_elang);
        btnIkan = findViewById(R.id.btn_buka_ras_ikan);
        btnBeruang.setOnClickListener(view -> bukaGaleri("Beruang"));
        btnElang.setOnClickListener(view -> bukaGaleri("Elang"));
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}