package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class d3 implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k3 f200864a;

    public d3(com.tencent.mm.ui.chatting.gallery.k3 k3Var) {
        this.f200864a = k3Var;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "preRemoveCallback %s", (java.lang.String) obj);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.ui.chatting.gallery.k3 k3Var = this.f200864a;
        if (k3Var.f201135s.indexOfKey(bitmap.hashCode()) >= 0) {
            return;
        }
        java.util.LinkedList linkedList = k3Var.f201134r;
        if (linkedList.contains(java.lang.Integer.valueOf(bitmap.hashCode()))) {
            linkedList.remove(java.lang.Integer.valueOf(bitmap.hashCode()));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "recycle bitmap:%s", bitmap.toString());
            bitmap.recycle();
        }
    }
}
