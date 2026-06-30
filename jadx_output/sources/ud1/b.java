package ud1;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "saveInitialRenderingCache";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        ri1.a aVar = v5Var != null ? (ri1.a) v5Var.q(ri1.a.class) : null;
        if (aVar == null) {
            if (v5Var != null) {
                v5Var.a(i17, o("fail:not supported"));
                return;
            }
            return;
        }
        if (jSONObject == null) {
            v5Var.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, v5Var.X1());
        try {
            java.lang.String string = jSONObject.getString("content");
            java.lang.String optString2 = jSONObject.optString("webviewData", null);
            java.lang.String optString3 = jSONObject.optString("appserviceData", null);
            ri1.p pVar = (ri1.p) aVar;
            if (pVar.f396036e) {
                if (!(optString == null || optString.length() == 0)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save path[");
                    sb6.append(optString);
                    sb6.append("] content[");
                    sb6.append(string != null ? string.length() : -1);
                    sb6.append("] webviewData[");
                    sb6.append(optString2 != null ? optString2.length() : -1);
                    sb6.append("] serviceData[");
                    sb6.append(optString3 != null ? optString3.length() : -1);
                    sb6.append(']');
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", sb6.toString());
                    if (string == null) {
                        com.tencent.mm.vfs.w6.h(pVar.c(optString));
                        new ri1.n();
                        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, pVar.b(optString), ri1.n.class, null);
                    } else {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f396040i;
                        r45.o8 o8Var = new r45.o8();
                        o8Var.f382015d = string;
                        o8Var.f382016e = optString2;
                        o8Var.f382017f = optString3;
                        java.lang.String c17 = pVar.c(optString);
                        try {
                            com.tencent.mm.vfs.w6.R(c17, o8Var.toByteArray());
                            new ri1.l();
                            com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel b17 = pVar.b(optString);
                            b17.f87238h = c17;
                            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, b17, ri1.l.class, null);
                        } catch (java.io.IOException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "saveRenderingCache appId[" + pVar.f396035d.f74803n + "] path[" + optString + "] e=" + e17);
                        }
                        concurrentHashMap.put(optString, o8Var);
                    }
                    v5Var.a(i17, o("ok"));
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "saveRenderingCache disabled appId[" + pVar.f396035d.f74803n + "] path[" + optString + ']');
            v5Var.a(i17, o("ok"));
        } catch (org.json.JSONException unused) {
            v5Var.a(i17, o("fail:invalid data"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return false;
    }
}
