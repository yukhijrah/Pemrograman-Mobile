package saha.app.kumpulanhadits.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.List;

import saha.app.kumpulanhadits.R;
import saha.app.kumpulanhadits.model.Doa;
import saha.app.kumpulanhadits.viewholder.DoaHolder;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;

    public DoaAdapter(List<Doa> doas) {
        this.doas = doas;
    }
    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, parent, false));
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNamaDoa());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
