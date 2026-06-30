package y93;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiDoGoToRecVideoList", "doGoToRecVideoList");
        try {
            ((lf0.u) ((mf0.z) i95.n0.c(mf0.z.class))).getClass();
            r45.un6 p17 = pm4.w.p(jSONObject);
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, p17, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiDoGoToRecVideoList", e17, "doGoToRecVideoList", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
