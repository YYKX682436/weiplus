package pf1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final java.lang.String NAME = "invokeMiniProgramAPI";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        pf1.v env = (pf1.v) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        pf1.q qVar = (pf1.q) env.c0();
        com.tencent.mm.plugin.appbrand.e9 C0 = qVar.getRt().C0();
        if (C0 != null) {
            try {
                data.put("htmlId", qVar.getHtmlId());
                data.put("webviewId", qVar.hashCode());
            } catch (org.json.JSONException unused) {
            }
            com.tencent.mm.plugin.appbrand.jsapi.webview.b bVar = new com.tencent.mm.plugin.appbrand.jsapi.webview.b();
            bVar.v(C0, qVar.hashCode());
            java.lang.String jSONObject = data.toString();
            if (jSONObject == null) {
                jSONObject = "";
            }
            bVar.f82374f = jSONObject;
            bVar.m();
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str2, jSONObject2));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public java.lang.String l() {
        return "err_msg";
    }
}
