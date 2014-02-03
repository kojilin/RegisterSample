package idv.koji.sample.register;

import android.app.Application;

import idv.koji.sample.util.Pref;

/**
 * Created by kojilin on 2014/02/03.
 */
public class TestApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Pref.INSTANCE = new Pref(this);
    }
}
