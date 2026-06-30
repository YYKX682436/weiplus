package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class b0 extends uw4.n {

    /* renamed from: y1, reason: collision with root package name */
    public static final java.lang.Object f139870y1 = new java.lang.Object();
    public final vz4.x P;
    public boolean Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.util.Map T;
    public java.lang.String U;
    public boolean V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.game.report.api.GameWebPerformanceInfo f139871l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f139872p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f139873p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f139874x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.lang.Runnable f139875x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f139876y0;

    public b0(android.content.Context context) {
        super(context);
        this.Q = false;
        this.V = false;
        this.W = false;
        this.f139872p0 = false;
        this.f139874x0 = false;
        this.f139876y0 = false;
        this.f139873p1 = false;
        this.f139875x1 = new com.tencent.mm.plugin.game.luggage.page.v(this);
        getSettings().A(1);
        this.P = new vz4.x();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "create, hashCode: %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // uw4.n
    public void M0() {
        super.M0();
        getWebCore().f406636o.a(new com.tencent.mm.plugin.game.luggage.c0(this));
    }

    public void O0(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onPageFinished, blockImg: %b", java.lang.Boolean.valueOf(this.W));
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.f139871l1;
        if (gameWebPerformanceInfo.F == 0) {
            gameWebPerformanceInfo.F = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onPageFinished, url: %s, time: %d", str, java.lang.Long.valueOf(this.f139871l1.F));
        }
        if (sx4.d0.b(this.U).f413586e == 0) {
            sx4.d0.b(this.U).f413586e = java.lang.System.currentTimeMillis();
        }
        synchronized (f139870y1) {
            getSettings().q(this.W);
        }
        this.V = true;
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo2 = this.f139871l1;
        if (gameWebPerformanceInfo2.C != 0) {
            return;
        }
        gameWebPerformanceInfo2.C = java.lang.System.currentTimeMillis();
    }

    public void P0(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f139872p0 = true;
        if (this.f139874x0) {
            postDelayed(this.f139875x1, 3000L);
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.f139871l1;
        if (gameWebPerformanceInfo.E == 0) {
            gameWebPerformanceInfo.E = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onPageStarted, url: %s, time: %d", str, java.lang.Long.valueOf(this.f139871l1.E));
        }
        if (sx4.d0.b(this.U).f413585d == 0) {
            sx4.d0.b(this.U).f413585d = java.lang.System.currentTimeMillis();
        }
    }

    @Override // uw4.n, pf.b
    public void a0(pf.a aVar) {
        super.a0(aVar);
        N0(new com.tencent.mm.plugin.game.luggage.page.w(this));
    }

    @Override // uw4.n, com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f
    public void destroy() {
        this.P.g(this.f139876y0);
        super.destroy();
    }

    @Override // uw4.n, com.tencent.xweb.WebView, tx5.f
    public java.lang.String getTitle() {
        return this.R;
    }

    public vz4.x getWePkgPlugin() {
        return this.P;
    }

    @Override // com.tencent.xweb.WebView, tx5.f
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (this.f139871l1 == null) {
            com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(str);
            this.f139871l1 = b17;
            b17.D = java.lang.System.currentTimeMillis();
        }
        if (!this.Q) {
            this.P.e(str, true, true);
            this.Q = true;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // uw4.n, com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time : %d, hashCode: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        if (this.f139871l1 == null) {
            com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(this.U);
            this.f139871l1 = b17;
            b17.D = java.lang.System.currentTimeMillis();
        }
        boolean z17 = this.Q;
        vz4.x xVar = this.P;
        if (!z17) {
            xVar.e(str, true, false);
            this.Q = true;
        }
        if (!xVar.f441756d) {
            xVar.f441769q = null;
        }
        java.lang.String str2 = xVar.f441769q;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                jj0.a.a().b(5, java.net.URLEncoder.encode(str), "0", 0L);
            } catch (java.lang.Exception unused) {
            }
            super.loadUrl(str);
        } else {
            try {
                jj0.a.a().b(5, java.net.URLEncoder.encode(str), "1", 0L);
            } catch (java.lang.Exception unused2) {
            }
            super.loadDataWithBaseURL(str, str2, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onAttachedToWindow, hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        this.f139874x0 = true;
        if (this.f139872p0) {
            postDelayed(this.f139875x1, 3000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "onDetachedFromWindow, hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        removeCallbacks(this.f139875x1);
    }

    public void setBlockNetworkImage(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage, blockImg: %b", java.lang.Boolean.valueOf(z17));
        this.W = z17;
        if (this.V) {
            synchronized (f139870y1) {
                getSettings().q(z17);
            }
        }
    }

    public void setRawUrl(java.lang.String str) {
        this.U = str;
    }

    public void setShouldCleanPkgWhenDestroy(boolean z17) {
        this.f139876y0 = z17;
    }

    @Override // uw4.n, com.tencent.xweb.WebView, tx5.f, pf.b
    public void loadUrl(java.lang.String str, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl, __Time__, time: %d， HEADER", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (this.f139871l1 == null) {
            com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(this.U);
            this.f139871l1 = b17;
            b17.D = java.lang.System.currentTimeMillis();
        }
        boolean z17 = this.Q;
        vz4.x xVar = this.P;
        if (!z17) {
            xVar.e(str, true, false);
            this.Q = true;
        }
        if (!xVar.f441756d) {
            xVar.f441769q = null;
        }
        java.lang.String str2 = xVar.f441769q;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebCoreImpl", "loadUrl:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            jj0.a.a().b(5, java.net.URLEncoder.encode(str), "0", 0L);
            super.loadUrl(str, map);
        } else {
            jj0.a.a().b(5, java.net.URLEncoder.encode(str), "1", 0L);
            super.loadDataWithBaseURL(str, str2, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        }
    }
}
