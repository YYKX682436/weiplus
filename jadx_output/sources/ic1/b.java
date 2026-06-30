package ic1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1431;
    public static final java.lang.String NAME = "clearEntryPagePath";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiClearEntryPagePath", "clearEntryPagePath invoke: %s", appId);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            lVar.o(new ic1.a(this, appId, lVar, i17));
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:invalid appid" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 1005);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
