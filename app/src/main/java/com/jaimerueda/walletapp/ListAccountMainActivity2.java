package com.jaimerueda.walletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountMainActivity2 extends AppCompatActivity {

    private ArrayList<Account> ListAccountRV =new ArrayList<>();

    private RecyclerView myRecycleAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account_main2);
        loadFakeData();

        myRecycleAccount = findViewById(R.id.rv_list_account);
        AccountAdapter myAdaptador = new AccountAdapter(ListAccountRV);
        myRecycleAccount.setAdapter(myAdaptador);
        myRecycleAccount.setLayoutManager(new LinearLayoutManager(ListAccountMainActivity2.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia", "Cuenta de ahorros",100033.0, "https://i.pinimg.com/originals/b8/cd/c1/b8cdc1ad498fe080bc21bb5a03c24f83.png");
        Account myAccount2 = new Account("Davivienda", "Cuenta debito",100033.0, "https://logos-world.net/wp-content/uploads/2023/02/Davivienda-Logo.png");
        Account myAccount3 = new Account("Efecto","Efectivo",1058402.0, "https://seeklogo.com/images/E/efecty-logo-C15037C189-seeklogo.com.png");
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);
        ListAccountRV.add(myAccount1);
        ListAccountRV.add(myAccount2);
        ListAccountRV.add(myAccount3);

    }
}