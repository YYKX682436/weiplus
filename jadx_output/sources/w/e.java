package w;

/* loaded from: classes13.dex */
public class e extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f441811a;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f441813c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f441814d;

    /* renamed from: e, reason: collision with root package name */
    public float f441815e;

    /* renamed from: h, reason: collision with root package name */
    public android.content.res.ColorStateList f441818h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.PorterDuffColorFilter f441819i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.res.ColorStateList f441820j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441816f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f441817g = true;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f441821k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f441812b = new android.graphics.Paint(5);

    public e(android.content.res.ColorStateList colorStateList, float f17) {
        this.f441811a = f17;
        b(colorStateList);
        this.f441813c = new android.graphics.RectF();
        this.f441814d = new android.graphics.Rect();
    }

    public final android.graphics.PorterDuffColorFilter a(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = android.content.res.ColorStateList.valueOf(0);
        }
        this.f441818h = colorStateList;
        this.f441812b.setColor(colorStateList.getColorForState(getState(), this.f441818h.getDefaultColor()));
    }

    public final void c(android.graphics.Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        android.graphics.RectF rectF = this.f441813c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect2 = this.f441814d;
        rect2.set(rect);
        if (this.f441816f) {
            float a17 = w.f.a(this.f441815e, this.f441811a, this.f441817g);
            float f17 = this.f441815e;
            float f18 = this.f441811a;
            if (this.f441817g) {
                f17 = (float) (f17 + ((1.0d - w.f.f441822a) * f18));
            }
            rect2.inset((int) java.lang.Math.ceil(f17), (int) java.lang.Math.ceil(a17));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17;
        android.graphics.Paint paint = this.f441812b;
        if (this.f441819i == null || paint.getColorFilter() != null) {
            z17 = false;
        } else {
            paint.setColorFilter(this.f441819i);
            z17 = true;
        }
        android.graphics.RectF rectF = this.f441813c;
        float f17 = this.f441811a;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        if (z17) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.f441814d, this.f441811a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2 = this.f441820j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f441818h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.content.res.ColorStateList colorStateList = this.f441818h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        android.graphics.Paint paint = this.f441812b;
        boolean z17 = colorForState != paint.getColor();
        if (z17) {
            paint.setColor(colorForState);
        }
        android.content.res.ColorStateList colorStateList2 = this.f441820j;
        if (colorStateList2 == null || (mode = this.f441821k) == null) {
            return z17;
        }
        this.f441819i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f441812b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f441812b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.f441820j = colorStateList;
        this.f441819i = a(colorStateList, this.f441821k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f441821k = mode;
        this.f441819i = a(this.f441820j, mode);
        invalidateSelf();
    }
}
