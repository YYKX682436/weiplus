package com.tencent.mm.ui.widget;

@android.widget.RemoteViews.RemoteView
/* loaded from: classes13.dex */
public class QImageView extends android.view.View {
    public static final android.graphics.Matrix.ScaleToFit[] C = {android.graphics.Matrix.ScaleToFit.FILL, android.graphics.Matrix.ScaleToFit.START, android.graphics.Matrix.ScaleToFit.CENTER, android.graphics.Matrix.ScaleToFit.END};
    public android.graphics.PaintFlagsDrawFilter A;
    public android.graphics.PaintFlagsDrawFilter B;

    /* renamed from: d, reason: collision with root package name */
    public android.net.Uri f211379d;

    /* renamed from: e, reason: collision with root package name */
    public int f211380e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Matrix f211381f;

    /* renamed from: g, reason: collision with root package name */
    public al5.q2 f211382g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f211383h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f211384i;

    /* renamed from: m, reason: collision with root package name */
    public int f211385m;

    /* renamed from: n, reason: collision with root package name */
    public int f211386n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.ColorFilter f211387o;

    /* renamed from: p, reason: collision with root package name */
    public int f211388p;

    /* renamed from: q, reason: collision with root package name */
    public int f211389q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f211390r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.drawable.Drawable f211391s;

    /* renamed from: t, reason: collision with root package name */
    public int f211392t;

    /* renamed from: u, reason: collision with root package name */
    public int f211393u;

    /* renamed from: v, reason: collision with root package name */
    public int f211394v;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.Matrix f211395w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.RectF f211396x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.RectF f211397y;

    /* renamed from: z, reason: collision with root package name */
    public final android.content.Context f211398z;

    public QImageView(android.content.Context context) {
        super(context);
        this.f211380e = 0;
        this.f211383h = false;
        this.f211384i = false;
        this.f211385m = Integer.MAX_VALUE;
        this.f211386n = Integer.MAX_VALUE;
        this.f211388p = 255;
        this.f211389q = 256;
        this.f211390r = false;
        this.f211391s = null;
        this.f211392t = 0;
        this.f211395w = null;
        this.f211396x = new android.graphics.RectF();
        this.f211397y = new android.graphics.RectF();
        this.f211398z = context;
        h();
    }

