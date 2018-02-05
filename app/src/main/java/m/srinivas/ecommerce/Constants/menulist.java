package m.srinivas.ecommerce.Constants;

import java.util.ArrayList;

import m.srinivas.ecommerce.Adapters.ExpandableListAdapter;
import m.srinivas.ecommerce.Models.Items;
import m.srinivas.ecommerce.R;

/**
 * Created by srinivas on 03/02/18.
 */

public class menulist {

    ArrayList<ExpandableListAdapter.Item> data;
    ArrayList<Items> items;
    public menulist() {
        items = new ArrayList<Items>();
        data = new ArrayList<ExpandableListAdapter.Item>();
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "My Account"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "profile"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Refer & Earn"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "desi Cow Milk"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "A2 MILK"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Natural Farming Food"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Rice"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Vegetables"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Fruits"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Wheat"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Pulses"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Spices"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Daily Basket"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Weekly Basket"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Monthly Basket"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "COLD PRESSED OIL"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Rice"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Vegetables"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Fruits"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Wheat"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Pulses"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Spices"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Daily Basket"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Coconut"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Rice"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Vegetables"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Fruits"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Wheat"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Pulses"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Spices"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "Daily Basket"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Til / Sesame"));

        items.add(new Items("BigBoss","Watches for Men 50% off","single","Rs 11550","Rs 1650", R.drawable.watch));
        items.add(new Items("Mast and Harbour","Watches for Ladies and Men 50% off","single","Rs 11550","Rs 1650",R.drawable.apple_wathc));
        items.add(new Items("Curren","Watches for Men 50% off","single","Rs 1550","Rs 650",R.drawable.dresswatch));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.tshirts));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.tshirts));
        items.add(new Items("Cameril","Watches for Men 50% off","single","Rs 11,055","Rs 1650",R.drawable.watch_lady));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.vaamsi));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.mens));
        items.add(new Items("BigBoss","Watches for Men 50% off","single","Rs 11,550","Rs 1650",R.drawable.watch));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.kurtha));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.mens));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.vaamsi));
        items.add(new Items("BigBoss","Rough T-shirt Awesome Product Varities","bulk","Rs 350","Rs 150",R.drawable.kurtha));
    }

    public ArrayList<ExpandableListAdapter.Item> senddata() {
        return data;
    }

    public ArrayList<Items> sendItems(){
        return items;
    }
}
