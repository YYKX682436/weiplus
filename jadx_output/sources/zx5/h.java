package zx5;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static long f477243a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f477244b;

    /* renamed from: c, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicBoolean f477245c;

    public static synchronized void a(boolean z17) {
        synchronized (zx5.h.class) {
            by5.c4.f("XWebAutoUpdater", "enableAutoCheckUpdate, flag:" + z17);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f477245c;
            if (atomicBoolean == null) {
                f477245c = new java.util.concurrent.atomic.AtomicBoolean(z17);
            } else {
                if (atomicBoolean.get() == z17) {
                    by5.c4.f("XWebAutoUpdater", "enableAutoCheckUpdate, flag not changed");
                    return;
                }
                f477245c.set(z17);
            }
            if (f477245c.get()) {
                b();
            } else {
                c();
            }
        }
    }

    public static synchronized void b() {
        boolean z17;
        synchronized (zx5.h.class) {
            if (!org.xwalk.core.XWalkEnvironment.p()) {
                by5.c4.g("XWebAutoUpdater", "startAutoCheckUpdate, xweb environment not inited");
                return;
            }
            try {
                b5.w.c(org.xwalk.core.XWalkEnvironment.f347970c);
                z17 = true;
            } catch (java.lang.Exception e17) {
                by5.c4.d("XWebAutoUpdater", "checkWorkManagerInit error", e17);
                z17 = false;
            }
            if (!z17) {
                by5.c4.g("XWebAutoUpdater", "startAutoCheckUpdate, work manager not init");
                return;
            }
            long m17 = by5.l0.m();
            if (f477243a == m17) {
                by5.c4.f("XWebAutoUpdater", "startAutoCheckUpdate, timeThreshold not changed");
                return;
            }
            f477243a = m17;
            by5.c4.f("XWebAutoUpdater", "startAutoCheckUpdate, timeThreshold:" + m17);
            long j17 = m17 + 600000;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
            new b5.h(b5.w.c(org.xwalk.core.XWalkEnvironment.f347970c), "auto_check_update", a5.n.REPLACE, java.util.Collections.singletonList((a5.m0) ((a5.l0) new a5.l0(com.tencent.xweb.updater.XWebAutoUpdateWorker.class, j17, timeUnit).e(j17, timeUnit)).a())).a();
            f477244b = true;
        }
    }

    public static synchronized void c() {
        boolean z17;
        synchronized (zx5.h.class) {
            if (!org.xwalk.core.XWalkEnvironment.p()) {
                by5.c4.g("XWebAutoUpdater", "stopAutoCheckUpdate, xweb environment not inited");
                return;
            }
            try {
                b5.w.c(org.xwalk.core.XWalkEnvironment.f347970c);
                z17 = true;
            } catch (java.lang.Exception e17) {
                by5.c4.d("XWebAutoUpdater", "checkWorkManagerInit error", e17);
                z17 = false;
            }
            if (!z17) {
                by5.c4.g("XWebAutoUpdater", "stopAutoCheckUpdate, work manager not init");
                return;
            }
            by5.c4.f("XWebAutoUpdater", "stopAutoCheckUpdate");
            b5.w c17 = b5.w.c(org.xwalk.core.XWalkEnvironment.f347970c);
            ((m5.c) c17.f17898d).a(new k5.c(c17, "auto_check_update", true));
            f477244b = false;
        }
    }
}
