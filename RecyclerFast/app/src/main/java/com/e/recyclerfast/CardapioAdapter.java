package com.e.recyclerfast;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.e.recyclerfast.Response.CardapioResponse;

import java.util.List;

public class CardapioAdapter extends RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder> {

    private List<CardapioResponse> cardapio;

    public CardapioAdapter(List<CardapioResponse> cardapio) {
        this.cardapio = cardapio;
    }

    @NonNull
    @Override
    public CardapioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardapio, parent, false);
        return new CardapioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardapioViewHolder holder, int position) {
        holder.Text_Cardapio.setText(cardapio.get(position).getId());


    }

    @Override
    public int getItemCount() {
        return cardapio.size();
    }

    static class CardapioViewHolder extends RecyclerView.ViewHolder {

        private TextView Text_Cardapio;


        public CardapioViewHolder(@NonNull View itemView) {
            super(itemView);
            Text_Cardapio = itemView.findViewById(R.id.text_cardapio);
        }
    }


}
