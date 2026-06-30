package k91;

/* loaded from: classes7.dex */
public abstract class s {
    public static final void a(java.lang.String appId, org.json.JSONObject injectConfig) {
        org.json.JSONArray optJSONArray;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(injectConfig, "injectConfig");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        org.json.JSONObject optJSONObject = injectConfig.optJSONObject("tabBar");
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("list")) != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                optJSONArray.getJSONObject(i17).remove("iconData");
                optJSONArray.getJSONObject(i17).remove("selectedIconData");
            }
        }
        org.json.JSONArray optJSONArray2 = injectConfig.optJSONArray("subPackages");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i18 = 0; i18 < length2; i18++) {
                optJSONArray2.getJSONObject(i18).remove("pages");
            }
        }
        org.json.JSONArray optJSONArray3 = injectConfig.optJSONArray("subpackages");
        if (optJSONArray3 != null) {
            int length3 = optJSONArray3.length();
            for (int i19 = 0; i19 < length3; i19++) {
                optJSONArray3.getJSONObject(i19).remove("pages");
            }
        }
        injectConfig.remove(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        injectConfig.remove("preloadRule");
        injectConfig.remove("preloadResources");
        injectConfig.remove("preloadSubpackages");
        injectConfig.remove("manualSplashScreen");
        injectConfig.remove("useCommandBuffer");
        injectConfig.remove("permission");
        injectConfig.remove("navigateToMiniProgramAppIdList");
        java.lang.System.currentTimeMillis();
    }
}
