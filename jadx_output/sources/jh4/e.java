package jh4;

/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.SharedPreferences f299853a = com.tencent.mm.sdk.platformtools.x2.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f299854b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f299855c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f299856d = true;

    public static void a() {
        if (f299856d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgCrashHelper", "markDrawEndPoint");
            f299853a.edit().putInt("dynamic_bg_draw_start_point_count", 0).apply();
            f299853a.edit().putBoolean("dynamic_bg_will_crash", false).apply();
            gh4.j0.c(true);
            f299856d = false;
        }
    }

    public static void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgCrashHelper", "markInitCrash");
        gh4.j0.c(false);
        if (f299853a == null) {
            f299853a = com.tencent.mm.sdk.platformtools.x2.d();
        }
        android.content.SharedPreferences sharedPreferences = f299853a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("dynamic_bg_init_crash", true).apply();
        }
        f299855c = true;
    }

    public static void c() {
        if (f299853a == null) {
            f299853a = com.tencent.mm.sdk.platformtools.x2.d();
        }
        android.content.SharedPreferences sharedPreferences = f299853a;
        if (sharedPreferences != null) {
            int i17 = sharedPreferences.getInt("dynamic_bg_init_start_point_count", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.DynamicBgCrashHelper", "markInitStartPoint current: %d", java.lang.Integer.valueOf(i17));
            if (i17 > 2) {
                gh4.j0.c(false);
                f299853a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
            }
            f299853a.edit().putInt("dynamic_bg_init_start_point_count", i17 + 1).apply();
        }
    }

    public static void d() {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences sharedPreferences = f299853a;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putInt("dynamic_bg_init_start_point_count", 0);
            edit.putInt("dynamic_bg_draw_start_point_count", 0);
            edit.putBoolean("dynamic_bg_init_crash", false);
            edit.putBoolean("dynamic_bg_will_crash", false);
            edit.apply();
        }
        f299855c = false;
        f299854b = false;
    }
}
