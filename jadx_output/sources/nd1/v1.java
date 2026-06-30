package nd1;

/* loaded from: classes7.dex */
public class v1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 417;
    public static final java.lang.String NAME = "setTabBarStyle";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        k91.n e17 = e9Var.getRuntime().m0().e();
        nd1.u1 u1Var = new nd1.u1(this, e9Var, i17, jSONObject.optString("color", e17.f305684b), jSONObject.optString("selectedColor", e17.f305685c), jSONObject.optString("backgroundColor", e17.f305686d), jSONObject.optString("borderStyle", e17.f305687e));
        if (e9Var.getRuntime().Q1()) {
            e9Var.getRuntime().I1(u1Var);
        } else {
            u1Var.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
