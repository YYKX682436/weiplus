package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/h4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenWeAppProfile", "openWeAppProfile %s", jSONObject);
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("searchId", "");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiOpenWeAppProfile", e17, me1.c.NAME, new java.lang.Object[0]);
                this.f143443f.a(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
                return;
            }
        } else {
            optString = null;
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("docId", "") : null;
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0)) : null;
        java.lang.Integer valueOf2 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("fromScene", 0)) : null;
        java.lang.Integer valueOf3 = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("type", 0)) : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("weAppUsername", "") : null;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 8);
        bundle.putString("stat_search_id", optString);
        java.lang.String str2 = optString + ':' + optString2 + ':' + valueOf + ':' + valueOf3;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_username", optString3);
        intent.putExtra("key_can_swipe_back", true);
        intent.putExtra("key_from_scene", valueOf2);
        intent.putExtra("key_scene_note", str2);
        intent.putExtra("_stat_obj", bundle);
        j45.l.j(c(), "appbrand", ".ui.AppBrandProfileUI", intent, null);
        this.f143443f.b(kz5.b1.e(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "ok")));
    }
}
