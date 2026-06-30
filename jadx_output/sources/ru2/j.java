package ru2;

/* loaded from: classes8.dex */
public final class j implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Runnable f399743f;

    /* renamed from: g, reason: collision with root package name */
    public static java.util.concurrent.Future f399744g;

    /* renamed from: h, reason: collision with root package name */
    public static java.util.concurrent.Future f399745h;

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f399748n;

    /* renamed from: d, reason: collision with root package name */
    public static final ru2.j f399741d = new ru2.j();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f399742e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f399746i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashSet f399747m = new java.util.HashSet();

    public final java.util.concurrent.Future a(final yz5.a aVar, long j17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.trtc.hardwareearmonitor.honor.HonorResultCode.BLUETOOTH_HD_FB_NOT_SUPPORT, 0);
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLifecycleCallback", str + " return for delayMs:" + j17);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLifecycleCallback", str + " delayMs:" + j17);
        return ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable(aVar) { // from class: ru2.h

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f399740d;

            {
                kotlin.jvm.internal.o.g(aVar, "function");
                this.f399740d = aVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f399740d.invoke();
            }
        }, j17);
    }

    public final java.lang.String b(android.app.Activity activity) {
        return activity.getClass().getName() + '_' + activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity p07, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(p07, "p0");
        i95.m c17 = i95.n0.c(zy2.aa.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.extension.reddot.m2 m2Var = (com.tencent.mm.plugin.finder.extension.reddot.m2) ((zy2.aa) c17);
        if (kotlin.jvm.internal.o.b(p07.getClass().getName(), "com.tencent.mm.ui.LauncherUI")) {
            if (gm0.j1.a()) {
                pm0.v.K(null, new com.tencent.mm.plugin.finder.extension.reddot.l2(m2Var));
            } else {
                m2Var.f105700d.compareAndSet(false, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        b(p07);
        java.lang.String simpleName = p07.getClass().getSimpleName();
        boolean z17 = (p07 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) || r26.n0.B(p07.getClass().getName(), "com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI", false) || r26.n0.B(p07.getClass().getName(), "com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLifecycleCallback", "isFinder=" + z17 + ",activity=" + p07 + ",name=" + p07.getClass().getName());
        if (!z17) {
            p07 = null;
        }
        if (p07 != null) {
            f399747m.add(f399741d.b(p07));
            if (f399748n) {
                return;
            }
            f399748n = true;
            ((ku5.t0) ku5.t0.f312615d).A("FINDER-BG");
            pm0.v.N("FINDER-FG", false, new ru2.b(simpleName));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity p07, android.os.Bundle p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        b(p07);
        java.util.HashSet hashSet = f399747m;
        hashSet.remove(b(p07));
        java.lang.String simpleName = p07.getClass().getSimpleName();
        if (f399748n && hashSet.isEmpty()) {
            f399748n = false;
            pm0.v.P("FINDER-BG", false, new ru2.c(simpleName), 600L);
        }
    }
}
