package k35;

/* loaded from: classes11.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f303941a = {0, 259200000, 604800000};

    public static void a() {
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4);
        sharedPreferences.edit().putLong("tinker-boots-last-show", java.lang.System.currentTimeMillis()).apply();
        sharedPreferences.edit().putInt("tinker-boots-show-time", sharedPreferences.getInt("tinker-boots-show-time", 0) + 1).apply();
    }
}
