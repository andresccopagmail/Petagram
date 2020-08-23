package org.coursera.ccopa.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<PetModel> petModelList;

    private RecyclerView recyclerPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbarMain = findViewById(R.id.toolbarMain);
        toolbarMain.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.favorite:
                        Intent intent = new Intent(MainActivity.this, FavoritePetsActivity.class);
                        startActivity(intent);
                        return true;
                    default:
                        return false;
                }
            }
        });

        FloatingActionButton floatingButtonMain = findViewById(R.id.floatingButtonMain);
        floatingButtonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_camera_button, Toast.LENGTH_SHORT).show();
            }
        });

        recyclerPet = findViewById(R.id.recyclerPet);
        recyclerPet.setLayoutManager(new LinearLayoutManager(this));

        generatePets();
        initPetAdapter();
    }

    private void initPetAdapter() {
        PetAdapter petAdapter = new PetAdapter(petModelList);
        recyclerPet.setAdapter(petAdapter);
    }

    private void generatePets() {
        petModelList = new ArrayList<>();
        petModelList.add(new PetModel(R.drawable.cat1, "Bianca", 3, false));
        petModelList.add(new PetModel(R.drawable.cat2, "Garfield", 2, false));
        petModelList.add(new PetModel(R.drawable.cat3, "Azrael", 5, false));
        petModelList.add(new PetModel(R.drawable.dog1, "Blacky", 1, false));
        petModelList.add(new PetModel(R.drawable.dog2, "Suchard", 2, false));
        petModelList.add(new PetModel(R.drawable.dog3, "Kuroinu", 4, false));
    }
}