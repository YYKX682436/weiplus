package tu4;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo a(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        return new com.tencent.mm.plugin.websearch.api.circlesearch.CircleSearchInfo(java.lang.Integer.valueOf(json.optInt("searchScene")), json.optString("parentSearchId"), json.optString("extInfo"), java.lang.Boolean.valueOf(json.optBoolean("skipImageUploading")), json.optString("recommendQuery"), json.optString("imageUrl"), json.optString("imageData"), java.lang.Integer.valueOf(json.optInt("recommendQueryPullType")), json.optString("reportInfoFor33399"), json.optString("reportSearchStatusInfoFor34875"), json.optString("reportExtInfoFor34875"), java.lang.Integer.valueOf(json.optInt("webview_scene")), json.optString("imgPath"), json.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID));
    }
}
