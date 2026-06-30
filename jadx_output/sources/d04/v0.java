package d04;

/* loaded from: classes13.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f225524e;

    public v0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, android.view.TextureView textureView) {
        this.f225523d = scanCodeProductMergeMaskView;
        this.f225524e = textureView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225523d;
            int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView.f159698a2;
            scanCodeProductMergeMaskView.M();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.graphics.Bitmap bitmap = this.f225524e.getBitmap();
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeProductMergeMaskView", "updatePreviewBitmap getBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            ((ku5.t0) ku5.t0.f312615d).B(new d04.u0(this.f225523d, bitmap));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeProductMergeMaskView", e17, "updatePreviewBitmap exception", new java.lang.Object[0]);
        }
    }
}
