package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class j5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeLine", "invoke");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d;
        if (mMActivity == null || mMActivity.isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareTimeLine", "activity is null or finish");
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("link");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareTimeLine", "link is null");
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("desc");
        if (optString2 != null) {
            if (optString2.startsWith("http://")) {
                optString2.substring(7);
            } else if (optString2.startsWith("https://")) {
                optString2.substring(8);
            }
        }
        java.lang.String optString3 = jSONObject.optString("appid");
        java.lang.String optString4 = jSONObject.optString("img_width");
        java.lang.String optString5 = jSONObject.optString("img_height");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeLine", "doTimeline, rawUrl:[%s], shareUrl:[%s]", optString, optString);
        java.lang.String optString6 = jSONObject.optString("type");
        java.lang.String optString7 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString8 = jSONObject.optString("img_url");
        java.lang.String optString9 = jSONObject.optString("src_username");
        java.lang.String optString10 = jSONObject.optString("src_displayname");
        int i17 = -1;
        try {
            i17 = java.lang.Integer.valueOf(optString4).intValue();
            java.lang.Integer.valueOf(optString5);
        } catch (java.lang.Exception unused) {
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_width", i17);
        intent.putExtra("Ksnsupload_height", i17);
        intent.putExtra("Ksnsupload_link", optString);
        intent.putExtra("Ksnsupload_title", optString7);
        intent.putExtra("Ksnsupload_imgurl", optString8);
        if (c01.e2.G(optString9)) {
            intent.putExtra("src_username", optString9);
            intent.putExtra("src_displayname", optString10);
        }
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString6) && optString6.equals("music")) {
            intent.putExtra("ksnsis_music", true);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString6) && optString6.equals("video")) {
            intent.putExtra("ksnsis_video", true);
        }
        if (optString3 != null && optString3.length() > 0) {
            intent.putExtra("Ksnsupload_appid", optString3);
        }
        intent.putExtra("ShareUrlOriginal", optString);
        intent.putExtra("ShareUrlOpen", ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u());
        intent.putExtra("JsAppId", ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).K.b());
        intent.putExtra("need_result", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareTimeLine", "doTimeline, start activity");
        mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.i5(this, bVar, mMActivity));
        j45.l.o(mMActivity, "sns", ".ui.SnsUploadUI", intent, hashCode() & 65535, false);
    }
}
