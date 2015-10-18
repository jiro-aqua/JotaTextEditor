package jp.sblo.pandora.jota;

import android.app.Application;
import android.os.Build;


public class JotaTextEditor extends Application {
    public static boolean sFroyo = ( Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO );
    public static boolean sHoneycomb = ( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB );
    public static boolean sIceCreamSandwich = ( Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH );

    @Override
    public void onCreate() {
        super.onCreate();

        SettingsActivity.isVersionUp(this);
        IS01FullScreen.createInstance();
    }

}
