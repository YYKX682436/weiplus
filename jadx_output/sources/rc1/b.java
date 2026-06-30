package rc1;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1350;
    private static final java.lang.String NAME = "showSystemSheetMenu";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
        V0.g4(jSONObject != null ? jSONObject.optString("sessionBuffer") : null);
        pm0.v.X(new rc1.a(V0));
        java.lang.String str = c0Var.t3().f74803n;
        com.tencent.mm.plugin.appbrand.page.n7 N2 = c0Var.t3().N2();
        java.lang.String X1 = N2 != null ? N2.X1() : null;
        if (X1 == null) {
            X1 = "";
        }
        com.tencent.mm.plugin.appbrand.report.v0.f(str, X1, jSONObject != null ? jSONObject.optString("sessionBuffer") : null, 2, 2);
    }
}
