package com.example.lucas.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lucas on 08/07/16.
 */

public class PessoaAdapter extends ArrayAdapter<Pessoa> {

    private TextView txtNome;
    private TextView txtSobrenome;

    public PessoaAdapter(Activity context, int resource, ArrayList<Pessoa> pessoa) {
        super(context, 0, pessoa);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;
            if (listView == null) listView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview, parent, false);

        Pessoa currentPessoa = getItem(position);

        TextView txtNome = (TextView) listView.findViewById(R.id.first_view);
        txtNome.setText(currentPessoa.getNome());

        TextView txtSobrenome = (TextView) listView.findViewById(R.id.second_view);
        txtSobrenome.setText(currentPessoa.getSobrenome());

        return listView;
    }
}
