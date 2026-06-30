package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class n4 implements com.tencent.mm.ipcinvoker.j {
    private n4() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.Long valueOf = java.lang.Long.valueOf(bundle.getLong("appUuid"));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(bundle.getLong("pageId"));
        java.lang.String string = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        try {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(valueOf.longValue(), valueOf2.longValue(), "app.postmessage", new org.json.JSONObject(string));
            rVar.a(null);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendMessageToLiteApp", "json exception %s", string);
        }
    }
}
