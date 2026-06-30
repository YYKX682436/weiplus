package wj1;

/* loaded from: classes14.dex */
public class c0 implements wj1.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI f446576a;

    public c0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI) {
        this.f446576a = appBrandIDCardUI;
    }

    public static void a(wj1.c0 c0Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
        db5.e1.K(appBrandIDCardUI, false, str, "", appBrandIDCardUI.getString(com.tencent.mm.R.string.f490085kh), "", new wj1.q(c0Var), new wj1.r(c0Var));
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "verifyPassword");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446576a;
        g0Var.d(14943, appBrandIDCardUI.f89532e, 2, appBrandIDCardUI.f89539o.f381961s);
        if (appBrandIDCardUI.f89539o.f381962t == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "showAuthorizeUserIDResp.verify_pay_req is null");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", appBrandIDCardUI.f89539o.f381962t.f386865d);
            jSONObject.put("timeStamp", appBrandIDCardUI.f89539o.f381962t.f386866e);
            jSONObject.put("nonceStr", appBrandIDCardUI.f89539o.f381962t.f386867f);
            jSONObject.put("package", appBrandIDCardUI.f89539o.f381962t.f386868g);
            jSONObject.put("signType", appBrandIDCardUI.f89539o.f381962t.f386869h);
            jSONObject.put("paySign", appBrandIDCardUI.f89539o.f381962t.f386870i);
            g0Var.d(14943, appBrandIDCardUI.f89532e, 3, appBrandIDCardUI.f89539o.f381961s);
            com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService.INSTANCE.verifyPassword(appBrandIDCardUI, null, jSONObject, new wj1.n(this));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandIDCardUI", e17, "", new java.lang.Object[0]);
        }
    }
}
