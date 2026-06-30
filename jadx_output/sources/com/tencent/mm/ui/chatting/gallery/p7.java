package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class p7 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201268d;

    public p7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201268d = imageGalleryUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201268d;
        if (!imageGalleryUI.x8() || imageGalleryUI.q8()) {
            return false;
        }
        imageGalleryUI.k8();
        return false;
    }
}
