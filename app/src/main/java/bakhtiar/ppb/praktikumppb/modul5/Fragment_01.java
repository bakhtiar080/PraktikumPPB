package bakhtiar.ppb.praktikumppb.modul5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import bakhtiar.ppb.praktikumppb.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_01 extends Fragment {


    public Fragment_01() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate ( R.layout.fragment01_modul5, container, false );

    }
}
