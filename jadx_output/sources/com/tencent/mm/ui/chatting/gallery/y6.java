package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201579e;

    public y6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, com.tencent.mm.storage.f9 f9Var) {
        this.f201579e = imageGalleryUI;
        this.f201578d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
        com.tencent.mm.modelstat.e.f71505a.getClass();
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201579e;
        imageGalleryUI.P8(this.f201578d, 7);
        com.tencent.mm.ui.report.KV17560Reporter.c(imageGalleryUI).b(com.tencent.mm.ui.report.i0.LongPressToSave);
    }
}
