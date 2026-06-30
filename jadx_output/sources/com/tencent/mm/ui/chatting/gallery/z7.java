package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class z7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201612e;

    public z7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, int i17) {
        this.f201612e = imageGalleryUI;
        this.f201611d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f201612e.f200611g;
        if (k1Var == null) {
            return;
        }
        k1Var.f201098p.w(this.f201611d);
    }
}
