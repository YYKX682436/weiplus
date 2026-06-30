package d04;

/* loaded from: classes13.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f225467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView, android.graphics.Bitmap bitmap, boolean z17) {
        super(0);
        this.f225466d = scanCodeMaskView;
        this.f225467e = bitmap;
        this.f225468f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225466d;
        boolean A = scanCodeMaskView.A();
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            scanCodeMaskView.C1 = com.tencent.mm.sdk.platformtools.x.W(this.f225467e, 0.1f, 10, true, 200L);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeMaskView", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = scanCodeMaskView.C1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap bitmap2 = scanCodeMaskView.C1;
            kotlin.jvm.internal.o.d(bitmap2);
            bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = scanCodeMaskView.C1;
            kotlin.jvm.internal.o.d(bitmap3);
            bitmap3.getHeight();
            if (A) {
                android.graphics.Bitmap bitmap4 = scanCodeMaskView.C1;
                kotlin.jvm.internal.o.d(bitmap4);
                int width = bitmap4.getWidth();
                android.graphics.Bitmap bitmap5 = scanCodeMaskView.C1;
                kotlin.jvm.internal.o.d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = scanCodeMaskView.getMeasuredWidth();
                int measuredHeight = scanCodeMaskView.getMeasuredHeight();
                float f17 = width;
                float f18 = height;
                float f19 = (measuredWidth * 1.0f) / measuredHeight;
                android.graphics.Point point = (f17 * 1.0f) / f18 < f19 ? width < measuredWidth ? new android.graphics.Point(width, (int) (f17 / f19)) : new android.graphics.Point(measuredWidth, measuredHeight) : height < measuredHeight ? new android.graphics.Point((int) (f19 * f18), height) : new android.graphics.Point(measuredWidth, measuredHeight);
                android.graphics.Bitmap S = com.tencent.mm.sdk.platformtools.x.S(scanCodeMaskView.C1, point.y, point.x, true, true);
                scanCodeMaskView.C1 = S;
                if (S != null) {
                    S.getWidth();
                }
                android.graphics.Bitmap bitmap6 = scanCodeMaskView.C1;
                if (bitmap6 != null) {
                    bitmap6.getHeight();
                }
            }
            d04.m mVar = new d04.m(scanCodeMaskView);
            if (this.f225468f) {
                scanCodeMaskView.post(new d04.l(mVar));
            } else {
                mVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
