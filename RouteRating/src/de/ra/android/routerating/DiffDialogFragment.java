package de.ra.android.routerating;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DiffDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_dialog_diff, container, false);
        getDialog().setTitle("DialogFragment Tutorial");
        // TODO: Difficulty wheel input
        return rootView;
    }
}
