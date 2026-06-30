package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes8.dex */
public class a3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "preVerifyJSAPI";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreVerify", "invokeInOwn");
        sx4.d0.m(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).s(), java.lang.System.currentTimeMillis());
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("verifyAppId");
        java.lang.String optString2 = jSONObject.optString("verifySignature");
        java.lang.String optString3 = jSONObject.optString("verifyNonceStr");
        java.lang.String optString4 = jSONObject.optString("verifyTimestamp");
        java.lang.String optString5 = jSONObject.optString("verifySignType");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("verifyJsApiList");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreVerify", "appid : %s, %s, %s, %s, %s", optString, optString2, optString3, optString4, optString5);
        java.lang.String u17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreVerify", "jsItem length %s", java.lang.Integer.valueOf(optJSONArray.length()));
            if (optJSONArray.length() == 0) {
                bVar.c("checkJsApi:param is empty", null);
                return;
            }
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                java.lang.String string = optJSONArray.getString(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    linkedList.add(string);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || linkedList.size() <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreVerify", "handlePreVerify wrong args, %s", optString);
                bVar.c("pre_verify_jsapi:fail_invalid_args", null);
                return;
            }
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.x14();
            lVar.f70665b = new r45.y14();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-preverify";
            lVar.f70667d = bb1.g.CTRL_INDEX;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.x14 x14Var = (r45.x14) a17.f70710a.f70684a;
            x14Var.f389650d = u17;
            x14Var.f389651e = optString;
            x14Var.f389652f = linkedList;
            x14Var.f389653g = optString4;
            x14Var.f389654h = optString3;
            x14Var.f389655i = optString2;
            x14Var.f389656m = optString5;
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.webview.luggage.jsapi.z2(bVar, optString));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPreVerify", "exception occur " + e17.getMessage());
            bVar.a();
        }
    }
}
