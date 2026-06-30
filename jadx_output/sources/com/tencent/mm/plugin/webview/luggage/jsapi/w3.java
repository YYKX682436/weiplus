package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class w3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f182493e;

    /* renamed from: f, reason: collision with root package name */
    public static int f182494f;

    @Override // sd.c
    public java.lang.String b() {
        return "sendAppMessage";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(final android.content.Context context, java.lang.String str, final com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        final org.json.JSONObject jSONObject;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (java.lang.Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            q5Var.a("data is null", null);
            return;
        }
        int optInt = jSONObject.optInt("sendAppMessageScene", 0);
        if (optInt == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendAppMessage", "favoriteUrl");
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.plugin.webview.model.z zVar = new com.tencent.mm.plugin.webview.model.z();
            zVar.f183210a = jSONObject.optString("shareUrl");
            zVar.f183213d = jSONObject.optString("img_url");
            zVar.f183211b = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            zVar.f183212c = jSONObject.optString("desc");
            zVar.f183214e = jSONObject.optString("appid");
            am.c4 c4Var = doFavoriteEvent.f54090g;
            if (context != null && (context instanceof com.tencent.mm.ui.MMActivity)) {
                c4Var.f6323i = (android.app.Activity) context;
                c4Var.f6327m = 36;
            }
            c4Var.f6330p = new com.tencent.mm.plugin.webview.luggage.jsapi.x3(this, q5Var);
            com.tencent.mm.plugin.webview.model.a0.a(doFavoriteEvent, zVar);
            doFavoriteEvent.e();
            if (doFavoriteEvent.f54091h.f6433a != 0) {
                q5Var.a("fail", null);
                return;
            }
            return;
        }
        if (optInt == 2) {
            uw4.u.b(context, jSONObject.optString("sourceUserName"), jSONObject.optString("shareUrl"), jSONObject, q5Var, null);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f9.a(jSONObject.optString("img_url"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("img_url", jSONObject.optString("img_url"));
        hashMap.put("desc", jSONObject.optString("desc"));
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        hashMap.put("url", jSONObject.optString("shareUrl"));
        hashMap.put("srcUserName", jSONObject.optString("src_username"));
        hashMap.put("srcDisplayname", jSONObject.optString("src_displayname"));
        hashMap.put("appId", jSONObject.optString("appid"));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendAppMessage", "sendAppMessage shareToFriend params:" + hashMap);
        com.tencent.mm.ui.da daVar = new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.w3$$a
            @Override // com.tencent.mm.ui.xc
            public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
                com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var2 = q5Var;
                com.tencent.mm.plugin.webview.luggage.jsapi.w3 w3Var = com.tencent.mm.plugin.webview.luggage.jsapi.w3.this;
                w3Var.getClass();
                if (i17 == 1) {
                    org.json.JSONObject jSONObject2 = jSONObject;
                    java.lang.String optString = jSONObject2.optString("appid");
                    if (i18 != -1) {
                        if (i18 == 0 || i18 == 1) {
                            q5Var2.a("cancel", null);
                            return;
                        } else {
                            q5Var2.a("fail", null);
                            return;
                        }
                    }
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                    if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                        q5Var2.a(null, null);
                        return;
                    }
                    java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                    java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendAppMessage", "toUser is null");
                        q5Var2.a("fail", null);
                        return;
                    }
                    java.lang.String optString2 = jSONObject2.optString("img_url");
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(optString2);
                    android.content.Context context2 = context;
                    if (K0) {
                        uw4.y.a(context2, optString, stringExtra, jSONObject2, stringExtra2);
                        return;
                    }
                    com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context2, "", context2.getResources().getString(com.tencent.mm.R.string.f490552yb), true, true, new com.tencent.mm.plugin.webview.luggage.jsapi.y3(w3Var, optString2, q5Var2));
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString2, new com.tencent.mm.plugin.webview.luggage.jsapi.z3(w3Var, Q, context2, optString, stringExtra, jSONObject2, stringExtra2, q5Var2));
                }
            }
        };
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        if (jSONObject.has("link")) {
            hashMap.put("url", jSONObject.optString("link"));
        }
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f334140a.e(hashMap));
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334118b = 1;
        rVar.f334119c = daVar;
        rVar.f334120d.f334139a = 3;
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi((com.tencent.mm.ui.MMActivity) context, aVar, rVar);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
