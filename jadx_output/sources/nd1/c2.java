package nd1;

/* loaded from: classes7.dex */
public class c2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 9;
    public static final java.lang.String NAME = "showNavigationBarLoading";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        nd1.b2 b2Var = new nd1.b2(this, yVar, i17);
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.t3().Q1()) {
            b2Var.run();
        } else {
            yVar.t3().I1(b2Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
