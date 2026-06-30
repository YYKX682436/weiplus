package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class z extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.channels.j.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null || context == null || q5Var == null) {
            if (q5Var != null) {
                q5Var.a("invalid_params", null);
                return;
            }
            return;
        }
        java.lang.String optString = e17.optString("signText");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("signText is null", null);
            return;
        }
        java.lang.String optString2 = e17.optString("h5Url", "");
        if (e17.has("shortPrefix")) {
            kotlin.jvm.internal.o.d(optString2);
            java.lang.String optString3 = e17.optString("shortPrefix");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            if (r26.n0.B(optString2, optString3, false)) {
                optString2 = e17.optString("shortPrefix");
            }
        }
        java.lang.String str2 = "|" + c01.id.a() + '|' + optString2;
        java.lang.String c17 = com.tencent.mm.network.j.f72026e.c(optString + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            q5Var.a("client signContent is null", null);
            return;
        }
        java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.o.f(ISO_8859_1, "ISO_8859_1");
        byte[] bytes = c17.getBytes(ISO_8859_1);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.Object encodeToString = android.util.Base64.encodeToString(bytes, 2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("signature", encodeToString);
        jSONObject.put("suffix", str2);
        q5Var.a(null, jSONObject);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
