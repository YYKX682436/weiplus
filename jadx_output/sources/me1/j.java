package me1;

/* loaded from: classes7.dex */
public final class j extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 649;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "openWeAppStarList";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String optString = jSONObject.optString("sceneNote");
        int optInt2 = jSONObject.optInt("getUsageReason", 0);
        try {
            com.tencent.mm.plugin.appbrand.ui.c5 c5Var = com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.f89355f;
            android.content.Context context = yVar.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("extra_get_usage_reason", optInt2);
            intent.putExtra("extra_enter_scene", optInt);
            intent.putExtra("extra_enter_scene_note", optString);
            c5Var.a(context, intent);
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            yVar.a(i17, o("fail:internal error " + e17.getMessage()));
        }
    }
}
