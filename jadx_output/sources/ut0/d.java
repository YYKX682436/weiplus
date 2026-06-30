package ut0;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1587;
    public static final java.lang.String NAME = "getLocalWVAPackageInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 env = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        com.tencent.mars.xlog.Log.i("JsApiGetLocalWVAPackageInfo", "invoke: packageName=" + optString + ", callbackId=" + i17);
        if (!(optString == null || optString.length() == 0)) {
            com.tencent.mm.minigame.g1 g1Var = com.tencent.mm.minigame.g1.f69071a;
            kotlin.jvm.internal.o.d(optString);
            g1Var.c(env, optString, new ut0.c(this, i17, env));
            return;
        }
        com.tencent.mars.xlog.Log.w("JsApiGetLocalWVAPackageInfo", "invoke: packageName is empty");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:invalid request parameter" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 1001);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str, jSONObject));
    }
}
