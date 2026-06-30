package qd1;

/* loaded from: classes.dex */
public final class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1416;
    private static final java.lang.String NAME = "updateModal";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApiUpdateModal", "updateModal data:" + jSONObject);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateModal", "env is null, return");
            return;
        }
        int optInt = jSONObject != null ? jSONObject.optInt(dm.i4.COL_ID, -1) : -1;
        if (optInt != -1) {
            kotlin.jvm.internal.o.d(jSONObject);
            e9Var.m(new qd1.b0(e9Var, optInt, i17, this, jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), jSONObject.optString("content", ""), jSONObject.optString("placeholderText"), jSONObject.optString("confirmText", e9Var.getF147807d().getString(com.tencent.mm.R.string.gpa)), jSONObject.optString("cancelText", e9Var.getF147807d().getString(com.tencent.mm.R.string.gp9))));
            return;
        }
        com.tencent.mars.xlog.Log.w("Luggage.JsApiUpdateModal", "invalid id, return");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
