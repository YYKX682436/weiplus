package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.l f139696e;

    public k(com.tencent.mm.plugin.game.luggage.jsapi.l lVar, java.lang.String str) {
        this.f139696e = lVar;
        this.f139695d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.jsapi.l lVar = this.f139696e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = lVar.f139706f.f139713f.f139720e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", 1);
            jSONObject.put("localIds", this.f139695d);
            jSONObject.put("appId", lVar.f139705e.getStringExtra("key_game_video_appid"));
            jSONObject.put("appName", lVar.f139705e.getStringExtra("key_game_video_appname"));
        } catch (org.json.JSONException unused) {
        }
        lVar.f139706f.f139711d.a(null, jSONObject);
    }
}
