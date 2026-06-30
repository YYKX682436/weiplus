package f3;

/* loaded from: classes13.dex */
public abstract class j extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f259246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f259247b;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.BitmapShader f259250e;

    /* renamed from: g, reason: collision with root package name */
    public float f259252g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f259256k;

    /* renamed from: l, reason: collision with root package name */
    public int f259257l;

    /* renamed from: m, reason: collision with root package name */
    public int f259258m;

    /* renamed from: c, reason: collision with root package name */
    public final int f259248c = 119;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f259249d = new android.graphics.Paint(3);

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f259251f = new android.graphics.Matrix();

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f259253h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f259254i = new android.graphics.RectF();

    /* renamed from: j, reason: collision with root package name */
    public boolean f259255j = true;

    public j(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        this.f259247b = 160;
        if (resources != null) {
            this.f259247b = resources.getDisplayMetrics().densityDpi;
        }
        this.f259246a = bitmap;
        if (bitmap == null) {
            this.f259258m = -1;
            this.f259257l = -1;
            this.f259250e = null;
        } else {
            int i17 = this.f259247b;
            this.f259257l = bitmap.getScaledWidth(i17);
            this.f259258m = bitmap.getScaledHeight(i17);
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
            this.f259250e = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public abstract void a(int i17, int i18, int i19, android.graphics.Rect rect, android.graphics.Rect rect2);

    public void b(boolean z17) {
        this.f259256k = z17;
        this.f259255j = true;
        if (!z17) {
            c(0.0f);
            return;
        }
        this.f259252g = java.lang.Math.min(this.f259258m, this.f259257l) / 2;
        this.f259249d.setShader(this.f259250e);
        invalidateSelf();
    }

    public void c(float f17) {
        if (this.f259252g == f17) {
            return;
        }
        this.f259256k = false;
        boolean z17 = f17 > 0.05f;
        android.graphics.Paint paint = this.f259249d;
        if (z17) {
            paint.setShader(this.f259250e);
        } else {
            paint.setShader(null);
        }
        this.f259252g = f17;
        invalidateSelf();
    }

    public void d() {
        if (this.f259255j) {
            boolean z17 = this.f259256k;
            android.graphics.Rect rect = this.f259253h;
            if (z17) {
                int min = java.lang.Math.min(this.f259257l, this.f259258m);
                a(this.f259248c, min, min, getBounds(), this.f259253h);
                int min2 = java.lang.Math.min(rect.width(), rect.height());
                rect.inset(java.lang.Math.max(0, (rect.width() - min2) / 2), java.lang.Math.max(0, (rect.height() - min2) / 2));
                this.f259252g = min2 * 0.5f;
            } else {
                a(this.f259248c, this.f259257l, this.f259258m, getBounds(), this.f259253h);
            }
            android.graphics.RectF rectF = this.f259254i;
            rectF.set(rect);
            android.graphics.BitmapShader bitmapShader = this.f259250e;
            if (bitmapShader != null) {
                android.graphics.Matrix matrix = this.f259251f;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                android.graphics.Bitmap bitmap = this.f259246a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f259249d.setShader(bitmapShader);
            }
            this.f259255j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f259246a;
        if (bitmap == null) {
            return;
        }
        d();
        android.graphics.Paint paint = this.f259249d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, this.f259253h, paint);
            return;
        }
        android.graphics.RectF rectF = this.f259254i;
        float f17 = this.f259252g;
        canvas.drawRoundRect(rectF, f17, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f259249d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        return this.f259249d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f259258m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f259257l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.Bitmap bitmap;
        if (this.f259248c == 119 && !this.f259256k && (bitmap = this.f259246a) != null && !bitmap.hasAlpha() && this.f259249d.getAlpha() >= 255) {
            if (!(this.f259252g > 0.05f)) {
                return -1;
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (this.f259256k) {
            this.f259252g = java.lang.Math.min(this.f259258m, this.f259257l) / 2;
        }
        this.f259255j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        android.graphics.Paint paint = this.f259249d;
        if (i17 != paint.getAlpha()) {
            paint.setAlpha(i17);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f259249d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z17) {
        this.f259249d.setDither(z17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z17) {
        this.f259249d.setFilterBitmap(z17);
        invalidateSelf();
    }
}
