package sl1;

/* loaded from: classes5.dex */
public class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f409231a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f409232b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.RectF f409233c;

    /* renamed from: d, reason: collision with root package name */
    public float f409234d;

    /* renamed from: e, reason: collision with root package name */
    public final int f409235e = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);

    public d(android.graphics.drawable.Drawable drawable) {
        this.f409232b = drawable;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f409231a = paint;
        paint.setColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479300vg));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f409232b;
        android.graphics.Rect bounds = drawable.getBounds();
        int save = canvas.save();
        canvas.rotate(this.f409234d, ((bounds.right - bounds.left) * 0.5f) + bounds.left, ((bounds.bottom - bounds.top) * 0.5f) + bounds.top);
        canvas.drawOval(this.f409233c, this.f409231a);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f409235e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f409235e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f409232b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.drawable.Drawable drawable = this.f409232b;
        if (drawable != null) {
            drawable.setAlpha(i17);
        }
        this.f409231a.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        android.graphics.drawable.Drawable drawable = this.f409232b;
        if (drawable != null) {
            drawable.setBounds(i17, i18, i19, i27);
        }
        this.f409233c = new android.graphics.RectF(i17, i18, i19, i27);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f409231a.setColorFilter(colorFilter);
    }
}
