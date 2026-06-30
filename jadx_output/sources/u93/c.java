package u93;

/* loaded from: classes.dex */
public class c extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        boolean Ai = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ai(c(), c01.z1.j());
        com.tencent.mars.xlog.Log.i("LiteAppJsApiGetGameCenterEntranceState", "getGameCenterEntranceState is closed:" + Ai);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("open", java.lang.Boolean.valueOf(Ai ^ true));
        this.f143442e.e(hashMap);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
