package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.c6 f200784d;

    public a6(com.tencent.mm.ui.chatting.gallery.c6 c6Var) {
        this.f200784d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "onAnimationStart postDelayed!!");
        com.tencent.mm.ui.chatting.gallery.c6 c6Var = this.f200784d;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = c6Var.f200833a;
        android.view.View K7 = imageGalleryUI.K7(imageGalleryUI.f200611g, imageGalleryUI.f200637n);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = c6Var.f200833a.f200611g;
        if (k1Var != null && com.tencent.mm.ui.chatting.gallery.k1.K(k1Var.w())) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = c6Var.f200833a;
            K7 = imageGalleryUI2.L7(imageGalleryUI2.f200611g, imageGalleryUI2.f200637n);
        }
        if (K7 == null || !(K7 instanceof db5.f0)) {
            return;
        }
        if (K7 instanceof com.tencent.mm.ui.base.MultiTouchImageView) {
            ((com.tencent.mm.ui.base.MultiTouchImageView) K7).i();
        } else if (K7 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) K7).i();
        }
    }
}
