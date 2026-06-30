package th0;

@j95.b
/* loaded from: classes13.dex */
public class y extends i95.w implements uh0.t {
    public boolean wi(android.content.Context context) {
        int i17;
        try {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z65.c.a()) {
                com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, not debug or red or purple environment");
                return false;
            }
            boolean z17 = com.tencent.xweb.WebView.f220193q;
            com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_PINUS;
            if (!z17) {
                com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, xweb core is not init");
                com.tencent.mm.xwebutil.y0.b(f1Var, null);
            }
            com.tencent.mm.xwebutil.l0.a();
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, ip: %s, port: %d", com.tencent.mm.xwebutil.l0.f214849a, java.lang.Integer.valueOf(com.tencent.mm.xwebutil.l0.f214850b));
            java.lang.String str2 = com.tencent.mm.xwebutil.l0.f214849a;
            if (str2 != null && (i17 = com.tencent.mm.xwebutil.l0.f214850b) != 0) {
                if (!(java.util.regex.Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$").matcher(str2).matches() && (i17 >= 1 && i17 <= 65535))) {
                    com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, ip or port is invalid");
                    return false;
                }
                if (!com.tencent.xweb.WebView.f220193q) {
                    com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, xweb core is not init");
                    com.tencent.xweb.WebView.v0(context, f1Var, com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : "tools", null);
                }
                if (!com.tencent.xweb.k1.a("PROXY_OVERRIDE")) {
                    com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, WebViewFeature.PROXY_OVERRIDE is not supported");
                    return false;
                }
                if (!com.tencent.xweb.WebView.f220193q) {
                    com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, xweb core is not init");
                    return false;
                }
                java.lang.String str3 = "http://" + com.tencent.mm.xwebutil.l0.f214849a + ":" + com.tencent.mm.xwebutil.l0.f214850b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList.add(new com.tencent.xweb.d0("*", str3));
                arrayList.add(new com.tencent.xweb.d0("*", "direct://"));
                com.tencent.xweb.e0 e0Var = new com.tencent.xweb.e0(arrayList, arrayList2, false);
                if (!com.tencent.xweb.k1.a("PROXY_OVERRIDE")) {
                    throw new java.lang.UnsupportedOperationException("Proxy override not supported");
                }
                (com.tencent.xweb.WebView.x0() ? com.tencent.xweb.g0.f220284a : com.tencent.xweb.WebView.y0() ? com.tencent.xweb.h0.f220289a : com.tencent.xweb.f0.f220275a).a(e0Var, new com.tencent.mm.xwebutil.j0(), new com.tencent.mm.xwebutil.k0());
                return true;
            }
            com.tencent.mars.xlog.Log.i("XWeb.MM.XWebDebugProxyUtil", "setProxyOverride, ip or port is null");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("XWeb.MM.XWebDebugProxyUtil", "setDebugProxyOverride, exception", e17);
            return false;
        }
    }
}
