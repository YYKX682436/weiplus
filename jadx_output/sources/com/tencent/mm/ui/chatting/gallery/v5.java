package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class v5 implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.w5 f201506a;

    public v5(com.tencent.mm.ui.chatting.gallery.w5 w5Var) {
        this.f201506a = w5Var;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.chatting.gallery.w5 w5Var = this.f201506a;
        long j17 = w5Var.f201535d.f200680y3;
        w5Var.f201535d.f200636m4.post(new com.tencent.mm.ui.chatting.gallery.u5(this));
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = w5Var.f201535d;
        android.view.View a76 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.a7(imageGalleryUI, imageGalleryUI.f200611g, imageGalleryUI.f200637n);
        if (a76 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) a76).setDrawFullSampleSizeBitmap(false);
        }
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.ui.chatting.gallery.l8 l8Var = this.f201506a.f201535d.f200655r3;
        if (l8Var != null) {
            ((com.tencent.mm.ui.chatting.gallery.c2) l8Var).a(java.lang.Boolean.TRUE);
        }
    }
}
