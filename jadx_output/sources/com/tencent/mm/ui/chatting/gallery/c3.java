package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class c3 implements kk.h {
    public c3(com.tencent.mm.ui.chatting.gallery.k3 k3Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "recycle bitmap:%s", bitmap.toString());
        bitmap.recycle();
    }
}
