package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class o extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f139718g = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_MONTH) + "haowan/";

    /* renamed from: h, reason: collision with root package name */
    public static final int f139719h = 62784;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f139720e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f139721f;

    @Override // sd.c
    public java.lang.String b() {
        return "chooseHaowanMedia";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        int optInt = e17.optInt("mediaType", 3);
        e17.optString("mediaTag");
        int optInt2 = e17.optInt("limitCount", 9);
        int optInt3 = e17.optInt("galleryType");
        org.json.JSONArray optJSONArray = e17.optJSONArray("albumInfos");
        boolean optBoolean = e17.optBoolean("ignoreVideoPreview", true);
        int optInt4 = e17.optInt("sourceSceneId");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_can_select_video_and_pic", true);
        intent.putExtra("key_send_raw_image", false);
        ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.game.luggage.jsapi.m(this, q5Var, context));
        intent.putExtra("max_select_count", optInt2);
        intent.putExtra("query_source_type", 15);
        intent.putExtra("query_media_type", optInt);
        intent.putExtra("show_header_view", false);
        intent.addFlags(67108864);
        if (optJSONArray != null) {
            intent.putExtra("game_haowan_local_albums_info", optJSONArray.toString());
        }
        intent.putExtra("game_haowan_ignore_video_preview", optBoolean);
        intent.putExtra("game_haowan_source_scene_id", optInt4);
        int i17 = f139719h;
        if (optInt3 == 2) {
            j45.l.n(context, "game", ".media.GameTabGalleryUI", intent, i17);
        } else {
            if (optInt3 != 1) {
                q5Var.a("galleryType is invalid", null);
                return;
            }
            j45.l.n(context, "game", ".media.GamePublishGalleryUI", intent, i17);
        }
        ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
