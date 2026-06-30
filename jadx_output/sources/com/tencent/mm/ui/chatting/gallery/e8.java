package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.i8 f200893d;

    public e8(com.tencent.mm.ui.chatting.gallery.i8 i8Var) {
        this.f200893d = i8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int n17 = gm0.j1.d().n();
        com.tencent.mm.ui.chatting.gallery.i8 i8Var = this.f200893d;
        if (n17 != 6 && gm0.j1.d().n() != 4) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = i8Var.f201026d;
            if (imageGalleryUI.M2 == 1) {
                db5.e1.s(imageGalleryUI, imageGalleryUI.getString(com.tencent.mm.R.string.f490500wu), "");
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = i8Var.f201026d;
                imageGalleryUI2.y7(false);
                imageGalleryUI2.f200591a3.a(2);
                return;
            }
            return;
        }
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI3 = i8Var.f201026d;
        if (imageGalleryUI3.f200611g == null) {
            return;
        }
        int I7 = imageGalleryUI3.I7();
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI4 = i8Var.f201026d;
        com.tencent.mm.storage.f9 y17 = imageGalleryUI4.f200611g.y(I7);
        if (y17 == null || !y17.M2()) {
            return;
        }
        if (imageGalleryUI4.f200611g.v() == null) {
            imageGalleryUI4.f200611g.v().d();
        }
        com.tencent.mm.ui.chatting.gallery.ta v17 = imageGalleryUI4.f200611g.v();
        v17.d();
        if (v17.f201439q.getVisibility() != 0) {
            com.tencent.mm.ui.chatting.gallery.ta v18 = imageGalleryUI4.f200611g.v();
            v18.d();
            if (v18.f201447y.getVisibility() != 0) {
                return;
            }
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI4.f200611g;
        k1Var.f201098p.A(k1Var.y(I7), I7);
    }
}
