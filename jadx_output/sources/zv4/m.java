package zv4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final zv4.m f476481a = new zv4.m();

    /* renamed from: b, reason: collision with root package name */
    public static org.json.JSONObject f476482b;

    public final su4.j2 a(android.content.Context context, zv4.i iVar) {
        su4.j2 j2Var = new su4.j2();
        j2Var.f412961x = java.net.URLDecoder.decode(iVar.f476469h, com.tencent.mapsdk.internal.rv.f51270c);
        j2Var.f412938a = context;
        java.lang.Integer num = iVar.f476463b;
        j2Var.f412939b = num != null ? num.intValue() : 0;
        j2Var.f412941d = iVar.f476462a;
        java.lang.Integer num2 = iVar.f476464c;
        j2Var.f412940c = num2 != null ? num2.intValue() : 0;
        j2Var.f412942e = iVar.f476465d;
        j2Var.f412943f = iVar.f476471j == 1;
        j2Var.f412948k = iVar.f476473l;
        j2Var.f412949l = iVar.f476474m;
        j2Var.f412945h = true;
        j2Var.f412946i = iVar.f476475n;
        j2Var.f412947j = iVar.f476476o;
        j2Var.f412954q = iVar.f476477p;
        int i17 = iVar.f476468g;
        if (i17 == 1 || i17 == 2) {
            j2Var.A = i17 == 1;
        }
        j2Var.f412958u = false;
        j2Var.f412953p = false;
        j2Var.f412963z = iVar.f476470i;
        j2Var.f412960w = iVar.f476472k;
        return j2Var;
    }

    public final zv4.i b(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null) {
            return new zv4.i("", null, null, "", "", "", 0, "", "", 0, false, false, "", false, false, "");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("customNavBarParams");
        java.lang.String optString = jSONObject.optString("query");
        java.lang.String str = optString == null ? "" : optString;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(jSONObject.optInt("type"));
        java.lang.String optString2 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject.optString("searchId");
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject.optString("subSessionId");
        java.lang.String str4 = optString4 == null ? "" : optString4;
        int optInt = jSONObject.optInt("ftsNeedHideKeyBoard", 0);
        java.lang.String optString5 = jSONObject.optString("extParams");
        java.lang.String str5 = optString5 == null ? "" : optString5;
        java.lang.String optString6 = jSONObject.optString("searchPlaceHolder");
        java.lang.String str6 = optString6 == null ? "" : optString6;
        int optInt2 = jSONObject.optInt("isHomePage", 0);
        boolean optBoolean = jSONObject.optBoolean("needPreGet", false);
        boolean optBoolean2 = jSONObject.optBoolean("enableRestoreEducatePage", false);
        java.lang.String optString7 = jSONObject.optString("forceUseThemeMode");
        if (optString7 == null) {
            optString7 = "";
        }
        boolean optBoolean3 = optJSONObject2 != null ? optJSONObject2.optBoolean("hideSearchBar", false) : false;
        boolean optBoolean4 = optJSONObject2 != null ? optJSONObject2.optBoolean("hideNavBar", false) : false;
        java.lang.String optString8 = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("nativeConfig")) == null) ? null : optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (optString8 == null) {
            optString8 = "";
        }
        return new zv4.i(str, valueOf, valueOf2, str2, str3, str4, optInt, str5, str6, optInt2, optBoolean, optBoolean2, optString7, optBoolean3, optBoolean4, optString8);
    }

    public final void c(android.content.Context context, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(a(context, b(jSONObject)));
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchSourceImgJumpInfoUtil", "startWebSearch: web search started successfully");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearchSourceImgJumpInfoUtil", "startWebSearch failed: " + e17.getMessage(), e17);
        }
    }
}
