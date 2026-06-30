package vx5;

/* loaded from: classes13.dex */
public class i0 implements tx5.f, com.tencent.xweb.c3 {
    public static volatile boolean C;
    public final android.os.Looper A;
    public final com.tencent.xweb.internal.ProxyWebViewClientExtension B;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.xweb.WebView f441353d;

    /* renamed from: e, reason: collision with root package name */
    public final vx5.j0 f441354e;

    /* renamed from: f, reason: collision with root package name */
    public final vx5.h0 f441355f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.AbsoluteLayout f441356g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.xweb.h1 f441357h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.xweb.s0 f441358i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.xweb.g1 f441359m;

    /* renamed from: n, reason: collision with root package name */
    public final int f441360n;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.xweb.h3 f441366t;

    /* renamed from: u, reason: collision with root package name */
    public sx5.a f441367u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.xweb.d3 f441368v;

    /* renamed from: o, reason: collision with root package name */
    public long f441361o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f441362p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f441363q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f441364r = 0;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.xweb.internal.ProxyWebViewClientExtension f441365s = new com.tencent.xweb.internal.ProxyWebViewClientExtension();

    /* renamed from: w, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f441369w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f441370x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f441371y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f441372z = false;

    public i0(com.tencent.xweb.WebView webView) {
        vx5.b0 b0Var = new vx5.b0(this);
        vx5.d0 d0Var = new vx5.d0(this);
        vx5.e0 e0Var = new vx5.e0(this);
        this.B = e0Var;
        this.A = android.os.Looper.myLooper();
        C = webView.getContext().getApplicationInfo().targetSdkVersion >= 18;
        int d17 = org.xwalk.core.XWalkEnvironment.d();
        this.f441360n = d17;
        com.tencent.xweb.pinus.PSContextWrapper pSContextWrapper = new com.tencent.xweb.pinus.PSContextWrapper(webView.getContext(), d17);
        vx5.h0 h0Var = new vx5.h0(this, pSContextWrapper);
        this.f441355f = h0Var;
        android.widget.AbsoluteLayout absoluteLayout = new android.widget.AbsoluteLayout(pSContextWrapper);
        this.f441356g = absoluteLayout;
        h0Var.getContentView().addView(absoluteLayout);
        h0Var.setCustomOnScrollChangedListener(new vx5.y(this));
        h0Var.setCustomOnOverScrolledListener(new vx5.z(this));
        h0Var.setBackgroundColor(0);
        this.f441353d = webView;
        this.f441354e = new vx5.j0(h0Var);
        h0Var.setWebChromeClient(b0Var);
        h0Var.setWebViewClient(d0Var);
        this.f441366t = new com.tencent.xweb.h3(this);
        h0Var.setProxyWebViewClientExtension(e0Var);
        this.f441368v = new com.tencent.xweb.d3(webView, this);
        android.content.Context context = h0Var.getContext();
        by5.c4.f("PinusWebView", "initFullscreenVideo, kind:" + getFullscreenVideoKind() + ", activity:" + context);
        this.f441367u = sx5.c1.a(webView.getCurrentInstanceWebCoreType(), context, webView, h0Var, sx5.g.a());
        if (getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS) {
            this.f441367u.j(h0Var);
        }
    }

    @Override // tx5.f
    public boolean F() {
        int scrollBarStyle = this.f441355f.getScrollBarStyle();
        return scrollBarStyle == 0 || scrollBarStyle == 33554432;
    }

    @Override // tx5.f
    public void S(boolean z17) {
        sx5.a aVar = this.f441367u;
        if (aVar != null) {
            aVar.i(z17);
        }
    }

    @Override // tx5.f
    public boolean T() {
        return u(1042);
    }

    @Override // tx5.f
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f441355f.addJavascriptInterface(obj, str);
    }

    @Override // tx5.f
    public boolean canGoBack() {
        if (this.f441362p) {
            return false;
        }
        return this.f441355f.canGoBack();
    }

    @Override // tx5.f
    public boolean canGoForward() {
        return this.f441355f.canGoForward();
    }

    @Override // tx5.f
    public void captureLongScreenshot(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback) {
        java.util.Objects.toString(rect);
        java.util.Objects.toString(valueCallback);
        if (rect == null || valueCallback == null) {
            java.util.Objects.toString(rect);
            java.util.Objects.toString(valueCallback);
        } else {
            this.f441355f.captureLongScreenshot(rect, new vx5.f0(this, valueCallback));
        }
    }

    @Override // tx5.f
    public void clearHistory() {
        this.f441355f.clearHistory();
    }

    @Override // tx5.f
    public void clearMatches() {
        this.f441355f.clearMatches();
    }

    @Override // tx5.f
    public void clearSslPreferences() {
        this.f441355f.clearSslPreferences();
    }

    @Override // tx5.f
    public void clearView() {
        this.f441355f.clearView();
    }

    @Override // tx5.f
    public void destroy() {
        this.f441355f.destroy();
    }

    @Override // tx5.f, com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f441355f.evaluateJavascript(str, valueCallback);
    }

    @Override // tx5.f, com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        by5.c4.f("PinusWebView", "captureBitmap, start");
        android.view.View childAt = ((android.view.ViewGroup) ((android.view.ViewGroup) this.f441355f.getChildAt(0)).getChildAt(0)).getChildAt(0);
        if (!(childAt instanceof android.view.TextureView)) {
            return null;
        }
        android.graphics.Bitmap bitmap = ((android.view.TextureView) childAt).getBitmap();
        by5.c4.f("PinusWebView", "captureBitmap, bitmap:" + bitmap);
        return bitmap;
    }

    @Override // tx5.f
    public void findAllAsync(java.lang.String str) {
        this.f441355f.findAllAsync(str);
    }

    @Override // tx5.f
    public void findNext(boolean z17) {
        this.f441355f.findNext(z17);
    }

    @Override // tx5.f
    public java.lang.String getAbstractInfo() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pinus, sdk ver = 20260502\napk ver = ");
        sb6.append(org.xwalk.core.XWalkEnvironment.d());
        sb6.append("\ndetail = ");
        by5.u3 u3Var = org.xwalk.core.XWalkEnvironment.f347971d;
        sb6.append(u3Var != null ? u3Var.f36606b : "");
        return sb6.toString();
    }

    @Override // tx5.f
    public android.net.http.SslCertificate getCertificate() {
        return this.f441355f.getCertificate();
    }

    @Override // tx5.f
    public int getContentHeight() {
        return this.f441355f.getContentHeight();
    }

    @Override // tx5.f
    public android.graphics.Bitmap getFavicon() {
        return this.f441355f.getFavicon();
    }

    @Override // tx5.f
    public com.tencent.xweb.c1 getFullscreenVideoKind() {
        return com.tencent.xweb.b.m().l(com.tencent.xweb.WebView.getModuleName());
    }

    @Override // tx5.f
    public com.tencent.xweb.d1 getHitTestResult() {
        int i17;
        java.lang.String str;
        by5.i0 i0Var;
        by5.i0 i0Var2;
        com.tencent.xweb.d1 d1Var = new com.tencent.xweb.d1();
        com.tencent.xweb.pinus.sdk.e hitTestResult = this.f441355f.getHitTestResult();
        com.tencent.xweb.pinus.sdk.f fVar = (com.tencent.xweb.pinus.sdk.f) hitTestResult;
        fVar.getClass();
        try {
            synchronized (fVar) {
                i0Var2 = fVar.f220442c;
                if (i0Var2 == null) {
                    i0Var2 = new by5.i0(fVar.f220440a, "getType", new java.lang.Class[0]);
                    fVar.f220442c = i0Var2;
                }
            }
            i17 = ((java.lang.Integer) i0Var2.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            i17 = 0;
        }
        d1Var.f220239a = i17;
        com.tencent.xweb.pinus.sdk.f fVar2 = (com.tencent.xweb.pinus.sdk.f) hitTestResult;
        try {
            synchronized (fVar2) {
                i0Var = fVar2.f220441b;
                if (i0Var == null) {
                    i0Var = new by5.i0(fVar2.f220440a, "getExtra", new java.lang.Class[0]);
                    fVar2.f220441b = i0Var;
                }
            }
            str = (java.lang.String) i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused2) {
            str = null;
        }
        d1Var.f220240b = str;
        return d1Var;
    }

    @Override // tx5.f
    public void getImageFromDiskCache(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (valueCallback == null) {
            return;
        }
        this.f441355f.getImageFromDiskCache(str, new vx5.g0(this, valueCallback));
    }

    @Override // tx5.f
    public java.lang.String getOriginalUrl() {
        return this.f441355f.getOriginalUrl();
    }

    @Override // tx5.f
    public int getProgress() {
        return this.f441355f.getProgress();
    }

    @Override // tx5.f
    public float getScale() {
        return this.f441355f.getScale();
    }

    @Override // tx5.f
    public int getScrollHeight() {
        return this.f441355f.computeVerticalScrollRange();
    }

    @Override // tx5.f
    public com.tencent.xweb.z0 getSettings() {
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (by5.d4.e().getBoolean("bEnableCheckThread", false) && this.A != null && android.os.Looper.myLooper() != this.A) {
            java.lang.Throwable th6 = new java.lang.Throwable("A WebView method was called on thread '" + java.lang.Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + this.A + " called on " + android.os.Looper.myLooper() + ", FYI main Looper is " + android.os.Looper.getMainLooper() + ")");
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkThread error:");
            sb6.append(stackTraceString);
            by5.c4.g("PinusWebView", sb6.toString());
            xx5.g.a(3, stackTraceString, 4, "");
            if (C) {
                throw new java.lang.RuntimeException(th6);
            }
        }
        return this.f441354e;
    }

    @Override // tx5.f
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        return null;
    }

    @Override // tx5.f
    public java.lang.String getTitle() {
        return this.f441355f.getTitle();
    }

    @Override // tx5.f
    public android.view.ViewGroup getTopView() {
        return this.f441356g;
    }

    @Override // tx5.f
    public java.lang.String getUrl() {
        return this.f441355f.getUrl();
    }

    @Override // tx5.f
    public java.lang.String getVersionInfo() {
        return "pinus, sdkver:20260502, apkver:" + this.f441360n;
    }

    @Override // tx5.f
    public android.view.View getView() {
        return this.f441355f;
    }

    @Override // tx5.f
    public int getVisibleTitleHeight() {
        return 0;
    }

    @Override // tx5.f
    public com.tencent.xweb.s0 getWebChromeClient() {
        return this.f441358i;
    }

    @Override // tx5.f
    public int getWebScrollX() {
        vx5.h0 h0Var = this.f441355f;
        return h0Var instanceof com.tencent.xweb.pinus.sdk.WebView ? h0Var.computeHorizontalScrollOffset() : h0Var.getScrollX();
    }

    @Override // tx5.f
    public int getWebScrollY() {
        return this.f441355f.computeVerticalScrollOffset();
    }

    @Override // tx5.f
    public com.tencent.xweb.g1 getWebViewCallbackClient() {
        return this.f441359m;
    }

    @Override // tx5.f
    public com.tencent.xweb.h1 getWebViewClient() {
        return this.f441357h;
    }

    @Override // tx5.f
    public android.os.Looper getWebViewLooper() {
        return this.A;
    }

    @Override // tx5.f
    public com.tencent.xweb.m1 getWebViewRenderProcessClient() {
        return null;
    }

    @Override // tx5.f
    public android.view.View getWebViewUI() {
        return this.f441355f;
    }

    @Override // tx5.f
    public void goBack() {
        this.f441355f.goBack();
    }

    @Override // tx5.f
    public void goForward() {
        this.f441355f.goForward();
    }

    @Override // tx5.f
    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f441355f.loadData(str, str2, str3);
    }

    @Override // tx5.f
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f441355f.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        vx5.h0 h0Var = this.f441355f;
        if (str != null && str.trim().startsWith("javascript:")) {
            h0Var.evaluateJavascript(str, null);
        } else {
            this.f441362p = false;
            h0Var.loadUrl(str);
        }
    }

    @Override // tx5.f
    public void m() {
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f441369w;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // tx5.f
    public com.tencent.xweb.o0 m0(com.tencent.xweb.VideoJsCallback videoJsCallback) {
        sx5.a aVar = this.f441367u;
        if (aVar != null && aVar.f(videoJsCallback)) {
            return new vx5.a0(this);
        }
        by5.c4.f("PinusWebView", "setVideoJsCallback not support");
        return null;
    }

    @Override // tx5.f
    public boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
        return this.f441355f.getImageBitmapToFile(str, str2, str3, getImageBitmapToFileFinishedCallback);
    }

    @Override // tx5.f
    public void onHide() {
        this.f441355f.onHide();
    }

    @Override // tx5.f
    public void onPause() {
        this.f441355f.onPause();
    }

    @Override // tx5.f
    public void onResume() {
        this.f441355f.onResume();
    }

    @Override // tx5.f
    public void onShow() {
        this.f441355f.onShow();
    }

    @Override // tx5.f
    public void reload() {
        this.f441355f.reload();
    }

    @Override // tx5.f
    public void removeJavascriptInterface(java.lang.String str) {
        this.f441355f.removeJavascriptInterface(str);
    }

    @Override // tx5.f
    public boolean s() {
        return this.f441370x;
    }

    @Override // tx5.f
    public boolean savePage(java.lang.String str, java.lang.String str2, int i17) {
        return this.f441355f.savePage(str, str2, i17);
    }

    @Override // tx5.f
    public void setAudioMuted(boolean z17) {
        this.f441355f.setAudioMuted(z17);
    }

    @Override // tx5.f
    public void setBottomHeight(int i17) {
        this.f441355f.setBottomHeight(i17);
    }

    @Override // tx5.f
    public void setDownloadListener(android.webkit.DownloadListener downloadListener) {
        this.f441355f.setDownloadListener(downloadListener);
    }

    @Override // tx5.f
    public void setFindListener(android.webkit.WebView.FindListener findListener) {
        this.f441355f.setFindListener(findListener);
    }

    @Override // tx5.f
    public void setHorizontalScrollBarEnabled(boolean z17) {
        this.f441355f.setHorizontalScrollBarEnable(z17);
    }

    @Override // tx5.f
    public void setHorizontalScrollbarOverlay(boolean z17) {
    }

    @Override // tx5.f
    public void setInitialScale(int i17) {
        this.f441355f.setInitialScale(i17);
    }

    @Override // tx5.f
    public void setInputOutOfKeyboardEnable(boolean z17) {
        this.f441355f.setInputOutOfKeyboardEnable(z17);
    }

    @Override // tx5.f
    public void setJSExceptionListener(com.tencent.xweb.l1 l1Var) {
    }

    @Override // tx5.f
    public void setNativeDownloadClient(com.tencent.xweb.p2 p2Var) {
        this.f441355f.setNativeDownloadClient(new com.tencent.xweb.internal.XWebNativeDownloadClientWrapper(p2Var));
    }

    @Override // tx5.f
    public void setNetworkAvailable(boolean z17) {
        this.f441355f.setNetworkAvailable(z17);
    }

    @Override // tx5.f
    public void setPictureListener(android.webkit.WebView.PictureListener pictureListener) {
    }

    @Override // tx5.f
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
    }

    @Override // tx5.f
    public void setVerticalScrollBarEnabled(boolean z17) {
        this.f441355f.setVerticalScrollBarEnable(z17);
    }

    @Override // tx5.f
    public void setVerticalScrollbarOverlay(boolean z17) {
    }

    @Override // tx5.f
    public void setWebChromeClient(com.tencent.xweb.s0 s0Var) {
        this.f441358i = s0Var;
    }

    @Override // tx5.f
    public void setWebContentsSize(int i17, int i18) {
        this.f441355f.setWebContentsSize(i17, i18);
    }

    @Override // tx5.f
    public void setWebViewCallbackClient(com.tencent.xweb.g1 g1Var) {
        this.f441359m = g1Var;
    }

    @Override // tx5.f
    public void setWebViewClient(com.tencent.xweb.h1 h1Var) {
        this.f441357h = h1Var;
    }

    @Override // tx5.f
    public void setWebViewClientExtension(com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension) {
        this.f441365s = proxyWebViewClientExtension;
        this.f441355f.setProxyWebViewClientExtension(this.B);
    }

    @Override // tx5.f
    public void setXWebKeyEventHandler(com.tencent.xweb.XWebKeyEventHandler xWebKeyEventHandler) {
        java.lang.Object bridge;
        vx5.h0 h0Var = this.f441355f;
        if (h0Var == null) {
            by5.c4.c("PinusWebView", "getPinusBridge, mWebview is null");
            bridge = null;
        } else {
            bridge = h0Var.getBridge();
        }
        vx5.k.f441374a.g(80015, new java.lang.Object[]{bridge, xWebKeyEventHandler});
    }

    @Override // tx5.f
    public void smoothScroll(int i17, int i18, long j17) {
        this.f441355f.smoothScroll(i17, i18, j17);
    }

    @Override // tx5.f
    public void stopLoading() {
        this.f441355f.stopLoading();
    }

    @Override // tx5.f
    public void t(java.util.concurrent.Executor executor, com.tencent.xweb.m1 m1Var) {
    }

    @Override // tx5.f
    public boolean u(int i17) {
        return com.tencent.xweb.pinus.PSCoreWrapper.getInstance().hasFeature(i17);
    }

    @Override // tx5.f
    public boolean y() {
        boolean z17 = this.f441363q;
        vx5.h0 h0Var = this.f441355f;
        return (h0Var instanceof com.tencent.xweb.pinus.sdk.WebView ? h0Var.computeVerticalScrollOffset() : h0Var.getScrollY()) == 0 && z17;
    }

    @Override // tx5.f
    public boolean zoomIn() {
        return this.f441355f.zoomIn();
    }

    @Override // tx5.f
    public boolean zoomOut() {
        return this.f441355f.zoomOut();
    }

    @Override // tx5.f, pf.b
    public void loadUrl(java.lang.String str, java.util.Map map) {
        this.f441355f.loadUrl(str, map);
    }
}
