package fh1;

/* loaded from: classes7.dex */
public final class x0 extends hq0.i0 {
    public static jc3.o P;
    public final java.lang.String A;
    public hq0.e0 B;
    public final java.util.concurrent.ConcurrentHashMap C;
    public final java.util.concurrent.atomic.AtomicBoolean D;
    public final java.util.concurrent.ConcurrentSkipListSet E;
    public yz5.a F;
    public final java.util.concurrent.atomic.AtomicBoolean G;
    public final fh1.u0 H;

    /* renamed from: x, reason: collision with root package name */
    public final fh1.i f262622x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f262623y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f262624z;
    public static final fh1.s0 I = new fh1.s0(null);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.HashMap f262621J = new java.util.HashMap();
    public static final java.util.HashMap K = new java.util.HashMap();
    public static final java.util.HashMap L = new java.util.HashMap();
    public static final android.util.SparseIntArray M = new android.util.SparseIntArray();
    public static final java.util.HashMap N = new java.util.HashMap();
    public static final hq0.e Q = new fh1.r0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(fh1.i host, java.lang.String str, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader wxaCommLib) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(wxaCommLib, "wxaCommLib");
        this.f262622x = host;
        this.f262623y = str;
        this.f262624z = wxaCommLib;
        java.lang.String str2 = "MicroMsg.MagicSclMBFrameBiz(" + hashCode() + ')';
        this.A = str2;
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.E = new java.util.concurrent.ConcurrentSkipListSet(fh1.w0.f262616d);
        this.G = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mars.xlog.Log.i(str2, "<init>");
        hq0.e eVar = Q;
        kotlin.jvm.internal.o.d(eVar);
        this.f283003r = eVar;
        X0();
        this.H = new fh1.u0(this);
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new fh1.t0();
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicWeAppMagicBrushFrame";
    }

    @Override // hq0.i0
    public void X0() {
        java.lang.String str;
        super.X0();
        if (com.tencent.mm.plugin.magicbrush.a5.f147838c) {
            x5();
        }
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147823m = true;
        java.util.HashSet d17 = kz5.p1.d(new gh1.a(), new gh1.b(), new gh1.d(), new gh1.c());
        ej1.b bVar = new ej1.b();
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.auth.o2.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.gc.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.p.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.v.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.j0.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.k0.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.c.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.d.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.e.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.f.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.s.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.v.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.b0.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.c0.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.h.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.storage.i.class, null);
        bVar.a(ad1.e.class, fj1.a.f263102d);
        bVar.a(ad1.f.class, fj1.b.f263104d);
        bVar.a(ad1.g.class, null);
        bVar.a(com.tencent.mm.plugin.appbrand.jsapi.auth.j4.class, null);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : bVar.entrySet()) {
            java.lang.Class cls = ((ej1.a) entry.getValue()).f253275a;
            hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.a1.class.isAssignableFrom(cls) ? new fj1.p(cls) : new fj1.n(cls));
        }
        d17.addAll(hashSet);
        mBBuildConfig.a(d17);
        jc3.j0 j0Var = this.f282995g;
        if (j0Var == null || (str = ((rc3.w0) j0Var).f394087e) == null) {
            str = "";
        }
        mBBuildConfig.f147824n = new com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs(str, this.f262623y, this.f262624z);
        mBBuildConfig.f147818e.add(com.tencent.mm.plugin.appbrand.jsapi.h6.class.getName());
        I1(mBBuildConfig);
        start();
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner appUIForegroundOwner = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE;
        boolean isForeground = appUIForegroundOwner.isForeground();
        com.tencent.mars.xlog.Log.i(this.A, "onConnException foreground: " + isForeground);
        super.b1();
        if (z65.c.a()) {
            pm0.v.X(fh1.v0.f262609d);
        }
        if (!isForeground) {
            fh1.u0 u0Var = this.H;
            appUIForegroundOwner.removeLifecycleCallback(u0Var);
            appUIForegroundOwner.addLifecycleCallback(u0Var);
        } else {
            yz5.a aVar = this.F;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        this.G.set(true);
    }

    @Override // hq0.i0, jc3.u
    public void x5() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.D;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = this.E;
        super.x5();
        com.tencent.mars.xlog.Log.i(this.A, "onServiceReady");
        while (true) {
            try {
                if (!(!concurrentSkipListSet.isEmpty())) {
                    return;
                }
                yz5.a aVar = (yz5.a) concurrentSkipListSet.pollFirst();
                if (aVar != null) {
                    aVar.invoke();
                }
            } finally {
                atomicBoolean.set(true);
            }
        }
    }
}
