package qd1;

/* loaded from: classes.dex */
public final class e0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 639;
    private static final java.lang.String NAME = "updateToast";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiUpdateToast", "updateToast: %s", jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateToast", "env is null, return");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        kotlin.jvm.internal.o.f(V0, "getCurrentPageView(...)");
        kotlin.jvm.internal.o.d(jSONObject);
        int optInt = jSONObject.optInt(dm.i4.COL_ID, -1);
        if (optInt != -1) {
            e9Var.getRuntime().m(new qd1.d0(V0, e9Var, i17, this, optInt, jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)));
            return;
        }
        com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateToast", "invalid id, return");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject2));
    }
}
