package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.t2 f201532e;

    public w2(com.tencent.mm.ui.chatting.gallery.t2 t2Var, int i17) {
        this.f201532e = t2Var;
        this.f201531d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f201532e.f200886d;
        if (k1Var == null || (imageGalleryUI = k1Var.f201092g) == null) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var2 = imageGalleryUI.f200611g;
        int i17 = this.f201531d;
        imageGalleryUI.y9(i17, k1Var2.y(i17), false);
    }
}
