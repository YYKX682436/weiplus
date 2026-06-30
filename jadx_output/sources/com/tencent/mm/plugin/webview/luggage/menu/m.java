package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class m extends sd.e {
    public m(com.tencent.mm.plugin.webview.luggage.menu.o oVar) {
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite");
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "menu:share:appmessage";
    }
}
