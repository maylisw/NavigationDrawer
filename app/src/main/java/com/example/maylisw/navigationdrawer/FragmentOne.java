package com.example.maylisw.navigationdrawer;


import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by maylisw on 10/11/17.
 */

public class FragmentOne extends Fragment {
    private Button button;
    public FragmentOne() {
    }
    protected void onCreateView(){
        super.onCreateView(inflater, container, savedInstanceState);
        //Inflate the layout we made (one_fragment.xml)
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        //Wire any widgets -- must use rootView.findViewById
        button = (Button) rootView.findViewById(R.id.button);

        //get any other initial set up done
        //in place of where you would normally say this,
        //you use getActivity() instead to get the context
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "I CLICKED THE THING",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //return the view that we inflated.
        return rootView;
    }
}
