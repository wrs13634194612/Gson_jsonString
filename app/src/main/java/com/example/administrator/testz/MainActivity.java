package com.example.administrator.testz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.testz.model.RestaurantMenuItem;
import com.example.administrator.testz.model.RestaurantWithMenu;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //参考网址： https://www.jianshu.com/p/9a4dcd436d7f
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //oneJson();
       //  twoJson();
        //  threeJson();
        //     fourJson();  纯list数组
       // fiveJson();
        sixJson();

    }

    private void sixJson() {
        HashSet<String> users = new HashSet<>();
        users.add("Charistian");
        users.add("Marcus");
        users.add("Norman");
        users.add("Marcus");

        Gson gson = new Gson();
        String res = gson.toJson(users);
        System.out.println("sixJson:"+res);

        /**
         * ["Marcus", "Norman", "Charistian"]
         */
        //解析  json
        Type founderSetType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> founderSet = gson.fromJson(res, founderSetType);
        Iterator it = founderSet.iterator();
        while(it.hasNext()){
            System.out.println("res:"+it.next());
        }
    }

    private void fiveJson() {
        HashMap<String,List<String>> emplyees = new HashMap<>();
        emplyees.put("D", Arrays.asList("Andress","arnold","Aden"));
        emplyees.put("Q", Arrays.asList("Christian","carter"));
        emplyees.put("W", Arrays.asList("Marcus","mary","tom","bob"));

        Gson gson = new Gson();
        String res = gson.toJson(emplyees);
        System.out.println("fiveJson:"+res);

        /**
          {
         "D": ["Andress", "arnold", "Aden"],
         "W": ["Marcus", "mary", "tom", "bob"],
         "Q": ["Christian", "carter"]
         }

         res:bob
         */
        //解析
        Type amountCurrencyType = new TypeToken<HashMap<String, List<String>>>(){}.getType();
        HashMap<String, List<String>> amountCurrency =
                gson.fromJson(res, amountCurrencyType);
        System.out.println("res:"+amountCurrency.get("W").get(3));
    }

    private void fourJson() {
        List<RestaurantMenuItem> menuItems = new ArrayList<>();
        menuItems.add(new RestaurantMenuItem("zhaoyun",7.6f));
        menuItems.add(new RestaurantMenuItem("haungchao",4.7f));
        menuItems.add(new RestaurantMenuItem("liubei",9.2f));

        Gson gson = new Gson();
        String res = gson.toJson(menuItems);
        System.out.println("fourJson:"+res);

        //解析
        Type type = new TypeToken<List<RestaurantMenuItem>>() {}.getType();
        List<RestaurantMenuItem> list = gson.fromJson(res, type);
        System.out.println("name:"+ list.get(0).getDescription());


        /**
         * [{
         "description": "zhaoyun",
         "price_wrs": 7.6
         }, {
         "description": "haungchao",
         "price_wrs": 4.7
         }, {
         "description": "liubei",
         "price_wrs": 9.2
         }]

         //解析
         name:zhaoyun
         */
    }


    private void twoJson() {
        List<RestaurantMenuItem> menuItems = new ArrayList<>();
        menuItems.add(new RestaurantMenuItem("Spaghetti", 7.99f));
        menuItems.add(new RestaurantMenuItem("steak", 12.99f));
        menuItems.add(new RestaurantMenuItem("salad", 5.99f));

        RestaurantWithMenu restaurantWithMenu = new RestaurantWithMenu("Future", menuItems);
        Gson gson = new Gson();
        String res = gson.toJson(restaurantWithMenu);
        System.out.println("twojson: " + res);

        //解析字符串
        restaurantWithMenu = gson.fromJson(res, RestaurantWithMenu.class);
        System.out.println("name:"+ restaurantWithMenu.getName());

        for (int i=0;i<restaurantWithMenu.getMenu().size();i++){
            System.out.println(i+" :list: "+restaurantWithMenu.getMenu().get(i).getDescription());
        }



        /** 运行结果
         {
         "menu": [{
             "description": "Spaghetti",
             "price_wrs": 7.99
         }, {
             "description": "steak",
             "price_wrs": 12.99
         }, {
             "description": "salad",
             "price_wrs": 5.99
         }],
         "name": "Future"
         }
         //解析结果
         name:Future
         0 :list: Spaghetti
         1 :list: steak
         2 :list: salad
         */
    }


    private void threeJson() {
        List<RestaurantMenuItem> menuItems = new ArrayList<>();
        menuItems.add(new RestaurantMenuItem("Spaghetti", 7.99f, "zhangfei"));

        RestaurantWithMenu restaurantWithMenu = new RestaurantWithMenu("Future", menuItems);
        Gson gson = new Gson();
        String res = gson.toJson(restaurantWithMenu);
        System.out.println("twojson: " + res);



        /**
         {
         "menu": [{
             "description": "Spaghetti",
             "name": "zhangfei",
             "price_wrs": 7.99
         }],
         "name": "Future"
         }
         */
    }


    //生成简单的json字符串
    private void oneJson() {
        UserSimple userSimple = new UserSimple("Normal", "259175190@qq.com", 26, true);
        Gson gson = new Gson();
        String userJson = gson.toJson(userSimple);
        System.out.println("wrs:" + userJson);

        //解析字符串
        userSimple = gson.fromJson(userJson, UserSimple.class);
        System.out.println("age:" + userSimple.getAge() + "email:" + userSimple.getEmail());

        /**运行结果：
         {
         "age": 26,
         "email": "249175190@qq.com",
         "isDeveloper": true,
         "name": "Normal"
         }
         */
    }
}
