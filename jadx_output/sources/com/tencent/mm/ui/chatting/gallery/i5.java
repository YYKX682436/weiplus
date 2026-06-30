package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class i5 implements db5.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201023a;

    public i5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201023a = imageGalleryUI;
    }

    @Override // db5.d8
    public void a() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201023a;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var != null) {
            if (k1Var.f201106x.a(imageGalleryUI.I7()) != null) {
                return;
            }
        }
        if (imageGalleryUI.f200671x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "%d handle single click event. isFinishing = %b  isDestoryed = %b  destroyCalled = %b", java.lang.Integer.valueOf(imageGalleryUI.hashCode()), java.lang.Boolean.valueOf(imageGalleryUI.isFinishing()), java.lang.Boolean.valueOf(imageGalleryUI.isDestroyed()), java.lang.Boolean.valueOf(imageGalleryUI.V1));
            if (imageGalleryUI.isFinishing() || imageGalleryUI.isDestroyed() || imageGalleryUI.V1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "call click on finishing or finished, just return");
                return;
            }
            if (imageGalleryUI.o8()) {
                imageGalleryUI.P3 = false;
                if (com.tencent.mm.ui.chatting.gallery.ja.H()) {
                    ((c35.m) i95.n0.c(c35.m.class)).getClass();
                }
                if (imageGalleryUI.x8()) {
                    imageGalleryUI.k8();
                    h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
                    com.tencent.mm.storage.f9 w17 = k1Var2 != null ? k1Var2.w() : null;
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var3 = imageGalleryUI.f200611g;
                    ((g90.s) vVar).hj(imageGalleryUI, w17, 1, 1, imageGalleryUI.c7(k1Var3 != null ? k1Var3.w() : null));
                    return;
                }
                imageGalleryUI.o9(false);
                h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
                com.tencent.mm.ui.chatting.gallery.k1 k1Var4 = imageGalleryUI.f200611g;
                com.tencent.mm.storage.f9 w18 = k1Var4 != null ? k1Var4.w() : null;
                com.tencent.mm.ui.chatting.gallery.k1 k1Var5 = imageGalleryUI.f200611g;
                ((g90.s) vVar2).hj(imageGalleryUI, w18, 1, 2, imageGalleryUI.c7(k1Var5 != null ? k1Var5.w() : null));
                return;
            }
            boolean p86 = imageGalleryUI.p8();
            com.tencent.mm.ui.report.i0 i0Var = com.tencent.mm.ui.report.i0.PressToClose;
            if (!p86 || !imageGalleryUI.B2) {
                if (imageGalleryUI.M2 != 1) {
                    com.tencent.mm.ui.report.KV17560Reporter.c(imageGalleryUI).b(i0Var);
                    imageGalleryUI.onBackPressed();
                    return;
                }
                return;
            }
            imageGalleryUI.P3 = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_click_image_close_gallery_enable, 0) == 1) {
                if (imageGalleryUI.M2 != 1) {
                    com.tencent.mm.ui.report.KV17560Reporter.c(imageGalleryUI).b(i0Var);
                    imageGalleryUI.onBackPressed();
                    h90.v vVar3 = (h90.v) i95.n0.c(h90.v.class);
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var6 = imageGalleryUI.f200611g;
                    com.tencent.mm.storage.f9 w19 = k1Var6 != null ? k1Var6.w() : null;
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var7 = imageGalleryUI.f200611g;
                    ((g90.s) vVar3).hj(imageGalleryUI, w19, 1, 3, imageGalleryUI.c7(k1Var7 != null ? k1Var7.w() : null));
                    return;
                }
                return;
            }
            if (imageGalleryUI.x8()) {
                imageGalleryUI.k8();
                h90.v vVar4 = (h90.v) i95.n0.c(h90.v.class);
                com.tencent.mm.ui.chatting.gallery.k1 k1Var8 = imageGalleryUI.f200611g;
                com.tencent.mm.storage.f9 w27 = k1Var8 != null ? k1Var8.w() : null;
                com.tencent.mm.ui.chatting.gallery.k1 k1Var9 = imageGalleryUI.f200611g;
                ((g90.s) vVar4).hj(imageGalleryUI, w27, 1, 1, imageGalleryUI.c7(k1Var9 != null ? k1Var9.w() : null));
                return;
            }
            imageGalleryUI.o9(false);
            h90.v vVar5 = (h90.v) i95.n0.c(h90.v.class);
            com.tencent.mm.ui.chatting.gallery.k1 k1Var10 = imageGalleryUI.f200611g;
            com.tencent.mm.storage.f9 w28 = k1Var10 != null ? k1Var10.w() : null;
            com.tencent.mm.ui.chatting.gallery.k1 k1Var11 = imageGalleryUI.f200611g;
            ((g90.s) vVar5).hj(imageGalleryUI, w28, 1, 2, imageGalleryUI.c7(k1Var11 != null ? k1Var11.w() : null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // db5.d8
    public void b() {
        ?? r07;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201023a;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var == null || k1Var.w() == null) {
            return;
        }
        imageGalleryUI.getClass();
        com.tencent.mm.ui.report.KV17560Reporter.c(imageGalleryUI).b(com.tencent.mm.ui.report.i0.PullDownToClose);
        com.tencent.mm.storage.f9 w17 = imageGalleryUI.f200611g.w();
        if (w17 != null && (w17.isVideo() || w17.J2())) {
            boolean z17 = imageGalleryUI.B2;
            if (imageGalleryUI.A2) {
                r07 = 3;
            } else {
                r07 = z17;
                if (w17.getMsgId() != imageGalleryUI.O2) {
                    r07 = 2;
                }
            }
            int i17 = r07;
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(imageGalleryUI, w17, 1, 1, i17, imageGalleryUI.d7(w17));
        }
        imageGalleryUI.Y8();
    }
}
