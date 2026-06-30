package cx;

/* loaded from: classes7.dex */
public final class x extends cx.w0 {
    public android.widget.FrameLayout E;
    public final java.util.HashSet F;
    public final java.util.HashSet G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ax.a flutterPlugin) {
        super(flutterPlugin);
        kotlin.jvm.internal.o.g(flutterPlugin, "flutterPlugin");
        dx.b a17 = dx.a.f244417a.a("MagicAdBrandService");
        jc3.y0 wi6 = ((com.tencent.mm.advertise.impl.jsapi.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicAdBrandService");
        java.util.HashSet d17 = kz5.p1.d(new hx.g(), new hx.f(), new jx.a(), new hx.h());
        d17.addAll(a17.f244418a);
        d17.addAll(wi6.f299012a);
        this.F = d17;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(a17.f244419b);
        hashSet.addAll(wi6.f299013b);
        this.G = hashSet;
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicAdBrandService";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.tencent.mars.xlog.Log.e("MagicAdBrandServiceBiz", "onJSException envId:" + envId + " msg:" + msg);
    }

    @Override // cx.w0, hq0.i0
    public void X0() {
        super.X0();
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.a(this.F);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, this.G);
        mBBuildConfig.a(kz5.b0.c(new sp0.e()));
        ((ku5.t0) ku5.t0.f312615d).g(new cx.v(this, mBBuildConfig));
        com.tencent.mars.xlog.Log.i("MagicAdBrandServiceBiz", "MagicAdAppBrandBizService setup");
    }

    @Override // cx.w0, hq0.i0
    public void destroy() {
        com.tencent.mars.xlog.Log.i("MagicAdBrandServiceBiz", "destroyADBrandServiceBiz");
        super.destroy();
        if (z65.c.a()) {
            pm0.v.X(new cx.u(this));
        }
    }

    @Override // cx.w0, hq0.i0, jc3.u
    public void n() {
        com.tencent.mars.xlog.Log.i("MagicAdBrandServiceBiz", "onMainScriptInjected");
        super.n();
        ((ku5.t0) ku5.t0.f312615d).q(new cx.w(this));
    }

    @Override // cx.w0, hq0.i0, jc3.u
    public void onCreated() {
        super.onCreated();
        com.tencent.mars.xlog.Log.i("MagicAdBrandServiceBiz", "onCreated");
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        com.tencent.mars.xlog.Log.i("MagicAdBrandServiceBiz", "onDestroy reason:" + i17);
    }

    @Override // hq0.i0
    public void start() {
        super.start();
        com.tencent.mars.xlog.Log.i("MagicAdBrandServiceBiz", "start");
    }
}
