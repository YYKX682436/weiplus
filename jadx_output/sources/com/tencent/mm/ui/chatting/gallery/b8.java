package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200817e;

    public b8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, int i17) {
        this.f200817e = imageGalleryUI;
        this.f200816d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200817e;
        if (imageGalleryUI.f200665v) {
            return;
        }
        int i17 = this.f200816d;
        if (i17 >= 100) {
            i17 = 99;
        }
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        imageGalleryUI.h9(imageGalleryUI.P, 8);
        android.view.Display display = imageGalleryUI.getContentView().getDisplay();
        if (display != null && display.getRotation() != 0 && display.getRotation() != 2 && imageGalleryUI.Q.getVisibility() != 0 && imageGalleryUI.S.getVisibility() != 0) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        }
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        imageGalleryUI.h9(imageGalleryUI.S, 0);
        imageGalleryUI.R.setText(i17 + "%");
        com.tencent.mm.ui.chatting.gallery.q3.c(imageGalleryUI.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$c0(), java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
    }
}
