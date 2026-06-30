package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes4.dex */
public final class d90 extends rj0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.WxImageView f112241a;

    public d90(com.tencent.mm.ui.base.WxImageView wxImageView) {
        this.f112241a = wxImageView;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.w("FinderLiveScreenShareWidget", "onImageLoadError, result:" + result);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        com.tencent.mm.ui.base.WxImageView wxImageView = this.f112241a;
        wxImageView.f68219h = width;
        wxImageView.f68220i = height;
        wxImageView.i();
    }

    @Override // rj0.c, com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        result.toString();
    }

    @Override // rj0.c, com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.w("FinderLiveScreenShareWidget", "onTileLoadError, result:" + result);
    }
}
