package d04;

/* loaded from: classes8.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f225507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f225509f;

    public t1(android.graphics.Bitmap bitmap, int i17, android.widget.ImageView imageView) {
        this.f225507d = bitmap;
        this.f225508e = i17;
        this.f225509f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f225507d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        java.util.HashMap hashMap = com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView.f159759n;
        int i17 = this.f225508e;
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        if (bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView.f159759n.put(valueOf, bitmap);
        }
        android.widget.ImageView imageView = this.f225509f;
        if (kotlin.jvm.internal.o.b(imageView.getTag(), java.lang.Integer.valueOf(i17))) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
