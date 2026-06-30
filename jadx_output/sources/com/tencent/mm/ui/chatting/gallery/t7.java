package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class t7 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f201407a;

    public t7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, q80.d0 d0Var) {
        this.f201407a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "openLiteApp fail %s.", this.f201407a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "openLiteApp success %s.", this.f201407a.f360649a);
    }
}
