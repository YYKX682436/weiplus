package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class d5 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        android.os.Bundle extraData = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a).getExtraData();
        int intValue = extraData.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID) != null ? ((java.lang.Integer) extraData.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)).intValue() : 0;
        int intValue2 = extraData.get("lastGetA8KeyRequestId") != null ? ((java.lang.Integer) extraData.get("lastGetA8KeyRequestId")).intValue() : 0;
        hashMap.put("currentRequestId", java.lang.Integer.valueOf(intValue));
        hashMap.put("lastRequestId", java.lang.Integer.valueOf(intValue2));
        com.tencent.mars.xlog.Log.i("LiteAppJsApiPrivateGetContext", "ret: " + hashMap);
        this.f143443f.b(hashMap);
    }
}
