package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.b2 f200777d;

    public a2(com.tencent.mm.ui.chatting.gallery.b2 b2Var) {
        this.f200777d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.b2 b2Var = this.f200777d;
        com.tencent.mm.ui.chatting.gallery.d2.a(b2Var.f200809g, !b2Var.f200807e.booleanValue() && b2Var.f200809g.f200855f, b2Var.f200806d);
        com.tencent.mm.ui.chatting.gallery.g2 g2Var = b2Var.f200808f.f201100r;
        if (g2Var != null) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = ((com.tencent.mm.ui.chatting.gallery.d5) g2Var).f200866a;
            if (imageGalleryUI.f200611g == null) {
                return;
            }
            imageGalleryUI.o9(false);
            imageGalleryUI.c9();
            imageGalleryUI.f200611g.onPageSelected(com.tencent.mm.ui.chatting.gallery.d2.f200849o);
        }
    }
}
