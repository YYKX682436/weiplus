package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.y2 f201548d;

    public x2(com.tencent.mm.ui.chatting.gallery.y2 y2Var) {
        this.f201548d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f201548d.f201573b.f200886d;
        if (k1Var == null || (imageGalleryUI = k1Var.f201092g) == null) {
            return;
        }
        imageGalleryUI.w7();
    }
}
