package com.example.intentapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RumahSakit extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[] {"Awal Bros", "RSUD Arifin Ahmad", "RS Santa Maria", "RS Syafira"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listHospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        showPilihan(pilihan);
    }

    private void showPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Awal Bros")){
                a = new Intent(this, AwalBros.class);
            } else if (pilihan.equals("RSUD Arifin Ahmad")){

            } else if (pilihan.equals("RS Santa Maria")){

            } else if (pilihan.equals("RS Syafira")){

            }
            startActivity(a);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
