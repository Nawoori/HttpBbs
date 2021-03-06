package com.veryworks.android.httpbbs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 6/26/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder>{
    List<Bbs> list;

    public CustomAdapter(){
        list = new ArrayList<>();
    }

    public void setList(List<Bbs> list){
        this.list = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Bbs bbs = list.get(position);
        //holder.no.setText(bbs.);
        holder.title.setText(bbs.title);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        TextView no;
        TextView title;
        public Holder(View itemView) {
            super(itemView);
            no = (TextView)itemView.findViewById(R.id.textNo);
            title = (TextView)itemView.findViewById(R.id.textTitle);
        }
    }
}
