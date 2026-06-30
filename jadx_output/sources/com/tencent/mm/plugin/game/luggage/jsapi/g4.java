package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
class g4 implements com.tencent.mm.ipcinvoker.j {
    private g4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("url");
        java.lang.String string2 = bundle.getString(dm.i4.COL_LOCALID);
        com.tencent.mm.plugin.game.luggage.jsapi.x3.f139774e = com.tencent.mm.plugin.game.luggage.jsapi.x3.g("bundle", null);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean(ya.b.SUCCESS, true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            r53.y.a().e(null, string, null, new com.tencent.mm.plugin.game.luggage.jsapi.e4(this, bundle2, rVar));
            return;
        }
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.tencent.mm.plugin.webview.model.o5.d(string2);
        if (!android.text.TextUtils.isEmpty(d17)) {
            com.tencent.mm.plugin.game.luggage.jsapi.x3.i(d17, string2, null, com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.plugin.game.luggage.jsapi.f4(this, bundle2, rVar));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveImageToPhotosAlbum", "saveToPhotosAlbum fail, filePath is null");
        bundle2.putBoolean(ya.b.SUCCESS, false);
        bundle2.putString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "saveToPhotosAlbum fail, filePath is null");
        rVar.a(bundle2);
    }
}
