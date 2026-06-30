package com.tencent.mm.plugin.websearch.webview;

/* loaded from: classes8.dex */
public abstract class BaseWebSearchWebView extends com.tencent.mm.ui.widget.MMWebView {
    public final android.content.Context G;
    public android.graphics.Bitmap H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f181704J;
    public boolean K;

    public BaseWebSearchWebView(android.content.Context context, com.tencent.xweb.f1 f1Var) {
        super(context, null, 0, f1Var);
        this.H = null;
        this.I = false;
        this.f181704J = 0;
        this.K = false;
        this.G = context;
        I0();
    }

    public final void I0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchWebView", "init WebSearchWebView");
        if (fp.h.c(19)) {
            return;
        }
        try {
            java.lang.Object a17 = new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(new yo.b(this, "mSysWebView", null).a(), "mProvider", null).a(), "mWebViewCore", null).a(), "sWebCoreHandler", null).a(), "mLooper", null).a(), "mThread", null).a();
            if (a17 instanceof java.lang.Thread) {
                java.lang.Thread thread = (java.lang.Thread) a17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", thread.getState());
                if (thread.getState() == java.lang.Thread.State.WAITING) {
                    thread.interrupt();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchWebView", "tryInterruptAwaitingWebCoreThread, exception = %s", e17);
        }
    }

    public void J0(com.tencent.xweb.s0 s0Var, com.tencent.xweb.h1 h1Var) {
        getSettings().z(true);
        getSettings().E(true);
        getSettings().r(false);
        getSettings().I(true);
        getSettings().J(0);
        getSettings().Q(getUserAgentString());
        getSettings().P(true);
        getSettings().G(true);
        getSettings().M(false);
        getSettings().L(false);
        getSettings().C(true);
        getSettings().D(true);
        getSettings().J(0);
        getSettings().l(10485760L);
        getSettings().m(this.G.getDir("webviewcache", 0).getAbsolutePath());
        getSettings().k(true);
        getSettings().t(true);
        getSettings().u(lp0.b.X() + "databases/");
        getSettings().h(true);
        getSettings().i(true);
        com.tencent.xweb.d.g().d(true);
        com.tencent.xweb.d.g().f(this, true);
        getView().setHorizontalScrollBarEnabled(false);
        getView().setVerticalScrollBarEnabled(true);
        setConfigCallback((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window"));
        if (s0Var != null) {
            super.setWebChromeClient(s0Var);
        }
        if (h1Var != null) {
            super.setWebViewClient(h1Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchWebView", "current webview core %s", getCurrentInstanceWebCoreType());
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        G0();
        getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        float b17 = j65.c.b(getContext());
        if (b17 >= i65.a.v(getContext())) {
            getSettings().O(132);
        } else if (b17 >= i65.a.u(getContext())) {
            getSettings().O(132);
        } else if (b17 >= i65.a.t(getContext())) {
            getSettings().O(132);
        } else if (b17 >= i65.a.s(getContext())) {
            getSettings().O(124);
        } else if (b17 >= i65.a.z(getContext())) {
            getSettings().O(116);
        } else if (b17 >= i65.a.w(getContext())) {
            getSettings().O(108);
        } else {
            i65.a.x(getContext());
            if (b17 >= 1.0f) {
                getSettings().O(100);
            } else if (b17 >= i65.a.y(getContext())) {
                getSettings().O(92);
            } else {
                getSettings().O(80);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchWebView", "SetFontSize, fontSize = %f", java.lang.Float.valueOf(b17));
    }

    public abstract java.lang.String getUserAgentString();

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.H;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        } else {
            super.onDraw(canvas);
            this.K = true;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f181704J;
        if (i19 <= 0) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void onPause() {
        if (this.I) {
            android.graphics.Bitmap bitmap = this.H;
            if (bitmap != null) {
                bitmap.recycle();
                this.H = null;
            }
            try {
                this.H = getBitmap();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchWebView", "setBitmap, exception = %s", e17);
                this.H = null;
            }
        }
        super.onPause();
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void onResume() {
        super.onResume();
        ((ku5.t0) ku5.t0.f312615d).B(new aw4.m$$a(this));
    }

    public void setConfigCallback(android.view.WindowManager windowManager) {
        try {
            java.lang.reflect.Field declaredField = com.tencent.xweb.WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            if (obj == null) {
                return;
            }
            java.lang.reflect.Field declaredField2 = declaredField.getType().getDeclaredField("mWindowManager");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, windowManager);
        } catch (java.lang.Exception unused) {
        }
    }

    public void setFlutterWidget(boolean z17) {
        this.I = z17;
        ((ku5.t0) ku5.t0.f312615d).B(new aw4.m$$a(this));
    }

    public void setOnTouchUp(aw4.n nVar) {
    }

    public void setRealHeight(int i17) {
        this.f181704J = i17;
    }

    public BaseWebSearchWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = null;
        this.I = false;
        this.f181704J = 0;
        this.K = false;
        this.G = context;
        I0();
    }

    public BaseWebSearchWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.H = null;
        this.I = false;
        this.f181704J = 0;
        this.K = false;
        this.G = context;
        I0();
    }

    public BaseWebSearchWebView(android.content.Context context) {
        super(context, null);
        this.H = null;
        this.I = false;
        this.f181704J = 0;
        this.K = false;
        this.G = context;
        I0();
    }
}
