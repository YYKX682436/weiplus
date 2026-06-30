package ux2;

/* loaded from: classes16.dex */
public final class g extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f431865a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f431866b;

    /* renamed from: c, reason: collision with root package name */
    public final int f431867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f431868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f431869e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f431870f;

    public g(android.content.Context context, int i17, float f17, float f18, float f19, int i18, float f27) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f431865a = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f431866b = paint;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.afe);
        this.f431867c = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca);
        this.f431868d = dimensionPixelSize2;
        this.f431869e = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479674cb);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.f481581d16, null);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        this.f431870f = f3.d.a(drawable, dimensionPixelSize2, dimensionPixelSize, null, 4, null);
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setShadowLayer(f27, f18, f19, i18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        float f17 = getBounds().left;
        float f18 = getBounds().top;
        float f19 = getBounds().right;
        float f27 = getBounds().bottom;
        float f28 = this.f431865a / 2.0f;
        int i17 = this.f431867c;
        android.graphics.RectF rectF = new android.graphics.RectF(f17, f18, f19, f27 - i17);
        android.graphics.Paint paint = this.f431866b;
        canvas.drawRoundRect(rectF, f28, f28, paint);
        canvas.drawBitmap(this.f431870f, (f19 - this.f431868d) - this.f431869e, f27 - i17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f431866b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f431866b.setColorFilter(colorFilter);
    }
}
