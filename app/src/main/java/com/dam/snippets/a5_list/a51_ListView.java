package com.dam.snippets.a5_list;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.dam.snippets.R;

public class a51_ListView extends AppCompatActivity {

    /**  mETHODE 1 AVEC UN TABLEAU JAVA
     priva
     * @param savedInstanceState
     */


    private String[] listeStagiaire = new String[]{
          "Theodore", "Fred", "Sylvere", "Jacques", "Moustafa", "Serge", "Patrick", "Andy", "Tha"


    };

    private void AffichageListeView(){
        // lE LIEN ENTRE JAVA ET DESIGN
        listView lvListView = findViewById(R.id.lvListView);
        this, android.R.layout.simple_dropdown_item_1line, listeStagiaire);

        lvListView.setAdapter(adapter);

        lvListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String valItem = (String) lvListView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), text "Le Stagiaire:"

            }

        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a51_list_view);
        affichageListView();

    }
}