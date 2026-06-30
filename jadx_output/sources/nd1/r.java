package nd1;

/* loaded from: classes7.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 14;
    public static final java.lang.String NAME = "navigateTo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("url");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("singlePageData");
        if (yVar.getRuntime().m0().e().a(optString)) {
            yVar.a(i17, o("fail:can not navigate to a tab bar page"));
            return;
        }
        nd1.q qVar = new nd1.q(this, yVar, i17, optString, optJSONObject, jSONObject.optString("routeId", null));
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.getRuntime().Q1()) {
            qVar.run();
        } else {
            yVar.getRuntime().I1(qVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
