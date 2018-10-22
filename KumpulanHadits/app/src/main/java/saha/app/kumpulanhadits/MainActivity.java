package saha.app.kumpulanhadits;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;
import saha.app.kumpulanhadits.adapter.DoaAdapter;
import saha.app.kumpulanhadits.model.Doa;

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();
    private RecyclerView lstDoa;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recyclerviewnya
        lstDoa = (RecyclerView) findViewById(R.id.lst_doa);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        lstDoa.setLayoutManager(linear);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doas);
        lstDoa.setAdapter(adapter);
    }

    private void doaCollections(){
        doas.add(new Doa("Sesudah Makan", "Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنََ"));
        doas.add(new Doa("Sebelum Tidur", "Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati", "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتَُ"));
        doas.add(new Doa("Ketika Mimpi Buruk", "Ya Allah, sesungguhnya aku mohon perlindungan kepada Engkau dari perbuatan setan dan dari mimpi-mimpi yang buruk", "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِ"));
        doas.add(new Doa("Ketika Mimpi Baik", "Segala puji bagi Allah yang telah memberi hajatku", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتَِ"));
        doas.add(new Doa("Melepas Pakaian", "Dengan nama Allah yang tiada Tuhan selain-Nya", "بِسْمِ اللهِ الَّذِيْ لاَ إِلَهَ إِلَّا هُوََِ"));
        doas.add(new Doa("Sebelum Belajar", "Ya Allah, tambahkanlah aku ilmu dan berikanlah aku rizqi akan kepahaman", "يَارَبِّ زِدْنِىْ عِلْمًا وَارْزُقْنِىْ فَهْمًا"));
        doas.add(new Doa("Masuk Masjid", "Ya Allah, bukalah untukku pintu-pintu rahmat-Mu", "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكََِ"));
        doas.add(new Doa("Keluar Masjid", "Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu", "اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكََِ"));
        doas.add(new Doa("Ketika Makan Lupa Membaca Doa", "Dengan menyebut nama Allah pada awal dan akhirnya", "بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهَِِ"));
        doas.add(new Doa("Sesudah Minum", "Segala puji bagi Allah yang telah menjadikan air ini (minuman) segar dan menggiatkan dengan rahmat-Nya dan tidak menjadikan air ini (minuman) asin lagi pahit karena dosa-dosa kami", "اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَاَِ"));
    }
}
