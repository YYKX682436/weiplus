package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class r2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f201318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201319e;

    public r2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI, java.util.Set set) {
        this.f201319e = imageGalleryGridUI;
        this.f201318d = set;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryGridUI", "delete message");
        java.util.Set set = this.f201318d;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201319e;
        com.tencent.mm.ui.chatting.i3.a(imageGalleryGridUI, set, imageGalleryGridUI);
        imageGalleryGridUI.a7();
    }
}
