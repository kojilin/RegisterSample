package idv.koji.sample.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import idv.koji.sample.R;

public class RegisterActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment2())
                    .commit();
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment2 extends Fragment
    {

        public PlaceholderFragment2()
        {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState)
        {
            final View rootView = inflater.inflate(R.layout.fragment_register, container, false);
            return rootView;
        }

        @Override
        public void onActivityCreated(final Bundle savedInstanceState)
        {
            super.onActivityCreated(savedInstanceState);
            final Button submitButton = (Button) getView().findViewById(R.id.submitButton);
            submitButton.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(final View v)
                {
                    final Intent intent = new Intent(getActivity(), VerificationActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
