package d04;

/* loaded from: classes14.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f225415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView) {
        super(1);
        this.f225415d = scanSharedMaskView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f225415d;
            scanSharedMaskView.f159798r = bitmap;
            android.widget.ImageView imageView = scanSharedMaskView.f159793m;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("blurMaskView");
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            android.widget.ImageView imageView2 = scanSharedMaskView.f159793m;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("blurMaskView");
                throw null;
            }
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return jz5.f0.f302826a;
    }
}
