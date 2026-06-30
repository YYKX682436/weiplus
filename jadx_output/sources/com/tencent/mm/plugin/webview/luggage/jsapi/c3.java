package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class c3 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "previewVideo";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.GameJsApiPreviewVideo", "invoke");
        if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f406597b.f344506c.optString(dm.i4.COL_LOCALID))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameJsApiPreviewVideo", "data is invalid");
            bVar.c("invalid_data", null);
            return;
        }
        java.lang.String optString = bVar.f406597b.f344506c.optString(dm.i4.COL_LOCALID);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameJsApiPreviewVideo", "localId:%s", optString);
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).f406610d;
        mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.luggage.jsapi.b3(this, bVar, mMActivity));
        android.content.Intent intent = new android.content.Intent();
        if ((optString == null ? "" : optString).trim().startsWith("weixin://bgmixid/")) {
            if (optString == null) {
                optString = "";
            }
            intent.putExtra("game_bg_mix_fake_local_id", optString.trim());
            j45.l.n(mMActivity, "game", ".media.background.GameFakeVideoUI", intent, hashCode() & 65535);
            return;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a17 = com.tencent.mm.plugin.webview.luggage.util.g.a(optString);
        if (a17 == null || android.text.TextUtils.isEmpty(a17.f182738g) || !com.tencent.mm.vfs.w6.j(a17.f182738g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameJsApiPreviewVideo", "the item is null or the File item not exist for localId: %s", optString);
            bVar.c("fail", null);
        } else {
            intent.putExtra("key_video_path", a17.f182738g);
            j45.l.n(mMActivity, "card", ".ui.CardGiftVideoUI", intent, hashCode() & 65535);
        }
    }
}
