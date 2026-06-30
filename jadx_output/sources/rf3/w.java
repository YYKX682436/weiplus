package rf3;

/* loaded from: classes12.dex */
public final class w implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.image.SwitchableImageContainer f395010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f395011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf3.g f395012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf3.g f395013d;

    public w(com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer, java.lang.String str, sf3.g gVar, sf3.g gVar2) {
        this.f395010a = switchableImageContainer;
        this.f395011b = str;
        this.f395012c = gVar;
        this.f395013d = gVar2;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult result) {
        sf3.g gVar = this.f395012c;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.errCode);
        java.lang.String errMsg = result.errMsg;
        kotlin.jvm.internal.o.f(errMsg, "errMsg");
        java.lang.Object[] objArr = {valueOf, errMsg};
        int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
        com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer = this.f395010a;
        switchableImageContainer.h("onImageLoadError errCode: %d, errMsg: %s", objArr);
        rq5.b.a(result.errCode);
        try {
            switchableImageContainer.i("tryLoadBitmap after big image load error, default imgPath: " + gVar.c(), new java.lang.Object[0]);
            sf3.d dVar = switchableImageContainer.innerLoader;
            if (dVar != null) {
                dVar.b(gVar, new rf3.x(switchableImageContainer));
            }
        } catch (java.lang.Exception e17) {
            switchableImageContainer.h("tryLoadBitmap exception", e17);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        java.lang.Object[] objArr = {this.f395011b};
        int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
        com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer = this.f395010a;
        switchableImageContainer.i("onImageLoaded cache bitmap, cacheImagePath: %s", objArr);
        switchableImageContainer.j(true, false);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.errCode);
        java.lang.String errMsg = result.errMsg;
        kotlin.jvm.internal.o.f(errMsg, "errMsg");
        java.lang.Object[] objArr = {valueOf, errMsg};
        int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
        this.f395010a.h("onPreviewLoadError errCode: %d, errMsg: %s", objArr);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoaded() {
        int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
        this.f395010a.i("onPreviewLoaded", new java.lang.Object[0]);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
        int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
        com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer = this.f395010a;
        switchableImageContainer.i("onReady", new java.lang.Object[0]);
        switchableImageContainer.j(true, false);
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult result) {
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.errCode);
        java.lang.String errMsg = result.errMsg;
        kotlin.jvm.internal.o.f(errMsg, "errMsg");
        java.lang.Object[] objArr = {valueOf, errMsg};
        int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
        com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer = this.f395010a;
        switchableImageContainer.h("onTileLoadError errCode: %d, errMsg: %s", objArr);
        rf3.v vVar = switchableImageContainer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (vVar != null) {
            vVar.z(this.f395013d);
        }
    }
}
