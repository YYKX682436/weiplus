package uj0;

/* loaded from: classes15.dex */
public class c implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rj0.b f428184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.graphics.ui.WxBaseImageView f428185b;

    public c(com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView, rj0.b bVar) {
        this.f428185b = wxBaseImageView;
        this.f428184a = bVar;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428185b;
        if (wxBaseImageView.f68225q != null) {
            wxBaseImageView.q(imageDecodeResult.errCode);
            wxBaseImageView.f68229u = true;
            wxBaseImageView.u();
        }
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onImageLoadError(imageDecodeResult);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428185b;
        if (wxBaseImageView.f68217f != null && wxBaseImageView.f68225q != null && wxBaseImageView.f68227s) {
            wxBaseImageView.q(0);
            wxBaseImageView.f68229u = true;
            wxBaseImageView.u();
        }
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onImageLoaded(bitmap);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428185b;
        if (wxBaseImageView.f68224p != null) {
            wxBaseImageView.s(imageDecodeResult.errCode);
            wxBaseImageView.f68228t = true;
            wxBaseImageView.u();
        }
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onPreviewLoadError(imageDecodeResult);
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoaded() {
        com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428185b;
        if (wxBaseImageView.f68217f != null && wxBaseImageView.f68224p != null && wxBaseImageView.f68226r) {
            wxBaseImageView.s(0);
            wxBaseImageView.f68224p.f419683h = 0;
            wxBaseImageView.f68228t = true;
            wxBaseImageView.u();
        }
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onPreviewLoaded();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxBaseImageView", "onPreviewReleased");
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onPreviewReleased();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onReady();
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mm.graphics.ui.WxBaseImageView wxBaseImageView = this.f428185b;
        if (wxBaseImageView.f68225q != null) {
            wxBaseImageView.q(imageDecodeResult.errCode);
            wxBaseImageView.f68229u = true;
            wxBaseImageView.u();
        }
        rj0.b bVar = this.f428184a;
        if (bVar != null) {
            bVar.onTileLoadError(imageDecodeResult);
        }
    }
}
