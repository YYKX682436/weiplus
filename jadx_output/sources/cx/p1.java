package cx;

/* loaded from: classes7.dex */
public final class p1 extends cx.w0 {
    public android.widget.FrameLayout E;
    public final java.util.HashSet F;
    public final java.util.HashSet G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(ax.b flutterPlugin) {
        super(flutterPlugin);
        kotlin.jvm.internal.o.g(flutterPlugin, "flutterPlugin");
        dx.b a17 = dx.a.f244417a.a("MagicBrandService");
        jc3.y0 wi6 = ((com.tencent.mm.advertise.impl.jsapi.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicBrandService");
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(508);
        kotlin.jvm.internal.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        com.tencent.mm.plugin.magicbrush.m5 m5Var = (com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class));
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc2 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(408);
        kotlin.jvm.internal.o.e(Vc2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        com.tencent.mm.plugin.magicbrush.m5 m5Var2 = (com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class));
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc3 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(764);
        kotlin.jvm.internal.o.e(Vc3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        java.util.HashSet d17 = kz5.p1.d(m5Var.Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc, "MagicBrandService"), m5Var2.Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc2, "MagicBrandService"), ((com.tencent.mm.plugin.magicbrush.m5) ((com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class))).Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc3, "MagicBrandService"));
        d17.addAll(a17.f244418a);
        d17.addAll(wi6.f299012a);
        this.F = d17;
        java.lang.String name = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(com.tencent.mm.plugin.appbrand.jsapi.o8.CTRL_INDEX).getClass().getName();
        java.lang.String name2 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(66505).getClass().getName();
        java.lang.String name3 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(66506).getClass().getName();
        java.lang.String name4 = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(66648).getClass().getName();
        new be1.a1();
        java.util.HashSet d18 = kz5.p1.d(name, name2, name3, name4, be1.a1.class.getName());
        d18.addAll(a17.f244419b);
        d18.addAll(wi6.f299013b);
        this.G = d18;
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicBrandService";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.tencent.mars.xlog.Log.e("MagicBrandServiceBiz", "onJSException envId:" + envId + " msg:" + msg);
    }

    @Override // cx.w0, hq0.i0
    public void X0() {
        super.X0();
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.a(this.F);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, this.G);
        ((ku5.t0) ku5.t0.f312615d).g(new cx.n1(this, mBBuildConfig));
    }

    @Override // cx.w0, hq0.i0
    public void destroy() {
        com.tencent.mars.xlog.Log.i("MagicBrandServiceBiz", "destroyBrandServiceBiz");
        if (z65.c.a()) {
            pm0.v.X(new cx.m1(this));
        }
        super.destroy();
    }

    @Override // cx.w0, hq0.i0, jc3.u
    public void n() {
        super.n();
        com.tencent.mars.xlog.Log.i("MagicBrandServiceBiz", "onMainScriptInjected");
        ((ku5.t0) ku5.t0.f312615d).q(new cx.o1(this));
    }

    @Override // cx.w0, hq0.i0, jc3.u
    public void onCreated() {
        super.onCreated();
        com.tencent.mars.xlog.Log.i("MagicBrandServiceBiz", "onCreated");
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        com.tencent.mars.xlog.Log.i("MagicBrandServiceBiz", "onDestroy reason:" + i17);
    }

    @Override // hq0.i0
    public void start() {
        super.start();
        com.tencent.mars.xlog.Log.i("MagicBrandServiceBiz", "start");
    }
}
