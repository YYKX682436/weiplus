package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f201613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201615f;

    public z8(com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        this.f201613d = jaVar;
        this.f201614e = f9Var;
        this.f201615f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f201613d;
        yd5.p pVar = jaVar.f201042e;
        if (pVar != null) {
            pVar.a();
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = jaVar.f200886d;
        if (k1Var == null || (imageGalleryUI = k1Var.f201092g) == null) {
            return;
        }
        imageGalleryUI.Z = false;
        imageGalleryUI.Y.setVisibility(8);
        jaVar.f200886d.f201092g.o9(false);
        jaVar.A(this.f201614e, this.f201615f);
    }
}
