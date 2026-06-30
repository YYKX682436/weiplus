package yv4;

/* loaded from: classes4.dex */
public final class i extends rj0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yv4.k f466226a;

    public i(yv4.k kVar) {
        this.f466226a = kVar;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "onImageLoadError");
        yv4.k kVar = this.f466226a;
        kVar.getClass();
        pm0.v.X(new yv4.h(false, kVar));
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CircleToSearchPreviewUIC", "onImageLoaded");
        yv4.k kVar = this.f466226a;
        kVar.getClass();
        pm0.v.X(new yv4.h(false, kVar));
    }
}
