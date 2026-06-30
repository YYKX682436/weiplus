package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class g0 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {

    /* renamed from: e, reason: collision with root package name */
    public sd.b f182313e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f182314f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.da f182315g = new com.tencent.mm.plugin.webview.luggage.jsapi.f0(this);

    @Override // sd.c
    public java.lang.String b() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.z3.NAME;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "invoke");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d;
        this.f182314f = mMActivity;
        this.f182313e = bVar;
        if (mMActivity == null) {
            h("fail", null);
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        java.lang.String optString = jSONObject.optString("sourceType");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject.optString("mediaType", "");
        int min = java.lang.Math.min(jSONObject.optInt("maxDuration", 10), 10);
        java.lang.String optString3 = jSONObject.optString("camera", "");
        int optInt = jSONObject.optInt("count", 1);
        java.lang.String optString4 = jSONObject.optString("sizeType", "");
        boolean z18 = false;
        boolean z19 = false;
        for (java.lang.String str : optString2.length() == 0 ? new java.lang.String[0] : optString2.split("\\|")) {
            if ("image".equals(str)) {
                z19 = true;
            } else if (!"video".equals(str) && "livePhoto".equals(str)) {
                z18 = true;
            }
        }
        boolean z27 = z18 || "true".equals(jSONObject.optString("livePhoto", ""));
        boolean z28 = z18 && !z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s livePhoto:%b livePhotoOnly:%b", optString, optString2, java.lang.Integer.valueOf(min), optString3, java.lang.Integer.valueOf(optInt), optString4, java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_count", optInt);
        intent.putExtra("key_pick_local_media_duration", min <= 0 ? 10 : min);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("key_pick_local_media_video_type", 2);
        intent.putExtra("key_pick_local_media_sight_type", optString2);
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        if (qp.b.f365678e && z27) {
            intent.putExtra("key_pick_local_media_localphoto", true);
            if (z28) {
                intent.putExtra("key_pick_local_media_livephoto_only", true);
            }
        }
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("key_pick_local_pic_query_source_type", optString4.contains("original") ^ optString4.contains("compressed") ? 7 : 8);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(true ^ optString4.contains("compressed"));
        if (!optString4.contains("original") && !optString4.contains("compressed")) {
            valueOf = java.lang.Boolean.FALSE;
        }
        intent.putExtra("key_pick_local_pic_send_raw", valueOf);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = "album|camera";
        }
        if (optString.contains(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM) && optString.contains("camera")) {
            new com.tencent.mm.ui.tools.s6(this.f182314f).a(null, new com.tencent.mm.plugin.webview.luggage.jsapi.c0(this), new com.tencent.mm.plugin.webview.luggage.jsapi.d0(this, optString3, intent), new com.tencent.mm.plugin.webview.luggage.jsapi.e0(this));
            return;
        }
        if (optString.contains(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM)) {
            f(intent);
        } else if (optString.contains("camera")) {
            g(optString3, intent);
        } else {
            h("sourceType_error", null);
        }
    }

    public final void f(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromAlbum");
        intent.putExtra("key_pick_local_pic_capture", 4096);
        this.f182314f.mmSetOnActivityResultCallback(this.f182315g);
        j45.l.o(this.f182314f, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }

    public final void g(java.lang.String str, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromCamera");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.ui.MMActivity mMActivity = this.f182314f;
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(mMActivity, "android.permission.CAMERA", 119, "", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", " checkPermission checkcamera[%b]", java.lang.Boolean.valueOf(a17));
        if (!a17) {
            h("no_user_permission", null);
            return;
        }
        intent.putExtra("key_pick_local_pic_capture", str.equals("front") ? 16 : 256);
        this.f182314f.mmSetOnActivityResultCallback(this.f182315g);
        j45.l.o(this.f182314f, "webview", ".ui.tools.OpenFileChooserUI", intent, hashCode() & 65535, false);
    }

    public final void h(java.lang.String str, java.util.HashMap hashMap) {
        sd.b bVar = this.f182313e;
        if (bVar != null) {
            bVar.b(str, hashMap);
        }
        this.f182313e = null;
        this.f182314f = null;
    }
}
