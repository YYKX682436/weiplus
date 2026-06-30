package ed3;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "finishLoading";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor mBAppBrandAdaptor = (com.tencent.mm.plugin.magicbrush.MBAppBrandAdaptor) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFinishLoading", "[mb] finish loading.");
        mBAppBrandAdaptor.getFileSystem().release();
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
        mBAppBrandAdaptor.a(i17, u(str, jSONObject2));
    }
}
