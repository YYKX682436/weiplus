package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
class g implements com.tencent.mm.ipcinvoker.j {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("icon_url");
        java.lang.String string2 = bundle.getString("page_url");
        java.lang.String string3 = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        com.tencent.mm.plugin.webview.luggage.menu.f fVar = new com.tencent.mm.plugin.webview.luggage.menu.f(this, rVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2) || com.tencent.mm.sdk.platformtools.t8.K0(string3) || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewShortcutManager", "url is null");
            com.tencent.mm.plugin.webview.model.a5.b(fVar, false);
            return;
        }
        android.content.Intent a17 = com.tencent.mm.plugin.webview.model.a5.a(null, string2, string3, false);
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((zd0.e) hVar).getClass();
        xp1.c.i(context, a17);
        n11.a.b().m(string, null, new com.tencent.mm.plugin.webview.model.y4(string2, string3, fVar));
    }
}
