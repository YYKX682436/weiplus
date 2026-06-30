package nd1;

/* loaded from: classes7.dex */
public class m1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 197;
    private static final java.lang.String NAME = "setStatusBarStyle";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        nd1.l1 l1Var = new nd1.l1(this, jSONObject, e9Var, i17);
        if (e9Var.t3().Q1()) {
            e9Var.t3().I1(l1Var);
        } else {
            l1Var.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
