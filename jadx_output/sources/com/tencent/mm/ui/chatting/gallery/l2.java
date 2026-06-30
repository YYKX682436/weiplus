package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class l2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f201170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201171e;

    public l2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI, java.util.List list) {
        this.f201171e = imageGalleryGridUI;
        this.f201170d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201171e;
        com.tencent.mm.ui.chatting.gallery.k1.i(imageGalleryGridUI.getContext(), this.f201170d);
        imageGalleryGridUI.a7();
    }
}
