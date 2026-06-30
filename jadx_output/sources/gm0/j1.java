package gm0;

/* loaded from: classes12.dex */
public final class j1 {

    /* renamed from: m, reason: collision with root package name */
    public static gm0.j1 f273206m;

    /* renamed from: a, reason: collision with root package name */
    public final gm0.z1 f273208a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.u3 f273209b;

    /* renamed from: c, reason: collision with root package name */
    public final c01.kd f273210c;

    /* renamed from: d, reason: collision with root package name */
    public gm0.b0 f273211d;

    /* renamed from: e, reason: collision with root package name */
    public gm0.m f273212e;

    /* renamed from: f, reason: collision with root package name */
    public gm0.y f273213f;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f273217j;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String[] f273205l = {":appbrand0", ":appbrand1", ":appbrand2", ":appbrand3", ":appbrand4"};

    /* renamed from: n, reason: collision with root package name */
    public static final gm0.p1 f273207n = new gm0.p1();

    /* renamed from: g, reason: collision with root package name */
    public final bm5.x0 f273214g = new bm5.x0(new gm0.j1$$a());

    /* renamed from: h, reason: collision with root package name */
    public final gm0.n1 f273215h = new gm0.n1(null);

    /* renamed from: i, reason: collision with root package name */
    public final gm0.w f273216i = new gm0.w();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f273218k = false;

    public j1(km0.c cVar) {
        gm0.z1 z1Var;
        this.f273210c = null;
        synchronized (gm0.z1.class) {
            if (gm0.z1.f273295j != null) {
                gm0.c2.a("MicroMsg.MMSkeleton", "Kernel not null, has initialized.", new java.lang.Object[0]);
                z1Var = gm0.z1.f273295j;
            } else {
                gm0.c2.a("MicroMsg.MMSkeleton", "Initialize skeleton, create whole world.", new java.lang.Object[0]);
                gm0.z1 z1Var2 = new gm0.z1(cVar);
                gm0.z1.f273295j = z1Var2;
                z1Var = z1Var2;
            }
        }
        this.f273208a = z1Var;
        boolean a17 = ((km0.c) z1Var.b().a()).a();
        this.f273217j = a17;
        if (a17) {
            this.f273210c = new c01.kd();
            com.tencent.mm.sdk.platformtools.u3 u3Var = new com.tencent.mm.sdk.platformtools.u3(s75.a.a("worker"));
            this.f273209b = u3Var;
            u3Var.j(new gm0.k1(this));
        }
    }

    public static boolean a() {
        gm0.m mVar;
        if (com.tencent.mm.sdk.platformtools.x2.n() && (mVar = i().f273212e) != null && mVar.m()) {
            return mVar.f273253p;
        }
        return false;
    }

    public static gm0.m b() {
        iz5.a.d("mCoreAccount not initialized!", i().f273212e);
        return i().f273212e;
    }

    public static com.tencent.mm.modelbase.r1 d() {
        i();
        return n().f273288b;
    }

    public static com.tencent.mm.sdk.platformtools.u3 e() {
        iz5.a.g(null, i().f273217j);
        return i().f273209b;
    }

    public static c01.kd f() {
        iz5.a.g(null, i().f273217j);
        return i().f273210c;
    }

    public static synchronized void g(km0.c cVar) {
        synchronized (gm0.j1.class) {
            gm0.j1 j1Var = f273206m;
            if (j1Var != null) {
                ((km0.c) j1Var.f273208a.b().a()).f308989c = cVar.f308989c;
                com.tencent.mars.xlog.Log.i("MicroMsg.MMKernel", "Kernel not null, has initialized.");
            } else {
                gm0.c2.f273172b = new gm0.l1();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMKernel", "Initialize kernel, create whole WeChat world.");
                f273206m = new gm0.j1(cVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMKernel", "[+] Call post initialized callbacks now.");
                f273207n.s();
            }
        }
    }

    public static boolean h() {
        return f273206m != null;
    }

    public static gm0.j1 i() {
        iz5.a.d("Kernel not initialized by MMApplication!", f273206m);
        return f273206m;
    }

    public static boolean j() {
        gm0.m mVar = i().f273212e;
        if (mVar != null) {
            return mVar.f273253p;
        }
        return false;
    }

    public static gm0.y n() {
        iz5.a.d("mCoreNetwork not initialized!", i().f273213f);
        return i().f273213f;
    }

    public static gm0.z o() {
        gm0.z zVar = i().f273208a.f273296a;
        iz5.a.d("mCorePlugins not initialized!", zVar);
        iz5.a.d("mCorePlugins not initialized!", zVar);
        gm0.z zVar2 = i().f273208a.f273296a;
        iz5.a.d("mCorePlugins not initialized!", zVar2);
        return zVar2;
    }

    public static gm0.a0 p() {
        iz5.a.d("mCoreProcess not initialized!", i().f273208a.b());
        return i().f273208a.b();
    }

    public static void q(java.lang.Class cls, lm0.a aVar) {
        i();
        gm0.z o17 = o();
        o17.f273294a.a(cls, new lm0.f(aVar));
    }

    public static lm0.a s(java.lang.Class cls) {
        i();
        lm0.a b17 = o().f273294a.b(cls);
        if (b17 != null) {
            return b17;
        }
        iz5.a.d("Skeleton not initialized!", gm0.z1.f273295j);
        android.app.Application application = gm0.z1.f273295j.b().a().f308989c;
        return null;
    }

    public static s85.d t() {
        return (s85.d) i().f273214g.b();
    }

    public static gm0.b0 u() {
        iz5.a.d("mCoreStorage not initialized!", i().f273211d);
        return i().f273211d;
    }

    public void c(hm0.x xVar) {
        gm0.z1 z1Var = this.f273208a;
        z1Var.a(z1Var.f273304i, xVar);
    }

    public void k(int i17) {
        gm0.m b17 = b();
        b17.getClass();
        if ((i17 != 0) && gm0.l.a(gm0.m.f273233v) == i17 && b17.m()) {
            com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "loginUin, uin not changed, return :%d", java.lang.Integer.valueOf(i17));
            return;
        }
        synchronized (b17.f273240c) {
            gm0.l.b(gm0.m.f273233v, i17);
            b17.y();
            b17.f273251n = android.os.SystemClock.elapsedRealtime();
            b17.p(true);
        }
    }

