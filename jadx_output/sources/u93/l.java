package u93;

/* loaded from: classes.dex */
public class l extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiStartGameLifeConversation", "Invoke startGameLifeConversation");
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("fromUserName");
        java.lang.String optString2 = jSONObject.optString("toUserName");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String optString3 = jSONObject.optString("ext_info");
        com.tencent.mars.xlog.Log.i("LiteAppJsApiStartGameLifeConversation", "fromUserName:[%s] toUserName:[%s], scene:[%d], extInfo:[%s]", optString, optString2, java.lang.Integer.valueOf(optInt), optString3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            this.f143443f.a("invalid_params");
            return;
        }
        ((t53.m0) ((t53.k) i95.n0.c(t53.k.class))).Bi(com.tencent.mm.sdk.platformtools.x2.f193071a, optString, optString2, optInt, com.tencent.mm.sdk.platformtools.t8.K0(optString3) ? null : new com.tencent.mm.protobuf.g(optString3.getBytes()), null);
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
