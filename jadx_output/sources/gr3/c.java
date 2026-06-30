package gr3;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final gr3.c f274848a = new gr3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f274849b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f274850c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f274851d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f274852e = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f274853f = new java.util.concurrent.atomic.AtomicLong(0);

    public static final void c(long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2127L, j17, 1L, false);
    }

    public static final void d(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String b17 = f274848a.b(activity);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f274849b;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(b17);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileMonitor", "recordFirstScreenLoadEnd: startTime is null for " + b17);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(2127L, 11L, currentTimeMillis, false);
        if (currentTimeMillis > 3000) {
            g0Var.idkeyStat(2127L, 13L, 1L, true);
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileMonitor", "recordFirstScreenLoadEnd: white screen, duration=" + currentTimeMillis + "ms");
        }
        concurrentHashMap.remove(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileMonitor", "bobkw recordFirstScreenLoadEnd: duration=" + currentTimeMillis + "ms");
    }

    public static final void e(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String a17 = f274848a.a(activity, com.google.android.gms.common.Scopes.PROFILE);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f274851d;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(a17);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileMonitor", "recordProfileDataFetchEnd: startTime is null for " + a17);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2127L, 30L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
            concurrentHashMap.remove(a17);
        }
    }

    public static final void f(android.app.Activity activity, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        f274850c.put(f274848a.b(activity) + "_tab_" + i17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final java.lang.String a(android.app.Activity activity, java.lang.String str) {
        return b(activity) + '_' + str;
    }

    public final java.lang.String b(android.app.Activity activity) {
        if (activity == null) {
            return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        return activity.getClass().getSimpleName() + '_' + java.lang.System.identityHashCode(activity);
    }
}
