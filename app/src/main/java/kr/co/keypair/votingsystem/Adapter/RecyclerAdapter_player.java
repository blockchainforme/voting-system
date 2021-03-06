package kr.co.keypair.votingsystem.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import kr.co.keypair.votingsystem.R;

public class RecyclerAdapter_player extends RecyclerView.Adapter<RecyclerAdapter_player.ItemViewHolder> {

    ArrayList<Item> mItems = new ArrayList<>();
    Context context;
    int resources;


    public RecyclerAdapter_player(Context context, int resource) {
        this.context = context;
        this.resources = resource;
    }

    // 새로운 뷰 홀더 생성
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {

        Item items = (Item)getItem(position);
        holder.player_name.setText(items.getName1());
        holder.player_position.setText(items.getName2());
        int num = items.getNum();
        holder.player_num.setText(String.valueOf(num));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    private Object getItem(int position){
        return mItems.get(position);
    }

    public void add(String player_name, String player_position, int player_num){
        Item items = new Item();

        items.setName1(player_name);
        items.setName2(player_position);
        items.setNum(player_num);
        mItems.add(items);
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView player_name;
        private TextView player_num;
        private TextView player_position;

        public ItemViewHolder(View itemView) {
            super(itemView);

            player_name = (TextView) itemView.findViewById(R.id.player_name);
            player_num = (TextView) itemView.findViewById(R.id.player_num);
            player_position = (TextView) itemView.findViewById(R.id.player_position);
        }
    }

}