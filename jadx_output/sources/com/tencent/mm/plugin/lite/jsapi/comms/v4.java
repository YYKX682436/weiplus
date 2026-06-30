package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public class v4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("PauseDownloadChatFile", "invoke pauseDownloadChatFile.");
        java.lang.String optString = jSONObject.optString("messageSvrId");
        java.lang.String optString2 = jSONObject.optString("chatName");
        java.lang.String optString3 = jSONObject.optString("extInfo");
        if (optString.isEmpty() || optString2.isEmpty()) {
            com.tencent.mars.xlog.Log.e("PauseDownloadChatFile", "invalid param %s", jSONObject.toString());
            this.f143442e.b("invalid param");
        } else {
            h40.f fVar = new h40.f(optString2, java.lang.Long.parseLong(optString));
            fVar.f278744e = new h40.a(optString3);
            fVar.f278743d = new com.tencent.mm.plugin.lite.jsapi.comms.u4(this);
            ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).Zi(fVar);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
