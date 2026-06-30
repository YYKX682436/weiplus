package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class k7 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201147d;

    public k7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201147d = imageGalleryUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201147d;
        imageGalleryUI.T7();
        imageGalleryUI.D1.getViewTreeObserver().removeOnPreDrawListener(this);
        imageGalleryUI.T7();
        int width = imageGalleryUI.D1.getWidth();
        imageGalleryUI.T7();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.E1.getLayoutParams();
        layoutParams.width = width;
        imageGalleryUI.T7();
        imageGalleryUI.E1.setLayoutParams(layoutParams);
        imageGalleryUI.T7();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.F1.getLayoutParams();
        layoutParams2.width = width;
        imageGalleryUI.T7();
        imageGalleryUI.F1.setLayoutParams(layoutParams2);
        return true;
    }
}
