package wj4;

/* loaded from: classes5.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f446749a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f446750b;

    public a(float f17, int i17) {
        this.f446749a = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f446750b = paint;
        paint.setColor(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.f(getBounds(), "getBounds(...)");
        float height = r0.height() * this.f446749a;
        canvas.drawRoundRect(r0.left, r0.top, r0.right, r0.bottom, height, height, this.f446750b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f446750b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f446750b.setColorFilter(colorFilter);
    }
}
