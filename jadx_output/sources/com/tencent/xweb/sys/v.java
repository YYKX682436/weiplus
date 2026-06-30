package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class v implements tx5.f {

    /* renamed from: t, reason: collision with root package name */
    public static volatile boolean f220574t;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.xweb.WebView f220575d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.xweb.sys.u f220576e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.xweb.h1 f220577f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.xweb.s0 f220578g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.xweb.g1 f220579h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.xweb.sys.w f220580i;

    /* renamed from: o, reason: collision with root package name */
    public sx5.a f220583o;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Looper f220585q;

    /* renamed from: m, reason: collision with root package name */
    public long f220581m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f220582n = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f220584p = -1;

    /* renamed from: r, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f220586r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f220587s = false;

    public v(com.tencent.xweb.WebView webView) {
        android.webkit.WebChromeClient webChromeClient = new android.webkit.WebChromeClient() { // from class: com.tencent.xweb.sys.SysWebView$2
            @Override // android.webkit.WebChromeClient
            public android.view.View getVideoLoadingProgressView() {
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                return s0Var != null ? s0Var.a() : android.view.LayoutInflater.from(vVar.f220575d.getContext()).inflate(com.tencent.xwebsdk.R.layout.xweb_video_progress, (android.view.ViewGroup) null);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                return s0Var != null ? s0Var.b(consoleMessage) : super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                by5.c4.f("SysWebView", "onGeolocationPermissionsHidePrompt");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.f();
                } else {
                    super.onGeolocationPermissionsHidePrompt();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
                by5.c4.f("SysWebView", "onGeolocationPermissionsShowPrompt");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.g(str, callback);
                } else {
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                by5.c4.f("SysWebView", "onHideCustomView");
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                vVar.f220586r = null;
                vVar.f220587s = false;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                if (s0Var != null ? s0Var.d() : false) {
                    by5.c4.f("SysWebView", "onHideCustomView, isHandled:true");
                    return;
                }
                sx5.a aVar = vVar.f220583o;
                if (aVar != null) {
                    aVar.e();
                    return;
                }
                com.tencent.xweb.s0 s0Var2 = vVar.f220578g;
                if (s0Var2 != null) {
                    s0Var2.h();
                } else {
                    super.onHideCustomView();
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(android.webkit.WebView webView2, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                by5.c4.f("SysWebView", "onJsAlert");
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                return s0Var != null ? s0Var.i(vVar.f220575d, str, str2, new com.tencent.xweb.sys.i(jsResult)) : super.onJsAlert(webView2, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(android.webkit.WebView webView2, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
                by5.c4.f("SysWebView", "onJsConfirm");
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                return s0Var != null ? s0Var.j(vVar.f220575d, str, str2, new com.tencent.xweb.sys.i(jsResult)) : super.onJsConfirm(webView2, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(android.webkit.WebView webView2, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
                by5.c4.f("SysWebView", "onJsPrompt");
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                return s0Var != null ? s0Var.k(vVar.f220575d, str, str2, str3, new com.tencent.xweb.sys.h(jsPromptResult)) : super.onJsPrompt(webView2, str, str2, str3, jsPromptResult);
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
                by5.c4.f("SysWebView", "onPermissionRequest");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.l(permissionRequest);
                } else {
                    super.onPermissionRequest(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequestCanceled(android.webkit.PermissionRequest permissionRequest) {
                by5.c4.f("SysWebView", "onPermissionRequestCanceled");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.m(permissionRequest);
                } else {
                    super.onPermissionRequestCanceled(permissionRequest);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView2, int i17) {
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                if (s0Var != null) {
                    s0Var.n(vVar.f220575d, i17);
                } else {
                    super.onProgressChanged(webView2, i17);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(android.webkit.WebView webView2, java.lang.String str) {
                by5.c4.f("SysWebView", "onReceivedTitle: " + str);
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                sx5.a aVar = vVar.f220583o;
                if (aVar != null) {
                    aVar.g(true, vVar.f220575d.getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS);
                }
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                if (s0Var != null) {
                    s0Var.o(vVar.f220575d, str);
                } else {
                    super.onReceivedTitle(webView2, str);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
                by5.c4.f("SysWebView", "onShowCustomView");
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                vVar.f220586r = customViewCallback;
                vVar.f220587s = true;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                boolean c17 = s0Var != null ? s0Var.c(view, customViewCallback) : false;
                com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
                if (n1Var != null) {
                    n1Var.b(577L, 56L, 1L);
                    by5.s0.f36595c.b(1749L, 5L, 1L);
                }
                if (c17) {
                    by5.c4.f("SysWebView", "onShowCustomView, isHandled:true");
                    return;
                }
                sx5.a aVar = vVar.f220583o;
                if (aVar != null) {
                    by5.s0.r(com.tencent.xweb.f1.WV_KIND_SYS, aVar instanceof sx5.a1, vVar.getUrl());
                    vVar.f220583o.b(view, customViewCallback);
                    return;
                }
                com.tencent.xweb.s0 s0Var2 = vVar.f220578g;
                if (s0Var2 != null) {
                    s0Var2.p(view, customViewCallback);
                } else {
                    super.onShowCustomView(view, customViewCallback);
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(android.webkit.WebView webView2, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
                by5.c4.f("SysWebView", "onShowFileChooser last method");
                com.tencent.xweb.sys.v vVar = com.tencent.xweb.sys.v.this;
                com.tencent.xweb.s0 s0Var = vVar.f220578g;
                return s0Var != null ? s0Var.q(vVar.f220575d, valueCallback, new com.tencent.xweb.sys.g(fileChooserParams)) : super.onShowFileChooser(webView2, valueCallback, fileChooserParams);
            }

            public void openFileChooser(android.webkit.ValueCallback<android.net.Uri> valueCallback) {
                by5.c4.f("SysWebView", "openFileChooser with one param");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.r(valueCallback, null, null);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }

            public void openFileChooser(android.webkit.ValueCallback<android.net.Uri> valueCallback, java.lang.String str) {
                by5.c4.f("SysWebView", "openFileChooser with two param");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.r(valueCallback, str, null);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }

            public void openFileChooser(android.webkit.ValueCallback<android.net.Uri> valueCallback, java.lang.String str, java.lang.String str2) {
                by5.c4.f("SysWebView", "openFileChooser with three param");
                com.tencent.xweb.s0 s0Var = com.tencent.xweb.sys.v.this.f220578g;
                if (s0Var != null) {
                    s0Var.r(valueCallback, str, str2);
                } else {
                    valueCallback.onReceiveValue(null);
                }
            }
        };
        com.tencent.xweb.sys.t tVar = new com.tencent.xweb.sys.t(this);
        this.f220575d = webView;
        this.f220585q = android.os.Looper.myLooper();
        f220574t = webView.getContext().getApplicationInfo().targetSdkVersion >= 18;
        com.tencent.xweb.sys.u uVar = new com.tencent.xweb.sys.u(this, webView.getContext());
        this.f220576e = uVar;
        if (y4.n.a(org.chromium.support_lib_boundary.util.Features.MULTI_PROFILE) && !com.tencent.xweb.o2.f220368c.equals("Default")) {
            java.lang.String str = com.tencent.xweb.o2.f220368c;
            int i17 = y4.m.f459277a;
            if (!z4.e0.f470065g.b()) {
                throw z4.e0.a();
            }
            z4.g0.f470067a.createWebView(uVar).setProfile(str);
        }
        uVar.setBackgroundColor(0);
        getSettings();
        uVar.setWebChromeClient(webChromeClient);
        uVar.setWebViewClient(tVar);
        if (webView.getContext() instanceof android.app.Activity) {
            a((android.app.Activity) webView.getContext());
        } else {
            a(null);
        }
    }

    @Override // tx5.f
    public boolean F() {
        return this.f220576e.overlayHorizontalScrollbar();
    }

    @Override // tx5.f
    public void S(boolean z17) {
        sx5.a aVar = this.f220583o;
        if (aVar != null) {
            aVar.i(z17);
        }
    }

    @Override // tx5.f
    public boolean T() {
        return false;
    }

    public final void a(android.app.Activity activity) {
        by5.c4.f("SysWebView", "initFullscreenVideo, kind:" + getFullscreenVideoKind() + ", activity:" + activity);
        if (getFullscreenVideoKind() == com.tencent.xweb.c1.NOT_HOOK) {
            return;
        }
        com.tencent.xweb.WebView webView = this.f220575d;
        com.tencent.xweb.f1 currentInstanceWebCoreType = webView.getCurrentInstanceWebCoreType();
        java.lang.String a17 = sx5.g.a();
        com.tencent.xweb.sys.u uVar = this.f220576e;
        this.f220583o = sx5.c1.a(currentInstanceWebCoreType, activity, webView, uVar, a17);
        if (getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS) {
            this.f220583o.j(uVar);
        }
    }

    @Override // tx5.f
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f220576e.addJavascriptInterface(obj, str);
    }

    @Override // tx5.f
    public boolean canGoBack() {
        return this.f220576e.canGoBack();
    }

    @Override // tx5.f
    public boolean canGoForward() {
        return this.f220576e.canGoForward();
    }

    @Override // tx5.f
    public void captureLongScreenshot(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback) {
        if (rect == null || valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(new com.tencent.xweb.n2(-1));
    }

    @Override // tx5.f
    public void clearHistory() {
        this.f220576e.clearHistory();
    }

    @Override // tx5.f
    public void clearMatches() {
        this.f220576e.clearMatches();
    }

    @Override // tx5.f
    public void clearSslPreferences() {
        this.f220576e.clearSslPreferences();
    }

    @Override // tx5.f
    public void clearView() {
        this.f220576e.clearView();
    }

    @Override // tx5.f
    public void destroy() {
        this.f220576e.destroy();
    }

    @Override // tx5.f, com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (str == null) {
            return;
        }
        this.f220576e.evaluateJavascript(str, valueCallback);
    }

    @Override // tx5.f, com.tencent.mm.plugin.appbrand.page.fb
    public android.graphics.Bitmap f() {
        com.tencent.xweb.sys.u uVar = this.f220576e;
        int height = uVar.getHeight();
        int width = uVar.getWidth();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/sys/SysWebView", "captureBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/xweb/sys/SysWebView", "captureBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        uVar.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    @Override // tx5.f
    public void findAllAsync(java.lang.String str) {
        this.f220576e.findAllAsync(str);
    }

    @Override // tx5.f
    public void findNext(boolean z17) {
        this.f220576e.findNext(z17);
    }

    @Override // tx5.f
    public java.lang.String getAbstractInfo() {
        return getVersionInfo();
    }

    @Override // tx5.f
    public android.net.http.SslCertificate getCertificate() {
        return this.f220576e.getCertificate();
    }

    @Override // tx5.f
    public int getContentHeight() {
        return this.f220576e.getContentHeight();
    }

    @Override // tx5.f
    public android.graphics.Bitmap getFavicon() {
        return this.f220576e.getFavicon();
    }

    @Override // tx5.f
    public com.tencent.xweb.c1 getFullscreenVideoKind() {
        return com.tencent.xweb.b.m().l(com.tencent.xweb.WebView.getModuleName());
    }

    @Override // tx5.f
    public com.tencent.xweb.d1 getHitTestResult() {
        android.webkit.WebView.HitTestResult hitTestResult = this.f220576e.getHitTestResult();
        com.tencent.xweb.d1 d1Var = new com.tencent.xweb.d1();
        d1Var.f220239a = hitTestResult.getType();
        d1Var.f220240b = hitTestResult.getExtra();
        return d1Var;
    }

    @Override // tx5.f
    public void getImageFromDiskCache(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(null);
    }

    @Override // tx5.f
    public java.lang.String getOriginalUrl() {
        return this.f220576e.getOriginalUrl();
    }

    @Override // tx5.f
    public int getProgress() {
        return this.f220576e.getProgress();
    }

    @Override // tx5.f
    public float getScale() {
        return this.f220576e.getScale();
    }

    @Override // tx5.f
    public int getScrollHeight() {
        return this.f220576e.a();
    }

    @Override // tx5.f
    public com.tencent.xweb.z0 getSettings() {
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (by5.d4.e().getBoolean("bEnableCheckThread", false) && this.f220585q != null && android.os.Looper.myLooper() != this.f220585q) {
            java.lang.Throwable th6 = new java.lang.Throwable("A WebView method was called on thread '" + java.lang.Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + this.f220585q + " called on " + android.os.Looper.myLooper() + ", FYI main Looper is " + android.os.Looper.getMainLooper() + ")");
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkThread error:");
            sb6.append(stackTraceString);
            by5.c4.g("SysWebView", sb6.toString());
            xx5.g.a(3, stackTraceString, 3, "");
            if (f220574t) {
                throw new java.lang.RuntimeException(th6);
            }
        }
        com.tencent.xweb.sys.w wVar = this.f220580i;
        if (wVar != null) {
            return wVar;
        }
        com.tencent.xweb.sys.u uVar = this.f220576e;
        if (uVar == null) {
            return null;
        }
        com.tencent.xweb.sys.w wVar2 = new com.tencent.xweb.sys.w(uVar);
        this.f220580i = wVar2;
        return wVar2;
    }

    @Override // tx5.f
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return this.f220576e.getTextClassifier();
        }
        return null;
    }

    @Override // tx5.f
    public java.lang.String getTitle() {
        return this.f220576e.getTitle();
    }

    @Override // tx5.f
    public android.view.ViewGroup getTopView() {
        return this.f220576e;
    }

    @Override // tx5.f
    public java.lang.String getUrl() {
        return this.f220576e.getUrl();
    }

    @Override // tx5.f
    public java.lang.String getVersionInfo() {
        return "sys, sdkver:20260502, sysver:" + by5.e.a();
    }

    @Override // tx5.f
    public android.view.View getView() {
        return this.f220576e;
    }

    @Override // tx5.f
    public int getVisibleTitleHeight() {
        java.lang.Object a17 = by5.j0.a(this.f220576e, "getVisibleTitleHeight");
        if (a17 == null) {
            return 0;
        }
        return ((java.lang.Integer) a17).intValue();
    }

    @Override // tx5.f
    public com.tencent.xweb.s0 getWebChromeClient() {
        return this.f220578g;
    }

    @Override // tx5.f
    public int getWebScrollX() {
        return this.f220576e.getScrollX();
    }

    @Override // tx5.f
    public int getWebScrollY() {
        return this.f220576e.getScrollY();
    }

    @Override // tx5.f
    public com.tencent.xweb.g1 getWebViewCallbackClient() {
        return this.f220579h;
    }

    @Override // tx5.f
    public com.tencent.xweb.h1 getWebViewClient() {
        return this.f220577f;
    }

    @Override // tx5.f
    public android.os.Looper getWebViewLooper() {
        return this.f220585q;
    }

    @Override // tx5.f
    public com.tencent.xweb.m1 getWebViewRenderProcessClient() {
        return null;
    }

    @Override // tx5.f
    public android.view.View getWebViewUI() {
        return this.f220576e;
    }

    @Override // tx5.f
    public void goBack() {
        this.f220576e.goBack();
    }

    @Override // tx5.f
    public void goForward() {
        this.f220576e.goForward();
    }

    @Override // tx5.f
    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f220576e.loadData(str, str2, str3);
    }

    @Override // tx5.f
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f220576e.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // tx5.f, pf.b
    public void loadUrl(java.lang.String str) {
        this.f220576e.loadUrl(str);
    }

    @Override // tx5.f
    public void m() {
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f220586r;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // tx5.f
    public com.tencent.xweb.o0 m0(com.tencent.xweb.VideoJsCallback videoJsCallback) {
        sx5.a aVar = this.f220583o;
        if (aVar != null && aVar.f(videoJsCallback)) {
            return new com.tencent.xweb.sys.s(this);
        }
        by5.c4.f("SysWebView", "setVideoJsCallback not support");
        return null;
    }

    @Override // tx5.f
    public boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
        return false;
    }

    @Override // tx5.f
    public void onHide() {
        this.f220576e.onPause();
    }

    @Override // tx5.f
    public void onPause() {
        this.f220576e.onPause();
    }

    @Override // tx5.f
    public void onResume() {
        this.f220576e.onResume();
    }

    @Override // tx5.f
    public void onShow() {
        this.f220576e.onPause();
    }

    @Override // tx5.f
    public void reload() {
        this.f220576e.reload();
    }

    @Override // tx5.f
    public void removeJavascriptInterface(java.lang.String str) {
        this.f220576e.removeJavascriptInterface(str);
    }

    @Override // tx5.f
    public boolean s() {
        return this.f220587s;
    }

    @Override // tx5.f
    public boolean savePage(java.lang.String str, java.lang.String str2, int i17) {
        return false;
    }

    @Override // tx5.f
    public void setAudioMuted(boolean z17) {
    }

    @Override // tx5.f
    public void setBottomHeight(int i17) {
        by5.c4.c("SysWebView", "setBottomHeight not implement");
    }

    @Override // tx5.f
    public void setDownloadListener(android.webkit.DownloadListener downloadListener) {
        this.f220576e.setDownloadListener(downloadListener);
    }

    @Override // tx5.f
    public void setFindListener(android.webkit.WebView.FindListener findListener) {
        this.f220576e.setFindListener(findListener);
    }

    @Override // tx5.f
    public void setHorizontalScrollBarEnabled(boolean z17) {
        this.f220576e.setHorizontalScrollBarEnabled(z17);
    }

    @Override // tx5.f
    public void setHorizontalScrollbarOverlay(boolean z17) {
        this.f220576e.setHorizontalScrollbarOverlay(z17);
    }

    @Override // tx5.f
    public void setInitialScale(int i17) {
        this.f220576e.setInitialScale(i17);
    }

    @Override // tx5.f
    public void setInputOutOfKeyboardEnable(boolean z17) {
    }

    @Override // tx5.f
    public void setJSExceptionListener(com.tencent.xweb.l1 l1Var) {
    }

    @Override // tx5.f
    public void setNativeDownloadClient(com.tencent.xweb.p2 p2Var) {
    }

    @Override // tx5.f
    public void setNetworkAvailable(boolean z17) {
        this.f220576e.setNetworkAvailable(z17);
    }

    @Override // tx5.f
    public void setPictureListener(android.webkit.WebView.PictureListener pictureListener) {
    }

    @Override // tx5.f
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            this.f220576e.setTextClassifier(textClassifier);
        }
    }

    @Override // tx5.f
    public void setVerticalScrollBarEnabled(boolean z17) {
        this.f220576e.setVerticalScrollBarEnabled(z17);
    }

    @Override // tx5.f
    public void setVerticalScrollbarOverlay(boolean z17) {
        this.f220576e.setVerticalScrollbarOverlay(z17);
    }

    @Override // tx5.f
    public void setWebChromeClient(com.tencent.xweb.s0 s0Var) {
        this.f220578g = s0Var;
    }

    @Override // tx5.f
    public void setWebContentsSize(int i17, int i18) {
    }

    @Override // tx5.f
    public void setWebViewCallbackClient(com.tencent.xweb.g1 g1Var) {
        this.f220579h = g1Var;
    }

    @Override // tx5.f
    public void setWebViewClient(com.tencent.xweb.h1 h1Var) {
        this.f220577f = h1Var;
    }

    @Override // tx5.f
    public void setWebViewClientExtension(com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension) {
    }

    @Override // tx5.f
    public void setXWebKeyEventHandler(com.tencent.xweb.XWebKeyEventHandler xWebKeyEventHandler) {
    }

    @Override // tx5.f
    public void smoothScroll(int i17, int i18, long j17) {
    }

    @Override // tx5.f
    public void stopLoading() {
        this.f220576e.stopLoading();
    }

    @Override // tx5.f
    public void t(java.util.concurrent.Executor executor, com.tencent.xweb.m1 m1Var) {
    }

    @Override // tx5.f
    public boolean u(int i17) {
        return i17 == 2006 || i17 == 2012;
    }

    @Override // tx5.f
    public boolean y() {
        return this.f220576e.getScrollY() == 0;
    }

    @Override // tx5.f
    public boolean zoomIn() {
        return this.f220576e.zoomIn();
    }

    @Override // tx5.f
    public boolean zoomOut() {
        return this.f220576e.zoomOut();
    }

    @Override // tx5.f, pf.b
    public void loadUrl(java.lang.String str, java.util.Map map) {
        this.f220576e.loadUrl(str, map);
    }
}
