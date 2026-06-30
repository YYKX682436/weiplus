package tb1;

/* loaded from: classes7.dex */
public class n0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1384;
    public static final java.lang.String NAME = "notifyCameraMessage";

    /* renamed from: g, reason: collision with root package name */
    public mi1.w0 f416915g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNotifyCameraMessage", "data:%s", jSONObject);
        if (c0Var.Z0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNotifyCameraMessage", "no page context");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.d5 x07 = c0Var.t3().x0();
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = (x07.getCurrentPage() == null && x07.getCurrentPage().getCurrentPageView() == null) ? null : x07.getCurrentPage().getCurrentPageView();
        if (currentPageView == null || currentPageView.t3() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNotifyCameraMessage", "mPageView is null or Runtime is null");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("open", false);
        mi1.w0 w0Var = this.f416915g;
        if (w0Var != null) {
            w0Var.dismiss();
            this.f416915g = null;
        }
        if (optBoolean) {
            this.f416915g = mi1.c.a(currentPageView.t3()).h(mi1.d.CAMERA);
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, u(str, jSONObject2));
    }
}
