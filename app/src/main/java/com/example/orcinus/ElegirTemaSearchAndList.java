package com.example.orcinus;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.orcinus.MainActivity;
import com.example.orcinus.R;

public class ElegirTemaSearchAndList extends AppCompatActivity {

    public ListView temasListView;
    public String[] txtListaMat = {"Potenciacion 1", "Potenciacion 2", "Radicacion 1", "Radicacion 2", "Fracciones", "Fracciones 2", "Fracciones 3", "Fracciones 4", "Fracciones 5"};
    public int[] imgListaMat = {R.drawable.pot, R.drawable.pot, R.drawable.rad, R.drawable.rad, R.drawable.frc, R.drawable.frc, R.drawable.frc, R.drawable.frc, R.drawable.frc};
    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_tema_search_and_list);

        temasListView = findViewById(R.id.temas_listview);

        ListELegTemaAdapter adapter = new ListELegTemaAdapter();
        temasListView.setAdapter(adapter);

        // Funcionalidad al hacer click;
        // temasListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //     public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
        //         Toast.makeText(ctx, "hola", Toast.LENGTH_SHORT).show();
        //         try {
        //             Thread.sleep(800);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //         Intent i = new Intent(ctx, MainActivity.class);
        //         startActivity(i);
        //     }
        // });

        temasListView.setOnItemClickListener((parent, v, pos, id) -> {
            Toast.makeText(ctx, "hola", Toast.LENGTH_SHORT).show();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent i = new Intent(ctx, MainActivity.class);
            startActivity(i);
        });
    }

    public class ListELegTemaAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return txtListaMat.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int pos, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.card_tema, parent, false);
            ImageView imgViewTema = convertView.findViewById(R.id.list_temas_item_img);
            TextView txtViewTema = convertView.findViewById(R.id.list_temas_item_text);

            txtViewTema.setText(txtListaMat[pos]);
            imgViewTema.setImageResource(imgListaMat[pos]);

            return convertView;
        }
    }
}