    private void h() {
        this.f211381f = new android.graphics.Matrix();
        this.f211382g = al5.q2.FIT_CENTER;
        this.A = new android.graphics.PaintFlagsDrawFilter(0, 3);
        this.B = new android.graphics.PaintFlagsDrawFilter(0, 0);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f211391s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void f() {
        android.graphics.drawable.Drawable drawable = this.f211391s;
        if (drawable == null || !this.f211390r) {
            return;
        }
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        this.f211391s = mutate;
        mutate.setColorFilter(this.f211387o);
        this.f211391s.setAlpha((this.f211388p * this.f211389q) >> 8);
    }

    public final void g() {
        float f17;
        float f18;
        if (this.f211391s == null || !this.f211383h) {
            return;
        }
        int i17 = this.f211393u;
        int i18 = this.f211394v;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        boolean z17 = (i17 < 0 || width == i17) && (i18 < 0 || height == i18);
        if (i17 <= 0 || i18 <= 0 || al5.q2.FIT_XY == this.f211382g) {
            this.f211391s.setBounds(0, 0, width, height);
            this.f211395w = null;
            return;
        }
        this.f211391s.setBounds(0, 0, i17, i18);
        al5.q2 q2Var = al5.q2.MATRIX;
        al5.q2 q2Var2 = this.f211382g;
        if (q2Var == q2Var2) {
            if (this.f211381f.isIdentity()) {
                this.f211395w = null;
                return;
            } else {
                this.f211395w = this.f211381f;
                return;
            }
        }
        if (z17) {
            this.f211395w = null;
            return;
        }
        if (al5.q2.CENTER == q2Var2) {
            android.graphics.Matrix matrix = this.f211381f;
            this.f211395w = matrix;
            matrix.setTranslate((int) (((width - i17) * 0.5f) + 0.5f), (int) (((height - i18) * 0.5f) + 0.5f));
            return;
        }
        float f19 = 0.0f;
        if (al5.q2.CENTER_CROP == q2Var2) {
            android.graphics.Matrix matrix2 = this.f211381f;
            this.f211395w = matrix2;
            if (i17 * height > width * i18) {
                f18 = height / i18;
                float f27 = (width - (i17 * f18)) * 0.5f;
                f17 = 0.0f;
                f19 = f27;
            } else {
                float f28 = width / i17;
                f17 = (height - (i18 * f28)) * 0.5f;
                f18 = f28;
            }
            matrix2.setScale(f18, f18);
            this.f211395w.postTranslate((int) (f19 + 0.5f), (int) (f17 + 0.5f));
            return;
        }
        if (al5.q2.CENTER_INSIDE == q2Var2) {
            this.f211395w = this.f211381f;
            float min = (i17 > width || i18 > height) ? java.lang.Math.min(width / i17, height / i18) : 1.0f;
            this.f211395w.setScale(min, min);
            this.f211395w.postTranslate((int) (((width - (i17 * min)) * 0.5f) + 0.5f), (int) (((height - (i18 * min)) * 0.5f) + 0.5f));
            return;
        }
        android.graphics.RectF rectF = this.f211396x;
        rectF.set(0.0f, 0.0f, i17, i18);
        android.graphics.RectF rectF2 = this.f211397y;
        rectF2.set(0.0f, 0.0f, width, height);
        android.graphics.Matrix matrix3 = this.f211381f;
        this.f211395w = matrix3;
        matrix3.setRectToRect(rectF, rectF2, C[this.f211382g.f6001d - 1]);
    }

    @Override // android.view.View
    public int getBaseline() {
        return -1;
    }

    public android.graphics.drawable.Drawable getDrawable() {
        return this.f211391s;
    }

    public android.graphics.Matrix getImageMatrix() {
        return this.f211381f;
    }

    public al5.q2 getScaleType() {
        return this.f211382g;
    }

    public final void i() {
        android.graphics.drawable.Drawable drawable = this.f211391s;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 0) {
                intrinsicWidth = this.f211393u;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight < 0) {
                intrinsicHeight = this.f211394v;
            }
            if (intrinsicWidth == this.f211393u && intrinsicHeight == this.f211394v) {
                return;
            }
            this.f211393u = intrinsicWidth;
            this.f211394v = intrinsicHeight;
            requestLayout();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f211391s) {
            postInvalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final int j(int i17, int i18, int i19) {
        int mode = android.view.View.MeasureSpec.getMode(i19);
        int size = android.view.View.MeasureSpec.getSize(i19);
        return mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? i17 : size : java.lang.Math.min(i17, i18) : java.lang.Math.min(java.lang.Math.min(i17, size), i18);
    }

    public final void k() {
        android.content.res.Resources resources;
        if (this.f211391s == null && (resources = getResources()) != null) {
            int i17 = this.f211380e;
            android.graphics.drawable.Drawable drawable = null;
            if (i17 != 0) {
                try {
                    drawable = resources.getDrawable(i17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("ImageView", "Unable to find resource: " + this.f211380e, e17);
                    this.f211379d = null;
                }
            } else if (this.f211379d == null) {
                return;
            }
            l(drawable);
        }
    }

    public final void l(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f211391s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f211391s);
        }
        this.f211391s = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
            drawable.setLevel(this.f211392t);
            this.f211393u = drawable.getIntrinsicWidth();
            this.f211394v = drawable.getIntrinsicHeight();
            f();
            g();
        }
    }

    @Override // android.view.View
    public int[] onCreateDrawableState(int i17) {
        return super.onCreateDrawableState(i17);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        canvas.setDrawFilter(this.A);
        super.onDraw(canvas);
        if (this.f211391s == null || this.f211393u == 0 || this.f211394v == 0) {
            return;
        }
        if (this.f211395w == null && getPaddingTop() == 0 && getPaddingLeft() == 0) {
            this.f211391s.draw(canvas);
        } else {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            android.graphics.Matrix matrix = this.f211395w;
            if (matrix != null) {
                canvas.concat(matrix);
            }
            this.f211391s.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (android.os.Build.VERSION.SDK_INT > 28) {
            canvas.setDrawFilter(this.B);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f211383h = true;
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.QImageView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onSetAlpha(int i17) {
        if (getBackground() != null) {
            return false;
        }
        int i18 = i17 + (i17 >> 7);
        if (this.f211389q != i18) {
            this.f211389q = i18;
            this.f211390r = true;
            f();
        }
        return true;
    }

    public void setAdjustViewBounds(boolean z17) {
        this.f211384i = z17;
        if (z17) {
            setScaleType(al5.q2.FIT_CENTER);
        }
    }

    public void setAlpha(int i17) {
        int i18 = i17 & 255;
        if (this.f211388p != i18) {
            this.f211388p = i18;
            this.f211390r = true;
            f();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public final void setColorFilter(int i17) {
        setColorFilter(new android.graphics.PorterDuffColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP));
    }

    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.f211398z.getResources(), bitmap));
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.f211391s != drawable) {
            this.f211380e = 0;
            this.f211379d = null;
            l(drawable);
            postInvalidate();
        }
    }

    public void setImageLevel(int i17) {
        this.f211392t = i17;
        android.graphics.drawable.Drawable drawable = this.f211391s;
        if (drawable != null) {
            drawable.setLevel(i17);
            i();
        }
    }

    public void setImageMatrix(android.graphics.Matrix matrix) {
        if (matrix != null && matrix.isIdentity()) {
            matrix = null;
        }
        if ((matrix != null || this.f211381f.isIdentity()) && (matrix == null || this.f211381f.equals(matrix))) {
            return;
        }
        this.f211381f.set(matrix);
        g();
        invalidate();
    }

    public void setImageResource(int i17) {
        if (this.f211379d == null && this.f211380e == i17) {
            return;
        }
        l(null);
        this.f211380e = i17;
        this.f211379d = null;
        k();
        invalidate();
    }

    public void setImageURI(android.net.Uri uri) {
        if (this.f211380e == 0) {
            android.net.Uri uri2 = this.f211379d;
            if (uri2 == uri) {
                return;
            }
            if (uri != null && uri2 != null && uri.equals(uri2)) {
                return;
            }
        }
        l(null);
        this.f211380e = 0;
        this.f211379d = uri;
        k();
        invalidate();
    }

    @Override // android.view.View
    public void setLayerType(int i17, android.graphics.Paint paint) {
        if (!(getDrawable() instanceof android.graphics.drawable.PictureDrawable) || i17 == 1) {
            super.setLayerType(i17, paint);
        }
    }

    public void setMaxHeight(int i17) {
        this.f211386n = i17;
    }

    public void setMaxWidth(int i17) {
        this.f211385m = i17;
    }

    public void setScaleType(al5.q2 q2Var) {
        q2Var.getClass();
        if (this.f211382g != q2Var) {
            this.f211382g = q2Var;
            setWillNotCacheDrawing(q2Var == al5.q2.CENTER);
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        i();
    }

    @Override // android.view.View
    public boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return this.f211391s == drawable || super.verifyDrawable(drawable);
    }

    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.f211387o != colorFilter) {
            this.f211387o = colorFilter;
            this.f211390r = true;
            f();
            invalidate();
        }
    }

    public QImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f211398z = context;
        h();
    }

    public QImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211380e = 0;
        this.f211383h = false;
        this.f211384i = false;
        this.f211385m = Integer.MAX_VALUE;
        this.f211386n = Integer.MAX_VALUE;
        this.f211388p = 255;
        this.f211389q = 256;
        this.f211390r = false;
        this.f211391s = null;
        this.f211392t = 0;
        this.f211395w = null;
        this.f211396x = new android.graphics.RectF();
        this.f211397y = new android.graphics.RectF();
        this.f211398z = context;
        h();
        setAdjustViewBounds(false);
        setMaxWidth(Integer.MAX_VALUE);
        setMaxHeight(Integer.MAX_VALUE);
    }
}
