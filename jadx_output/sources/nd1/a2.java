package nd1;

/* loaded from: classes7.dex */
public final class a2 extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 577;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "showNavigationBar";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        nd1.z1 z1Var = new nd1.z1(yVar, i17, this);
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.getRuntime().Q1()) {
            z1Var.run();
        } else {
            yVar.getRuntime().I1(z1Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
