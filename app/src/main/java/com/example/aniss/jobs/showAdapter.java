package com.example.aniss.jobs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aniss.jobs.model.employee;

import java.util.List;

/**
 * Created by PC on 3/16/2018.
 */
public class showAdapter extends RecyclerView.Adapter<showAdapter.ViewHolder> {
    Context context;
    List<employee> employeeList;

    public showAdapter(Context context, List<employee> employeeList) {
        this.context = context;
        this.employeeList = employeeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_showall,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        employee employee1 = employeeList.get(position);
        holder.title.setText(employee1.getTitle());
        holder.companyName.setText(employee1.getCompanyName());
        holder.date.setText(employee1.getDate());
    }
    @Override
    public int getItemCount() {
        return employeeList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title ,companyName, date;
        public ViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.title);
            companyName=(TextView)itemView.findViewById(R.id.companyName);
            date=(TextView)itemView.findViewById(R.id.date);
        }
    }


}