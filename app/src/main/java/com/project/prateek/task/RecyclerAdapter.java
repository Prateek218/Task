package com.project.prateek.task;

/**
 * Created by PRATEEK on 12/8/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = {"HDFC",
            "HDFC",
            "HDFC",
            "HDFC",
            "HDFC",
            "HDFC",
            "HDFC",
            "HDFC"};

    private String[] details = {"ABC Mutual Funds",
            "ABC Mutual Funds", "ABC Mutual Funds",
            "ABC Mutual Funds", "ABC Mutual Funds",
            "ABC Mutual Funds", "ABC Mutual Funds",
            "ABC Mutual Funds"};
    private String[] values = {"Current Value",
            "Current Value", "Current Value",
            "Current Value", "Current Value",
            "Current Value", "Current Value",
            "Current Value"};
    private String[] full = {"Full Withdrawal           ",
            "Full Withdrawal           ", "Full Withdrawal           ",
            "Full Withdrawal           ", "Full Withdrawal           ",
            "Full Withdrawal           ", "Full Withdrawal           ",
            "Full Withdrawal           "};

    private String[] wid = {"Withdrawal Amount",
            "Withdrawal Amount", "Withdrawal Amount",
            "Withdrawal Amount", "Withdrawal Amount",
            "Withdrawal Amount", "Withdrawal Amount",
            "Withdrawal Amount"};
    private String[] camt = {"Rs. 35000",
            "Rs. 35000", "Rs. 35000",
            "Rs. 35000", "Rs. 35000",
            "Rs. 35000", "Rs. 35000",
            "Rs. 35000"};
    private String[] wdamt = {"Rs. 15000",
            "Rs. 15000", "Rs. 15000",
            "Rs. 15000", "Rs. 15000",
            "Rs. 15000", "Rs. 15000",
            "Rs. 15000"};
    private int[] images = { R.drawable.hdfc,
            R.drawable.hdfc,
            R.drawable.hdfc,
            R.drawable.hdfc,
            R.drawable.hdfc,
            R.drawable.hdfc,
            R.drawable.hdfc,
            R.drawable.hdfc };

    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
        public TextView itemvalue;
        public TextView itemfull;
        public TextView itemwidamt;
        public TextView itemcamt;
        public TextView itemwdamt;
        public ToggleButton toggleButton;
        TextView text;
        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);
            itemvalue = (TextView)itemView.findViewById(R.id.item_value);
            itemfull = (TextView)itemView.findViewById(R.id.item_full);
            itemwidamt = (TextView)itemView.findViewById(R.id.item_widamt);
            itemcamt = (TextView)itemView.findViewById(R.id.item_camt);
            itemwdamt = (TextView)itemView.findViewById(R.id.item_wdamt);
            toggleButton = (ToggleButton)itemView.findViewById(R.id.toggleButton1);
            text = (TextView) itemView.findViewById(R.id.textView1);
            toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
                  //  text.setText("Status: " + isChecked);
                }
            });
            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });*/
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_card, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemvalue.setText(values[i]);
        viewHolder.itemfull.setText(full[i]);
        viewHolder.itemwidamt.setText(wid[i]);
        viewHolder.itemcamt.setText(camt[i]);
        viewHolder.itemwdamt.setText(wdamt[i]);
        viewHolder.toggleButton.setText("");
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}