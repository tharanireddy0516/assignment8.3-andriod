package com.example.tharani.gridvew;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;



public class ImageAdapter extends BaseAdapter {
    private Activity context;
    /*An activity represents a single screen with a user interface just like window or frame
    Context allows access to application-specific resources and classes
    calls for application-level operations such as launching activities, broadcasting and receiving intents
    */

    public ImageAdapter(Activity context ){
        this.context=context;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
    // getCount returns the numbers of rows in the cursor.
    @Override
    public Object getItem(int i) {
        return null;
    }
     //getItem get  the data item associated with the specified position in the data set.
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    //getView gets the type of view
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null);
        {
           //Layout Inflater is used to get the View object which you define in a layout xml (the root object, normally a LinearLayout, FrameLayout, or RelativeLayout)
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.gridview_activity, null);
            /*Here we can do changes to the View*/

        }

       //R is a resource and it is auto generate file
        ImageView imageView= view.findViewById(R.id.imageView2);

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mThumbIds[i]);//sets ImageResource
        return view;//returns view
    }
    private Integer[] mThumbIds = {

            R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean,
            R.drawable.kitkat,R.drawable.lollipop
            //these are images which are uploaded in drawable folder

    };
}
