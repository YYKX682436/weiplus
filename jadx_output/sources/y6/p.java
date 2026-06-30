package y6;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final int f459602e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f459603a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.ActivityManager f459604b;

    /* renamed from: c, reason: collision with root package name */
    public final y6.r f459605c;

    /* renamed from: d, reason: collision with root package name */
    public final float f459606d;

    static {
        f459602e = android.os.Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public p(android.content.Context context) {
        this.f459606d = f459602e;
        this.f459603a = context;
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f459604b = activityManager;
        this.f459605c = new y6.q(context.getResources().getDisplayMetrics());
        if (android.os.Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f459606d = 0.0f;
    }
}
