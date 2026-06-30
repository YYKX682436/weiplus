package im0;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static long f292163b;

    /* renamed from: c, reason: collision with root package name */
    public static long f292164c;

    /* renamed from: a, reason: collision with root package name */
    public im0.b f292165a;

    public static final void a(java.lang.String str, java.lang.Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            gm0.c2.a("MMSkeleton.Boot", str, new java.lang.Object[0]);
        } else {
            gm0.c2.a("MMSkeleton.Boot", str, objArr);
        }
    }

    public void b(km0.b bVar) {
        a("boot execute extension... ", new java.lang.Object[0]);
        ((im0.h) this.f292165a).getClass();
        a("startup final step, account initialize... for parallels", new java.lang.Object[0]);
        if (bVar.a() && gm0.j1.b().m()) {
            gm0.j1.b().w(false);
        }
        boolean z17 = bVar.a() && gm0.j1.b().m();
        if (!gm0.j1.a()) {
            i95.n0.k(false);
        }
        nm.j jVar = nm.j.f338443g;
        nm.c cVar = nm.c.Now;
        if (jVar.f338449f.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement", "initialize pending plugins from %s", cVar);
            im0.g gVar = im0.g.f292167g;
            gVar.getClass();
            int[] iArr = nm.a.f338400a;
            gm0.c2.b("initializePendingPlugins");
            if (gVar.f292170f.compareAndSet(false, true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CallbacksProxy", "initialize pending plugins.");
                gm0.c2.b("configureAndExecutePendingPlugins");
                gm0.c2.b("configureAndExecutePendingPlugins done");
                gVar.f292169e = true;
                if (((km0.c) gm0.j1.p().a()).a()) {
                    if (gm0.j1.b().m()) {
                        gm0.c2.b("preloadServicesWithAsyncModeOnDemand-before_firstscreen");
                        i95.n0.e(false, false);
                    }
                    gm0.j1.b().b();
                }
                gm0.c2.b("initializePendingPlugins done");
            }
            synchronized (jVar) {
                jVar.f338446c = true;
                jVar.b();
            }
        }
        if (z17) {
            gm0.j1.b().C();
        }
        int[] iArr2 = nm.a.f338400a;
        gm0.c2.b("afterAccountInit");
    }

    public void c() {
        f292164c = android.os.SystemClock.elapsedRealtime();
        a("hello WeChat.", new java.lang.Object[0]);
        com.tencent.mm.legacy.app.j jVar = (com.tencent.mm.legacy.app.j) this.f292165a;
        jVar.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            try {
                com.tencent.mars.comm.MMWakerLock[] mMWakerLockArr = com.tencent.mm.booter.CoreService.f63235w;
                if (mMWakerLockArr[0] == null) {
                    synchronized (mMWakerLockArr) {
                        if (mMWakerLockArr[0] == null) {
                            mMWakerLockArr[0] = new com.tencent.mars.comm.MMWakerLock(context, "push_wake");
                        }
                    }
                }
                mMWakerLockArr[0].lock(300000L);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CoreService", th6, "[-] Fail to call tryToAvoidHibernating().", new java.lang.Object[0]);
            }
        }
        int[] iArr = nm.a.f338400a;
        gm0.c2.b("helloWeChat");
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.legacy.app.i(jVar), com.tencent.mm.sdk.platformtools.x2.n() ? 180000L : 360000L);
    }
}
