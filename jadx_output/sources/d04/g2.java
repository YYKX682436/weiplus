package d04;

/* loaded from: classes8.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f225419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f225421f;

    public g2(android.graphics.Bitmap bitmap, int i17, android.widget.ImageView imageView) {
        this.f225419d = bitmap;
        this.f225420e = i17;
        this.f225421f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f225419d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.B;
        int i18 = this.f225420e;
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.H.put(valueOf, bitmap);
        }
        android.widget.ImageView imageView = this.f225421f;
        if (kotlin.jvm.internal.o.b(imageView.getTag(), java.lang.Integer.valueOf(i18))) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
