package com.example.lucas.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pessoa> list_pessoa = new ArrayList<Pessoa>();

            list_pessoa.add(new Pessoa("Nome","Sobrenome"));
            list_pessoa.add(new Pessoa("Nome","Sobrenome"));
            list_pessoa.add(new Pessoa("Nome","Sorenome"));

        listView = (ListView) findViewById(R.id.listView);

        inflateList(listView,list_pessoa);
    }

    public void inflateList(ListView lista, ArrayList<Pessoa> pessoa){
        PessoaAdapter adapter = new PessoaAdapter(this,R.layout.custom_listview,pessoa);
        lista.setAdapter(adapter);
    }

}
