package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f200976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f200977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.j1 f200979h;

    public h1(com.tencent.mm.ui.chatting.gallery.j1 j1Var, int i17, boolean z17, com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var) {
        this.f200979h = j1Var;
        this.f200975d = i17;
        this.f200976e = z17;
        this.f200977f = taVar;
        this.f200978g = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        com.tencent.mm.ui.chatting.gallery.j1 j1Var = this.f200979h;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = j1Var.f200886d;
        if (k1Var != null && (imageGalleryUI = k1Var.f201092g) != null) {
            if (this.f200975d == 0) {
                imageGalleryUI.getClass();
                t23.p0.n().c(new com.tencent.mm.ui.chatting.gallery.d8(imageGalleryUI));
            } else {
                java.lang.String charSequence = this.f200976e ? imageGalleryUI.getText(com.tencent.mm.R.string.on9).toString() : imageGalleryUI.getText(com.tencent.mm.R.string.on_).toString();
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = j1Var.f200886d.f201092g;
                imageGalleryUI2.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "originVideoLoadingFailed");
                t23.p0.n().c(new com.tencent.mm.ui.chatting.gallery.f8(imageGalleryUI2, charSequence));
            }
        }
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f200977f;
        j1Var.y(taVar);
        j1Var.A(this.f200978g, taVar.f201425c);
    }
}
