package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class u2 implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f201470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f201471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.t2 f201473e;

    public u2(com.tencent.mm.ui.chatting.gallery.t2 t2Var, java.lang.String str, int i17, com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var) {
        this.f201473e = t2Var;
        this.f201469a = str;
        this.f201470b = i17;
        this.f201471c = taVar;
        this.f201472d = f9Var;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", "BigImgOpt onImageLoadError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(imageDecodeResult.errCode), imageDecodeResult.errMsg);
        rq5.b.a(imageDecodeResult.errCode);
        java.lang.String str = this.f201469a;
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201471c;
        int i17 = this.f201470b;
        com.tencent.mm.ui.chatting.gallery.t2 t2Var = this.f201473e;
        t2Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "tryLoadBitmap after big image load error, imgPath: %s", str);
            t2Var.I(taVar, false, true);
            t2Var.f201386h.b(taVar.C, str, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ImageGalleryHolderImage", e17, "tryLoadBitmap exception", new java.lang.Object[0]);
        }
        if (imageDecodeResult.errCode == 4) {
            com.tencent.mm.ui.chatting.gallery.t2.f201381r = false;
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f201471c;
        com.tencent.mm.ui.chatting.gallery.t2 t2Var = this.f201473e;
        if (bitmap != null && t2Var.f201386h != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "onImageLoaded cache bitmap, cacheImagePath: %s", this.f201469a);
            com.tencent.mm.ui.chatting.gallery.k3 k3Var = t2Var.f201386h;
            int i17 = this.f201470b;
            if (i17 <= 0) {
                i17 = taVar.f201425c;
            }
            k3Var.d(i17, bitmap);
        }
        t2Var.I(taVar, true, false);
        if (t2Var.f201384f != null) {
            com.tencent.mm.storage.f9 f9Var = this.f201472d;
            ((com.tencent.mm.ui.chatting.gallery.b7) t2Var.f201384f).a(f9Var != null ? f9Var.getMsgId() : 0L, f9Var != null ? f9Var.Q0() : "", taVar.D, this.f201469a, bitmap);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", "BigImgOpt onPreviewLoadError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(imageDecodeResult.errCode), imageDecodeResult.errMsg);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoaded() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "SubsamplingImageView onPreviewLoaded");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mars.xlog.Log.e("MicroMsg.ImageGalleryHolderImage", "BigImgOpt onTileLoadError errCode: %d, errMsg: %s", java.lang.Integer.valueOf(imageDecodeResult.errCode), imageDecodeResult.errMsg);
        this.f201473e.p(this.f201472d, this.f201471c, this.f201470b, 5);
    }
}
