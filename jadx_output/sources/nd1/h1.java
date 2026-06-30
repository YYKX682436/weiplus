package nd1;

/* loaded from: classes7.dex */
public class h1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 238;
    private static final java.lang.String NAME = "setNavigationBarRightButton";

    public h1() {
        si1.e.a(NAME);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = d0Var instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) d0Var : ((com.tencent.mm.plugin.appbrand.e9) d0Var).V0();
        com.tencent.mm.plugin.appbrand.e9 b17 = com.tencent.mm.plugin.appbrand.jsapi.gg.b(d0Var);
        boolean optBoolean = jSONObject.optBoolean("hide", false);
        if (V0 == null) {
            d0Var.a(i17, o("fail:page don't exist"));
            com.tencent.mars.xlog.Log.w("JsApiSetNavigationBarRightButton", "onInvoke: page not exist");
            return;
        }
        if (b17 == null) {
            d0Var.a(i17, o("fail:internal error invalid js component"));
            com.tencent.mars.xlog.Log.w("JsApiSetNavigationBarRightButton", "onInvoke: service not AppBrandService");
            return;
        }
        com.tencent.mars.xlog.Log.i("JsApiSetNavigationBarRightButton", "onInvoke: hide=" + optBoolean + ", appId=" + V0.getAppId());
        V0.b3(optBoolean ^ true, al1.h0.JsApi);
        if (optBoolean || !(!(this instanceof nd1.j2))) {
            d0Var.a(i17, o("ok"));
            return;
        }
        java.lang.String optString = jSONObject.optString("iconPath");
        if (android.text.TextUtils.isEmpty(optString)) {
            d0Var.a(i17, o("ok"));
            return;
        }
        zl1.f0 f0Var = new zl1.f0(optString, new nd1.e1(this, d0Var, i17), b17);
        f0Var.f473631f = new nd1.g1(this, V0, d0Var, i17);
        f0Var.b();
    }
}
