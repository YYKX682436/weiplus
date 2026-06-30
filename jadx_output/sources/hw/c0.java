package hw;

/* loaded from: classes7.dex */
public abstract class c0 extends hq0.i0 {
    public final java.util.HashMap A;
    public yz5.a B;
    public boolean C;
    public final java.util.HashSet D;
    public final java.util.HashSet E;
    public final hw.x F;

    /* renamed from: x, reason: collision with root package name */
    public final fw.v f285362x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f285363y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.ref.WeakReference f285364z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(fw.v flutterPlugin) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(flutterPlugin, "flutterPlugin");
        this.f285362x = flutterPlugin;
        this.f285363y = new java.util.concurrent.CopyOnWriteArrayList();
        this.A = new java.util.HashMap(2);
        java.lang.String bizName = O0();
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.util.Set e17 = kz5.p1.e(new ce3.a(bizName), new ce3.d(bizName), new vd3.f(), new vd3.d(), new md3.t(), new rd3.j(), new rd3.k(), new sd3.c(), new sd3.b(), new md3.c(), new vd3.c(), new md3.q(), new md3.u(), new md3.l(), new mw.b(), new mw.a(), new lw.a(), new jw.b(), new kw.b(), new iw.a());
        kz5.n0.O0(((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni(bizName), e17);
        java.util.HashSet d17 = kz5.p1.d(((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(763).getClass().getName());
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(508);
        kotlin.jvm.internal.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.lang.String O0 = O0();
        com.tencent.mm.plugin.magicbrush.m5 m5Var = (com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class));
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc2 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(408);
        kotlin.jvm.internal.o.e(Vc2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.lang.String O02 = O0();
        com.tencent.mm.plugin.magicbrush.m5 m5Var2 = (com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class));
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc3 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(764);
        kotlin.jvm.internal.o.e(Vc3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.util.HashSet d18 = kz5.p1.d(m5Var.Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc, O0), m5Var2.Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc2, O02), ((com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class))).Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc3, O0()));
        d18.addAll(e17);
        this.D = d18;
        java.lang.String name = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(com.tencent.mm.plugin.appbrand.jsapi.o8.CTRL_INDEX).getClass().getName();
        java.lang.String name2 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(66505).getClass().getName();
        java.lang.String name3 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(66506).getClass().getName();
        java.lang.String name4 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(66648).getClass().getName();
        new be1.a1();
        java.util.HashSet d19 = kz5.p1.d(name, name2, name3, name4, be1.a1.class.getName());
        d19.addAll(d17);
        this.E = d19;
        flutterPlugin.f267037r = new java.lang.ref.WeakReference(this);
        ((ku5.t0) ku5.t0.f312615d).q(new hw.q(this));
        this.F = new hw.x(this);
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.f285364z;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new hw.w(this);
    }

    @Override // hq0.i0
    public void G1(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        super.G1(key, value);
    }

    @Override // hq0.i0
    public void I1(com.tencent.mm.plugin.magicbrush.MBBuildConfig buildConfig) {
        kotlin.jvm.internal.o.g(buildConfig, "buildConfig");
        buildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        buildConfig.a(kz5.p1.d(new sp0.g(), new sp0.e(), new sp0.f()));
        buildConfig.a(this.D);
        com.tencent.mm.plugin.magicbrush.y4.a(buildConfig, this.E);
        super.I1(buildConfig);
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        hq0.e0 H0 = H0(this, context, O0(), "frames", "", true);
        fw.v vVar = this.f285362x;
        vVar.getClass();
        vVar.f242289e.put(H0.f282984e, H0);
        this.A.put("frames", H0);
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        java.lang.ref.WeakReference weakReference;
        android.app.Activity activity;
        this.f282998m.f283028a.clear();
        com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner processUIResumedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE;
        boolean isForeground = processUIResumedStateOwner.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsTLBaseBiz", "onConnException foreground: " + isForeground + ", bizName:" + O0());
        super.b1();
        if (z65.c.a() && (weakReference = this.f285364z) != null && (activity = (android.app.Activity) weakReference.get()) != null) {
            pm0.v.X(new hw.b0(activity));
        }
        if (!isForeground) {
            hw.x xVar = this.F;
            processUIResumedStateOwner.removeLifecycleCallback(xVar);
            processUIResumedStateOwner.addLifecycleCallback(xVar);
        } else {
            yz5.a aVar = this.B;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // hq0.i0
    public void destroy() {
        java.lang.String str;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MagicEcsTLBaseBiz", "destroy", new java.lang.Object[0]);
        fw.v vVar = this.f285362x;
        vVar.getClass();
        d75.b.g(new dq0.v(vVar));
        java.util.HashMap hashMap = this.A;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            hq0.e0 e0Var = (hq0.e0) ((java.util.Map.Entry) it.next()).getValue();
            if (e0Var != null && (str = e0Var.f282984e) != null) {
                vVar.i(str);
            }
        }
        hashMap.clear();
        super.destroy();
        if (z65.c.a()) {
            this.f285363y.clear();
        }
    }

    @Override // hq0.i0
    public boolean g1() {
        java.lang.ref.WeakReference weakReference = this.f285364z;
        if (weakReference != null) {
            kotlin.jvm.internal.o.d(weakReference);
            if (weakReference.get() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        jc3.j0 j0Var;
        if (z65.c.a() && (j0Var = this.f282995g) != null) {
            kotlin.jvm.internal.o.d(j0Var);
            synchronized (j0Var) {
                java.util.Iterator it = this.f285363y.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.f.a(it.next());
                    kotlin.jvm.internal.o.d(this.f282995g);
                    throw null;
                }
            }
        }
        super.n();
    }

    @Override // hq0.i0, jc3.u
    public void onCreated() {
        super.onCreated();
    }

    @Override // hq0.i0
    public void w1(hq0.e0 root) {
        kotlin.jvm.internal.o.g(root, "root");
        super.w1(root);
    }
}
