package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class l3 extends com.tencent.mm.plugin.webview.ui.tools.media.y0 {

    /* renamed from: l, reason: collision with root package name */
    public long f201172l;

    /* renamed from: m, reason: collision with root package name */
    public final int f201173m;

    public l3() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f201172l = currentTimeMillis;
        this.f201173m = (int) (currentTimeMillis / 1000);
    }

    public final void c(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var == null || !f9Var.M2()) {
            return;
        }
        b(com.tencent.mm.ui.chatting.gallery.j1.r(f9Var), i17, this.f201173m, 101);
    }

    public final void d(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI ui6, int i17, int i18) {
        com.tencent.mm.storage.f9 y17;
        ot0.m1 r17;
        com.tencent.mm.ui.chatting.gallery.j1 j1Var;
        com.tencent.mm.ui.chatting.gallery.ta k17;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var;
        kotlin.jvm.internal.o.g(ui6, "ui");
        int i19 = this.f201173m;
        if (i17 > 0 && (y17 = ui6.f200611g.y(i17)) != null && y17.M2() && (r17 = com.tencent.mm.ui.chatting.gallery.j1.r(y17)) != null) {
            this.f185838d = (int) (java.lang.System.currentTimeMillis() - this.f201172l);
            com.tencent.mm.ui.chatting.gallery.k1 k1Var = ui6.f200611g;
            this.f185837c = (k1Var == null || (j1Var = k1Var.f201098p) == null || (k17 = j1Var.k(i17)) == null || (f4Var = k17.f201438p) == null) ? 0 : f4Var.getCurrentPosition();
            b(r17, 2, i19, 101);
        }
        if (i18 > 0) {
            com.tencent.mm.ui.chatting.gallery.l3 l3Var = ui6.f200676y;
            if (i17 > 0) {
                l3Var.f185843i = 0;
            } else {
                l3Var.f185843i = 1;
            }
            com.tencent.mm.storage.f9 y18 = ui6.f200611g.y(i18);
            if (y18 == null || !y18.M2()) {
                return;
            }
            this.f201172l = java.lang.System.currentTimeMillis();
            this.f185840f = ui6.getIntent().getIntExtra("KOpenArticleSceneFromScene", 1);
            this.f185841g = 10000;
            ot0.m1 r18 = com.tencent.mm.ui.chatting.gallery.j1.r(y18);
            if (r18 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryMpVideoReport", "report17537 mpShareVideoInfo is null");
            } else {
                this.f185842h = c01.e2.J(r18.f373348p);
                b(r18, 1, i19, 101);
            }
        }
    }
}
