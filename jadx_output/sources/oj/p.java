package oj;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final android.app.ActivityManager f345712a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f345713b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f345714c;

    static {
        if (!ih.d.c()) {
            throw new java.lang.IllegalStateException("Matrix is NOT installed or MemoryInfoFactory is not initialized!!!");
        }
        ih.d d17 = ih.d.d();
        kotlin.jvm.internal.o.f(d17, "Matrix.with()");
        android.app.Application application = d17.f291471b;
        java.lang.Object systemService = application != null ? application.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME) : null;
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        f345712a = activityManager;
        f345713b = activityManager.getMemoryClass();
        f345714c = activityManager.getLargeMemoryClass();
    }
}
