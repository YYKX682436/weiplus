package com.tencent.mm.plugin.webview.emojistore;

/* loaded from: classes.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.emojistore.a f182039d = new com.tencent.mm.plugin.webview.emojistore.a(this, null);

    public b() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PreEmotionSearchEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.emojistore.EmojiStoreWebViewLogic$1
            {
                this.__eventId = 1238741578;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PreEmotionSearchEvent preEmotionSearchEvent) {
                com.tencent.mm.autogen.events.PreEmotionSearchEvent preEmotionSearchEvent2 = preEmotionSearchEvent;
                if (!(preEmotionSearchEvent2 instanceof com.tencent.mm.autogen.events.PreEmotionSearchEvent)) {
                    return false;
                }
                com.tencent.mm.plugin.webview.emojistore.a aVar = com.tencent.mm.plugin.webview.emojistore.b.this.f182039d;
                am.po poVar = preEmotionSearchEvent2.f54622g;
                int i17 = poVar.f7642b;
                java.lang.String str = poVar.f7641a;
                java.lang.String str2 = poVar.f7643c;
                poVar.getClass();
                aVar.a(i17, str, str2, 0, 0L);
                return true;
            }
        }.alive();
    }

    public static int a(java.util.Map map, java.lang.String str, int i17) {
        java.lang.String b17 = b(map, str);
        return com.tencent.mm.sdk.platformtools.t8.K0(b17) ? i17 : com.tencent.mm.sdk.platformtools.t8.P(b17, 0);
    }

    public static java.lang.String b(java.util.Map map, java.lang.String str) {
        return (!map.containsKey(str) || map.get(str) == null) ? "" : map.get(str).toString();
    }

    public boolean c(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "getSearchEmotionData: %s", map.toString());
        java.lang.String b17 = b(map, "keyword");
        java.lang.String b18 = b(map, "nextPageBuffer");
        int a17 = a(map, "type", 0);
        int a18 = a(map, "webview_instance_id", 0);
        java.lang.String b19 = b(map, "searchID");
        this.f182039d.a(a17, b17, b18, a18, com.tencent.mm.sdk.platformtools.t8.K0(b19) ? 0L : java.lang.Long.valueOf(b19).longValue());
        return false;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof com.tencent.mm.plugin.webview.emojistore.c) {
            gm0.j1.d().q(234, this);
            com.tencent.mm.plugin.webview.emojistore.a aVar = this.f182039d;
            aVar.f182036d = false;
            com.tencent.mm.plugin.webview.emojistore.c cVar = (com.tencent.mm.plugin.webview.emojistore.c) m1Var;
            if (i17 == 0 && i18 == 0) {
                aVar.f182037e = true;
            } else {
                aVar.f182037e = false;
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(cVar.f182045i).w6("{}", cVar.f182046m, "", 0L);
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(cVar.f182045i).w6(cVar.H().f381714d, cVar.f182046m, x51.j1.f(cVar.H().f381715e), cVar.H().f381716f);
        }
    }
}
