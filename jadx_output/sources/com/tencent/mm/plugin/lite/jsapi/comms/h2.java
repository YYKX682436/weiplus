package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class h2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("sessionFrom");
        if (optString.length() > 1024) {
            optString.substring(0, 1024);
            com.tencent.mars.xlog.Log.i("LiteAppJsApiEnterContact", "enterContact sessionFrom length is large than 1024!");
        }
        java.lang.String optString2 = jSONObject.optString("appId");
        java.lang.String optString3 = jSONObject.optString("userName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2) || com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            this.f143443f.a("expected necessary param");
            return;
        }
        jSONObject.optString("businessId");
        jSONObject.optBoolean("showMessageCard", false);
        jSONObject.optString("sendMessageTitle");
        jSONObject.optString("sendMessagePath");
        jSONObject.optString("sendMessageImg");
        jSONObject.optString("headimgUrl");
        jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        jSONObject.optString("subTitle");
        ((com.tencent.mm.plugin.appbrand.app.t2) ((com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, optString3, null, optString2, 2, null, new com.tencent.mm.plugin.appbrand.service.j6() { // from class: com.tencent.mm.plugin.lite.jsapi.comms.h2$$a
            @Override // com.tencent.mm.plugin.appbrand.service.j6
            public final void onResult(int i17, java.lang.String str2) {
                com.tencent.mm.plugin.lite.jsapi.comms.h2 h2Var = com.tencent.mm.plugin.lite.jsapi.comms.h2.this;
                h2Var.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("retCode", java.lang.Integer.valueOf(i17));
                hashMap.put("errMsg", str2);
                h2Var.f143443f.b(hashMap);
            }
        });
    }
}
