package uj;

/* loaded from: classes7.dex */
public final class p extends z31.a implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public jc3.j0 f428169d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f428170e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f428171f;

    /* renamed from: g, reason: collision with root package name */
    public x31.a f428172g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f428173h;

    /* renamed from: i, reason: collision with root package name */
    public bf3.p f428174i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f428175m = kz5.c0.i(new vj.c(), new vj.b());

    @Override // z31.a
    public android.widget.FrameLayout C0() {
        return this.f428170e;
    }

    @Override // z31.a
    public x31.a E0() {
        return this.f428172g;
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewCreated canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f428171f;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewLayout canvasId:" + i17 + " left:" + i18 + " top:" + i19 + " width:" + i27 + " height:" + i28);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onJSException msg:".concat(msg));
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewDestroy canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f428170e;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    @Override // jc3.u
    public void b1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onConnException");
        x31.a aVar = this.f428172g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f451599d;
            x31.a.a(aVar, 2, "android connException", null, 4, null);
        }
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewFirstFrameRendered canvasId:" + i17);
        x31.a aVar = this.f428172g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f451599d;
            x31.a.a(aVar, 1, "", null, 4, null);
        }
        if (this.f428173h) {
            jc3.j0 j0Var = this.f428169d;
            if (j0Var == null) {
                kotlin.jvm.internal.o.o("magicBrush");
                throw null;
            }
            ((rc3.w0) j0Var).pause();
        }
        uj.m mVar = uj.m.f428165a;
        java.lang.String sessionId = java.lang.String.valueOf(hashCode());
        synchronized (mVar) {
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = uj.m.f428166b;
            uj.l lVar = (uj.l) concurrentHashMap.get(sessionId);
            if (lVar != null && lVar.f428163a > 0) {
                com.tencent.mars.xlog.Log.i("MagicPlayableReporter", "reportRenderFinish sessionId:" + sessionId + " time:" + currentTimeMillis + " currentTime:" + (currentTimeMillis - lVar.f428163a));
                i95.m c17 = i95.n0.c(je3.i.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                je3.i.La((je3.i) c17, sessionId, "MagicPlayable", "", com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.FirstFrameFromStart, currentTimeMillis - lVar.f428163a, null, null, 96, null);
            }
            concurrentHashMap.remove(sessionId);
        }
    }

    @Override // jc3.u
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onMainScriptInjected");
        this.f428173h = true;
    }

    @Override // jc3.u
    public void onCreated() {
        java.lang.String e17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCreated");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "injectPlayableLibrary");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_playable_lib_use_native_js, 0) == 1;
        if (z17) {
            e17 = ik1.f.e("playable/wxgame-playable-lib.js");
        } else {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.appbrand.appstorage.u1 b17 = com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, "MagicAdPlayableBasic", null, 2, null).b();
            e17 = b17 != null ? bf3.r0.e(b17, "/wxgame-playable-lib.js") : null;
        }
        if (e17 != null) {
            kotlin.jvm.internal.o.f(e17.substring(0, 200), "substring(...)");
        }
        jc3.j0 j0Var = this.f428169d;
        if (j0Var == null) {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
        if (e17 == null) {
            e17 = "";
        }
        ((rc3.w0) j0Var).l(e17, new uj.n(z17));
        jc3.j0 j0Var2 = this.f428169d;
        if (j0Var2 != null) {
            ((rc3.w0) j0Var2).start();
        } else {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
    }

    @Override // jc3.u
    public void onDestroy(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onDestroy");
    }

    @Override // jc3.u
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onPause");
    }

    @Override // jc3.u
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onResume");
    }
}
