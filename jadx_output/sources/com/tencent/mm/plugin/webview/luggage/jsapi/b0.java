package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class b0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.e3.NAME;
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
        int i17;
        java.lang.Boolean bool;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "invoke");
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        if (optJSONArray != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "sourceType = " + optJSONArray.toString());
            i17 = 0;
            for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                if (optJSONArray.optString(i18).equals(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM)) {
                    i17 |= 1;
                } else if (optJSONArray.optString(i18).equals("camera")) {
                    i17 |= 2;
                }
            }
        } else {
            i17 = 0;
        }
        if (i17 == 0) {
            i17 = 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "real scene = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity = (android.app.Activity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d;
            ((sb0.f) jVar).getClass();
            if (!j35.u.a(activity, "android.permission.CAMERA", 113, "", "")) {
                bVar.c("android_permission_denied", null);
                return;
            }
        }
        int optInt = jSONObject.optInt("count", 0);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("sizeType");
        java.lang.Boolean bool3 = bool2;
        if (optJSONArray2 != null) {
            for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                if (optJSONArray2.optString(i19).equals("original")) {
                    bool2 = java.lang.Boolean.TRUE;
                } else if (optJSONArray2.optString(i19).equals("compressed")) {
                    bool3 = java.lang.Boolean.TRUE;
                }
            }
        }
        int i27 = 7;
        if (bool2.booleanValue() && !bool3.booleanValue()) {
            bool = java.lang.Boolean.TRUE;
        } else if (bool2.booleanValue() || !bool3.booleanValue()) {
            bool = java.lang.Boolean.FALSE;
            i27 = 8;
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_capture", i17);
        intent.putExtra("key_pick_local_pic_count", optInt);
        intent.putExtra("key_pick_local_pic_query_source_type", i27);
        intent.putExtra("key_pick_local_pic_send_raw", bool);
        intent.putExtra("query_media_type", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseImage", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(i27), bool);
        ((com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.a0(this, bVar));
        j45.l.o(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }
}
