package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class n6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f201216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201217f;

    public n6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var, java.util.ArrayList arrayList) {
        this.f201217f = imageGalleryUI;
        this.f201215d = f9Var;
        this.f201216e = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo;
        g4Var.clear();
        com.tencent.mm.storage.f9 f9Var = this.f201215d;
        boolean J2 = f9Var.J2();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201217f;
        if (J2) {
            int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
            sourceImgInfo = imageGalleryUI.V8(f9Var);
        } else {
            sourceImgInfo = null;
        }
        if (sourceImgInfo != null && sourceImgInfo.f71259e == 10) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            if (ya2.e1.f460472a.k(imageGalleryUI.getContext(), sourceImgInfo.f71258d, imageGalleryUI.f200651q2, g4Var, 23)) {
                return;
            }
        }
        int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        boolean z17 = true;
        if (imageGalleryUI.g8(2)) {
            oc5.l0 l0Var = imageGalleryUI.f200663u2;
            if (imageGalleryUI.j9(l0Var.f344451a)) {
                ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) imageGalleryUI.Z2).e(l0Var.f344451a, l0Var.f344452b, imageGalleryUI.f200651q2, g4Var, 3);
                this.f201216e.add(9);
                oc5.g0 g0Var = imageGalleryUI.f200669w2;
                if (g0Var != null) {
                    long j17 = imageGalleryUI.f200654r2;
                    java.lang.Long l17 = g0Var.f344425i;
                    if (l17 != null && l17.longValue() == j17) {
                        g0Var.f344428l = true;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (g0Var.f344427k) {
                            g0Var.f344429m = currentTimeMillis - g0Var.f344426j;
                            g0Var.g(j17, "codeMenuVisible");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = imageGalleryUI.f200651q2;
        final com.tencent.mm.modelmulti.WxaInfo X8 = imageGalleryUI.X8(f9Var);
        if (X8 == null) {
            z17 = false;
        } else {
            g4Var.q(15, X8.f71262e, imageGalleryUI.getString(com.tencent.mm.R.string.a4l), 0, 0);
            k0Var.F = new db5.j4() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v
                @Override // db5.j4
                public final void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
                    int i19 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
                    imageView.setBackground(null);
                    imageView.setImageDrawable(null);
                    n11.a b17 = n11.a.b();
                    java.lang.String str = com.tencent.mm.modelmulti.WxaInfo.this.f71263f;
                    o11.f fVar = new o11.f();
                    fVar.f342079c = true;
                    fVar.f342091o = com.tencent.mm.R.raw.actionsheet_default_appbrand_icon;
                    fVar.f342096t = true;
                    b17.h(str, imageView, fVar.a());
                }
            };
            imageGalleryUI.I8(com.tencent.mm.plugin.appbrand.service.a0.f88621g, com.tencent.mm.plugin.appbrand.service.z.f88839e, X8);
        }
        if (z17 || !((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Ai() || imageGalleryUI.T8(f9Var) == null) {
            return;
        }
        g4Var.g(21, imageGalleryUI.getString(com.tencent.mm.R.string.o4y), com.tencent.mm.R.raw.icons_outlined_subscriptions);
    }
}
