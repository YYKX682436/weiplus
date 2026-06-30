package vj3;

/* loaded from: classes3.dex */
public class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f437676a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f437677b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f437678c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f437679d;

    public b(int i17, float f17) {
        this.f437676a = f17;
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.f437677b = paint;
        paint.setColor(i17);
        this.f437678c = new android.graphics.RectF();
        this.f437679d = new android.graphics.Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f437678c;
        android.graphics.Paint paint = this.f437677b;
        float f17 = this.f437676a;
        canvas.drawRoundRect(rectF, f17, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.f437679d, this.f437676a);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (rect == null) {
            rect = getBounds();
        }
        this.f437678c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f437679d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
