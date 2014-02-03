package idv.koji.sample.util;

import android.content.Context;
import android.content.SharedPreferences;

public class Pref
{
    public static Pref INSTANCE;

    private Context context;
    private SharedPreferences preference;

    public Pref(final Context context)
    {
        this.context = context;
        preference = context.getSharedPreferences("idv.koji.test", Context.MODE_PRIVATE);
    }

    public void register()
    {
        preference.edit().putBoolean("register", true).commit();
    }

    public boolean isRegistered()
    {
        return preference.getBoolean("register", false);
    }

}

