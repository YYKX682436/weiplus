package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes13.dex */
public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    private static final java.lang.String TAG = "ContextUtils";
    private static android.content.Context sApplicationContext;

    /* loaded from: classes13.dex */
    public static class Holder {
        private static android.content.SharedPreferences sSharedPreferences = org.chromium.base.ContextUtils.a();

        private Holder() {
        }
    }

    public static /* bridge */ /* synthetic */ android.content.SharedPreferences a() {
        return fetchAppSharedPreferences();
    }

    public static android.app.Activity activityFromContext(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static void clearApplicationContextForTests() {
        sApplicationContext = null;
        org.chromium.base.ContextUtils.Holder.sSharedPreferences = null;
    }

    private static android.content.SharedPreferences fetchAppSharedPreferences() {
        org.chromium.base.StrictModeContext allowDiskWrites = org.chromium.base.StrictModeContext.allowDiskWrites();
        try {
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
            if (allowDiskWrites != null) {
                allowDiskWrites.close();
            }
            return defaultSharedPreferences;
        } catch (java.lang.Throwable th6) {
            if (allowDiskWrites != null) {
                try {
                    allowDiskWrites.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public static android.content.SharedPreferences getAppSharedPreferences() {
        return org.chromium.base.ContextUtils.Holder.sSharedPreferences;
    }

    public static android.content.res.AssetManager getApplicationAssets() {
        android.content.Context applicationContext = getApplicationContext();
        while (applicationContext instanceof android.content.ContextWrapper) {
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static android.content.Context getApplicationContext() {
        return sApplicationContext;
    }

    public static java.lang.String getProcessName() {
        return org.chromium.base.ApiCompatibilityUtils.getProcessName();
    }

    public static void initApplicationContext(android.content.Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(android.content.Context context) {
        initJavaSideApplicationContext(context);
        org.chromium.base.ContextUtils.Holder.sSharedPreferences = fetchAppSharedPreferences();
    }

    private static void initJavaSideApplicationContext(android.content.Context context) {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS && (context instanceof android.app.Application)) {
            context = new android.content.ContextWrapper(context);
        }
        sApplicationContext = context;
    }

    public static boolean isIsolatedProcess() {
        return android.os.Process.isIsolated();
    }

    public static boolean isProcess64Bit() {
        return org.chromium.base.compat.ApiHelperForM.isProcess64Bit();
    }

    public static boolean isSdkSandboxProcess() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return android.os.Process.isSdkSandbox();
        }
        return false;
    }

    private static android.content.Intent registerBroadcastReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? org.chromium.base.compat.ApiHelperForO.registerReceiver(context, broadcastReceiver, intentFilter, str, handler, i17) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static android.content.Intent registerExportedBroadcastReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, str, null, 2);
    }

    public static android.content.Intent registerNonExportedBroadcastReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 4);
    }

    public static android.content.Intent registerProtectedBroadcastReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, null, 0);
    }

    public static android.content.Intent registerNonExportedBroadcastReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, android.os.Handler handler) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, handler, 4);
    }

    public static android.content.Intent registerProtectedBroadcastReceiver(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, android.os.Handler handler) {
        return registerBroadcastReceiver(context, broadcastReceiver, intentFilter, null, handler, 0);
    }
}
