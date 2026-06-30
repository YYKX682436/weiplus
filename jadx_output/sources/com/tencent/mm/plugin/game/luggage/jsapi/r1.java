package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class r1 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f139742d;

    public r1(com.tencent.mm.plugin.game.luggage.jsapi.s1 s1Var, sd.b bVar) {
        this.f139742d = bVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 510) {
            sd.b bVar = this.f139742d;
            if (i18 == -1) {
                int intExtra = intent.getIntExtra("webview_callback_err", 0);
                if (intExtra == 0) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("videoInfo", new org.json.JSONArray(intent.getStringExtra("key_video_info")).getJSONObject(0));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchGameVideoEditor", "json_err:%s", e17.getMessage());
                    }
                    bVar.e(jSONObject);
                } else if (intExtra == 1) {
                    bVar.c("cancel", null);
                } else if (intExtra == 2) {
                    bVar.c("download_err", null);
                }
            } else {
                bVar.c("cancel", null);
            }
            ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d).mmSetOnActivityResultCallback(null);
        }
    }
}
