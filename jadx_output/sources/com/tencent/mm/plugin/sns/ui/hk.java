package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hk implements rj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jk f168514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f168515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f168516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f168517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f168518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bk f168519f;

    public hk(com.tencent.mm.plugin.sns.ui.bk bkVar, com.tencent.mm.plugin.sns.ui.jk jkVar, r45.jj4 jj4Var, int i17, boolean z17, boolean z18) {
        this.f168519f = bkVar;
        this.f168514a = jkVar;
        this.f168515b = jj4Var;
        this.f168516c = i17;
        this.f168517d = z17;
        this.f168518e = z18;
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsGalleryAdapter", "onImageLoadError, switch to multiTouchImageView");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f168519f;
        com.tencent.mm.plugin.sns.ui.jk jkVar = this.f168514a;
        int i17 = this.f168516c;
        r45.jj4 jj4Var = this.f168515b;
        boolean z17 = this.f168517d;
        boolean z18 = this.f168518e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        bkVar.u(jkVar, i17, jj4Var, z17, z18, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mm.plugin.sns.ui.jk jkVar = this.f168514a;
        jkVar.f169515b.setVisibility(8);
        jkVar.f169516c.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.J(this.f168519f.f167925r).put(this.f168515b.f377855d, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreviewLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreviewLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoaded() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreviewLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreviewLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreviewReleased", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreviewReleased", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReady", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReady", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(com.davemorrissey.labs.subscaleview.decoder.ImageDecodeResult imageDecodeResult) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTileLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTileLoadError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$6");
    }
}
