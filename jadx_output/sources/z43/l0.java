package z43;

/* loaded from: classes8.dex */
public class l0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiSetGameTab", "data is null");
            this.f143443f.a("null_data");
            return;
        }
        com.tencent.mm.autogen.events.handleGameTabNavigationEvent handlegametabnavigationevent = new com.tencent.mm.autogen.events.handleGameTabNavigationEvent();
        java.lang.String Ai = ((com.tencent.mm.plugin.game.h0) ((m33.b1) i95.n0.c(m33.b1.class))).Ai(c());
        am.f30 f30Var = handlegametabnavigationevent.f55004g;
        f30Var.f6635c = Ai;
        f30Var.f6633a = this.f299023d;
        f30Var.f6634b = jSONObject.toString();
        handlegametabnavigationevent.e();
    }
}
