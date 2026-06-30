package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class p3 extends com.tencent.mm.plugin.lite.jsapi.comms.h3 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f143718h = new java.util.HashMap();

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.h3
    public com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig A(org.json.JSONObject jSONObject) {
        if (!jSONObject.has("shareProductItem")) {
            return com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig.f77389f;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("shareProductItem");
        r45.br2 br2Var = new r45.br2();
        br2Var.set(5, optJSONObject.optString("appId"));
        br2Var.set(6, optJSONObject.optString("pagePath"));
        br2Var.set(7, optJSONObject.optString("productId"));
        br2Var.set(8, optJSONObject.optString("coverUrl"));
        br2Var.set(9, optJSONObject.optString("productTitle"));
        br2Var.set(10, java.lang.Integer.valueOf(optJSONObject.optInt("marketPrice")));
        br2Var.set(11, java.lang.Integer.valueOf(optJSONObject.optInt("sellingPrice")));
        br2Var.set(1, optJSONObject.optString("finderUsername"));
        br2Var.set(12, optJSONObject.optString("platformHeadImg"));
        br2Var.set(13, optJSONObject.optString("platformName"));
        br2Var.set(17, optJSONObject.optString("ecSource"));
        br2Var.set(28, optJSONObject.optString("entranceGMsgID", ""));
        com.tencent.mars.xlog.Log.i("LiteAppJsApiNavigateToMiniProgramForFinderProductShare", "fillTraceInfoToShareObject " + br2Var.getString(28));
        java.lang.String valueOf = java.lang.String.valueOf(optJSONObject.hashCode());
        f143718h.put(valueOf, br2Var);
        return new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.ShareActionConfig(true, valueOf);
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.h3
    public l81.e1 B(boolean z17) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.o3(this, z17);
    }

    @Override // com.tencent.mm.plugin.lite.jsapi.comms.h3, jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        super.a(str, jSONObject, z17);
    }
}
