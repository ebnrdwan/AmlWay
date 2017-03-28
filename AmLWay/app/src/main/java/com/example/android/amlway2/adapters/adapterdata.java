package com.example.android.amlway2.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.amlway2.R;
import com.example.android.amlway2.models.billModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Abdulrhman on 23/03/2017.
 */


public class adapterdata extends RecyclerView.Adapter<adapterdata.holderBills> {

    Context context;
    List<billModel> mylist ;


//        List<billModel> mylist= new ArrayList<billModel>();
    public adapterdata(Context context,List<billModel>list) {
        this.context = context;
        mylist = new ArrayList<billModel>();
        if (!list.equals(null))
        mylist=list;


    }

    @Override
    public holderBills onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_bill, parent, false);
        return new holderBills(view);
    }

    @Override
    public void onBindViewHolder(holderBills holder, int position) {

        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm");
        String date = df.format(Calendar.getInstance().getTime());
        billModel object = mylist.get(position);

        holder.date.setText(date);
        holder.employeeName.setText(object.getEmployeeName());
        holder.customerName.setText(object.getCustomerName());
        holder.price.setText(String.valueOf(object.getPrice()));
    }
    @Override
    public int getItemCount() {
        return mylist.size();
    }

    public class holderBills extends RecyclerView.ViewHolder {

        TextView customerName;
        TextView date;
        TextView employeeName;
        TextView price;

        public holderBills(View itemView) {
            super(itemView);

            customerName = (TextView) itemView.findViewById(R.id.name_customer);
            date = (TextView) itemView.findViewById(R.id.datebill);
            employeeName = (TextView) itemView.findViewById(R.id.employee_name);
            price = (TextView) itemView.findViewById(R.id.overalPrice);

        }
    }

}
