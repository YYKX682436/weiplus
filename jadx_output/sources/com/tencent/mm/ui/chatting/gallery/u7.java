package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201482d;

    public u7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201482d = imageGalleryUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201482d;
        imageGalleryUI.A9();
        imageGalleryUI.e9();
        imageGalleryUI.o9(false);
        imageGalleryUI.T7();
        imageGalleryUI.H1.setVisibility(8);
    }
}
