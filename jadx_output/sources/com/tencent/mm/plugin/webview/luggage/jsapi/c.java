package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes7.dex */
public abstract class c extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return f();
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = null;
        if (e17 == null || context == null || q5Var == null) {
            if (q5Var != null) {
                q5Var.a("invalid_params", null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePrefetchJsApiTransferRequestBase", "[game-web-prefetch] " + f() + " invokeInOwn, data: " + e17);
        e17.put("type", g());
        zq1.f0 f0Var = (zq1.f0) gm0.j1.s(zq1.f0.class);
        com.tencent.mm.plugin.webview.luggage.jsapi.b bVar = new com.tencent.mm.plugin.webview.luggage.jsapi.b(q5Var, this);
        js1.m mVar = (js1.m) f0Var;
        mVar.getClass();
        try {
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo2 = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo();
            transferRequestInfo2.f93913d = e17.optInt("type", -1);
            transferRequestInfo2.f93914e = e17.optString("h5Url");
            transferRequestInfo2.f93915f = e17.optString("scope");
            r45.y24 y24Var = new r45.y24();
            transferRequestInfo2.f93917h = y24Var;
            y24Var.f390725d = e17.optString("reqUrl");
            transferRequestInfo2.f93917h.f390727f = e17.optInt("cgiCmdId");
            org.json.JSONObject optJSONObject = e17.optJSONObject("reqBody");
            transferRequestInfo2.f93917h.f390726e = optJSONObject != null ? optJSONObject.toString() : "";
            transferRequestInfo2.f93917h.f390729h = e17.optInt(ya.b.METHOD);
            transferRequestInfo2.f93920n = e17.optBoolean("needVerifySignature", false);
            transferRequestInfo2.f93918i = e17.optBoolean("is_security_check", false);
            if (e17.has("signText") && !com.tencent.mm.sdk.platformtools.t8.K0(e17.optString("signText"))) {
                java.lang.String str2 = "|" + c01.id.a() + "|" + ((e17.has("shortPrefix") && transferRequestInfo2.f93914e.contains(e17.optString("shortPrefix"))) ? e17.optString("shortPrefix") : e17.optString("h5Url"));
                java.lang.String c17 = com.tencent.mm.network.j.f72026e.c(e17.optString("signText") + str2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                    java.lang.String encodeToString = android.util.Base64.encodeToString(c17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), 2);
                    r45.cw3 cw3Var = new r45.cw3();
                    cw3Var.f371860d = e17.optString("signSignatureHeaderKey", "X-WXGAME-TRANSFER-SIGATURE");
                    cw3Var.f371861e = encodeToString;
                    transferRequestInfo2.f93917h.f390728g.push(cw3Var);
                    r45.cw3 cw3Var2 = new r45.cw3();
                    cw3Var2.f371860d = e17.optString("signSuffixHeaderKey", "X-WXGAME-TRANSFER-SIGATURE-SUFFIX");
                    cw3Var2.f371861e = str2;
                    transferRequestInfo2.f93917h.f390728g.push(cw3Var2);
                }
            }
            java.lang.String optString = e17.optString("header");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String optString2 = jSONObject.optString(next);
                    r45.cw3 cw3Var3 = new r45.cw3();
                    cw3Var3.f371860d = next;
                    cw3Var3.f371861e = optString2;
                    transferRequestInfo2.f93917h.f390728g.push(cw3Var3);
                }
            }
            transferRequestInfo = transferRequestInfo2;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TransferRequestInfo", e18, "parseTransferRequestInfo from json exception", new java.lang.Object[0]);
        }
        mVar.c(transferRequestInfo, bVar);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }

    public abstract java.lang.String f();

    public abstract int g();
}
