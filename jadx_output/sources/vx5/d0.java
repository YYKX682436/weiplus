package vx5;

/* loaded from: classes13.dex */
public class d0 extends com.tencent.xweb.pinus.sdk.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f441333a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f441334b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f441335c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx5.i0 f441336d;

    public d0(vx5.i0 i0Var) {
        this.f441336d = i0Var;
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void doUpdateVisitedHistory(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, boolean z17) {
        if (str != null && str.startsWith("data:text/html;charset=utf-8")) {
            by5.c4.g("PinusWebView", "doUpdateVisitedHistory, ignore");
            return;
        }
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.k(i0Var.f441353d, str, z17);
        } else {
            super.doUpdateVisitedHistory(webView, str, z17);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onLoadResource(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.l(i0Var.f441353d, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onPageCommitVisible(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        by5.c4.f("PinusWebView", "onPageCommitVisible, webview:" + webView.hashCode() + ", url:" + str);
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.m(i0Var.f441353d, str);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onPageFinished(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        java.lang.String str2 = this.f441334b;
        if (str2 != null && str2.equals(str)) {
            by5.c4.f("PinusWebView", "onPageFinished abandoned, url:" + str);
            return;
        }
        by5.c4.f("PinusWebView", "onPageFinished, webview:" + webView.hashCode() + ", url:" + str);
        vx5.i0 i0Var = this.f441336d;
        sx5.a aVar = i0Var.f441367u;
        if (aVar != null) {
            aVar.g(false, i0Var.f441353d.getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS);
        }
        this.f441334b = str;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.n(i0Var.f441353d, str);
        } else {
            super.onPageFinished(webView, str);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - i0Var.f441361o;
        by5.s0.n(currentTimeMillis);
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null && currentTimeMillis > 0 && currentTimeMillis < 300000) {
            n1Var.a(nd1.a2.CTRL_INDEX, nd1.a2.CTRL_INDEX, 6, 7, 1, (int) currentTimeMillis);
        }
        xx5.j.a(by5.s0.c(str), this.f441335c, 1, 0, (int) currentTimeMillis, i0Var.f441364r, str, com.tencent.xweb.f1.WV_KIND_PINUS, "");
        i0Var.f441361o = java.lang.System.currentTimeMillis();
        i0Var.f441353d.getDebugView().h();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onPageStarted(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        by5.c4.f("PinusWebView", "onPageStarted, webview:" + webView.hashCode() + ", url:" + str);
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.o(i0Var.f441353d, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
        this.f441334b = null;
        this.f441335c = by5.s0.a();
        java.lang.String str2 = this.f441333a;
        if (str2 != null && str != null && !str.equals(str2) && by5.s0.c(str) != by5.s0.c(this.f441333a)) {
            if (by5.s0.c(this.f441333a) == 1 && by5.s0.c(str) == 2) {
                i0Var.f441364r = 1;
            } else if (by5.s0.c(this.f441333a) == 2 && by5.s0.c(str) == 1) {
                i0Var.f441364r = 2;
            }
        }
        this.f441333a = str;
        i0Var.f441361o = java.lang.System.currentTimeMillis();
        by5.s0.m(str);
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 4L, 1L);
        }
        xx5.j.a(by5.s0.c(str), this.f441335c, 0, 0, 0, i0Var.f441364r, str, com.tencent.xweb.f1.WV_KIND_PINUS, "");
        sx5.a aVar = i0Var.f441367u;
        if (aVar != null) {
            aVar.g(true, i0Var.f441353d.getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS);
        }
        i0Var.f441368v.getClass();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        by5.c4.f("PinusWebView", "onReceivedError, webview:" + webView.hashCode() + ", errorCode:" + i17 + ", desc:" + str + ", url:" + str2);
        vx5.i0 i0Var = this.f441336d;
        i0Var.f441362p = true;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        com.tencent.xweb.WebView webView2 = i0Var.f441353d;
        if (h1Var != null) {
            h1Var.p(webView2, i17, str, str2);
        } else {
            super.onReceivedError(webView, i17, str, str2);
        }
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 1L, 1L);
        }
        com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
        if (n1Var2 != null) {
            n1Var2.b(577L, 5L, 1L);
        }
        xx5.j.a(by5.s0.c(str2), this.f441335c, 1, i17, (int) (java.lang.System.currentTimeMillis() - i0Var.f441361o), i0Var.f441364r, str2, com.tencent.xweb.f1.WV_KIND_PINUS, str);
        com.tencent.xweb.h1 h1Var2 = i0Var.f441357h;
        if (h1Var2 == null || !h1Var2.w(webView2, i17, str, str2)) {
            i0Var.f441355f.loadDataWithBaseURL("file:///android_asset/", by5.y3.a(webView2.getContext(), i17, str, str2), "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onReceivedHttpAuthRequest(com.tencent.xweb.pinus.sdk.WebView webView, com.tencent.xweb.pinus.sdk.g gVar, java.lang.String str, java.lang.String str2) {
        by5.c4.f("PinusWebView", "onReceivedHttpAuthRequest, host:" + str + ", realm:" + str2);
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.r(i0Var.f441353d, new vx5.p(gVar), str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, gVar, str, str2);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onReceivedHttpError(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        by5.c4.f("PinusWebView", "onReceivedHttpError, webview:" + webView.hashCode() + ", errorCode:" + java.lang.String.valueOf(webResourceResponse.getStatusCode()));
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.s(i0Var.f441353d, new vx5.t(webResourceRequest), webResourceResponse == null ? null : new com.tencent.xweb.y0(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData()));
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
        if (webResourceRequest.isForMainFrame()) {
            onPageFinished(webView, webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : "");
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onReceivedSslError(com.tencent.xweb.pinus.sdk.WebView webView, com.tencent.xweb.pinus.sdk.q qVar, android.net.http.SslError sslError) {
        by5.c4.f("PinusWebView", "onReceivedSslError, webview:" + webView.hashCode() + ", error:" + sslError.getPrimaryError());
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.t(i0Var.f441353d, new vx5.s(qVar), sslError);
        } else {
            super.onReceivedSslError(webView, qVar, sslError);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public boolean onRenderProcessGone(com.tencent.xweb.pinus.sdk.WebView webView, com.tencent.xweb.j0 j0Var) {
        by5.c4.f("PinusWebView", "onRenderProcessGone, webview:" + webView.hashCode() + ", didCrash:" + j0Var.a() + ", rendererPriorityAtExit:" + j0Var.b());
        boolean a17 = j0Var.a();
        int b17 = j0Var.b();
        java.lang.String str = "";
        int i17 = 0;
        try {
            java.lang.String url = webView.getUrl();
            if (url != null) {
                str = java.net.URLEncoder.encode(url, com.tencent.mapsdk.internal.rv.f51270c);
            }
            android.content.Context context = webView.getContext();
            if (context instanceof android.content.MutableContextWrapper) {
                context = ((android.content.MutableContextWrapper) context).getBaseContext();
            }
            if (context != null) {
                i17 = context instanceof android.app.Activity ? 1 : 2;
            }
        } catch (java.lang.Exception e17) {
            by5.c4.d("KVReportForRenderProcessGone", "report, error", e17);
        }
        java.lang.String str2 = i17 + "," + (a17 ? 1 : 0) + "," + b17 + "," + str + ",20260502," + org.xwalk.core.XWalkEnvironment.d();
        by5.c4.f("KVReportForRenderProcessGone", "report:" + str2);
        by5.s0.t(26011, str2);
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        return h1Var != null ? h1Var.u(i0Var.f441353d, new vx5.c0(this, j0Var)) : super.onRenderProcessGone(webView, j0Var);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onScaleChanged(com.tencent.xweb.pinus.sdk.WebView webView, float f17, float f18) {
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.v(i0Var.f441353d, f17, f18);
        } else {
            super.onScaleChanged(webView, f17, f18);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        vx5.i0 i0Var = this.f441336d;
        if (i0Var.f441357h != null) {
            vx5.t tVar = new vx5.t(webResourceRequest);
            com.tencent.xweb.v0 v0Var = tVar.f441394f;
            android.os.Bundle a17 = v0Var == null ? null : v0Var.a();
            com.tencent.xweb.y0 y17 = a17 != null ? i0Var.f441357h.y(i0Var.f441353d, tVar, a17) : null;
            if (y17 == null) {
                y17 = i0Var.f441357h.x(i0Var.f441353d, tVar);
            }
            if (y17 == null) {
                y17 = i0Var.f441357h.z(i0Var.f441353d, webResourceRequest.getUrl().toString());
            }
            return vx5.u.a(y17);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        vx5.i0 i0Var = this.f441336d;
        if (i0Var.f441353d.getDebugView().i(webResourceRequest.getUrl().toString())) {
            return true;
        }
        if (i0Var.f441357h != null) {
            boolean A = i0Var.f441357h.A(i0Var.f441353d, new vx5.t(webResourceRequest));
            by5.c4.f("PinusWebView", "shouldOverrideUrlLoading, ret:" + A + ", url:" + webResourceRequest.getUrl().toString());
            return A;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public boolean shouldOverrideUrlLoading(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        vx5.i0 i0Var = this.f441336d;
        if (i0Var.f441353d.getDebugView().i(str)) {
            return true;
        }
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            boolean B = h1Var.B(i0Var.f441353d, str);
            by5.c4.f("PinusWebView", "shouldOverrideUrlLoading, ret:" + B + ", url:" + str);
            return B;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            return vx5.u.a(h1Var.z(i0Var.f441353d, str));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewClient
    public void onReceivedError(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.WebResourceRequest webResourceRequest, com.tencent.xweb.pinus.sdk.s sVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedError, webview:");
        sb6.append(webView.hashCode());
        sb6.append(", errorCode:");
        com.tencent.xweb.pinus.sdk.t tVar = (com.tencent.xweb.pinus.sdk.t) sVar;
        sb6.append(tVar.b());
        sb6.append(", desc:");
        sb6.append((java.lang.Object) tVar.a());
        sb6.append(", url:");
        sb6.append(webResourceRequest.getUrl());
        by5.c4.f("PinusWebView", sb6.toString());
        vx5.i0 i0Var = this.f441336d;
        com.tencent.xweb.h1 h1Var = i0Var.f441357h;
        if (h1Var != null) {
            h1Var.q(i0Var.f441353d, new vx5.t(webResourceRequest), new vx5.n(tVar));
        } else {
            super.onReceivedError(webView, webResourceRequest, tVar);
        }
    }
}
