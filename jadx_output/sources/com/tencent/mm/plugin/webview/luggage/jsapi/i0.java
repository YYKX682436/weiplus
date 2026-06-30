package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class i0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    public static void f(sd.b bVar, int i17) {
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseVideo", "activity is null");
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("sourceType", "");
        java.lang.String optString2 = jSONObject.optString("camera", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", optString, optString2, java.lang.Integer.valueOf(i17));
        int optInt = jSONObject.optInt("maxDuration", 60);
        int i18 = optString.contains(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM) ? 4096 : 0;
        if (optString.contains("camera")) {
            if (optInt <= 0) {
                bVar.c("fail", null);
                return;
            }
            i18 = optString2.equals("front") ? i18 | 16 : i18 | 256;
        }
        if (i18 == 0) {
            i18 = 4352;
        }
        if (i18 == 16 || i18 == 256 || i18 == 4352) {
            if (i17 == 1) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.a(mMActivity, "android.permission.CAMERA", 117, "", "")) {
                    return;
                }
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.a(mMActivity, "android.permission.RECORD_AUDIO", 118, "", "")) {
                    return;
                }
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                if (!j35.u.a(mMActivity, "android.permission.CAMERA", 115, "", "")) {
                    return;
                }
            }
        }
        int optInt2 = jSONObject.optInt("quality", 1);
        if (optInt2 != 0 && optInt2 != 1) {
            optInt2 = 1;
        }
        int i19 = optInt <= 60 ? optInt : 60;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", java.lang.Integer.valueOf(i18), 1, java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(i19));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_capture", i18);
        intent.putExtra("key_pick_local_pic_count", 1);
        intent.putExtra("key_pick_local_pic_query_source_type", 7);
        intent.putExtra("key_pick_local_media_quality", optInt2);
        intent.putExtra("key_pick_local_media_duration", i19);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("key_pick_local_media_video_type", i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", java.lang.Integer.valueOf(i18), 1, 7);
        mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.h0(bVar, mMActivity));
        if (i17 == 1) {
            j45.l.o(mMActivity, "webview", ".ui.tools.OpenFileChooserUI", intent, 45, false);
        } else {
            j45.l.o(mMActivity, "webview", ".ui.tools.OpenFileChooserUI", intent, 32, false);
        }
    }

    @Override // sd.c
    public java.lang.String b() {
        return "chooseVideo";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseVideo", "invokeInOwn");
        f(bVar, 0);
    }
}
