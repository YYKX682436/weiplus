package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class y2 implements com.tencent.mm.ui.chatting.gallery.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f201572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.t2 f201573b;

    public y2(com.tencent.mm.ui.chatting.gallery.t2 t2Var, boolean z17) {
        this.f201573b = t2Var;
        this.f201572a = z17;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.e2
    public void a() {
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        if (!this.f201572a || (k1Var = this.f201573b.f200886d) == null || (imageGalleryUI = k1Var.f201092g) == null) {
            return;
        }
        imageGalleryUI.runOnUiThread(new com.tencent.mm.ui.chatting.gallery.x2(this));
    }
}
