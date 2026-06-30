package mw4;

/* loaded from: classes7.dex */
public final class w extends com.tencent.mm.plugin.webview.core.i3 {
    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean l(int i17, java.lang.String reqUrl, r45.s83 resp) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(resp, "resp");
        if (i17 != 11) {
            return false;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String url = c().f181916a.getUrl();
        h0Var.f310123d = url;
        boolean z17 = true;
        if (!r26.i0.p(reqUrl, url, true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizMpVideoInterceptor", "url changed after do get A8key, webUrl:" + ((java.lang.String) h0Var.f310123d) + ", reqUrl:" + reqUrl);
            return false;
        }
        if ((resp.f385551m.f390838d & 2097152) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMpVideoInterceptor", "on spa auth resp handle start");
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new mw4.v(resp, this, reqUrl, h0Var, null), 3, null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMpVideoInterceptor", "spa auth getA8key not allow");
        nw4.n jsApiHandler = c().g0();
        kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
        java.lang.String str = "doAuthCurrentUrl:fail a8key not allow";
        java.lang.String str2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0.f186402e;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
        } else {
            pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n0(jsApiHandler, str));
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean n() {
        java.lang.String Z = c().Z();
        boolean z17 = true;
        if (Z != null && r26.i0.y(Z, "https", false)) {
            java.lang.String Z2 = c().Z();
            if (Z2 == null || Z2.length() == 0) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMpVideoInterceptor", "RequestAuthCurrentUrl startGetA8Key:" + Z2);
            c().V0(Z2, true, 11);
            return true;
        }
        nw4.n jsApiHandler = c().g0();
        kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
        java.lang.String str = "doAuthCurrentUrl:fail url is invalid";
        java.lang.String str2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.o0.f186402e;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
        } else {
            pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n0(jsApiHandler, str));
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        return !z17 && i17 == 11;
    }
}
