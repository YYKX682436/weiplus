package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class g1 extends com.tencent.mm.plugin.webview.core.i3 {
    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        com.tencent.xweb.y0 y0Var;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        if (!r26.i0.y(uri, "webcompt://", false)) {
            return null;
        }
        nw4.n g07 = c().g0();
        kotlin.jvm.internal.o.e(g07, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        com.tencent.mm.plugin.webview.webcompt.y1 y17 = g07.y();
        if (y17 == null) {
            return null;
        }
        com.tencent.mm.plugin.webview.webcompt.f1 c17 = y17.c();
        c17.getClass();
        android.net.Uri url = request.getUrl();
        java.lang.String host = url.getHost();
        if (host == null) {
            host = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "getInterceptResponse " + url);
        com.tencent.mm.plugin.webview.webcompt.b bVar = com.tencent.mm.plugin.webview.webcompt.b.E;
        com.tencent.mm.plugin.webview.webcompt.s1 s1Var = c17.f187812b;
        s1Var.a(bVar);
        com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) c17.k().get(host);
        if (k0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("['");
            java.util.List list = (java.util.List) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187800h).getValue();
            java.security.SecureRandom secureRandom = new java.security.SecureRandom();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bArr = new byte[((java.lang.Number) it.next()).intValue()];
                secureRandom.nextBytes(bArr);
                arrayList.add(kz5.z.a0(bArr, "", null, null, 0, null, com.tencent.mm.plugin.webview.webcompt.b1.f187765d, 30, null));
            }
            sb6.append(kz5.n0.g0(arrayList, "','", null, null, 0, null, null, 62, null));
            sb6.append("']");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "buildMatrix " + sb7 + ", " + url);
            java.lang.String x17 = r26.i0.x((java.lang.String) ((jz5.n) com.tencent.mm.plugin.webview.webcompt.f1.f187801i).getValue(), "$__IFRAME_MATRIX__$", sb7, false, 4, null);
            java.lang.String name = k0Var.f187839b.f372006d;
            kotlin.jvm.internal.o.f(name, "name");
            java.lang.String x18 = r26.i0.x(x17, "$__WEB_COMPT_NAME__$", name, false, 4, null);
            c17.h(k0Var.a(), "WeixinWebCompt.onBind.apply(WeixinWebCompt, " + sb7 + ')');
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("ready to response ");
            sb8.append(url);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", sb8.toString());
            byte[] bytes = x18.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            y0Var = new com.tencent.xweb.y0("text/html", "utf8", new java.io.ByteArrayInputStream(bytes));
            k0Var.f187841d = true;
            s1Var.a(com.tencent.mm.plugin.webview.webcompt.b.F);
        } else {
            s1Var.a(com.tencent.mm.plugin.webview.webcompt.b.G);
            byte[] bytes2 = ("webCompt: " + host + " not found").getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            y0Var = new com.tencent.xweb.y0("text/html", "utf8", new java.io.ByteArrayInputStream(bytes2));
        }
        return y0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean j(java.lang.String url, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        return r26.i0.y(url, "webcompt://", false);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean l(int i17, java.lang.String reqUrl, r45.s83 resp) {
        byte[] d17;
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(resp, "resp");
        r45.cu5 cu5Var = resp.D;
        if (cu5Var != null && (d17 = x51.j1.d(cu5Var)) != null) {
            try {
                r45.f97 f97Var = new r45.f97();
                f97Var.parseFrom(d17);
                java.lang.String FullURL = resp.f385545d;
                kotlin.jvm.internal.o.f(FullURL, "FullURL");
                com.tencent.mm.plugin.webview.webcompt.h1.a(FullURL, f97Var.f374118d);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebComponentInterceptor", e17, "parse WebComponentInfo", new java.lang.Object[0]);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 r(com.tencent.xweb.WebView webView, java.lang.String url) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        return r26.i0.y(url, "webcompt://", false) ? new com.tencent.mm.plugin.webview.core.h3(true, false) : super.r(webView, url);
    }
}
