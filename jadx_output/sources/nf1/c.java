package nf1;

/* loaded from: classes7.dex */
public abstract class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.Iterator<java.lang.String> keys;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            return;
        }
        if (jSONObject == null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            java.lang.String str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo();
        transferRequestInfo.f93913d = D();
        java.lang.String optString = jSONObject.optString("scope");
        if (optString == null) {
            optString = "";
        }
        transferRequestInfo.f93915f = optString;
        transferRequestInfo.f93920n = jSONObject.optBoolean("needVerifySignature", false);
        transferRequestInfo.f93918i = jSONObject.optBoolean("is_security_check", false);
        transferRequestInfo.f93921o = c0Var.getAppId();
        transferRequestInfo.f93914e = "";
        r45.y24 y24Var = new r45.y24();
        java.lang.String optString2 = jSONObject.optString("reqUrl");
        if (optString2 == null) {
            optString2 = "";
        }
        y24Var.f390725d = optString2;
        java.lang.String optString3 = jSONObject.optString("reqBody");
        if (optString3 == null) {
            optString3 = "";
        }
        y24Var.f390726e = optString3;
        y24Var.f390727f = jSONObject.optInt("cgiCmdId", 0);
        y24Var.f390729h = jSONObject.optInt(ya.b.METHOD, 0);
        transferRequestInfo.f93917h = y24Var;
        java.lang.String optString4 = jSONObject.optString("debug_env", "");
        kotlin.jvm.internal.o.d(optString4);
        transferRequestInfo.f93924r = optString4.length() > 0 ? ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).b(optString4) : "";
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("debug_cookies");
        if (optJSONObject != null) {
            transferRequestInfo.f93925s = optJSONObject.optString("route_tag", "");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
        if (optJSONObject2 != null && (keys = optJSONObject2.keys()) != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.String optString5 = optJSONObject2.optString(next);
                if (optString5 == null) {
                    optString5 = "";
                }
                java.util.LinkedList linkedList = transferRequestInfo.f93917h.f390728g;
                r45.cw3 cw3Var = new r45.cw3();
                cw3Var.f371860d = next;
                cw3Var.f371861e = optString5;
                linkedList.push(cw3Var);
            }
        }
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(transferRequestInfo, new nf1.b(this, i17, c0Var));
    }

    public abstract java.lang.String C();

    public abstract int D();
}
