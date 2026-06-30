package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class m implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.o f139713f;

    public m(com.tencent.mm.plugin.game.luggage.jsapi.o oVar, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, android.content.Context context) {
        this.f139713f = oVar;
        this.f139711d = q5Var;
        this.f139712e = context;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == com.tencent.mm.plugin.game.luggage.jsapi.o.f139719h) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("key_video_info");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra)) {
                        com.tencent.mm.plugin.game.luggage.jsapi.o oVar = this.f139713f;
                        android.content.Context context = this.f139712e;
                        oVar.f139721f = new com.tencent.mm.plugin.game.luggage.jsapi.n(oVar);
                        oVar.f139720e = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.g6v), true, false, oVar.f139721f);
                        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.l(this, stringArrayListExtra, intent));
                    } else if (intent.getBooleanExtra("key_game_haowan_text", false)) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("type", 3);
                            jSONObject.put("appId", intent.getStringExtra("key_game_video_appid"));
                            jSONObject.put("appName", intent.getStringExtra("key_game_video_appname"));
                        } catch (org.json.JSONException unused) {
                        }
                        this.f139711d.a(null, jSONObject);
                    } else {
                        this.f139711d.a("cancel", null);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseHaowanMedia", "video, result: %s", stringExtra);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("type", 2);
                        if (intent.getBooleanExtra("key_game_video_encode_json_array", false)) {
                            jSONObject2.put("localIds", new org.json.JSONArray(stringExtra));
                        } else {
                            jSONObject2.put("localIds", stringExtra);
                        }
                        jSONObject2.put("appId", intent.getStringExtra("key_game_video_appid"));
                        jSONObject2.put("appName", intent.getStringExtra("key_game_video_appname"));
                        jSONObject2.put("transInfo", intent.getStringExtra("key_game_trans_info"));
                        jSONObject2.put("pageType", intent.getIntExtra("key_game_video_page_type", 0));
                    } catch (org.json.JSONException unused2) {
                    }
                    this.f139711d.a(null, jSONObject2);
                }
            } else {
                this.f139711d.a("cancel", null);
            }
            ((com.tencent.mm.ui.MMActivity) this.f139712e).mmSetOnActivityResultCallback(null);
        }
    }
}
