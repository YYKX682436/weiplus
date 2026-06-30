package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/k2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class k2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (str != null ? r26.i0.n(str, "@pay", false) : false) {
            this.f143443f.a("this jsapi is not allowed in pay liteapp");
            return;
        }
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String uj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).uj(str);
        if (uj6 != null) {
            boolean z18 = true;
            if (!(uj6.length() == 0)) {
                java.lang.String j17 = j62.e.g().j("clicfg_liteapp_transfer_android", "0", false, true);
                kotlin.jvm.internal.o.f(j17, "getMulitExpt(...)");
                boolean p17 = r26.i0.p(j17, "1", true);
                com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo();
                transferRequestInfo.f93913d = p17 ? 5 : 1;
                transferRequestInfo.f93915f = jSONObject.optString("scope");
                transferRequestInfo.f93914e = uj6;
                if (!p17) {
                    str = "";
                }
                transferRequestInfo.f93921o = str;
                r45.y24 y24Var = new r45.y24();
                y24Var.f390725d = jSONObject.optString("reqUrl");
                y24Var.f390727f = jSONObject.optInt("cgiCmdId");
                y24Var.f390726e = jSONObject.optString("reqBody");
                y24Var.f390729h = jSONObject.optInt(ya.b.METHOD);
                transferRequestInfo.f93917h = y24Var;
                transferRequestInfo.f93918i = jSONObject.optBoolean("is_security_check", false);
                java.lang.String optString = jSONObject.optString("debug_env", "");
                kotlin.jvm.internal.o.d(optString);
                transferRequestInfo.f93924r = optString.length() > 0 ? ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).b(optString) : "";
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("debug_cookies");
                if (optJSONObject != null) {
                    transferRequestInfo.f93925s = optJSONObject.optString("route_tag", "");
                }
                try {
                    java.lang.String optString2 = jSONObject.optString("header");
                    kotlin.jvm.internal.o.d(optString2);
                    if (optString2.length() <= 0) {
                        z18 = false;
                    }
                    if (z18) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                        kotlin.jvm.internal.o.d(keys);
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            java.lang.String optString3 = jSONObject2.optString(next);
                            java.util.LinkedList linkedList = transferRequestInfo.f93917h.f390728g;
                            r45.cw3 cw3Var = new r45.cw3();
                            cw3Var.f371860d = next;
                            cw3Var.f371861e = optString3;
                            linkedList.push(cw3Var);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiExtTransfer", e17, "parseTransferRequestInfo exception", new java.lang.Object[0]);
                }
                ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(transferRequestInfo, new com.tencent.mm.plugin.lite.jsapi.comms.j2(this));
                return;
            }
        }
        this.f143443f.a("get auth url fail");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
