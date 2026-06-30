package me1;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 650;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "openWeAppProfile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        if (yVar == null || yVar.getContext() == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME, null);
        if (optString == null || !k01.o.a(optString)) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String optString2 = jSONObject.optString("sceneNote", null);
        int optInt2 = jSONObject.optInt("exposeScene", 0);
        try {
            android.content.Context context = yVar.getContext();
            k91.z5 z5Var = new k91.z5();
            z5Var.f305866d = optString;
            z5Var.f305872j = optInt2;
            com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.V6(context, optString, optInt, optString2, true, z5Var.a(), new android.os.Bundle(), null);
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            yVar.a(i17, o("fail:internal error " + e17.getMessage()));
        }
    }
}
