package com.example.listmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();

    }


    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(fotoMakanan, namaMakanan, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void getDataFromInternet(){


        namaMakanan.add("Chicken Muffin");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/October2019/AZa7XBfA0ADkUbSdnQOW.png");
        infoMakanan.add("Setangkup English muffin hangat dilapis saus mayonais dengan daging ayam olahan yang digoreng dengan sempurna. Tersedia dari jam 5-11 pagi.");


        namaMakanan.add("Sausage Mcmuffin");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/October2019/Vm7RRv0nsWQmS1fz3iv6.png");
        infoMakanan.add("English muffin disajikan dengan sosis ayam yang gurih dan selembar keju bernutrisi. Tersedia dari jam 5-11 pagi.");

        namaMakanan.add("Double CheeseBurger ");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/October2019/apZ1DxDmKvwS2lV12Elp.png");
        infoMakanan.add("Perpaduan roti burger dengan 2 Lapisan daging gurih dan 2 lapisan keju disajikan dengan saus tomat, acar, potongan bawang dan mustard.");


        namaMakanan.add("ChesseBurger");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/October2019/5nxLKIp3cPfPnv7ZYjPb.png");
        infoMakanan.add("Perpaduan roti burger dengan daging sapi gurih, selada segar, keju, saus tomat, acar, potongan bawang dan mustard.");


        namaMakanan.add("Triple Cheeseburger");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/October2019/AfYw3Cwp5YqZ7wOP9aQu.png");
        infoMakanan.add("Perpaduan roti burger dengan 3 Lapisan daging gurih dan 2 lapisan keju, saus tomat, acar, potongan bawang dan mustard.");


        namaMakanan.add("Mcnugget");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/September2019/qFoLKbSe1R3OJ75zAm4B.png");
        infoMakanan.add("Nugget ayam McDonald's dan saus Sweet & Sour atau Barbeque pilihan Anda. Tersedia dalam pilihan 4, 6 dan 9 pieces");


        namaMakanan.add("Sausage Wrap");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/August2019/oOqk0inorO5YNcw5S2iG.png");
        infoMakanan.add("Perpaduan sosis ayam, scrambled egg, dan keju gurih dalam balutan tortilla yang lembut. Tersedia dari jam 5-11 pagi.");


        namaMakanan.add("Big Breakfast");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/August2019/l8UZVpyERSD76zcQgWlq.png");
        infoMakanan.add("Perpaduan English Muffin panggang yang disajikan dengan sosis ayam gurih, renyahnya Hashbrown serta lembutnya scrambled egg. Tersedia dari jam 5-11 pagi.");


        namaMakanan.add("McChicken");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/October2019/Ppf2GZrRgXEd05rpGABx.png");
        infoMakanan.add("Patty ayam krispi diantara roti wijen lembut, selada segar, dan saus McChicken klasik McDonald's");


        namaMakanan.add("McSpicy");
        fotoMakanan.add("https://nos.jkt-1.neo.id/mcdonalds/foods/November2019/0nR6ysDcMRuLttBeJ4Ho.png");
        infoMakanan.add("Burger dengan daging paha ayam goreng yang empuk, renyah dan pedas, dilengkapi dengan selada segar dan saus spesial di dalam roti berwijen.");



        prosesRecyclerViewAdapter();

    }

}