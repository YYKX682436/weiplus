package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes13.dex */
public class p4 extends android.graphics.drawable.Drawable {

    /* renamed from: c, reason: collision with root package name */
    public static final android.graphics.Paint f191834c = new android.graphics.Paint(6);

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f191835a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f191836b = new java.lang.ref.WeakReference(null);

    public static void a(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        com.tencent.mm.pluginsdk.ui.tools.p4 p4Var = imageView.getDrawable() instanceof com.tencent.mm.pluginsdk.ui.tools.p4 ? (com.tencent.mm.pluginsdk.ui.tools.p4) imageView.getDrawable() : new com.tencent.mm.pluginsdk.ui.tools.p4();
        p4Var.getClass();
        p4Var.f191836b = new java.lang.ref.WeakReference(bitmap);
        imageView.getScaleType();
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
        imageView.getScaleType();
        android.widget.ImageView.ScaleType scaleType2 = android.widget.ImageView.ScaleType.CENTER_CROP;
        imageView.setImageDrawable(p4Var);
        imageView.postInvalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f191836b.get();
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        android.graphics.Rect rect = this.f191835a;
        copyBounds(rect);
        canvas.drawBitmap(bitmap, (android.graphics.Rect) null, rect, f191834c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
