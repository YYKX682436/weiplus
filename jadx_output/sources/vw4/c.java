package vw4;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f441214b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f441215c;

    /* renamed from: d, reason: collision with root package name */
    public int f441216d;

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(request, "request");
        try {
            if (this.f441214b && this.f441215c) {
                c().i();
                java.lang.String str = webView.getUrl().toString();
                java.lang.String uri = request.getUrl().toString();
                kotlin.jvm.internal.o.f(uri, "toString(...)");
                boolean isForMainFrame = request.isForMainFrame();
                java.lang.String str2 = java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode();
                if (isForMainFrame && uri.equals(str)) {
                    vw4.b bVar = vw4.b.f441212a;
                    if (bVar.d(uri) && !bVar.b(uri)) {
                        com.tencent.xweb.y0 a17 = vw4.a.f441211a.a(uri);
                        if (a17 != null) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1951, 6);
                            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: ok      , thread=" + str2 + ", isMainFrame=" + isForMainFrame + ", controller=" + c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str);
                            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept: default0, thread=" + str2 + ", isMainFrame=" + isForMainFrame + ", controller=" + c().hashCode() + ", reqUrl=" + uri + ", webUrl=" + str);
                        }
                        return a17;
                    }
                }
                c().hashCode();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "intercept, exp=" + th6);
        }
        super.f(webView, request);
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean g(com.tencent.xweb.WebView webview, int i17, java.lang.String description, java.lang.String failingUrl) {
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(failingUrl, "failingUrl");
        try {
            if (this.f441214b && this.f441215c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "interceptLoadError: errorCode" + i17 + ", description" + description + ", failingUrl" + failingUrl);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "interceptLoadError, exp=" + th6);
        }
        super.g(webview, i17, description, failingUrl);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public void h() {
        vw4.b bVar = vw4.b.f441212a;
        this.f441214b = bVar.c();
        this.f441216d = 0;
        java.lang.String i17 = c().i();
        this.f441215c = (i17 == null || i17.length() == 0 ? false : r26.n0.D(i17, "adCgiRedirect=1", false, 2, null)) || bVar.d(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "onAttachController,  isExptEnabled=" + this.f441214b + ", hasFlag=" + this.f441215c + ", this.hash=" + hashCode() + ", controller.hash=" + c().hashCode() + ", thread=" + (java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode()) + ", rawUrl=" + i17);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(request, "request");
        try {
            if (this.f441214b && this.f441215c) {
                java.lang.String i17 = c().i();
                java.lang.String str = webView.getUrl().toString();
                java.lang.String uri = request.getUrl().toString();
                kotlin.jvm.internal.o.f(uri, "toString(...)");
                java.lang.String str2 = java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode();
                vw4.b bVar = vw4.b.f441212a;
                if (bVar.d(uri) && !bVar.b(uri)) {
                    webView.loadUrl(uri);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl : ok , thread=" + str2 + ", isForMainFrame=" + request.isForMainFrame() + ", reqUrl=" + uri + ", webUrl=" + str);
                    return new com.tencent.mm.plugin.webview.core.h3(true, true);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl : default, thread=" + str2 + ", isForMainFrame=" + request.isForMainFrame() + ", reqUrl=" + uri + ", webUrl=" + str);
                int i18 = this.f441216d + 1;
                this.f441216d = i18;
                if (i18 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19789, "ad_h5_multi_override", "", 0, 0, i17);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "overrideUrl, exp=" + th6);
        }
        return super.q(webView, request);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 r(com.tencent.xweb.WebView webView, java.lang.String url) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(url, "url");
        try {
            if (this.f441214b && this.f441215c) {
                c().i();
                java.lang.String str = webView.getUrl().toString();
                java.lang.String str2 = java.lang.Thread.currentThread().getName() + '_' + java.lang.Thread.currentThread().hashCode();
                vw4.b bVar = vw4.b.f441212a;
                if (bVar.d(url) && !bVar.b(url)) {
                    webView.loadUrl(url);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl2: ok , thread=" + str2 + ", reqUrl=" + url + ", webUrl=" + str);
                    return new com.tencent.mm.plugin.webview.core.h3(true, true);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "--overrideUrl2: default, thread=" + str2 + ", reqUrl=" + url + ", webUrl=" + str);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewHighRiskAdH5Interceptor", "overrideUrl2, exp=" + th6);
        }
        return super.r(webView, url);
    }
}
