package com.example.cardrecyclerview.mycustomadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardrecyclerview.R;
import com.example.cardrecyclerview.cardmodel.cardmodel;

import java.util.List;

import javax.xml.namespace.QName;

public class mycustomadapter extends RecyclerView.Adapter<mycustomadapter.cardviewholder> {

    List <cardmodel>cardmodelList;

    public mycustomadapter(List<cardmodel> cardmodelList) {
        this.cardmodelList = cardmodelList;
    }


    @NonNull
    @Override
    public mycustomadapter.cardviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new cardviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.cardviewholder holder, int position) {

        cardmodel cardmodel=cardmodelList.get(position);

        holder.textView.setText(cardmodel.getName());
        holder.textView.setText(String.valueOf(cardmodel.getNumber()));
        holder.imageView.setImageResource(cardmodel.getImage());

    }

    @Override
    public int getItemCount()
    {
        return cardmodelList.size();
    }


    public static class cardviewholder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public cardviewholder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.name);
            textView = itemView.findViewById(R.id.number);
            imageView = itemView.findViewById(R.id.image);


        }


    }


}
