package com.tencent.mm.ui.widget;

/* loaded from: classes8.dex */
public class MMWebView extends com.tencent.xweb.WebView implements pq5.a {
    public static final java.util.concurrent.CopyOnWriteArrayList F = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.Set A;
    public al5.o2 B;
    public final java.util.concurrent.CopyOnWriteArrayList C;
    public boolean D;
    public final java.util.List E;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f211370s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f211371t;

    /* renamed from: u, reason: collision with root package name */
    public final o25.k2 f211372u;

    /* renamed from: v, reason: collision with root package name */
    public int f211373v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f211374w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.z7 f211375x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f211376y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnTouchListener f211377z;

    public MMWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, com.tencent.xweb.f1.WV_KIND_NONE);
    }

    public static void H0(boolean z17) {
        java.util.Iterator it = F.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) ((java.lang.ref.WeakReference) it.next()).get();
            if (mMWebView != null) {
                if (z17) {
                    mMWebView.getSettings().B(2);
                } else {
                    mMWebView.getSettings().B(0);
                }
            }
        }
    }

    @Override // com.tencent.xweb.WebView
    public void A0(int i17, int i18, int i19, int i27) {
        al5.o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.F3(i17, i18, i19, i27);
        }
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            ((al5.o2) it.next()).F3(i17, i18, i19, i27);
        }
    }

    public void D0(al5.o2 o2Var) {
        this.C.add(o2Var);
    }

    public void E0() {
    }

    public void F0() {
        super.setOnTouchListener(new al5.k2(this));
    }

    public void G0() {
        setScrollbarFadingEnabled(true);
        setScrollBarStyle(0);
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        if (isXWalkKernel()) {
            s0(canvas);
            return true;
        }
        draw(canvas);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1.remove(r3);
     */
    @Override // com.tencent.xweb.WebView, tx5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void destroy() {
        /*
            r5 = this;
            r0 = 1
            super.destroy()     // Catch: java.lang.Throwable -> L29
            java.util.Set r1 = r5.A     // Catch: java.lang.Throwable -> L29
            r1.clear()     // Catch: java.lang.Throwable -> L29
            java.util.concurrent.CopyOnWriteArrayList r1 = com.tencent.mm.ui.widget.MMWebView.F     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L29
        Lf:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L26
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L29
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L29
            com.tencent.mm.ui.widget.MMWebView r4 = (com.tencent.mm.ui.widget.MMWebView) r4     // Catch: java.lang.Throwable -> L29
            if (r4 != r5) goto Lf
            r1.remove(r3)     // Catch: java.lang.Throwable -> L29
        L26:
            r5.f211376y = r0
            goto L35
        L29:
            r1 = move-exception
            java.lang.String r2 = "MicroMsg.MMWebView"
            java.lang.String r3 = "catch in destroy()"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r1, r3, r4)     // Catch: java.lang.Throwable -> L36
            goto L26
        L35:
            return
        L36:
            r1 = move-exception
            r5.f211376y = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.MMWebView.destroy():void");
    }

    @Override // com.tencent.xweb.WebView, tx5.f, com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (this.f211376y) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebView", "EvaluateJavascript can not after destroy. %s", new com.tencent.mm.sdk.platformtools.z3());
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            if (fp.h.c(19)) {
                super.evaluateJavascript(str, valueCallback);
                return;
            }
            try {
                if (!str.startsWith("javascript:")) {
                    str = "javascript:".concat(str);
                }
                super.loadUrl(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWebView", "evaluateJavascript failed : %s", e17.getMessage());
            }
        }
    }

    public android.content.Context getActivityContextIfHas() {
        return getContext() instanceof android.content.MutableContextWrapper ? ((android.content.MutableContextWrapper) getContext()).getBaseContext() : getContext();
    }

    public float getMMDensity() {
        float f17 = j65.f.f();
        com.tencent.xweb.f1 currentInstanceWebCoreType = getCurrentInstanceWebCoreType();
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_CW;
        com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
        if (currentInstanceWebCoreType != f1Var && getCurrentInstanceWebCoreType() != f1Var2) {
            return f17;
        }
        zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
        return com.tencent.xweb.WebView.getCurrentModuleWebCoreType() == f1Var2 && org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST) ? org.xwalk.core.XWalkEnvironment.f347975h : false ? getResources().getDisplayMetrics().density : f17;
    }

    public o25.k2 getPerformanceHelper() {
        return this.f211372u;
    }

    public java.lang.String getRandomStr() {
        return this.f211370s;
    }

    public int getWebViewContextType() {
        android.content.Context context = getContext();
        if (context instanceof android.content.MutableContextWrapper) {
            context = ((android.content.MutableContextWrapper) context).getBaseContext();
        }
        if (context == null) {
            return 0;
        }
        return context instanceof android.app.Activity ? 1 : 2;
    }

    public void i(android.content.Context context) {
        if (context instanceof com.tencent.mm.ui.vas.VASActivity) {
            context = ((com.tencent.mm.ui.vas.VASActivity) context).getContainerActivity();
        }
        if (getContext() instanceof android.content.MutableContextWrapper) {
            android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) getContext();
            if (mutableContextWrapper.getBaseContext() == context) {
                return;
            }
            mutableContextWrapper.setBaseContext(context);
        }
    }

    @Override // com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        super.loadUrl(str);
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (android.os.Build.VERSION.SDK_INT >= 30 && windowInsets != null) {
            android.graphics.Insets insets = windowInsets.getInsets(android.view.WindowInsets.Type.systemBars());
            android.graphics.Insets insets2 = windowInsets.getInsets(android.view.WindowInsets.Type.navigationBars());
            android.graphics.Insets insets3 = windowInsets.getInsets(android.view.WindowInsets.Type.tappableElement());
            java.lang.Object[] objArr = new java.lang.Object[5];
            boolean z17 = false;
            objArr[0] = java.lang.Integer.valueOf(insets.top);
            objArr[1] = java.lang.Integer.valueOf(insets.bottom);
            objArr[2] = java.lang.Integer.valueOf(insets2.bottom);
            objArr[3] = java.lang.Integer.valueOf(insets3.bottom);
            if (insets3.bottom > 0 && insets2.bottom == 0) {
                z17 = true;
            }
            objArr[4] = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebView", "onApplyWindowInsets systemBars.top:%d bottom:%d, navigationBars.bottom:%d, tappableElement.bottom:%d, isGestureNav:%b", objArr);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebView", "onCreateInputConnection");
        if (this.f211375x == null) {
            return super.onCreateInputConnection(editorInfo);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebView", "use inputConnectionWrapperHelper");
        if (editorInfo.extras == null) {
            editorInfo.extras = new android.os.Bundle();
        }
        ((fy4.e) this.f211375x).getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("if_support_wx_emoji", true);
        bundle.putBoolean("if_support_new_wxkb", true);
        bundle.putInt("wechat_scene", 7);
        bundle.putLong("if_support_file_ability", 7L);
        bundle.putLong("if_support_identity_ability", 7L);
        bundle.putLong("wechat_support_ability", 33L);
        editorInfo.extras.putAll(bundle);
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        fy4.e eVar = (fy4.e) this.f211375x;
        eVar.getClass();
        if (onCreateInputConnection == null) {
            onCreateInputConnection = new android.view.inputmethod.BaseInputConnection(eVar.f267259d.f183815f, false);
        }
        return new fy4.a(onCreateInputConnection, eVar);
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public final void onHide() {
        if (this.D) {
            return;
        }
        super.onHide();
        this.D = true;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public final void onShow() {
        super.onShow();
        this.D = false;
    }

    public void setCleanOnDetached(boolean z17) {
    }

    public void setInputConnectionWrapperHelper(com.tencent.mm.ui.z7 z7Var) {
        this.f211375x = z7Var;
    }

    @Override // com.tencent.xweb.WebView, android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f211377z = onTouchListener;
    }

    public void setPreload(boolean z17) {
        this.f211371t = z17;
    }

    public void setRandomStr(java.lang.String str) {
        this.f211370s = str;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void setWebChromeClient(com.tencent.xweb.s0 s0Var) {
        boolean z17 = s0Var instanceof al5.n2;
        java.util.List list = this.E;
        if (z17) {
            ((al5.n2) s0Var).f5963a = list;
        }
        if (s0Var == null) {
            ((java.util.ArrayList) list).clear();
        }
        super.setWebChromeClient(s0Var);
    }

    public MMWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, com.tencent.xweb.f1.WV_KIND_NONE);
    }

    public MMWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.tencent.xweb.f1 f1Var) {
        super(context instanceof com.tencent.mm.ui.vas.VASActivity ? ((com.tencent.mm.ui.vas.VASActivity) context).getContainerActivity() : context, attributeSet, i17, f1Var);
        this.f211372u = new o25.k2();
        this.f211373v = 0;
        this.f211374w = "MMWebView_" + java.lang.System.currentTimeMillis();
        this.A = new java.util.HashSet();
        this.B = null;
        this.C = new java.util.concurrent.CopyOnWriteArrayList();
        this.D = false;
        this.E = new java.util.ArrayList();
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebView", "MMWebView create not in main thread, stack: %s", new com.tencent.mm.sdk.platformtools.z3());
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", e17.getMessage());
        }
        F.add(new java.lang.ref.WeakReference(this));
    }
}
