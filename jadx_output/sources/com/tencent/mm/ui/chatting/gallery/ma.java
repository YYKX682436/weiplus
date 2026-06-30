package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class ma implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201202d;

    public ma(com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201202d = taVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201202d;
        taVar.f201428f.start();
        taVar.f201432j.post(new com.tencent.mm.ui.chatting.gallery.la(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201202d;
        taVar.f201428f.stop();
        java.lang.String str = (java.lang.String) ((android.view.View) taVar.f201428f).getTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        sb6.append(com.tencent.mm.plugin.sight.base.e.b());
        sb6.append("[ImageGallery] on play sight error, what=");
        sb6.append(i17);
        sb6.append(", extra=");
        sb6.append(i18);
        sb6.append(", path=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(str == null ? "" : str);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.gallery.ka(this, str));
        taVar.f201426d.put(str, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
