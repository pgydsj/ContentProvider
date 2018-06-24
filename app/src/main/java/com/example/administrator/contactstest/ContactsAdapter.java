package com.example.administrator.contactstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/6/24.
 */

public class ContactsAdapter extends ArrayAdapter<Contacts>{
    private int resourcedId;
    public ContactsAdapter(Context context, int textViewResourceId, List<Contacts>objects) {
        super(context, textViewResourceId, objects);
        resourcedId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Contacts contacts=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourcedId,parent,false);
        TextView name=(TextView)view.findViewById(R.id.text1);
        TextView number=(TextView)view.findViewById(R.id.text2);
        name.setText(contacts.getName());
        number.setText(contacts.getNumber());
        return view;
    }
}
