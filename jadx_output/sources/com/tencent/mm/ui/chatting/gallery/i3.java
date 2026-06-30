package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.j3 f201022f;

    public i3(com.tencent.mm.ui.chatting.gallery.j3 j3Var, android.view.View view, java.lang.String str) {
        this.f201022f = j3Var;
        this.f201020d = view;
        this.f201021e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.davemorrissey.labs.subscaleview.view.ImageSource uri;
        android.graphics.Bitmap bitmap;
        com.tencent.mm.ui.base.WxImageView wxImageView = (com.tencent.mm.ui.base.WxImageView) this.f201020d;
        com.tencent.mm.ui.chatting.gallery.j3 j3Var = this.f201022f;
        java.lang.String str = j3Var.f201058f;
        int i17 = j3Var.f201059g;
        com.tencent.mm.ui.chatting.gallery.k3 k3Var = j3Var.f201060h;
        if (k3Var.f201129m == null || wxImageView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(k3Var.f201131o);
        objArr[2] = java.lang.Boolean.valueOf(k3Var.f201138v == null);
        android.graphics.Bitmap bitmap2 = k3Var.f201138v;
        if (bitmap2 != null && bitmap2.isRecycled()) {
            z17 = true;
        }
        objArr[3] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryLazyLoader", "loadWxImageView position: %d, mLastPosition: %d, previewBitmap == null: %b, recycle: %b", objArr);
        if (i17 != k3Var.f201131o || (bitmap = k3Var.f201138v) == null || bitmap.isRecycled()) {
            java.lang.String str2 = this.f201021e;
            uri = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? com.davemorrissey.labs.subscaleview.view.ImageSource.uri(str2) : null;
        } else {
            uri = com.davemorrissey.labs.subscaleview.view.ImageSource.cachedBitmap(k3Var.f201138v);
        }
        ((com.tencent.mm.ui.chatting.gallery.t2) k3Var.f201129m).D(wxImageView, str, uri);
    }
}
