package fa;

/* loaded from: classes13.dex */
public abstract class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f260580a;

    /* renamed from: e, reason: collision with root package name */
    public float f260584e;

    /* renamed from: f, reason: collision with root package name */
    public int f260585f;

    /* renamed from: g, reason: collision with root package name */
    public int f260586g;

    /* renamed from: h, reason: collision with root package name */
    public int f260587h;

    /* renamed from: i, reason: collision with root package name */
    public int f260588i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.res.ColorStateList f260589j;

    /* renamed from: k, reason: collision with root package name */
    public int f260590k;

    /* renamed from: m, reason: collision with root package name */
    public float f260592m;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f260581b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f260582c = new android.graphics.RectF();

    /* renamed from: d, reason: collision with root package name */
    public final fa.c f260583d = new fa.c(this, null);

    /* renamed from: l, reason: collision with root package name */
    public boolean f260591l = true;

    public d() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f260580a = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17 = this.f260591l;
        android.graphics.Rect rect = this.f260581b;
        android.graphics.Paint paint = this.f260580a;
        if (z17) {
            copyBounds(rect);
            float height = this.f260584e / rect.height();
            paint.setShader(new android.graphics.LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{e3.b.g(this.f260585f, this.f260590k), e3.b.g(this.f260586g, this.f260590k), e3.b.g(e3.b.i(this.f260586g, 0), this.f260590k), e3.b.g(e3.b.i(this.f260588i, 0), this.f260590k), e3.b.g(this.f260588i, this.f260590k), e3.b.g(this.f260587h, this.f260590k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            this.f260591l = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        android.graphics.RectF rectF = this.f260582c;
        copyBounds(rect);
        rectF.set(rect);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f260592m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f260583d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f260584e > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        int round = java.lang.Math.round(this.f260584e);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.f260589j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        this.f260591l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.f260589j;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f260590k)) != this.f260590k) {
            this.f260591l = true;
            this.f260590k = colorForState;
        }
        if (this.f260591l) {
            invalidateSelf();
        }
        return this.f260591l;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f260580a.setAlpha(i17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f260580a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
