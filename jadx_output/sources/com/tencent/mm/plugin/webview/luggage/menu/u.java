package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class u extends sd.e {
    public u(com.tencent.mm.plugin.webview.luggage.menu.v vVar) {
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "menu:share:appmessage";
    }
}
