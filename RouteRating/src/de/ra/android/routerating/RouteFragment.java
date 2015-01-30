package de.ra.android.routerating;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class RouteFragment extends Fragment {

    private Route mRoute;

    private EditText mNameField;

    private EditText mColorField;

    private EditText mSetterField;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mRoute = new Route();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_create_route, parent, false);

        mNameField = (EditText) view.findViewById(R.id.route_name);
        mNameField.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                mRoute.setName(s.toString());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                // left blank intentionally
            }

            public void afterTextChanged(Editable s)
            {
                // left blank intentionally
            }
        });

        mColorField = (EditText) view.findViewById(R.id.route_color);
        mColorField.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                mRoute.setColor(s.toString());

            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                // left blank intentionally
            }

            public void afterTextChanged(Editable s)
            {
                // left blank intentionally
            }
        });

        mSetterField = (EditText) view.findViewById(R.id.route_setter);
        mSetterField.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                mRoute.setSetter(s.toString());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                // left blank intentionally
            }

            public void afterTextChanged(Editable s)
            {
                // left blank intentionally
            }
        });

        return view;
    }

}
