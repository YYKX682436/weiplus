package nd1;

/* loaded from: classes7.dex */
public final class r0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = 413;
    public static final java.lang.String NAME = "scrollWebviewTo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = yVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) yVar : yVar instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) yVar).V0() : null;
        if (V0 == null) {
            return o("fail:page don't exist");
        }
        long optLong = jSONObject.optLong("duration", 300L);
        if (!jSONObject.has("scrollTop")) {
            return o("fail:invalid data");
        }
        try {
            V0.m(new nd1.q0(this, V0, java.lang.Math.round(ik1.w.f() * new java.math.BigDecimal(jSONObject.getString("scrollTop")).floatValue()), optLong));
            return o("ok");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Jsapi_scrollWebviewTo", "opt scrollTop, e = %s", e17);
            java.lang.String message = e17.getMessage();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (message == null) {
                message = "";
            }
            return o("fail:invalid data ".concat(message));
        }
    }
}
