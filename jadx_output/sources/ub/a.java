package ub;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Stack f425990a;

    public static int a(android.content.Context context, float f17) {
        return (int) ((f17 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static java.lang.String b() {
        android.content.pm.PackageManager packageManager;
        try {
            android.content.Context context = com.tencent.midas.api.APMidasPayAPI.fromApplicationContext;
            return (context == null || (packageManager = context.getPackageManager()) == null) ? "" : packageManager.getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("APMidasCommMethod", "getApplicationPackageName error:" + e17.toString());
            return "";
        }
    }

    public static int c(android.content.Context context, java.lang.String str) {
        return context.getResources().getIdentifier(str, dm.i4.COL_ID, context.getPackageName());
    }

    public static int d(android.content.Context context, java.lang.String str) {
        return context.getResources().getIdentifier(str, "layout", context.getPackageName());
    }
}
