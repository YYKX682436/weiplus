package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class t extends android.webkit.WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f220571a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.sys.v f220572b;

    public t(com.tencent.xweb.sys.v vVar) {
        this.f220572b = vVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(android.webkit.WebView webView, java.lang.String str, boolean z17) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.k(vVar.f220575d, str, z17);
        } else {
            super.doUpdateVisitedHistory(webView, str, z17);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.l(vVar.f220575d, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        by5.c4.f("SysWebView", "onPageCommitVisible s = " + str);
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.m(vVar.f220575d, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        by5.c4.f("SysWebView", "onPageFinished " + str);
        com.tencent.xweb.sys.v vVar = this.f220572b;
        sx5.a aVar = vVar.f220583o;
        if (aVar != null) {
            aVar.g(false, vVar.f220575d.getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS);
        }
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.n(vVar.f220575d, str);
        } else {
            super.onPageFinished(webView, str);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - vVar.f220581m;
        by5.s0.n(currentTimeMillis);
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null && currentTimeMillis > 0 && currentTimeMillis < 300000) {
            n1Var.a(nd1.a2.CTRL_INDEX, nd1.a2.CTRL_INDEX, 48, 49, 1, (int) currentTimeMillis);
        }
        xx5.j.a(by5.s0.c(str), null, 1, 0, (int) currentTimeMillis, vVar.f220582n, str, com.tencent.xweb.f1.WV_KIND_SYS, "");
        vVar.f220581m = java.lang.System.currentTimeMillis();
        vVar.f220575d.getDebugView().h();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        by5.c4.f("SysWebView", "onPageStarted " + str);
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.o(vVar.f220575d, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
        java.lang.String str2 = this.f220571a;
        if (str2 != null && str != null && !str.equals(str2) && by5.s0.c(str) != by5.s0.c(this.f220571a)) {
            if (by5.s0.c(this.f220571a) == 1 && by5.s0.c(str) == 2) {
                vVar.f220582n = 1;
            } else if (by5.s0.c(this.f220571a) == 2 && by5.s0.c(str) == 1) {
                vVar.f220582n = 2;
            }
        }
        this.f220571a = str;
        vVar.f220581m = java.lang.System.currentTimeMillis();
        by5.s0.m(str);
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 46L, 1L);
        }
        xx5.j.a(by5.s0.c(str), null, 0, 0, 0, vVar.f220582n, str, com.tencent.xweb.f1.WV_KIND_SYS, "");
        sx5.a aVar = vVar.f220583o;
        if (aVar != null) {
            aVar.g(true, vVar.f220575d.getFullscreenVideoKind() == com.tencent.xweb.c1.HOOK_EVALUTE_JS);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.p(vVar.f220575d, i17, str, str2);
        } else {
            super.onReceivedError(webView, i17, str, str2);
        }
        com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
        if (n1Var != null) {
            n1Var.b(577L, 1L, 1L);
        }
        com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
        if (n1Var2 != null) {
            n1Var2.b(577L, 47L, 1L);
        }
        xx5.j.a(by5.s0.c(str2), null, 1, i17, (int) (java.lang.System.currentTimeMillis() - vVar.f220581m), vVar.f220582n, str2, com.tencent.xweb.f1.WV_KIND_SYS, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
        by5.c4.f("SysWebView", "onReceivedHttpAuthRequest host:" + str + ", realm:" + str2);
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.r(vVar.f220575d, new com.tencent.xweb.sys.f(httpAuthHandler), str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
        by5.c4.f("SysWebView", "onReceivedHttpError code:" + java.lang.String.valueOf(webResourceResponse.getStatusCode()));
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.s(vVar.f220575d, new com.tencent.xweb.sys.j(webResourceRequest), webResourceResponse == null ? null : new com.tencent.xweb.y0(webResourceResponse.getMimeType(), webResourceResponse.getEncoding(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), webResourceResponse.getData()));
        } else {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
        by5.c4.f("SysWebView", "onReceivedSslError " + sslError.getPrimaryError());
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.t(vVar.f220575d, new com.tencent.xweb.sys.e(sslErrorHandler), sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(android.webkit.WebView webView, float f17, float f18) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            h1Var.v(vVar.f220575d, f17, f18);
        } else {
            super.onScaleChanged(webView, f17, f18);
        }
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            com.tencent.xweb.sys.j jVar = new com.tencent.xweb.sys.j(webResourceRequest);
            com.tencent.xweb.v0 v0Var = jVar.f220561f;
            android.os.Bundle a17 = v0Var == null ? null : v0Var.a();
            com.tencent.xweb.y0 y17 = a17 != null ? h1Var.y(vVar.f220575d, jVar, a17) : null;
            if (y17 == null) {
                y17 = h1Var.x(vVar.f220575d, jVar);
            }
            return com.tencent.xweb.sys.k.a(y17);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        if (vVar.f220575d.getDebugView().i(str)) {
            return true;
        }
        by5.c4.f("SysWebView", "shouldOverrideUrlLoading " + str);
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            boolean B = h1Var.B(vVar.f220575d, str);
            if (str == null || !str.toLowerCase(java.util.Locale.ROOT).startsWith("javascript")) {
                return B;
            }
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        by5.c4.f("SysWebView", "shouldOverrideUrlLoading " + webResourceRequest.getUrl().toString());
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            boolean A = h1Var.A(vVar.f220575d, new com.tencent.xweb.sys.j(webResourceRequest));
            android.net.Uri url = webResourceRequest.getUrl();
            java.lang.String scheme = url != null ? url.getScheme() : "";
            if (scheme == null || !scheme.toLowerCase(java.util.Locale.ROOT).startsWith("javascript")) {
                return A;
            }
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            return com.tencent.xweb.sys.k.a(h1Var.z(vVar.f220575d, str));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        by5.c4.f("SysWebView", "onReceivedError2");
        com.tencent.xweb.sys.v vVar = this.f220572b;
        com.tencent.xweb.h1 h1Var = vVar.f220577f;
        if (h1Var != null) {
            if (webResourceRequest.isForMainFrame() && webResourceError != null) {
                h1Var.p(vVar.f220575d, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
            }
            h1Var.q(vVar.f220575d, new com.tencent.xweb.sys.j(webResourceRequest), webResourceError != null ? new com.tencent.xweb.sys.d(webResourceError) : null);
        }
    }
}