    public void l(java.lang.String str) {
        java.lang.String a17 = kk.v.a(this.f273212e.h());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.w("MicroMsg.MMKernel", "logoutAccount uin:%s info:%s stack:%s", a17, str, new com.tencent.mm.sdk.platformtools.z3());
        gm0.m.f273234w = com.tencent.mm.sdk.platformtools.z3.b(true) + str;
        this.f273212e.l().a((long) this.f273212e.h());
        r();
        this.f273212e.getClass();
        gm0.l.b(gm0.m.f273233v, 0);
        gm0.m.f273232u = false;
    }

    public void m(hm0.x xVar) {
        gm0.z1 z1Var = this.f273208a;
        z1Var.a(z1Var.f273303h, xVar);
    }

    public void r() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[1];
        gm0.m mVar = this.f273212e;
        java.lang.String a17 = mVar != null ? kk.v.a(mVar.h()) : "-1";
        objArr[0] = a17;
        com.tencent.mars.xlog.Log.w("MicroMsg.MMKernel", "release uin:%s ", objArr);
        com.tencent.mm.modelbase.r1 r1Var = this.f273213f.f273288b;
        if (r1Var != null) {
            r1Var.r();
        }
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        synchronized (t0Var) {
            if (t0Var.f312617a.compareAndSet(false, true)) {
                java.util.Iterator it = xu5.b.f457300e.values().iterator();
                while (it.hasNext()) {
                    ((xu5.b) it.next()).f457303b.g();
                }
                xu5.b.f457300e.clear();
                vu5.l lVar = t0Var.f312619c;
                vu5.f fVar = lVar.f440359a;
                if (fVar.f440345d.compareAndSet(false, true)) {
                    fVar.e();
                }
                vu5.j jVar = lVar.f440360b;
                if (jVar.f440345d.compareAndSet(false, true)) {
                    jVar.d();
                }
                vu5.q qVar = lVar.f440361c;
                if (qVar.f440345d.compareAndSet(false, true)) {
                    qVar.d();
                }
                ku5.o.f312599c.i("PoolAdapter", "[shutdown]", new java.lang.Object[0]);
                java.util.Iterator it6 = ru5.k.f399809a.values().iterator();
                while (it6.hasNext()) {
                    ((ru5.j) it6.next()).j();
                }
                java.util.Iterator it7 = ru5.d.f399793c.values().iterator();
                while (it7.hasNext()) {
                    android.os.Handler handler = (android.os.Handler) ((java.lang.ref.WeakReference) it7.next()).get();
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                }
                ku5.o.f312597a.shutdown();
            }
        }
        pu5.g.f358471a.j();
        if (((ku5.t0) ku5.t0.f312615d).f312618b.f312559f) {
            try {
                java.util.concurrent.Executor executor = ku5.u.f312620a;
                zu5.a aVar = new zu5.a(android.os.AsyncTask.class, "THREAD_POOL_EXECUTOR");
                synchronized (aVar) {
                    aVar.c(null, executor, false);
                }
            } catch (java.lang.Exception e17) {
                ku5.o.f312599c.e("ThreadModuleBoot", e17.toString(), new java.lang.Object[0]);
            }
            ku5.u.f312620a = null;
        }
        com.tencent.mm.sdk.platformtools.u3 u3Var = this.f273209b;
        if (u3Var != null) {
            gm0.m1 m1Var = new gm0.m1(this);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset tid[%d] stack:%s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
            iz5.a.g("syncReset should in mainThread", com.tencent.mm.sdk.platformtools.u3.e());
            long id6 = u3Var.f193015a.getId();
            byte[] bArr = new byte[0];
            com.tencent.mm.sdk.platformtools.p3 p3Var = new com.tencent.mm.sdk.platformtools.p3(u3Var, m1Var, u3Var.f193017c, bArr);
            synchronized (bArr) {
                int g17 = u3Var.g(p3Var);
                long id7 = u3Var.f193015a.getId();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset postAtFrontOfWorker ret[%d], oldTid[%d], curTid[%d]", java.lang.Integer.valueOf(g17), java.lang.Long.valueOf(id6), java.lang.Long.valueOf(id7));
                if (g17 == 0 && id6 == id7) {
                    try {
                        bArr.wait();
                    } catch (java.lang.Exception e18) {
                        e18.getMessage();
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMKernel", "release uin:%s finish!!! cost:%sms", a17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
