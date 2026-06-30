package nd1;

/* loaded from: classes7.dex */
public final class p0 extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "rewriteRoute";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null) {
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("url") : null;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.REWRITE_ROUTE;
        com.tencent.mm.plugin.appbrand.page.i3 x07 = yVar.t3().x0();
        if (optString == null || optString.length() == 0) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("webviewId", 0) : 0;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("lastOpenType", "") : null;
        if (optString2 == null) {
            optString2 = "";
        }
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("routeId", null) : null;
        com.tencent.mars.xlog.Log.i("Luggage.WXA.JsApiRewriteRoute", "invoke rewriteRoute, data:" + jSONObject + " webviewId:" + optInt + ", url:" + optString + " openType:" + optString2 + " jsRouteId:" + optString3);
        nd1.o0 o0Var = new nd1.o0(yVar, x07, optInt, optString, optString2, optString3, i17, this);
        com.tencent.mm.plugin.appbrand.page.pa paVar = x07.f86719y;
        long a17 = paVar.a(wdVar, optString3);
        paVar.b(a17, "overrideEntryPagePath", java.lang.Boolean.FALSE, false);
        com.tencent.mm.plugin.appbrand.page.n4 n4Var = new com.tencent.mm.plugin.appbrand.page.n4(x07, o0Var, optString, wdVar, a17);
        com.tencent.mm.plugin.appbrand.page.r4 r4Var = x07.f86706i;
        if (r4Var != null ? r4Var.b(optString, wdVar, x07, n4Var) : false) {
            return;
        }
        n4Var.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
