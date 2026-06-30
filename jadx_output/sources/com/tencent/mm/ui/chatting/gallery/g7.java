package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f200958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.AnonymousClass62 f200959e;

    public g7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.AnonymousClass62 anonymousClass62, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f200959e = anonymousClass62;
        this.f200958d = scanTranslationResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.J2 == this.f200958d.f54739g.f6400a) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.y7(false);
            am.ct ctVar = this.f200958d.f54739g;
            if (ctVar.f6402c) {
                if (com.tencent.mm.vfs.w6.j(ctVar.f6403d)) {
                    com.tencent.mm.ui.chatting.gallery.k1 k1Var = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.f200611g;
                    if (k1Var != null) {
                        k1Var.R(k1Var.w(), true, com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.O3);
                        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
                        imageGalleryUI.h7(imageGalleryUI.f200611g.w(), true);
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryUI", "adapter is null, fail to set translate status.");
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "trans result path %s not exist!", this.f200958d.f54739g.f6403d);
                }
            }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.J2 = 0;
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI2 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this;
            db5.e1.G(imageGalleryUI2, imageGalleryUI2.getString(com.tencent.mm.R.string.iaw), "", false, null);
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.this.f200591a3.a(2);
        }
    }
}
