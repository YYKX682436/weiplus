package t93;

/* loaded from: classes.dex */
public class l extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            jSONObject2.put("tipsWording", jSONObject.optJSONObject("tipsWording"));
            try {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).qj(com.tencent.mm.sdk.platformtools.x2.f193071a, null, jSONObject2.toString(), false, new t93.k(this));
            } catch (java.lang.Exception e17) {
                this.f143443f.a("fail");
                com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenFinderCreateAcctView", e17, "", new java.lang.Object[0]);
            }
        } catch (org.json.JSONException e18) {
            this.f143443f.a("fail");
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiOpenFinderCreateAcctView", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
