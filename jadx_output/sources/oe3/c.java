package oe3;

/* loaded from: classes7.dex */
public final class c extends hq0.i0 {
    public java.lang.ref.WeakReference A;
    public final java.util.HashSet B;
    public final java.util.HashSet C;
    public long D;
    public long E;

    /* renamed from: x, reason: collision with root package name */
    public bf3.p f344794x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f344795y;

    /* renamed from: z, reason: collision with root package name */
    public se3.e f344796z;

    public c() {
        super(null, 1, null);
        jc3.y0 wi6 = ((com.tencent.mm.advertise.impl.jsapi.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicSclDemo");
        this.B = kz5.p1.d(new md3.o(), new qe3.a(), new qe3.b(), new ce3.a("MagicAdBrandService"), new ce3.d("MagicAdBrandService"), new vd3.f(), new vd3.d());
        java.util.HashSet d17 = kz5.p1.d(com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.class.getName(), ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(com.tencent.mm.plugin.appbrand.jsapi.eb.CTRL_INDEX).getClass().getName(), ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(64).getClass().getName(), ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(63).getClass().getName());
        d17.addAll(wi6.f299013b);
        this.C = d17;
        this.D = java.lang.System.currentTimeMillis();
        this.E = java.lang.System.currentTimeMillis();
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.A;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        throw new jz5.k("An operation is not implemented: not implemented");
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicSclDemo";
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = true;
        bf3.p pVar = this.f344794x;
        if (pVar != null) {
            mBBuildConfig.f147831u = pVar;
        }
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.a(this.B);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, this.C);
        I1(mBBuildConfig);
    }

    @Override // hq0.i0, jc3.g0
    public void c(int i17, boolean z17) {
        super.c(i17, z17);
        com.tencent.mars.xlog.Log.i("vird", "cost " + (java.lang.System.currentTimeMillis() - this.D));
    }

    @Override // hq0.i0
    public void destroy() {
        pm0.v.X(new oe3.a(this));
        super.destroy();
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        jc3.j0 j0Var = this.f282995g;
        if (j0Var != null) {
            jc3.j0.d(j0Var, "mb.switchVConsole(true);", null, 2, null);
        }
        com.tencent.mars.xlog.Log.i("MagicSclDemoBiz", "onMainScriptInjected");
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        super.s1(root, frameSet, info);
        this.D = java.lang.System.currentTimeMillis();
    }

    @Override // hq0.i0
    public void x1(hq0.e0 root, fq0.x frameSet) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        super.x1(root, frameSet);
        this.E = java.lang.System.currentTimeMillis();
        frameSet.f265484h = new oe3.b(this);
    }
}
