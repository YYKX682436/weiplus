package e64;

/* loaded from: classes7.dex */
public final class h extends hq0.i0 {
    public hq0.e0 A;

    /* renamed from: x, reason: collision with root package name */
    public bf3.p f249826x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f249827y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.ref.Reference f249828z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f249828z = new java.lang.ref.WeakReference(activity);
    }

    @Override // hq0.i0
    public void A1(hq0.e0 root) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(root, "root");
        super.A1(root);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        android.app.Activity activity = (android.app.Activity) this.f249828z.get();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return activity;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findContainerDelegate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        tp0.l lVar = new tp0.l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findContainerDelegate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return lVar;
    }

    public final void J1(fq0.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = xVar.f265488l;
        if (magicSclViewContainer == null) {
            com.tencent.mars.xlog.Log.e("SnsAdMB", "sclView empty, addCustomView error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            return;
        }
        if (xVar.f265492p == 0) {
            kotlin.jvm.internal.o.d(magicSclViewContainer);
            int C0 = C0(magicSclViewContainer);
            xVar.f265492p = C0;
            com.tencent.mars.xlog.Log.i("SnsAdMB", "viewId is assigned:" + C0);
        } else {
            com.tencent.mars.xlog.Log.i("SnsAdMB", "viewId is already assigned:" + xVar.f265492p);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    public final void N1(android.widget.FrameLayout frameLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        if (frameLayout != null) {
            this.f249827y = frameLayout;
            com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
            android.content.Context context = frameLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            bf3.p Di = ((com.tencent.mm.plugin.magicbrush.m5) d4Var).Di(context);
            Di.a(frameLayout);
            this.f249826x = Di;
        }
        X0();
        start();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1997, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBizName", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBizName", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return "MagicAdLandPage";
    }

    @Override // hq0.i0
    public void X0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.X0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideSnsAdJsApis", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiFactory");
        java.util.HashSet d17 = kz5.p1.d(new f64.a(), new f64.b(), new f64.c(), new f64.n(), new f64.d(), new f64.e(), new f64.f(), new f64.g(), new f64.h(), new f64.i(), new f64.j(), new f64.k(), new f64.l(), new f64.m(), new f64.o(), new f64.p(), new f64.q(), new f64.r(), new f64.s(), new f64.t(), new f64.u(), new f64.v(), new f64.w(), new f64.x(), new f64.y());
        d17.addAll(((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni("MagicAdLandPage"));
        java.util.HashSet hashSet = new java.util.HashSet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideSnsAdJsApis", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiFactory");
        jc3.y0 wi6 = ((com.tencent.mm.advertise.impl.jsapi.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicAdLandPage");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMbJsApiSet", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMbJsApiSet", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        mBBuildConfig.a(kz5.n0.t0(kz5.n0.t0(d17, wi6.f299012a), kz5.c0.i(new lq0.g(), new lq0.d(), new lq0.e())));
        java.util.HashSet hashSet2 = new java.util.HashSet();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppBrandJsApi", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppBrandJsApi", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        hashSet2.addAll(hashSet);
        hashSet2.addAll(wi6.f299013b);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, hashSet2);
        bf3.p pVar = this.f249826x;
        if (pVar != null) {
            mBBuildConfig.f147831u = pVar;
        }
        I1(mBBuildConfig);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void destroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        pm0.v.X(new e64.f(this));
        super.destroy();
        hq0.e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.c();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1997, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMainScriptInjected", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.n();
        if (this.f249827y != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("evaluate$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            jc3.j0 j0Var = this.f282995g;
            if (j0Var != null) {
                jc3.j0.d(j0Var, "mb.switchVConsole(true);", null, 2, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("evaluate$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMainScriptInjected", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    public void onCreated() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreated", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onCreated();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreated", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onDestroy(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        J1(frameSet);
        super.s1(root, frameSet, info);
        com.tencent.mars.xlog.Log.i("SnsAdMB", "onBind:: info is ".concat(info));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void t1(fq0.r appContext) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(appContext, "appContext");
        super.t1(appContext);
        com.tencent.mars.xlog.Log.i("SnsAdMB", "the magic brush scl app context created");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void v1(hq0.e0 root) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(root, "root");
        super.v1(root);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void w1(hq0.e0 root) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(root, "root");
        super.w1(root);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void x1(hq0.e0 root, fq0.x frameSet) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInit", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        J1(frameSet);
        super.x1(root, frameSet);
        frameSet.f265484h = new e64.g(frameSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInit", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void y1(hq0.e0 root) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        kotlin.jvm.internal.o.g(root, "root");
        super.y1(root);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }
}
