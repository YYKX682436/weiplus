package u93;

/* loaded from: classes.dex */
public class h extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("promotionId");
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s", optString, optString2);
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(c(), str, "", "liteapp", optString, optString2, new u93.g(this));
    }
}
