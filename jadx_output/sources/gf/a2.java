package gf;

/* loaded from: classes7.dex */
public final class a2 extends gf.w implements sf.g, ni1.f {

    /* renamed from: p, reason: collision with root package name */
    public static final gg.c f271011p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f271012q = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final gf.d0 f271013e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.MutableContextWrapper f271014f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f271015g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f271016h;

    /* renamed from: i, reason: collision with root package name */
    public final gf.k1 f271017i;

    /* renamed from: m, reason: collision with root package name */
    public final df.s0 f271018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f271019n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f271020o;

    static {
        gg.c createClientProxy = gg.d.getInstance().createClientProxy();
        f271011p = createClientProxy;
        kotlin.jvm.internal.o.d(createClientProxy);
        gg.a aVar = (gg.a) createClientProxy;
        aVar.f271486c = new gf.q1();
        aVar.f271484a = eg.c.getInstance();
        io.flutter.plugin.platform.SkylineTextureLogic.initSkylineTextureHandler(new gf.r1());
    }

    public a2(gf.d0 skylineRenderer, android.content.Context context) {
        kotlin.jvm.internal.o.g(skylineRenderer, "skylineRenderer");
        kotlin.jvm.internal.o.g(context, "context");
        this.f271013e = skylineRenderer;
        android.content.MutableContextWrapper mutableContextWrapper = new android.content.MutableContextWrapper(context);
        this.f271014f = mutableContextWrapper;
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) skylineRenderer.F();
        this.f271015g = bVar != null ? java.lang.Integer.valueOf(bVar.b2()) : null;
        com.tencent.luggage.sdk.jsapi.component.b bVar2 = (com.tencent.luggage.sdk.jsapi.component.b) skylineRenderer.F();
        this.f271016h = bVar2 != null ? java.lang.Integer.valueOf(bVar2.getComponentId()) : null;
        int i17 = gf.k1.f271102y;
        gf.k1 j1Var = android.os.Build.VERSION.SDK_INT >= 29 ? new gf.j1(mutableContextWrapper) : new gf.k1(mutableContextWrapper);
        gf.z1 z1Var = new gf.z1(j1Var, this);
        j1Var.addOnAttachStateChangeListener(new gf.w1(this));
        j1Var.setNoInterceptOnApplyWindowInsetsListener(new gf.x1(z1Var));
        j1Var.addOnLayoutChangeListener(new gf.y1(z1Var));
        this.f271017i = j1Var;
        df.s0 s0Var = new df.s0();
        s0Var.f229548b = new gf.s1(this);
        this.f271018m = s0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.dd
    public void D() {
        xi1.g windowAndroid;
        u(null);
        df.w0 w0Var = df.w0.f229569a;
        df.s0 handler = this.f271018m;
        kotlin.jvm.internal.o.g(handler, "handler");
        if (df.w0.f229573e == null) {
            ef.m mVar = new ef.m();
            mVar.f252124a = new df.v0();
            if (android.os.Build.VERSION.SDK_INT < 30) {
                mVar.f252138o = com.tencent.mm.ui.bl.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            df.w0.f229573e = mVar;
        }
        ((java.util.ArrayList) df.w0.f229579k).add(handler);
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) this.f271013e.F();
        if (bVar == null || (windowAndroid = bVar.getWindowAndroid()) == null) {
            return;
        }
        F(windowAndroid);
    }

