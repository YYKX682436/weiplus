package qd1;

/* loaded from: classes7.dex */
public final class x extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 105;
    private static final java.lang.String NAME = "showToast";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShowToast", "invoke JsApi JsApiShowToast failed, current page view is null.");
            e9Var.a(i17, o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowToast", "showToast:%s, callbackId:%d", jSONObject, java.lang.Integer.valueOf(i17));
        int optInt = jSONObject.optInt(dm.i4.COL_ID, -1);
        int optInt2 = jSONObject.optInt("duration", 1500);
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = jSONObject.optString("icon", ya.b.SUCCESS);
        java.lang.String optString3 = jSONObject.optString("image");
        V0.m(new qd1.w(this, e9Var, com.tencent.mm.sdk.platformtools.t8.K0(optString2) && com.tencent.mm.sdk.platformtools.t8.K0(optString3), V0, optInt, optInt2, optString, i17, jSONObject.optBoolean("mask"), optString2, optString3));
    }
}
