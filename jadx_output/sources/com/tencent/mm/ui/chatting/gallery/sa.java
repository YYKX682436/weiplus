package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class sa implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201371d;

    public sa(com.tencent.mm.ui.chatting.gallery.ta taVar) {
        this.f201371d = taVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201371d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = taVar.f201424b;
        k1Var.f201092g.f200676y.c(k1Var.w(), 7);
        taVar.f201424b.f201092g.f200676y.f185843i = 4;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.gallery.qa(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryViewHolder", "play video error what : " + i17 + " extra: " + i18);
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201371d;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = taVar.f201424b;
        if (k1Var != null) {
            k1Var.f201098p.v(i17, i18);
        }
        com.tencent.mm.ui.chatting.gallery.l3 l3Var = taVar.f201424b.f201092g.f200676y;
        l3Var.f185843i = 4;
        l3Var.f185839e = "what : " + i17 + " extra: " + i18;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12084, java.lang.Integer.valueOf(taVar.H), java.lang.Integer.valueOf(taVar.G * 1000), 0, 4, taVar.f201422J, java.lang.Integer.valueOf(taVar.I), taVar.L, java.lang.Long.valueOf(taVar.K));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPrepared() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.sa.onPrepared():void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201371d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryViewHolder", "dkvideo onplaytime:%d total:%d,%d size:%d cnt:%d user:%s", valueOf, java.lang.Integer.valueOf(taVar.G), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(taVar.H), java.lang.Integer.valueOf(taVar.I), taVar.f201422J);
        gm0.j1.e().j(new com.tencent.mm.ui.chatting.gallery.ra(this, i18, i17));
        return 0;
    }
}
