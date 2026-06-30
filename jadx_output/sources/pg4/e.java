package pg4;

/* loaded from: classes7.dex */
public final class e extends hq0.i0 {
    public com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer A;
    public oe0.q B;
    public final java.util.Collection C;
    public final java.util.HashSet D;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f354235x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f354236y;

    /* renamed from: z, reason: collision with root package name */
    public hq0.e0 f354237z;

    public e() {
        super(null, 1, null);
        this.f354235x = "MagicGameLoading";
        this.f354236y = "";
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) c17;
        this.C = kz5.n0.t0(kz5.c0.i(new lq0.g(), new og4.b(), new og4.a(), new og4.c()), ((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni("MagicGameLoading"));
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.eb();
        this.D = kz5.p1.d(com.tencent.mm.plugin.appbrand.jsapi.eb.class.getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX).getClass().getName(), com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.class.getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX).getClass().getName());
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 != null && (activity = (android.app.Activity) k17.get()) != null) {
            return activity;
        }
        java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
        if (j17 != null) {
            return (android.app.Activity) j17.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new tp0.l();
    }

    public final void J1(android.view.ViewGroup viewGroup) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "createFrameSetView");
        if (viewGroup != null) {
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.A = new com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer(context, null, 0, 6, null);
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.A;
        if (magicSclViewContainer != null) {
            magicSclViewContainer.e(this.f354235x);
        }
        int generateViewId = android.view.View.generateViewId();
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer2 = this.A;
        if (magicSclViewContainer2 != null) {
            magicSclViewContainer2.setId(generateViewId);
        }
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1);
        if (viewGroup != null) {
            viewGroup.addView(this.A);
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer3 = this.A;
        if (magicSclViewContainer3 != null) {
            magicSclViewContainer3.setLayoutParams(layoutParams);
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer4 = this.A;
        hq0.e0 e0Var = this.f354237z;
        if (e0Var != null && magicSclViewContainer4 != null) {
            magicSclViewContainer4.a(e0Var);
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer5 = this.A;
        if (magicSclViewContainer5 != null) {
            magicSclViewContainer5.bringToFront();
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer6 = this.A;
        if (magicSclViewContainer6 != null) {
            magicSclViewContainer6.getId();
        }
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicGameLoading";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // hq0.i0
    public void X0() {
        hq0.e0 e0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.X0();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jc3.j0 j0Var = this.f282995g;
        kotlin.jvm.internal.o.d(j0Var);
        com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, ((rc3.w0) j0Var).f394087e, null, 2, null);
        this.f354235x = "MagicGameLoading";
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, this.D);
        mBBuildConfig.a(this.C);
        I1(mBBuildConfig);
        start();
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "createFrameSetRoot");
        java.lang.Object obj = new java.lang.Object();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f354237z = hq0.i0.K0(this, obj, context, "MagicGameLoading", "frames", "", false, 32, null);
        java.lang.String str = this.f354235x;
        if (str != null) {
            if (!(str.length() > 0) || (e0Var = this.f354237z) == null) {
                return;
            }
            cl0.g gVar = new cl0.g();
            gVar.h("frameSetName", str);
            e0Var.a(this.f354236y, gVar.toString());
        }
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        super.b1();
        com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onConnException");
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onMainScriptInjected");
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onDestroy");
        this.B = null;
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "onBind: info is ".concat(info));
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = frameSet.f265488l;
        if (magicSclViewContainer == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "sclView empty, addCustomView error");
        } else if (frameSet.f265492p == 0) {
            int C0 = C0(magicSclViewContainer);
            frameSet.f265492p = C0;
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "viewId is assigned:" + C0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicGameLoadingBiz", "viewId is already assigned:" + frameSet.f265492p);
        }
        super.s1(root, frameSet, info);
    }
}
