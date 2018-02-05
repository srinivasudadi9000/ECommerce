package m.srinivas.ecommerce.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import m.srinivas.ecommerce.Adapters.ExpandableListAdapter;
import m.srinivas.ecommerce.R;
import m.srinivas.ecommerce.Constants.menulist;

public class Search extends Activity implements View.OnClickListener {
    LinearLayout home_img, cat_img, search_img, offer_img, basket_img;
    ImageView search_ll;
    Animation move;

    RecyclerView recyclerview;
    ArrayList<ExpandableListAdapter.Item> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        search_ll = (ImageView) findViewById(R.id.search_ll);
        home_img = (LinearLayout) findViewById(R.id.home_img);
        cat_img = (LinearLayout) findViewById(R.id.cat_img);
        search_img = (LinearLayout) findViewById(R.id.search_img);
        offer_img = (LinearLayout) findViewById(R.id.offer_img);
        basket_img = (LinearLayout) findViewById(R.id.basket_img);

        move = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);

        // onclick's for footer
        home_img.setOnClickListener(this);
        cat_img.setOnClickListener(this);
        search_img.setOnClickListener(this);
        offer_img.setOnClickListener(this);
        basket_img.setOnClickListener(this);

        search_ll.setImageDrawable(getResources().getDrawable(R.drawable.search_red));
        recyclerview = (RecyclerView) findViewById(R.id.left_drawer);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        data = new ArrayList<ExpandableListAdapter.Item>();
        data = new menulist().senddata();
        recyclerview.setAdapter(new ExpandableListAdapter(data, this));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_img:
                Intent search = new Intent(Search.this, Home.class);
                startActivity(search);
                finish();
                break;
            case R.id.cat_img:
                Intent cat = new Intent(Search.this, Category.class);
                startActivity(cat);
                finish();
                break;
            case R.id.search_img:
                search_ll.setImageDrawable(getResources().getDrawable(R.drawable.search_red));
                break;
            case R.id.offer_img:
                Intent offer = new Intent(Search.this, Offers.class);
                startActivity(offer);
                finish();
                break;
            case R.id.basket_img:
                Intent basket = new Intent(Search.this, Basket.class);
                startActivity(basket);
                finish();
                break;

        }
    }
}
