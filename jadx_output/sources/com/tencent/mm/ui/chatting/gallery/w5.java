package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class w5 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201535d;

    public w5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var) {
        this.f201535d = imageGalleryUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        db5.f0 f0Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201535d;
        imageGalleryUI.f200637n.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "[handleAnimation] -> onPreDraw, isBackFromGrid:" + imageGalleryUI.C2);
        imageGalleryUI.Z1 = imageGalleryUI.f200637n.getWidth();
        imageGalleryUI.f200590a2 = imageGalleryUI.f200637n.getHeight();
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        if (k1Var == null) {
            return true;
        }
        if (k1Var.w().Y2()) {
            imageGalleryUI.f200590a2 = (int) ((imageGalleryUI.Z1 / imageGalleryUI.f200612g2) * imageGalleryUI.f200616h2);
        }
        if (imageGalleryUI.f200611g.w().J2() && (f0Var = (db5.f0) imageGalleryUI.K7(imageGalleryUI.f200611g, imageGalleryUI.f200637n)) != null) {
            int imageWidth = (int) ((imageGalleryUI.Z1 / f0Var.getImageWidth()) * f0Var.getImageHeight());
            imageGalleryUI.f200590a2 = imageWidth;
            if (imageWidth > imageGalleryUI.f200637n.getHeight()) {
                imageGalleryUI.f200590a2 = imageGalleryUI.f200637n.getHeight();
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var = imageGalleryUI.f200634m2;
        int i17 = imageGalleryUI.Z1;
        int i18 = imageGalleryUI.f200590a2;
        s4Var.f210699f = i17;
        s4Var.f210700g = i18;
        if (!imageGalleryUI.C2) {
            s4Var.c(imageGalleryUI.f200637n, imageGalleryUI.W1, new com.tencent.mm.ui.chatting.gallery.v5(this));
        }
        imageGalleryUI.f200637n.setGalleryScaleListener(new com.tencent.mm.ui.chatting.gallery.x5(imageGalleryUI, imageGalleryUI.c8()));
        return true;
    }
}
