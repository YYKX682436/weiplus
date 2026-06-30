package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class f7 implements com.tencent.mm.ui.chatting.gallery.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200920a;

    public f7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f200920a = imageGalleryUI;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.e2
    public void a() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200920a;
        if (imageGalleryUI.isFinishing() || imageGalleryUI.isDestroyed() || imageGalleryUI.V1) {
            return;
        }
        imageGalleryUI.f200636m4.post(new com.tencent.mm.ui.chatting.gallery.e7(this));
    }
}