    public final void F(xi1.g windowAndroid) {
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        com.tencent.mars.xlog.Log.i("SkylineViewRenderEngine", "updateWindowAndroid windowAndroid:" + windowAndroid + " context:" + windowAndroid.getContext());
        android.app.Activity a17 = q75.a.a(windowAndroid.getContext());
        if (a17 != null) {
            df.w1 t17 = t();
            if (t17 != null) {
                t17.y(new df.m1(t17, new java.lang.ref.WeakReference(a17)));
                return;
            }
            return;
        }
        df.w1 t18 = t();
        if (t18 != null) {
            t18.m();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void N(int i17, int i18) {
        df.w1 t17 = t();
        if (t17 != null) {
            android.content.res.Resources resources = this.f271014f.getResources();
            kotlin.jvm.internal.o.f(resources, "getResources(...)");
            float f17 = resources.getDisplayMetrics().density;
            float f18 = i17 / f17;
            float f19 = i18 / f17;
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "updateViewport, call view size[" + f18 + " x " + f19 + ']', new java.lang.Object[0]);
            t17.y(new df.u1(f18, f19, t17));
        }
    }

    @Override // ni1.f
    public void P() {
        df.w1 t17 = t();
        if (t17 != null) {
            t17.P();
        }
    }

    @Override // ni1.f
    public void V() {
        df.w1 t17;
        df.w1 t18 = t();
        if (!kotlin.jvm.internal.o.b(t18 != null ? t18.f229583g : null, this.f271017i) || (t17 = t()) == null) {
            return;
        }
        t17.V();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void b() {
        java.lang.Integer num = this.f271015g;
        java.lang.Integer num2 = this.f271016h;
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineViewRenderEngine", "page [%d]-[%d] onForeground", num, num2);
        if (this.f271019n) {
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineViewRenderEngine", "skipAttachFlutterViewOnForeground", new java.lang.Object[0]);
            this.f271019n = false;
        } else {
            s();
        }
        df.w1 t17 = t();
        if (t17 != null) {
            java.util.ArrayList arrayList = t17.f229588o;
            if (num2 != null && !arrayList.contains(num2)) {
                arrayList.add(num2);
            }
            boolean z17 = (!t17.f229589p) & (arrayList.size() > 0);
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "id:" + t17.f229580d + " call resume,mResumedPages=" + arrayList + " ,switchResumed=" + z17, new java.lang.Object[0]);
            if (z17) {
                t17.f229589p = true;
                t17.y(new df.j1(t17));
                t17.y(new df.k1(t17));
                t17.u(t17.f229598y);
            }
        }
        gf.k1 k1Var = this.f271017i;
        if (k1Var.f271055o) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = k1Var.f271057q;
            n3Var.removeCallbacks(k1Var.f271060t);
            if (k1Var.getForeground() != null) {
                n3Var.postDelayed(k1Var.f271058r, android.animation.ValueAnimator.getFrameDelay() * 5);
                io.flutter.embedding.android.FlutterView flutterView = (io.flutter.embedding.android.FlutterView) kz5.n0.Y(k1Var.f271056p);
                if (flutterView != null) {
                    flutterView.addOnFirstFrameRenderedListener(k1Var.f271059s);
                }
            }
        }
        this.f271018m.f229547a = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void c() {
        df.w1 t17;
        java.lang.Integer num = this.f271015g;
        java.lang.Integer num2 = this.f271016h;
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineViewRenderEngine", "page [%d]-[%d] onBackground", num, num2);
        if (!this.f271020o && (t17 = t()) != null) {
            t17.t(num2);
        }
        this.f271020o = false;
        this.f271018m.f229547a = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb, com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        xi1.m mVar = this.f271181d;
        if (mVar != null) {
            mVar.b(null);
            mVar.release();
        }
        this.f271181d = null;
        gf.k1 k1Var = this.f271017i;
        ze.n nVar = k1Var.f271106x;
        if (nVar != null && k1Var.f271104v != null && k1Var.f271105w != null) {
            gf.o1 a17 = gf.o1.f271155b.a(nVar);
            java.lang.Integer num = k1Var.f271104v;
            kotlin.jvm.internal.o.d(num);
            df.w1 a18 = a17.a(num.intValue());
            java.lang.Integer num2 = k1Var.f271105w;
            kotlin.jvm.internal.o.d(num2);
            int intValue = num2.intValue();
            a18.t(java.lang.Integer.valueOf(intValue));
            java.util.LinkedList linkedList = a18.f229592s;
            linkedList.remove(java.lang.Integer.valueOf(intValue));
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "removeRefPage window " + a18.f229580d + " currentRef " + linkedList, new java.lang.Object[0]);
            if (linkedList.size() == 0) {
                a18.m();
                if (!a18.f229590q.getAndSet(true)) {
                    com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "id:" + a18.f229580d + " release, cur window can't no longer be used", new java.lang.Object[0]);
                    yz5.a aVar = a18.f229593t;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    a18.f229587n.clear();
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    a18.i(context);
                    df.w0 w0Var = df.w0.f229569a;
                    kotlin.jvm.internal.m0.a(df.w0.f229578j).remove(a18.f229597x);
                    kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new df.r1(a18, null), 2, null);
                }
            }
        }
        k1Var.f271106x = null;
        df.w0 w0Var2 = df.w0.f229569a;
        df.s0 handler = this.f271018m;
        kotlin.jvm.internal.o.g(handler, "handler");
        ((java.util.ArrayList) df.w0.f229579k).remove(handler);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void e0(java.lang.Runnable runnable) {
        df.w1 t17;
        if (runnable == null || (t17 = t()) == null) {
            return;
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer obtainRenderer = com.tencent.skyline.SkylineLogic.obtainRenderer(t17.f229580d);
        if (obtainRenderer == null) {
            runnable.run();
        } else if (obtainRenderer.isDisplayingFlutterUi()) {
            android.view.Choreographer.getInstance().postFrameCallback(new gf.t1(runnable));
        } else {
            obtainRenderer.addIsDisplayingFlutterUiListener(new gf.u1(obtainRenderer, runnable));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getContentView() {
        return this.f271017i;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getHeight() {
        android.view.ViewGroup viewGroup;
        df.w1 t17 = t();
        if (t17 == null || (viewGroup = t17.f229583g) == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollX() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWebScrollY() {
        return 0;
    }

    @Override // sf.g
    public gg.c getWebViewPluginClientProxy() {
        gg.c cVar = f271011p;
        kotlin.jvm.internal.o.d(cVar);
        return cVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public int getWidth() {
        android.view.ViewGroup viewGroup;
        df.w1 t17 = t();
        if (t17 == null || (viewGroup = t17.f229583g) == null) {
            return 0;
        }
        return viewGroup.getMeasuredWidth();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public android.view.View getWrapperView() {
        return this.f271017i;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        kotlin.jvm.internal.o.d(cls);
        if (cls.isInstance(this)) {
            return (com.tencent.mm.plugin.appbrand.jsruntime.u) cls.cast(this);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f271014f.setBaseContext(context);
        df.w1 t17 = t();
        if (t17 != null) {
            t17.i(context);
        }
    }

    public final void s() {
        gf.k1 k1Var = this.f271017i;
        kotlin.jvm.internal.o.e(k1Var, "null cannot be cast to non-null type android.view.ViewGroup");
        k1Var.getClass();
        ze.n nVar = k1Var.f271106x;
        java.lang.Integer num = k1Var.f271104v;
        if (num == null || nVar == null) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineViewContainer", "attachFlutterView error " + num + ", " + k1Var.f271105w + ',' + nVar, new java.lang.Object[0]);
            return;
        }
        df.w1 a17 = gf.o1.f271155b.a(nVar).a(num.intValue());
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineViewContainer", "attachFlutterView  window-" + num + " to page-" + k1Var.f271105w, new java.lang.Object[0]);
        if (kotlin.jvm.internal.o.b(k1Var, a17.f229583g)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineView", "switchContentView", new java.lang.Object[0]);
        a17.f229583g = k1Var;
        df.a0 a0Var = a17.f229585i;
        if (a0Var != null) {
            a0Var.j(k1Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public void setBackgroundColor(int i17) {
        df.a0 a0Var;
        df.w1 t17 = t();
        if (t17 == null || (a0Var = t17.f229585i) == null) {
            return;
        }
        a0Var.setBackgroundColor(i17);
    }

    public final df.w1 t() {
        return this.f271017i.getSkylineView();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x017d A[LOOP:0: B:63:0x017a->B:65:0x017d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl r30) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.a2.u(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.fb
    public boolean w() {
        return false;
    }

    public final void y(boolean z17, int i17) {
        gf.k1 k1Var = this.f271017i;
        if (z17) {
            k1Var.d();
            k1Var.setSheetMode(true);
            k1Var.setFixedHeight(i17);
            k1Var.setEnableFixSize(true);
            return;
        }
        k1Var.d();
        k1Var.setEnableFixSize(false);
        k1Var.setFixedHeight(0);
        k1Var.setSheetMode(false);
    }
}
