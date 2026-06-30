package z43;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mm.autogen.events.handleGameTabNavigationEvent handlegametabnavigationevent = new com.tencent.mm.autogen.events.handleGameTabNavigationEvent();
        am.f30 f30Var = handlegametabnavigationevent.f55004g;
        try {
            f30Var.f6633a = jSONObject.getString("eventName");
            f30Var.f6635c = ((com.tencent.mm.plugin.game.h0) ((m33.b1) i95.n0.c(m33.b1.class))).Ai(c());
            f30Var.f6634b = jSONObject.toString();
            handlegametabnavigationevent.e();
        } catch (org.json.JSONException unused) {
            this.f143443f.a("Parse json fail");
        }
    }
}
