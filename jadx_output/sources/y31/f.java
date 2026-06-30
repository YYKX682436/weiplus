package y31;

/* loaded from: classes7.dex */
public final class f extends z31.a implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public jc3.j0 f459163d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f459164e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f459165f;

    /* renamed from: g, reason: collision with root package name */
    public x31.a f459166g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f459167h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f459168i;

    /* renamed from: n, reason: collision with root package name */
    public bf3.p f459170n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f459171o;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f459169m = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f459172p = kz5.c0.i(new z31.b(), new vj.b(), new ce3.d("MagicNewAdPlayable"), new ce3.a("MagicNewAdPlayable"), new z31.c());

    @Override // z31.a
    public android.widget.FrameLayout C0() {
        return this.f459164e;
    }

    @Override // z31.a
    public x31.a E0() {
        return this.f459166g;
    }

    public final void F0(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        pm0.v.X(new y31.d(this, key, value));
    }

    public final void G0(android.widget.FrameLayout containerView) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setContainerView playableContainerView null:");
        sb6.append(this.f459164e == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb6.toString());
        this.f459164e = containerView;
        bf3.p pVar = this.f459170n;
        if (pVar != null) {
            pVar.a(containerView);
        }
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.adplayable.jsapi.MagicPlayableContainer magicPlayableContainer = new com.tencent.mm.adplayable.jsapi.MagicPlayableContainer(context, null, 0, 6, null);
        this.f459165f = magicPlayableContainer;
        android.widget.FrameLayout frameLayout = this.f459164e;
        kotlin.jvm.internal.o.d(frameLayout);
        magicPlayableContainer.setLayoutParams(frameLayout.getLayoutParams());
        android.widget.FrameLayout frameLayout2 = this.f459164e;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.f459165f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "add playableCanvasView");
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewCreated canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f459165f;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewLayout canvasId:" + i17 + " left:" + i18 + " top:" + i19 + " width:" + i27 + " height:" + i28);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onJSException msg:".concat(msg));
        com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnError mbJsEventOnError = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnError();
        cl0.g gVar = new cl0.g();
        gVar.h(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, msg);
        gVar.h("stack", msg);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        F0(mbJsEventOnError.f147881d, gVar2);
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewDestroy canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f459164e;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    @Override // jc3.u
    public void b1() {
        android.widget.FrameLayout frameLayout;
        android.content.Context context;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onConnException");
        x31.a aVar = this.f459166g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f451599d;
            x31.a.a(aVar, 2, "android connException", null, 4, null);
        }
        com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnError mbJsEventOnError = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnError();
        cl0.g gVar = new cl0.g();
        gVar.h(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "onConnException");
        gVar.h("stack", "");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        F0(mbJsEventOnError.f147881d, gVar2);
        yz5.a aVar2 = this.f459171o;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        if (!z65.c.a() || (frameLayout = this.f459164e) == null || (context = frameLayout.getContext()) == null) {
            return;
        }
        pm0.v.X(new y31.b(context));
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        jc3.j0 j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewFirstFrameRendered canvasId:" + i17);
        x31.a aVar = this.f459166g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f451599d;
            x31.a.a(aVar, 1, "", null, 4, null);
        }
        com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew mbJsEventOnPlayableCustomEventNew = new com.tencent.mm.newadplayable.mb.jsapi.jsevent.MbJsEventOnPlayableCustomEventNew();
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "playableFirstFrame");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        F0(mbJsEventOnPlayableCustomEventNew.f147881d, gVar2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "pauseJsThread manualPause:" + this.f459167h);
        if (!this.f459167h || (j0Var = this.f459163d) == null) {
            return;
        }
        ((rc3.w0) j0Var).pause();
    }

    @Override // jc3.u
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onMainScriptInjected");
        jc3.j0 j0Var = this.f459163d;
        if (j0Var != null) {
            synchronized (j0Var) {
                for (y31.a aVar : this.f459169m) {
                    ((rc3.w0) j0Var).k(aVar.f459155a, aVar.f459156b);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("sendEvent pending:");
                    sb6.append(aVar.f459155a);
                    sb6.append(" value:");
                    java.lang.String str = aVar.f459156b;
                    int length = str.length();
                    if (length > 200) {
                        length = 200;
                    }
                    java.lang.String substring = str.substring(0, length);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    sb6.append(substring);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb6.toString());
                }
                this.f459169m.clear();
                this.f459168i = true;
            }
        }
    }

    @Override // jc3.u
    public void onCreated() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCreated");
    }

    @Override // jc3.u
    public void onDestroy(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onDestroy reason:" + i17);
    }

    @Override // jc3.u
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onPause");
    }

    @Override // jc3.u
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onResume");
    }

    public final void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "release");
        this.f459166g = null;
        pm0.v.X(new y31.c(this));
        this.f459165f = null;
        this.f459164e = null;
        this.f459167h = false;
        this.f459168i = false;
        this.f459169m.clear();
        bf3.p pVar = this.f459170n;
        if (pVar != null) {
            pVar.b();
        }
        jc3.j0 j0Var = this.f459163d;
        if (j0Var != null) {
            ((rc3.w0) j0Var).destroy();
        }
        this.f459163d = null;
    }
}
