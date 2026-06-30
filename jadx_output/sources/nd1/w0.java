package nd1;

/* loaded from: classes7.dex */
public final class w0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 772;
    public static final java.lang.String NAME = "setNavigateBackConfirmDialog";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("enable", false);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = jSONObject.optString("content");
        com.tencent.mars.xlog.Log.i("JsApiSetNavigateBackConfirmDialog", "[invoke] enable=" + optBoolean + "  content=" + ((java.lang.String) h0Var.f310123d));
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d)) {
            h0Var.f310123d = e9Var.getF147807d().getResources().getString(com.tencent.mm.R.string.gp_);
        }
        e9Var.m(new nd1.v0(e9Var, e9Var.getRuntime().x0().getCurrentPage(), optBoolean, i17, this, h0Var));
    }
}
