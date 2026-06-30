package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class o8 implements zh1.c1 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f201243b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Runnable f201244c = null;

    public o8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201243b = new java.lang.ref.WeakReference(imageGalleryUI);
    }

    @Override // zh1.c1
    public void a(java.lang.Runnable runnable) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "executeOrDefer");
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) this.f201243b.get();
        if (imageGalleryUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "executeOrDefer, ui is null");
            return;
        }
        com.tencent.mm.storage.f9 w17 = imageGalleryUI.f200611g.w();
        if (w17 == null || !w17.isVideo()) {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                runnable.run();
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(runnable);
                return;
            }
        }
        t21.v2 h17 = t21.d3.h(w17.z0());
        if (h17 == null || (i17 = h17.f415011i) == 199 || i17 == 199) {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                runnable.run();
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(runnable);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "executeOrDefer, video start download and waiting");
        imageGalleryUI.P2 = t21.d3.d(w17.getMsgId(), 4);
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = imageGalleryUI.f200611g;
        int currentItem = imageGalleryUI.f200637n.getCurrentItem();
        k1Var.f201098p.B(k1Var.y(currentItem), currentItem, true);
        this.f201244c = runnable;
    }
}
