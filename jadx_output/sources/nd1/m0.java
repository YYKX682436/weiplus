package nd1;

/* loaded from: classes7.dex */
public class m0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 13;
    public static final java.lang.String NAME = "redirectTo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (yVar.getRuntime().m0().e().a(optString)) {
            yVar.a(i17, o("fail:can not redirect to a tab bar page"));
            return;
        }
        nd1.l0 l0Var = new nd1.l0(this, yVar, optString, jSONObject.optJSONObject("singlePageData"), jSONObject.optString("routeId", null), i17);
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.getRuntime().Q1()) {
            l0Var.run();
        } else {
            yVar.getRuntime().I1(l0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
