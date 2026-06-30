package nd1;

/* loaded from: classes7.dex */
public class u0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 388;
    public static final java.lang.String NAME = "setMenuStyle";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMenuStyle", "data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("style");
        com.tencent.mm.plugin.appbrand.page.v5 pageView = e9Var.getRuntime().x0().getPageView();
        if (pageView == null) {
            e9Var.a(i17, o("fail view is null"));
            return;
        }
        if (optString.equalsIgnoreCase("dark")) {
            pageView.X2("dark");
        } else {
            if (!optString.equalsIgnoreCase("light")) {
                e9Var.a(i17, o("fail invalid style ".concat(optString)));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetMenuStyle", "fail invalid style %s", optString);
                return;
            }
            pageView.X2("light");
        }
        e9Var.a(i17, o("ok"));
    }
}
