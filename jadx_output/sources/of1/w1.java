package of1;

/* loaded from: classes7.dex */
public final class w1 extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.jsapi.webview.o, of1.y1, com.tencent.mm.plugin.appbrand.jsapi.webview.s {
    public static final /* synthetic */ int H = 0;
    public final jz5.g A;
    public final com.tencent.mm.plugin.appbrand.report.model.s0 B;
    public final jz5.g C;
    public final of1.g1 D;
    public final java.lang.Runnable E;
    public final jz5.g F;
    public java.util.ArrayList G;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f345033d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.n7 f345034e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345035f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f345036g;

    /* renamed from: h, reason: collision with root package name */
    public int f345037h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345038i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.String f345039m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.String f345040n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f345041o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.l2 f345042p;

    /* renamed from: q, reason: collision with root package name */
    public final of1.i1 f345043q;

    /* renamed from: r, reason: collision with root package name */
    public final of1.t1 f345044r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f345045s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMFalseProgressBar f345046t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.xweb.o0 f345047u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f345048v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f345049w;

    /* renamed from: x, reason: collision with root package name */
    public final x.d f345050x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Object f345051y;

    /* renamed from: z, reason: collision with root package name */
    public int f345052z;

    static {
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        nw4.d.f340815a.a();
    }

