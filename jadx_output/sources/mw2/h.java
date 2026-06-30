package mw2;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw2.j f331718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw2.e f331719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f331720f;

    public h(mw2.j jVar, mw2.e eVar, android.graphics.Bitmap bitmap) {
        this.f331718d = jVar;
        this.f331719e = eVar;
        this.f331720f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        float width;
        float height;
        mw2.j jVar = this.f331718d;
        if (jVar.f331725d == 0) {
            com.tencent.mars.xlog.Log.i("FinderSpritePreviewController", "Skip sprite preview because progress is already 0");
            return;
        }
        mw2.e eVar = this.f331719e;
        if (eVar.f331711c <= 0 || eVar.f331712d <= 0 || jVar.f331723b.getWidth() <= 0 || jVar.f331723b.getHeight() <= 0) {
            com.tencent.mars.xlog.Log.w("FinderSpritePreviewController", "Invalid dimensions for matrix transform");
            return;
        }
        android.graphics.Bitmap bitmap = jVar.f331728g;
        android.graphics.Bitmap bitmap2 = this.f331720f;
        if (!kotlin.jvm.internal.o.b(bitmap, bitmap2)) {
            jVar.f331723b.setImageBitmap(bitmap2);
            jVar.f331728g = bitmap2;
        }
        android.widget.ImageView imageView = jVar.f331723b;
        jVar.getClass();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (eVar.f331711c <= 0 || (i17 = eVar.f331712d) <= 0 || imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            com.tencent.mars.xlog.Log.w("FinderSpritePreviewController", "Invalid dimensions for matrix transform");
        } else {
            float f17 = eVar.f331711c;
            float f18 = i17;
            float f19 = 0.0f;
            if (f17 / f18 > imageView.getWidth() / imageView.getHeight()) {
                width = imageView.getHeight() / f18;
                float width2 = (imageView.getWidth() - (f17 * width)) / 2.0f;
                height = 0.0f;
                f19 = width2;
            } else {
                width = imageView.getWidth() / f17;
                height = (imageView.getHeight() - (f18 * width)) / 2.0f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((-eVar.f331709a) * width, (-eVar.f331710b) * width);
            matrix.postTranslate(f19, height);
            imageView.setImageMatrix(matrix);
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        }
        jVar.f331723b.setAlpha(1.0f);
    }
}
