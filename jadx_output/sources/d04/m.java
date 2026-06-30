package d04;

/* loaded from: classes13.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        super(0);
        this.f225460d = scanCodeMaskView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225460d;
        android.graphics.Bitmap bitmap = scanCodeMaskView.C1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.widget.ImageView imageView = scanCodeMaskView.I;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView.setImageBitmap(scanCodeMaskView.C1);
            android.widget.ImageView imageView2 = scanCodeMaskView.I;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView2.setAlpha(1.0f);
            android.widget.ImageView imageView3 = scanCodeMaskView.I;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView3.setVisibility(0);
            android.widget.ImageView imageView4 = scanCodeMaskView.I;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("blurView");
                throw null;
            }
            imageView4.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return jz5.f0.f302826a;
    }
}
