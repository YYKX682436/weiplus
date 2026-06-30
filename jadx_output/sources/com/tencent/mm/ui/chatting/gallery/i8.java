package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class i8 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201026d;

    public i8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201026d = imageGalleryUI;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.gallery.e8(this));
    }
}
