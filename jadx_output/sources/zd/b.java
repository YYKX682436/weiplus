package zd;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 585;
    public static final java.lang.String NAME = "hideSplashScreen";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHideSplashScreen", "hideSplashScreen jsApi");
        if (!D()) {
            e9Var.a(i17, o("ok"));
            C(e9Var);
        } else {
            if (e9Var.getRuntime() == null) {
                e9Var.a(i17, o("fail"));
                return;
            }
            e9Var.getRuntime().H0();
            C(e9Var);
            e9Var.a(i17, o("ok"));
        }
    }

    public void C(com.tencent.mm.plugin.appbrand.e9 e9Var) {
    }

    public boolean D() {
        return false;
    }
}
