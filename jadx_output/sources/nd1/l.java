package nd1;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "hideTabBar";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        nd1.k kVar = new nd1.k(this, e9Var, i17, jSONObject);
        if (e9Var.t3().Q1()) {
            e9Var.t3().I1(kVar);
        } else {
            kVar.run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
