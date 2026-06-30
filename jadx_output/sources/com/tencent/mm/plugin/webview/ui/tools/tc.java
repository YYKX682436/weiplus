package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class tc extends com.tencent.xweb.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.o0 f186911a = new com.tencent.mm.plugin.webview.modeltools.o0();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f186912b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186913c;

    public tc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186913c = webViewUI;
    }

    @Override // com.tencent.xweb.s0
    public android.view.View a() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        if (webViewUI.f183873y1 == null) {
            webViewUI.f183873y1 = new android.widget.ProgressBar(webViewUI);
            webViewUI.f183873y1.setIndeterminate(true);
        }
        return webViewUI.f183873y1;
    }

    @Override // com.tencent.xweb.s0
    public boolean b(android.webkit.ConsoleMessage consoleMessage) {
        cf.o.a(consoleMessage, "MicroMsg.WebViewUI", false);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean c(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        this.f186913c.I8(true);
        qp1.h0.a(true, true, false);
        if (this.f186913c.y7().f358710b) {
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView I7 = this.f186913c.I7();
            android.content.Context context = I7.getContext();
            if ((context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && (mMWebView = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183815f) != null) {
                I7.f185727y = mMWebView.m0(new com.tencent.mm.plugin.webview.ui.tools.media.r(I7));
            }
            if (I7.f185727y != null) {
                this.f186913c.f183836m3 = customViewCallback;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onEnterFullscreen view");
                if (view.getParent() == null) {
                    com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView I72 = this.f186913c.I7();
                    synchronized (I72) {
                        I72.l();
                        I72.f185710g.removeAllViews();
                        android.content.Context context2 = I72.getContext();
                        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).setMMOrientation();
                        I72.i(true);
                        android.view.View view2 = I72.f185708e;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "addVideoView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView", "addVideoView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        I72.f185708e.setBackgroundColor(-16777216);
                        I72.setVisibility(0);
                        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(I72.getContext());
                        frameLayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -2));
                        I72.f185711h = frameLayout;
                        android.view.ViewGroup viewGroup = I72.f185710g;
                        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                        layoutParams.addRule(15);
                        viewGroup.addView(frameLayout, layoutParams);
                        I72.h();
                        I72.T = false;
                        I72.P = true;
                        I72.e();
                    }
                }
                return true;
            }
        }
        if (this.f186913c.y7().f358710b) {
            this.f186913c.y7().a(false);
        }
        return false;
    }

    @Override // com.tencent.xweb.s0
    public boolean d() {
        this.f186913c.I8(false);
        qp1.h0.a(false, true, false);
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void e(android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.tools.s4 s4Var;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        if (webViewUI.f183844p0 != null && webViewUI.y7().f358710b && webViewUI.I7().getVisibility() == 0) {
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = webViewUI.f183836m3;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            webViewUI.y7().a(false);
            com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView I7 = webViewUI.I7();
            boolean z17 = I7.T;
            java.lang.String str = I7.f185707d;
            if (z17) {
                com.tencent.mars.xlog.Log.i(str, "isRunningExitAnimation");
            } else if (I7.f185725x == null) {
                com.tencent.mars.xlog.Log.i(str, "runExitAnimation mpShareVideoInfo is null, just exit");
                I7.f();
            } else {
                I7.o();
                if (bitmap != null && !bitmap.isRecycled()) {
                    android.widget.ImageView imageView = new android.widget.ImageView(I7.getContext());
                    android.view.ViewGroup viewGroup = I7.f185711h;
                    if (viewGroup != null) {
                        viewGroup.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    }
                    imageView.setImageBitmap(bitmap);
                }
                com.tencent.mars.xlog.Log.i(str, "runExitAnimation");
                I7.p();
                android.view.View view = I7.f185708e;
                int width = view.getWidth();
                int height = view.getHeight();
                com.tencent.mm.ui.tools.s4 s4Var2 = I7.C;
                if (s4Var2 != null) {
                    s4Var2.f210699f = width;
                    s4Var2.f210700g = height;
                }
                if (s4Var2 != null) {
                    ot0.m1 m1Var = I7.f185725x;
                    kotlin.jvm.internal.o.d(m1Var);
                    int i17 = m1Var.f348583u;
                    ot0.m1 m1Var2 = I7.f185725x;
                    kotlin.jvm.internal.o.d(m1Var2);
                    int i18 = m1Var2.f348584v;
                    ot0.m1 m1Var3 = I7.f185725x;
                    kotlin.jvm.internal.o.d(m1Var3);
                    int i19 = m1Var3.f348585w;
                    ot0.m1 m1Var4 = I7.f185725x;
                    kotlin.jvm.internal.o.d(m1Var4);
                    s4Var2.e(i17, i18, i19, m1Var4.f348586x);
                }
                float f17 = I7.S;
                if (!(((double) f17) == 1.0d) && (s4Var = I7.C) != null) {
                    s4Var.f210707n = 1 / f17;
                }
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                com.tencent.mm.ui.tools.s4 s4Var3 = I7.C;
                if (s4Var3 != null) {
                    s4Var3.d(I7.f185711h, I7.f185708e, false, new com.tencent.mm.plugin.webview.ui.tools.media.c0(I7, null, layoutParams), null);
                }
            }
            com.tencent.mm.plugin.webview.ui.tools.ld ldVar = webViewUI.f183866w2;
            if (ldVar != null) {
                ldVar.n();
            }
        }
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        com.tencent.mm.plugin.webview.modeltools.o0 o0Var = this.f186911a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        o0Var.g(webViewUI, webViewUI.x7(), webViewUI.F7(), webViewUI.L1.Q(), webViewUI.getIntent().getStringExtra("geta8key_username"), str, callback);
    }

    @Override // com.tencent.xweb.s0
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onHideCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        webViewUI.getContext().getWindow().clearFlags(128);
        if (webViewUI.f183831l1 == null) {
            return;
        }
        try {
            webViewUI.K8(webViewUI.t8());
            if (webViewUI.f183815f.isXWalkKernel()) {
                webViewUI.fullScreenNoTitleBar(false);
                webViewUI.P8(webViewUI.getResources().getColor(com.tencent.mm.R.color.f479523a70));
                if (webViewUI.W2 != null) {
                    webViewUI.L8(webViewUI.D7());
                }
            } else {
                webViewUI.f183815f.setVisibility(0);
                webViewUI.setTitleVisibility(0);
            }
            android.widget.FrameLayout frameLayout = webViewUI.f183871y;
            if (frameLayout != null) {
                frameLayout.removeView(webViewUI.f183831l1);
            }
            webViewUI.f183831l1 = null;
            android.webkit.WebChromeClient.CustomViewCallback customViewCallback = webViewUI.f183872y0;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            webViewUI.I8(false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "onHideCustomView error " + e17.getMessage());
        }
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsAlert");
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        pBool.value = false;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        if (webViewUI.isFinishing() || webViewUI.activityHasDestroyed()) {
            zVar.a();
            return true;
        }
        webViewUI.f183810d2++;
        if (webViewUI.f183810d2 > 2) {
            this.f186912b = db5.e1.B(webViewUI, str2, "", webViewUI.getString(com.tencent.mm.R.string.lao), webViewUI.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.pc(this, str, zVar), new com.tencent.mm.plugin.webview.ui.tools.qc(this, pBool, zVar), com.tencent.mm.R.color.f479308vo);
        } else {
            this.f186912b = db5.e1.y(webViewUI, str2, "", webViewUI.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.rc(this, pBool, zVar));
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f186912b;
        if (j0Var == null) {
            return false;
        }
        j0Var.setOnDismissListener(new com.tencent.mm.plugin.webview.ui.tools.sc(this, pBool, zVar));
        this.f186912b.setCanceledOnTouchOutside(false);
        this.f186912b.o(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean j(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm");
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        pBool.value = false;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        if (webViewUI.isFinishing() || webViewUI.activityHasDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onJsConfirm finish");
            zVar.a();
            return true;
        }
        webViewUI.f183810d2++;
        if (webViewUI.f183810d2 > 2) {
            this.f186912b = db5.e1.B(webViewUI, str2, "", webViewUI.getString(com.tencent.mm.R.string.lao), webViewUI.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.kc(this, str, zVar), new com.tencent.mm.plugin.webview.ui.tools.lc(this, pBool, zVar), com.tencent.mm.R.color.f478749g4);
        } else {
            this.f186912b = db5.e1.K(webViewUI.getContext(), false, str2, "", webViewUI.getString(com.tencent.mm.R.string.f490507x1), webViewUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webview.ui.tools.mc(this, pBool, zVar), new com.tencent.mm.plugin.webview.ui.tools.nc(this, zVar));
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f186912b;
        if (j0Var == null) {
            return false;
        }
        j0Var.setOnDismissListener(new com.tencent.mm.plugin.webview.ui.tools.oc(this, pBool, zVar));
        this.f186912b.setCancelable(false);
        this.f186912b.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean k(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.y yVar) {
        return false;
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        this.f186911a.h(permissionRequest, webViewUI, webViewUI.x7());
    }

    @Override // com.tencent.xweb.s0
    public void n(com.tencent.xweb.WebView webView, int i17) {
    }

    @Override // com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onReceivedTitle#%s title = %s, loadurl = %s", java.lang.Integer.valueOf(webViewUI.t7()), str, webViewUI.L1.f181964y);
        if (webViewUI.f183809d && !webViewUI.f183812e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "fixed title, ignore received title: " + str);
            return;
        }
        if (webViewUI.S) {
            by4.k kVar = webViewUI.f183841o2;
            if (kVar != null && kVar.a()) {
                java.lang.String X6 = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.X6(webViewUI, str);
                java.lang.String url = com.tencent.mm.sdk.platformtools.t8.K0(webViewUI.L1.f181964y) ? webViewUI.x7() : webViewUI.L1.f181964y;
                by4.k kVar2 = webViewUI.f183841o2;
                kVar2.getClass();
                kotlin.jvm.internal.o.g(url, "url");
                ((java.util.HashMap) kVar2.f36404e).put(url, X6);
                by4.k kVar3 = webViewUI.f183841o2;
                if (kVar3.f36400a) {
                    kVar3.b(webViewUI, url, webViewUI.F7(), X6);
                    return;
                }
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                webViewUI.setMMTitle("");
                return;
            }
            java.lang.String str2 = webViewUI.L1.f181964y;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.endsWith(str)) {
                java.lang.String a17 = com.tencent.mm.pluginsdk.ui.tools.h9.a(webViewUI.L1.f181964y);
                if (a17 == null) {
                    a17 = "";
                }
                if (!a17.endsWith(com.tencent.mm.pluginsdk.ui.tools.h9.a(str))) {
                    java.lang.String c17 = xw4.b.c(webViewUI.L1.f181964y);
                    if (c17 == null) {
                        c17 = "";
                    }
                    java.lang.String decode = java.net.URLDecoder.decode(c17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onReceivedTitle urlHost: %s, title: %s", decode, str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(decode) || !str.startsWith(decode)) {
                        z17 = false;
                    } else {
                        webViewUI.setMMTitle("");
                        z17 = true;
                    }
                    if (z17 || com.tencent.mm.plugin.webview.luggage.util.g.d(str) || str.startsWith("about:blank")) {
                        return;
                    }
                    webViewUI.setMMTitle(str);
                    return;
                }
            }
            webViewUI.setMMTitle("");
        }
    }

    @Override // com.tencent.xweb.s0
    public void p(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onShowCustomView, sdk int = " + android.os.Build.VERSION.SDK_INT);
        try {
            webViewUI.getContext().getWindow().addFlags(128);
            if (webViewUI.f183831l1 != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            webViewUI.K8(false);
            webViewUI.f183831l1 = view;
            webViewUI.f183872y0 = customViewCallback;
            if (webViewUI.f183815f.isXWalkKernel()) {
                webViewUI.f183871y.addView(view, 0);
                webViewUI.fullScreenNoTitleBar(true);
                webViewUI.P8(0);
                if (webViewUI.W2 != null) {
                    webViewUI.L8(0);
                }
            } else {
                webViewUI.f183815f.setVisibility(8);
                webViewUI.f183871y.addView(view);
                webViewUI.setTitleVisibility(4);
            }
            webViewUI.I8(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "onShowCustomView error " + e17.getMessage());
        }
    }

    @Override // com.tencent.xweb.s0
    public boolean q(com.tencent.xweb.WebView webView, android.webkit.ValueCallback valueCallback, com.tencent.xweb.r0 r0Var) {
        if (r0Var.c() != 0 && r0Var.c() != 1) {
            return false;
        }
        if (r0Var.b() == null || r0Var.b().length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
            return true;
        }
        java.lang.String[] b17 = r0Var.b();
        java.lang.String str = r0Var.d() ? "true" : "false";
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onShowFileChooser mode: %d, catpure: %s", java.lang.Integer.valueOf(r0Var.c()), java.lang.Boolean.valueOf(r0Var.d()));
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186913c;
        webViewUI.f183806b3.c(webViewUI, webViewUI.f183876z1, valueCallback, b17, str, r0Var.a(), r0Var.c());
        return true;
    }
}
