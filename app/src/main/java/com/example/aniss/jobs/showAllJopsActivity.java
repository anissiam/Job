package com.example.aniss.jobs;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aniss.jobs.model.employee;

import java.util.ArrayList;

public class showAllJopsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private showAdapter showAdapter;
    private ArrayList<employee> employeeList ;

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_jops);
        recyclerView = (RecyclerView) findViewById(R.id.cardList);
        recyclerView.setHasFixedSize(true);
        employeeList = new ArrayList<>();
        showAdapter = new showAdapter(this,employeeList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(showAdapter);


        employee employee = new employee("android developer ","ppp","12/12/12");
        employeeList.add(employee);

        employee = new employee("web developer ","ccccc","12/13/12");
        employeeList.add(employee);

        employee = new employee("ios developer ","ppfgdfp","12/14/12");
        employeeList.add(employee);

        employee = new employee("dsads developer ","fghgf","12/15/12");
        employeeList.add(employee);

        employee = new employee("android developer ","ppp","12/12/12");
        employeeList.add(employee);

        employee = new employee("web developer ","ccccc","12/13/12");
        employeeList.add(employee);

        employee = new employee("ios developer ","ppfgdfp","12/14/12");
        employeeList.add(employee);

        employee = new employee("dsads developer ","fghgf","12/15/12");
        employeeList.add(employee);

        employee = new employee("android developer ","ppp","12/12/12");
        employeeList.add(employee);

        employee = new employee("web developer ","ccccc","12/13/12");
        employeeList.add(employee);

        employee = new employee("ios developer ","ppfgdfp","12/14/12");
        employeeList.add(employee);

        employee = new employee("dsads developer ","fghgf","12/15/12");
        employeeList.add(employee);

        employee = new employee("android developer ","ppp","12/12/12");
        employeeList.add(employee);

        employee = new employee("web developer ","ccccc","12/13/12");
        employeeList.add(employee);

        employee = new employee("ios developer ","ppfgdfp","12/14/12");
        employeeList.add(employee);

        employee = new employee("dsads developer ","fghgf","12/15/12");
        employeeList.add(employee);
        showAdapter.notifyDataSetChanged();

        /*LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);*/
    }
}

 +
