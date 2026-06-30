package le3;

/* loaded from: classes7.dex */
public final class a extends hq0.i0 {

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f318144x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Collection f318145y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f318146z;

    public a() {
        super(null, 1, null);
        this.f318144x = "MagicSclNativeDemoBiz";
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) c17;
        this.f318145y = kz5.n0.t0(kz5.b0.c(new lq0.g()), ((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni("MagicSclNativeDemo"));
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.eb();
        this.f318146z = kz5.p1.d(com.tencent.mm.plugin.appbrand.jsapi.eb.class.getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX).getClass().getName(), com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.class.getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX).getClass().getName());
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new tp0.l();
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicSclNativeDemo";
    }

    @Override // hq0.i0
    public void X0() {
        com.tencent.mars.xlog.Log.i(this.f318144x, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.X0();
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, this.f318146z);
        mBBuildConfig.a(this.f318145y);
        I1(mBBuildConfig);
        start();
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        com.tencent.mars.xlog.Log.i(this.f318144x, "onMainScriptInjected");
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        com.tencent.mars.xlog.Log.i(this.f318144x, "onDestroy");
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String concat = "onBind: info is ".concat(info);
        java.lang.String str = this.f318144x;
        com.tencent.mars.xlog.Log.i(str, concat);
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = frameSet.f265488l;
        if (magicSclViewContainer == null) {
            com.tencent.mars.xlog.Log.e(str, "sclView empty, addCustomView error");
        } else if (frameSet.f265492p == 0) {
            int C0 = C0(magicSclViewContainer);
            frameSet.f265492p = C0;
            com.tencent.mars.xlog.Log.i(str, "viewId is assigned:" + C0);
        } else {
            com.tencent.mars.xlog.Log.i(str, "viewId is already assigned:" + frameSet.f265492p);
        }
        super.s1(root, frameSet, info);
    }
}
