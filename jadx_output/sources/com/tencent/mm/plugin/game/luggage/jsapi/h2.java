package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class h2 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "openGameRegion";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameRegion", "invoke");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.game.luggage.page.x0) bVar.f406596a).f406610d;
        mMActivity.mmSetOnActivityResultCallback(new com.tencent.mm.plugin.game.luggage.jsapi.g2(this, bVar, mMActivity));
        j45.l.o(mMActivity, "game", ".ui.GameRegionSelectUI", null, hashCode() & 65535, false);
    }
}