    public w1(com.tencent.mm.plugin.appbrand.ui.z6 z6Var, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, kotlin.jvm.internal.i iVar) {
        super(z6Var);
        boolean z17;
        this.f345033d = o6Var;
        this.f345034e = n7Var;
        try {
            z17 = o6Var.E0().f47300z ? o6Var.E0().f47299y : o6Var.E0().f47296w;
        } catch (java.lang.NullPointerException unused) {
            z17 = false;
        }
        this.f345035f = z17 ? 55 : 49;
        com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f345033d;
        try {
            if (o6Var2.E0().f47300z) {
                boolean z18 = o6Var2.E0().f47299y;
            } else {
                boolean z19 = o6Var2.E0().f47296w;
            }
        } catch (java.lang.NullPointerException unused2) {
        }
        this.f345038i = true;
        this.f345041o = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f345043q = new of1.i1(this);
        this.f345044r = new of1.t1(this);
        this.f345049w = jz5.h.b(new of1.v1(this));
        of1.q1 q1Var = new of1.q1(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> start hash[" + hashCode() + ']');
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(z6Var);
        this.f345045s = a17;
        if (o6Var.N0()) {
            a17.addJavascriptInterface(new com.tencent.mm.plugin.appbrand.wxassistant.cdp.f3(), "__AndroidPromiseBridge");
        }
        a17.setBackgroundColor(0);
        com.tencent.xweb.z0 settings = a17.getSettings();
        settings.z(true);
        settings.E(true);
        settings.I(false);
        settings.J(0);
        a17.setHorizontalScrollBarEnabled(false);
        a17.setVerticalScrollBarEnabled(false);
        settings.r(true);
        settings.G(true);
        settings.M(false);
        settings.L(false);
        settings.C(true);
        settings.D(true);
        settings.k(true);
        settings.t(true);
        settings.p(true);
        a17.setWebViewClientExtension(q1Var);
        settings.R(2);
        java.lang.String g17 = settings.g();
        ik1.k0 k0Var = (ik1.k0) nd.f.a(ik1.k0.class);
        if (k0Var == null) {
            ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).getClass();
            k0Var = new com.tencent.mm.plugin.appbrand.luggage.customize.y(z6Var);
        }
        kotlin.jvm.internal.o.d(g17);
        if (!r26.n0.B(g17, " MicroMessenger/", false)) {
            settings.Q(ik1.l0.a(z6Var, g17, k0Var) + " miniProgram/" + o6Var.f74803n);
        }
        a17.setDownloadListener(new of1.x0(this));
        this.f345047u = a17.m0(new of1.y0(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> end WebView construct hash[" + hashCode() + ']');
        addView(a17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.ui.base.MMFalseProgressBar mMFalseProgressBar = new com.tencent.mm.ui.base.MMFalseProgressBar(z6Var);
        mMFalseProgressBar.setProgressDrawable(i65.a.i(z6Var, com.tencent.mm.R.drawable.f481982ap4));
        this.f345046t = mMFalseProgressBar;
        addView(mMFalseProgressBar, new android.widget.FrameLayout.LayoutParams(-1, i65.a.b(z6Var, 3)));
        n7Var.w(new com.tencent.mm.plugin.appbrand.jsapi.w() { // from class: of1.z0
            @Override // com.tencent.mm.plugin.appbrand.jsapi.w
            public final void onDestroy() {
                of1.w1.this.destroy();
            }
        });
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.jsapi.webview.a.f83870a;
        synchronized (sparseArray) {
            sparseArray.put(getBinderID(), this);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "<init> end hash[" + hashCode() + "], supportOrientationControl[" + getXwVideoOrientationControlSupported() + ']');
        this.f345050x = new x.d(0);
        this.f345051y = new java.lang.Object();
        this.A = jz5.h.b(of1.o1.f344984d);
        this.B = o6Var.x0().getReporter().k();
        this.C = jz5.h.b(new of1.d1(this));
        this.D = new of1.g1();
        this.E = new of1.r1(this);
        this.F = jz5.h.b(new of1.f1(this));
    }

    private final boolean getEnableAutoPlay() {
        return ((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.appbrand.jsapi.l getEventContext() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f345034e;
        if (!com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(n7Var)) {
            return n7Var;
        }
        com.tencent.mm.plugin.appbrand.service.c0 U1 = n7Var.U1();
        kotlin.jvm.internal.o.f(U1, "getService(...)");
        return U1;
    }

    private final ni1.h getMPullDown() {
        return (ni1.h) this.f345034e.B1(ni1.h.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.ArrayList<java.lang.Object> getPageLoadingListenerList() {
        return (java.util.ArrayList) ((jz5.n) this.A).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.appbrand.jsapi.webview.m getREPORTER() {
        return (com.tencent.mm.plugin.appbrand.jsapi.webview.m) ((jz5.n) this.C).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final of1.x1 getWebViewController() {
        return (of1.x1) ((jz5.n) this.f345049w).getValue();
    }

    private final boolean getXwVideoOrientationControlSupported() {
        com.tencent.xweb.o0 o0Var = this.f345047u;
        return o0Var != null && o0Var.d();
    }

    private final void setCurrentUrl(java.lang.String str) {
        this.f345039m = str;
        if (str == null || str.length() == 0) {
            ni1.h mPullDown = getMPullDown();
            if (mPullDown != null) {
                mPullDown.g("");
                return;
            }
            return;
        }
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (host == null || host.length() == 0) {
                ni1.h mPullDown2 = getMPullDown();
                if (mPullDown2 != null) {
                    mPullDown2.g("");
                    return;
                }
                return;
            }
            ni1.h mPullDown3 = getMPullDown();
            if (mPullDown3 != null) {
                mPullDown3.g(getContext().getString(com.tencent.mm.R.string.l6m, host));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void F(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("htmlId", this.f345037h);
            } catch (org.json.JSONException unused) {
            }
        }
        if (jSONObject != null) {
            jSONObject.put("webviewId", hashCode());
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.b bVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.b();
        java.lang.String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
        if (jSONObject2 == null) {
            jSONObject2 = "";
        }
        bVar.f82374f = jSONObject2;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f345034e;
        n7Var.i(bVar, new int[]{n7Var.U1().getComponentId()});
    }

    public void I() {
        android.view.View view = this.f345048v;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLWebViewWithBWC", "hideScreenshotCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLWebViewWithBWC", "hideScreenshotCover", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setBackground(null);
            removeView(view);
        }
        this.f345048v = null;
    }

    @Override // ni1.f
    public void P() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "restoreRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        this.f345045s.onShow();
    }

    public final void S() {
        boolean N0 = this.f345033d.N0();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "injectWxAssistantJs isWxAssistEnable:" + N0);
        if (N0) {
            this.f345045s.evaluateJavascript(ik1.f.e("wxa_library/wx_assistant_page_info.js"), of1.h1.f344932a);
        }
    }

    public boolean T() {
        return getEnableAutoPlay();
    }

    @Override // ni1.f
    public void V() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "pauseRendering hash[%d]", java.lang.Integer.valueOf(hashCode()));
        this.f345045s.onHide();
    }

    public void a0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageCommitVisible url[%s] hash[%d] destroyed[%b]", str, java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f345036g));
        if (this.f345036g) {
            return;
        }
        setCurrentUrl(str);
        S();
        this.f345045s.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
        synchronized (this.f345051y) {
            this.f345052z = 2;
            if (this.f345033d.N0()) {
                w0(new of1.l1(str));
            }
        }
    }

    public void c0(java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f345036g);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageFinished url[%s] hash[%d] destroyed[%b] attached[%b]", str, valueOf, valueOf2, java.lang.Boolean.valueOf(n3.x0.b(this)));
        if (this.f345036g) {
            return;
        }
        setCurrentUrl(str);
        S();
        this.f345045s.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
        of1.g1 g1Var = this.D;
        if (!g1Var.f344920b && !g1Var.f344919a) {
            com.tencent.mm.plugin.appbrand.report.model.r0 exitReporter = getExitReporter();
            com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f345034e;
            java.lang.String str2 = g1Var.f344921c;
            java.util.LinkedList linkedList = exitReporter.f88073c;
            exitReporter.f88086p = (java.lang.String) linkedList.peekFirst();
            exitReporter.f88087q = 2;
            exitReporter.f88088r = str;
            linkedList.push(str2);
            exitReporter.b(n7Var);
        }
        g1Var.f344920b = false;
        g1Var.f344919a = false;
        g1Var.f344921c = str;
        com.tencent.mm.plugin.appbrand.jsapi.webview.p pVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.p();
        pVar.u(getEventContext());
        pVar.s("src", str);
        pVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
        pVar.m();
        synchronized (this.f345051y) {
            this.f345052z = 1;
            w0(new of1.m1(str));
        }
        postDelayed(this.E, 1000L);
        this.f345040n = null;
        t0(str);
    }

    public void destroy() {
        removeCallbacks(this.E);
        of1.e1 e1Var = new of1.e1(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            e1Var.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(e1Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        ni1.h mPullDown;
        ni1.h mPullDown2;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (this.f345036g) {
            return false;
        }
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            ni1.h mPullDown3 = getMPullDown();
            if (mPullDown3 != null) {
                mPullDown3.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && (mPullDown2 = getMPullDown()) != null) {
            mPullDown2.requestDisallowInterceptTouchEvent(false);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(ev6);
        if (!dispatchTouchEvent && (mPullDown = getMPullDown()) != null) {
            mPullDown.requestDisallowInterceptTouchEvent(false);
        }
        return dispatchTouchEvent;
    }

    public android.content.Context getAndroidContext() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.o
    public android.view.View getAndroidView() {
        return this;
    }

    public java.lang.String getAppId() {
        java.lang.String str = this.f345033d.f74803n;
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    public int getBinderID() {
        return ((of1.v0) getController()).U();
    }

    public java.util.ArrayList<java.lang.String> getBizDomainList() {
        return this.G;
    }

    public int getCoverViewId() {
        return this.f345037h;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.o
    public java.lang.String getCurrentUrl() {
        return this.f345039m;
    }

    public int getEnterScene() {
        return this.f345033d.g2();
    }

    public final com.tencent.mm.plugin.appbrand.report.model.r0 getExitReporter() {
        com.tencent.mm.plugin.appbrand.report.model.r0 n17 = this.f345033d.x0().getReporter().n();
        kotlin.jvm.internal.o.f(n17, "getHTMLWebViewUrlExitReporter(...)");
        return n17;
    }

    public final int getHtmlId() {
        return this.f345037h;
    }

    public java.lang.String[] getJsApiReportArgs() {
        if (this.f345036g) {
            return new java.lang.String[0];
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f345034e;
        com.tencent.mm.plugin.appbrand.o6 runtime = n7Var.getRuntime();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = runtime.l2();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = runtime.u0();
        of1.w1 s37 = n7Var.s3();
        java.lang.String[] strArr = new java.lang.String[19];
        strArr[0] = "" + l27.f87790f;
        strArr[1] = l27.f87791g;
        strArr[2] = runtime.f74803n;
        strArr[3] = "" + runtime.E0().f305852r.pkgVersion;
        strArr[4] = u07.f47276v;
        strArr[5] = "" + (runtime.E0().f305852r.f75399d + 1);
        strArr[6] = "" + l27.f87792h;
        strArr[7] = n7Var.X1();
        strArr[8] = s37 == null ? "" : s37.getWebView().getUrl();
        strArr[9] = com.tencent.mm.plugin.appbrand.report.q2.b(n7Var.getContext());
        strArr[10] = "";
        strArr[11] = "";
        strArr[12] = "";
        strArr[13] = "";
        strArr[14] = "";
        strArr[15] = "";
        strArr[16] = "" + l27.f87788d;
        strArr[17] = "" + l27.f87789e;
        strArr[18] = "" + (runtime.u0().f47284z + 1000);
        return strArr;
    }

    public androidx.lifecycle.y getLifecycleOwner() {
        return m533getPageView().O1();
    }

    public int getPageLoadingStatus() {
        int i17;
        synchronized (this.f345051y) {
            i17 = this.f345052z;
        }
        return i17;
    }

    public com.tencent.mm.plugin.appbrand.jsapi.webview.m getReporter() {
        return getREPORTER();
    }

    public java.lang.String getUrl() {
        return getWebView().getUrl();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.o
    public com.tencent.mm.ui.widget.MMWebView getWebView() {
        return this.f345045s;
    }

    public void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.AppBrandRuntimePersistentContextWrapper");
        ((com.tencent.mm.plugin.appbrand.ui.z6) context2).setBaseContext(context);
        try {
            this.f345045s.i(context);
        } catch (java.lang.Exception unused) {
        }
        of1.v0 v0Var = (of1.v0) getController();
        v0Var.getClass();
        of1.m mVar = v0Var.X1;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("viewScanHelper");
            throw null;
        }
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) mVar.f344972s).f158647d = context;
        com.tencent.mm.ui.tools.s6 s6Var = mVar.f344964h;
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = mVar.f344880d;
        if (s6Var != null) {
            try {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = s6Var.f210721e;
                if (k0Var.i()) {
                    k0Var.u();
                }
            } catch (java.lang.Exception unused2) {
            } catch (java.lang.Throwable th6) {
                ((of1.w1) oVar).getWebView().setOnLongClickListener(null);
                mVar.f344964h = null;
                throw th6;
            }
            ((of1.w1) oVar).getWebView().setOnLongClickListener(null);
            mVar.f344964h = null;
        }
        if (context instanceof android.app.Activity) {
            com.tencent.mm.ui.tools.s6 s6Var2 = new com.tencent.mm.ui.tools.s6(mVar.a());
            mVar.f344964h = s6Var2;
            s6Var2.c(((of1.w1) oVar).getWebView(), mVar, null);
        }
        if (q75.a.a(getContext()) == null) {
            this.f345042p = null;
        } else {
            if (q75.a.a(getContext()) == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.input.l2 e17 = com.tencent.mm.plugin.appbrand.widget.input.h1.e(this);
            if (e17 != null) {
                e17.a(this.f345043q);
            }
            this.f345042p = e17;
        }
    }

    public void m0(java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(this.f345036g);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onPageStarted url[%s] hash[%d] destroyed[%b] attached[%b]", str, valueOf, valueOf2, java.lang.Boolean.valueOf(n3.x0.b(this)));
        if (this.f345036g) {
            return;
        }
        boolean z17 = !u46.l.c(this.f345040n, str) && android.webkit.URLUtil.isNetworkUrl(str);
        this.f345040n = str;
        this.f345041o.set(false);
        S();
        this.f345045s.evaluateJavascript("window.__wxjs_environment = \"miniprogram\";", null);
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.webview.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.q();
            qVar.u(getEventContext());
            qVar.s("src", str);
            qVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
            qVar.s("isMainFrame", java.lang.Boolean.TRUE);
            qVar.m();
        }
        synchronized (this.f345051y) {
            this.f345052z = 0;
            w0(new of1.n1(str));
        }
    }

    public void n0(java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onReceivedError url:" + str + ", errorCode:" + i17 + ", message:" + str2);
        if ((str == null || str.length() == 0) || !android.webkit.URLUtil.isNetworkUrl(str)) {
            return;
        }
        java.lang.String a17 = com.tencent.mm.pluginsdk.ui.tools.h9.a(str);
        if (!u46.l.c(a17, com.tencent.mm.pluginsdk.ui.tools.h9.a(this.f345039m))) {
            java.lang.String str4 = null;
            try {
                str3 = this.f345045s.getUrl();
            } catch (java.lang.Exception unused) {
                str3 = null;
            }
            if (!u46.l.c(a17, com.tencent.mm.pluginsdk.ui.tools.h9.a(str3))) {
                try {
                    str4 = this.f345045s.getOriginalUrl();
                } catch (java.lang.Exception unused2) {
                }
                if (!u46.l.c(a17, com.tencent.mm.pluginsdk.ui.tools.h9.a(str4))) {
                    return;
                }
            }
        }
        x0(str);
        com.tencent.mm.plugin.appbrand.jsapi.webview.r rVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.r();
        rVar.u(getEventContext());
        rVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
        rVar.s(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(i17));
        rVar.s("description", str2);
        rVar.s("src", str);
        rVar.m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q75.a.a(getContext()) != null) {
            com.tencent.mm.plugin.appbrand.widget.input.l2 e17 = com.tencent.mm.plugin.appbrand.widget.input.h1.e(this);
            if (e17 != null) {
                e17.a(this.f345043q);
            }
            this.f345042p = e17;
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f345034e;
        of1.t1 t1Var = this.f345044r;
        n7Var.U(t1Var);
        n7Var.R(t1Var);
        if (n7Var.l2()) {
            t1Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f345034e;
        boolean isRunning = n7Var.isRunning();
        of1.t1 t1Var = this.f345044r;
        if (!isRunning) {
            t1Var.c();
            destroy();
        }
        com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = this.f345042p;
        if (l2Var != null) {
            l2Var.g(this.f345043q);
        }
        n7Var.I(t1Var);
        n7Var.O(t1Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            int mode = android.view.View.MeasureSpec.getMode(i18);
            if (mode == Integer.MIN_VALUE) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, java.lang.Math.min(viewGroup.getMeasuredHeight(), android.view.View.MeasureSpec.getSize(i18))), Integer.MIN_VALUE);
            } else if (mode == 0) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), Integer.MIN_VALUE);
            } else if (mode == 1073741824 && android.view.View.MeasureSpec.getSize(i18) > viewGroup.getMeasuredHeight()) {
                i18 = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824);
            }
        }
        super.onMeasure(i17, i18);
    }

    public void q0(com.tencent.xweb.x0 x0Var, com.tencent.xweb.y0 y0Var) {
        if (x0Var == null || y0Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onReceivedHttpError url:" + x0Var.getUrl() + ", isForMainFrame:" + x0Var.isForMainFrame() + ", statusCode:" + y0Var.f220623c + ", reason:" + y0Var.f220624d);
        if (x0Var.isForMainFrame()) {
            java.lang.String uri = x0Var.getUrl().toString();
            kotlin.jvm.internal.o.f(uri, "toString(...)");
            x0(uri);
            com.tencent.mm.plugin.appbrand.jsapi.webview.r rVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.r();
            rVar.u(getEventContext());
            rVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
            rVar.s("httpCode", java.lang.Integer.valueOf(y0Var.f220623c));
            rVar.s("description", y0Var.f220624d);
            rVar.s("src", uri);
            rVar.m();
        }
    }

    public void r0(android.net.http.SslError sslError) {
        java.lang.String str;
        if (sslError == null) {
            return;
        }
        java.lang.String url = sslError.getUrl();
        java.lang.String a17 = com.tencent.mm.pluginsdk.ui.tools.h9.a(url);
        if (!u46.l.c(a17, com.tencent.mm.pluginsdk.ui.tools.h9.a(this.f345039m))) {
            java.lang.String str2 = null;
            try {
                str = this.f345045s.getUrl();
            } catch (java.lang.Exception unused) {
                str = null;
            }
            if (!u46.l.c(a17, com.tencent.mm.pluginsdk.ui.tools.h9.a(str))) {
                try {
                    str2 = this.f345045s.getOriginalUrl();
                } catch (java.lang.Exception unused2) {
                }
                if (!u46.l.c(a17, com.tencent.mm.pluginsdk.ui.tools.h9.a(str2))) {
                    return;
                }
            }
        }
        kotlin.jvm.internal.o.d(url);
        x0(url);
        com.tencent.mm.plugin.appbrand.jsapi.webview.r rVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.r();
        rVar.u(getEventContext());
        rVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
        rVar.s(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(sslError.getPrimaryError()));
        rVar.s("description", sslError.toString());
        rVar.s("src", url);
        rVar.m();
    }

    public void setAdjustResizeOnKeyboardStateChanged(boolean z17) {
        this.f345038i = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.o
    public void setAndroidViewId(int i17) {
        getAndroidView().setId(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.o
    public void setAudioMuted(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "setAudioMuted " + z17);
        this.f345045s.setAudioMuted(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.webview.o
    public void setBizDomainList(java.util.ArrayList<java.lang.String> arrayList) {
        this.G = arrayList;
    }

    public void setCoverViewId(int i17) {
        this.f345037h = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = r0.f345040n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L11
            int r1 = r1.length()
            if (r1 != 0) goto Lf
            goto L11
        Lf:
            r1 = r2
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 != 0) goto L15
            return
        L15:
            com.tencent.mm.plugin.appbrand.page.n7 r1 = r16.m533getPageView()
            com.tencent.mm.plugin.appbrand.o6 r1 = r1.getRuntime()
            if (r1 == 0) goto La6
            java.lang.Class<zd1.c> r4 = zd1.c.class
            com.tencent.mm.plugin.appbrand.jsapi.g0 r1 = r1.b(r4)
            zd1.c r1 = (zd1.c) r1
            if (r1 == 0) goto La6
            boolean r4 = r1.f471528d
            if (r4 != 0) goto L2e
            return
        L2e:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f345041o
            boolean r4 = r4.getAndSet(r3)
            if (r4 == 0) goto L37
            return
        L37:
            int r4 = r0.f345037h
            java.lang.String[] r5 = r1.f471529e
            if (r5 == 0) goto L48
            int r1 = r5.length
            if (r1 != 0) goto L42
            r1 = r3
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L46
            goto L48
        L46:
            r1 = r2
            goto L49
        L48:
            r1 = r3
        L49:
            r15 = 0
            if (r1 == 0) goto L4e
            r1 = r15
            goto L8c
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "\n            ;\n            (function (window) {\n                var htmlId = "
            r1.<init>(r6)
            r1.append(r4)
            java.lang.String r4 = "\n                var types = \""
            r1.append(r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r7 = "|"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 124(0x7c, float:1.74E-43)
            r14 = 0
            r6 = r4
            kz5.z.Z(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.append(r4)
            java.lang.String r4 = "\"\n                var webviewUrl = \""
            r1.append(r4)
            if (r17 != 0) goto L7e
            java.lang.String r4 = ""
            goto L80
        L7e:
            r4 = r17
        L80:
            r1.append(r4)
            java.lang.String r4 = "\"\n                var result = {}\n                result['htmlId'] = htmlId\n                result['webviewUrl'] = webviewUrl\n                types.split('|').forEach(function (type) {\n                    if ('textContent' === type) {\n                        result[type] = window.document.documentElement.textContent\n                    } else if ('innerHTML' === type) {\n                        result[type] = window.document.documentElement.innerHTML\n                    } else if ('innerText' === type) {\n                        result[type] = window.document.documentElement.innerText\n                    }\n                })\n                return JSON.stringify(result)\n            })(this)\n            ;\n        "
            r1.append(r4)
            java.lang.String r1 = r1.toString()
        L8c:
            if (r1 == 0) goto La6
            int r4 = r1.length()
            if (r4 <= 0) goto L95
            r2 = r3
        L95:
            if (r2 == 0) goto L98
            r15 = r1
        L98:
            if (r15 == 0) goto La6
            com.tencent.mm.ui.widget.MMWebView r1 = r16.getWebView()
            of1.s1 r2 = new of1.s1
            r2.<init>(r0)
            r1.evaluateJavascript(r15, r2)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.w1.t0(java.lang.String):void");
    }

    public void u0(java.lang.String str, com.tencent.xweb.x0 x0Var) {
        android.net.Uri url;
        com.tencent.mm.plugin.appbrand.jsapi.webview.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.q();
        qVar.u(getEventContext());
        qVar.s("src", (x0Var == null || (url = x0Var.getUrl()) == null) ? null : url.toString());
        qVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
        qVar.s("isMainFrame", java.lang.Boolean.FALSE);
        qVar.m();
    }

    public boolean v0() {
        return !getXwVideoOrientationControlSupported();
    }

    public final void w0(yz5.l lVar) {
        synchronized (this.f345051y) {
            java.util.Iterator<java.lang.Object> it = getPageLoadingListenerList().iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                kotlin.jvm.internal.o.d(null);
                throw null;
            }
        }
    }

    public final void x0(java.lang.String str) {
        java.lang.String str2 = this.f345040n;
        if (str2 == null || str2.length() == 0) {
            this.f345040n = str;
            com.tencent.mm.plugin.appbrand.jsapi.webview.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.q();
            qVar.u(getEventContext());
            qVar.s("src", str);
            qVar.s("htmlId", java.lang.Integer.valueOf(this.f345037h));
            qVar.s("isMainFrame", java.lang.Boolean.TRUE);
            qVar.m();
        }
    }

    public of1.x1 getController() {
        return getWebViewController();
    }

    /* renamed from: getPageView, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.n7 m533getPageView() {
        return this.f345034e;
    }
}
