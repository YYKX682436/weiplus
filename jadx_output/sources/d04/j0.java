package d04;

/* loaded from: classes13.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, boolean z17) {
        super(0);
        this.f225443d = scanCodeProductMergeMaskView;
        this.f225444e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225443d;
        android.graphics.Bitmap bitmap = scanCodeProductMergeMaskView.U1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.widget.ImageView imageView = scanCodeProductMergeMaskView.L1;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView.setImageBitmap(scanCodeProductMergeMaskView.U1);
            android.widget.ImageView imageView2 = scanCodeProductMergeMaskView.L1;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            if (this.f225444e) {
                android.widget.ImageView imageView3 = scanCodeProductMergeMaskView.J1;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView3.setImageBitmap(scanCodeProductMergeMaskView.U1);
                android.widget.ImageView imageView4 = scanCodeProductMergeMaskView.J1;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView4.setVisibility(0);
                android.widget.ImageView imageView5 = scanCodeProductMergeMaskView.J1;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView5.setAlpha(1.0f);
                android.widget.ImageView imageView6 = scanCodeProductMergeMaskView.J1;
                if (imageView6 == null) {
                    kotlin.jvm.internal.o.o("bottomBlurView");
                    throw null;
                }
                imageView6.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            scanCodeProductMergeMaskView.R1 = true;
        }
        return jz5.f0.f302826a;
    }
}
