package d04;

/* loaded from: classes13.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f225451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, android.graphics.Bitmap bitmap, boolean z17) {
        super(0);
        this.f225450d = scanCodeProductMergeMaskView;
        this.f225451e = bitmap;
        this.f225452f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225450d;
        boolean A = scanCodeProductMergeMaskView.A();
        boolean A2 = scanCodeProductMergeMaskView.A();
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            scanCodeProductMergeMaskView.U1 = com.tencent.mm.sdk.platformtools.x.W(this.f225451e, 0.1f, 10, true, 200L);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeProductMergeMaskView", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeProductMergeMaskView", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = scanCodeProductMergeMaskView.U1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap bitmap2 = scanCodeProductMergeMaskView.U1;
            kotlin.jvm.internal.o.d(bitmap2);
            bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = scanCodeProductMergeMaskView.U1;
            kotlin.jvm.internal.o.d(bitmap3);
            bitmap3.getHeight();
            if (A) {
                android.graphics.Bitmap bitmap4 = scanCodeProductMergeMaskView.U1;
                kotlin.jvm.internal.o.d(bitmap4);
                int width = bitmap4.getWidth();
                android.graphics.Bitmap bitmap5 = scanCodeProductMergeMaskView.U1;
                kotlin.jvm.internal.o.d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = scanCodeProductMergeMaskView.getMeasuredWidth();
                int measuredHeight = scanCodeProductMergeMaskView.getMeasuredHeight();
                float f17 = width;
                float f18 = height;
                float f19 = (measuredWidth * 1.0f) / measuredHeight;
                android.graphics.Point point = (f17 * 1.0f) / f18 < f19 ? width < measuredWidth ? new android.graphics.Point(width, (int) (f17 / f19)) : new android.graphics.Point(measuredWidth, measuredHeight) : height < measuredHeight ? new android.graphics.Point((int) (f19 * f18), height) : new android.graphics.Point(measuredWidth, measuredHeight);
                android.graphics.Bitmap S = com.tencent.mm.sdk.platformtools.x.S(scanCodeProductMergeMaskView.U1, point.y, point.x, true, true);
                scanCodeProductMergeMaskView.U1 = S;
                if (S != null) {
                    S.getWidth();
                }
                android.graphics.Bitmap bitmap6 = scanCodeProductMergeMaskView.U1;
                if (bitmap6 != null) {
                    bitmap6.getHeight();
                }
            }
            d04.j0 j0Var = new d04.j0(scanCodeProductMergeMaskView, A2);
            if (this.f225452f) {
                scanCodeProductMergeMaskView.post(new d04.i0(j0Var));
            } else {
                j0Var.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
