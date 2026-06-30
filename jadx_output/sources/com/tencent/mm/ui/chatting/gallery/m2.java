package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes4.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201191d;

    public m2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI) {
        this.f201191d = imageGalleryGridUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201191d;
        android.widget.GridView gridView = imageGalleryGridUI.f200571h;
        if (gridView == null || gridView.getVisibility() == 0) {
            return;
        }
        imageGalleryGridUI.f200571h.setVisibility(0);
    }
}
