package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class y extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "downloadGameVideo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("videoUrl", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                q5Var.a("videoUrl is null", null);
                return;
            }
            java.lang.String optString2 = jSONObject.optString("thumbUrl", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                q5Var.a("thumbUrl is null", null);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("game_from", 11);
            intent.putExtra("video_url", optString);
            intent.putExtra("thumb_url", optString2);
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.game.luggage.jsapi.x(this, q5Var, context));
            j45.l.n(context, "game", ".media.GameVideoDownloadUI", intent, 1137);
        } catch (org.json.JSONException unused) {
            q5Var.a("fail", null);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
