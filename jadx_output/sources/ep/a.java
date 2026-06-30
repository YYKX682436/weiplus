package ep;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f255598a;

    public static boolean a() {
        if (f255598a == 0) {
            android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
            if (d17 == null || !d17.getBoolean("settings_support_swipe", true)) {
                f255598a = 2;
            } else {
                f255598a = 1;
            }
        }
        return f255598a == 1;
    }

    public static void b(boolean z17) {
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        boolean z18 = d17.getBoolean("settings_support_swipe", true);
        if (z18 != z17) {
            d17.edit().putBoolean("settings_support_swipe", z17).commit();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StyleUtil", "switchSwipebackMode, from %B to %B", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
    }
}
