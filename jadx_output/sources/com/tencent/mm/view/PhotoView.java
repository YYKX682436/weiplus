package com.tencent.mm.view;

/* loaded from: classes15.dex */
public class PhotoView extends androidx.appcompat.widget.AppCompatImageView {
    public boolean A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public int F;
    public int G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.RectF f213379J;
    public android.graphics.RectF K;
    public android.graphics.RectF L;
    public android.graphics.RectF M;
    public android.graphics.RectF N;
    public android.graphics.PointF P;
    public android.graphics.PointF Q;
    public android.graphics.PointF R;
    public final ym5.j3 S;
    public android.graphics.RectF T;
    public com.tencent.mm.view.PhotoView.Info U;
    public long V;
    public java.lang.Runnable W;

    /* renamed from: f, reason: collision with root package name */
    public int f213380f;

    /* renamed from: g, reason: collision with root package name */
    public float f213381g;

    /* renamed from: h, reason: collision with root package name */
    public int f213382h;

    /* renamed from: i, reason: collision with root package name */
    public int f213383i;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.GestureDetector.OnGestureListener f213384l1;

    /* renamed from: m, reason: collision with root package name */
    public int f213385m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Matrix f213386n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Matrix f213387o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Matrix f213388p;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View.OnLongClickListener f213389p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.graphics.Rect f213390p1;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Matrix f213391q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnClickListener f213392r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView.ScaleType f213393s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f213394t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f213395u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f213396v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f213397w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f213398x;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.ScaleGestureDetector.OnScaleGestureListener f213399x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f213400y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.Runnable f213401y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f213402z;

    public PhotoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213382h = 0;
        this.f213383i = 0;
        this.f213385m = 500;
        this.f213386n = new android.graphics.Matrix();
        this.f213387o = new android.graphics.Matrix();
        this.f213388p = new android.graphics.Matrix();
        this.f213391q = new android.graphics.Matrix();
        this.E = 1.0f;
        this.f213379J = new android.graphics.RectF();
        this.K = new android.graphics.RectF();
        this.L = new android.graphics.RectF();
        this.M = new android.graphics.RectF();
        this.N = new android.graphics.RectF();
        this.P = new android.graphics.PointF();
        this.Q = new android.graphics.PointF();
        this.R = new android.graphics.PointF();
        this.S = new ym5.j3(this);
        new ym5.y2(this);
        this.f213399x0 = new ym5.z2(this);
        this.f213401y0 = new ym5.a3(this);
        this.f213384l1 = new ym5.b3(this);
        this.f213390p1 = new android.graphics.Rect();
        x();
    }

    public static void n(com.tencent.mm.view.PhotoView photoView) {
        if (photoView.f213397w) {
            return;
        }
        android.graphics.RectF rectF = photoView.f213379J;
        android.graphics.RectF rectF2 = photoView.L;
        android.graphics.RectF rectF3 = photoView.N;
        float f17 = rectF.left;
        float f18 = rectF2.left;
        if (f17 <= f18) {
            f17 = f18;
        }
        float f19 = rectF.right;
        float f27 = rectF2.right;
        if (f19 >= f27) {
            f19 = f27;
        }
        if (f17 > f19) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        float f28 = rectF.top;
        float f29 = rectF2.top;
        if (f28 <= f29) {
            f28 = f29;
        }
        float f37 = rectF.bottom;
        float f38 = rectF2.bottom;
        if (f37 >= f38) {
            f37 = f38;
        }
        if (f28 > f37) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            rectF3.set(f17, f28, f19, f37);
        }
    }

    public static int v(android.graphics.drawable.Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        return intrinsicHeight <= 0 ? drawable.getBounds().height() : intrinsicHeight;
    }

    public static int w(android.graphics.drawable.Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        return intrinsicWidth <= 0 ? drawable.getBounds().width() : intrinsicWidth;
    }

    public final void A() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        this.K.set(0.0f, 0.0f, w(drawable), v(drawable));
        this.f213386n.set(this.f213388p);
        this.f213386n.mapRect(this.K);
        this.H = this.K.width() / 2.0f;
        this.I = this.K.height() / 2.0f;
        this.E = 1.0f;
        this.F = 0;
        this.G = 0;
        this.f213387o.reset();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i17) {
        if (this.f213394t) {
            return true;
        }
        return r(i17);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i17) {
        if (this.f213394t) {
            return true;
        }
        return s(i17);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        canvas.save();
        android.graphics.RectF rectF = this.T;
        if (rectF != null) {
            canvas.clipRect(rectF);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public int getAnimaDuring() {
        return this.f213380f;
    }

    public long getDefaultAnimDuring() {
        return 200L;
    }

    public com.tencent.mm.view.PhotoView.Info getInfo() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        getGlobalVisibleRect(rect2);
        android.graphics.Rect rect3 = this.f213390p1;
        if (!rect3.isEmpty() && rect2.bottom - getHeight() < rect3.top) {
            rect2.top = rect2.bottom - getHeight();
        }
        int i17 = (int) (rect2.left + 0.5f);
        int i18 = (int) (rect2.top + 0.5f);
        android.graphics.RectF rectF = this.L;
        rect.set(((int) rectF.left) + i17, ((int) rectF.top) + i18, i17 + ((int) rectF.right), i18 + ((int) rectF.bottom));
        return new com.tencent.mm.view.PhotoView.Info(rect, this.L, this.f213379J, this.K, this.P, this.E, this.D, this.f213393s, this.f213390p1);
    }

    public float getMaxScale() {
        return this.f213381g;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (!this.f213395u) {
            super.onMeasure(i17, i18);
            return;
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        int w17 = w(drawable);
        int v17 = v(drawable);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        int i19 = layoutParams.width;
        if (i19 != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || w17 <= size) : mode == 0) {
            size = w17;
        }
        int i27 = layoutParams.height;
        if (i27 != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || v17 <= size2) : mode2 == 0) {
            size2 = v17;
        }
        if (this.f213400y) {
            float f17 = w17;
            float f18 = v17;
            float f19 = size;
            float f27 = size2;
            if (f17 / f18 != f19 / f27) {
                float f28 = f27 / f18;
                float f29 = f19 / f17;
                if (f28 >= f29) {
                    f28 = f29;
                }
                if (i19 != -1) {
                    size = (int) (f17 * f28);
                }
                if (i27 != -1) {
                    size2 = (int) (f18 * f28);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i("PhotoView", "[onSizeChanged] w:%s, h:%s, oldw:%s, oldh:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        this.f213379J.set(0.0f, 0.0f, i17, i18);
        this.P.set(i17 / 2, i18 / 2);
        if (this.f213396v) {
            return;
        }
        this.f213396v = true;
        y();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean r(float f17) {
        if (this.L.width() <= this.f213379J.width()) {
            return false;
        }
        if (f17 >= 0.0f || java.lang.Math.round(this.L.left) - f17 < this.f213379J.left) {
            return f17 <= 0.0f || ((float) java.lang.Math.round(this.L.right)) - f17 > this.f213379J.right;
        }
        return false;
    }

    public boolean s(float f17) {
        if (this.L.height() <= this.f213379J.height()) {
            return false;
        }
        if (f17 >= 0.0f || java.lang.Math.round(this.L.top) - f17 < this.f213379J.top) {
            return f17 <= 0.0f || ((float) java.lang.Math.round(this.L.bottom)) - f17 > this.f213379J.bottom;
        }
        return false;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z17) {
        super.setAdjustViewBounds(z17);
        this.f213400y = z17;
    }

    public void setAnimaDuring(int i17) {
        this.f213380f = i17;
    }

    public void setGlobalVisibleView(android.view.View view) {
        view.getGlobalVisibleRect(this.f213390p1);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        boolean z17 = false;
        if (drawable == null) {
            this.f213395u = false;
            return;
        }
        if ((drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || ((drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0))) {
            z17 = true;
        }
        if (z17) {
            if (!this.f213395u) {
                this.f213395u = true;
            }
            y();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i17) {
        android.graphics.drawable.Drawable drawable;
        try {
            drawable = getResources().getDrawable(i17);
        } catch (java.lang.Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.S.f463405s.f463296a = interpolator;
    }

    public void setMaxAnimFromWaiteTime(int i17) {
        this.f213385m = i17;
    }

    public void setMaxScale(float f17) {
        this.f213381g = f17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f213392r = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f213389p0 = onLongClickListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType scaleType) {
        if (scaleType == android.widget.ImageView.ScaleType.MATRIX || scaleType == this.f213393s) {
            return;
        }
        this.f213393s = scaleType;
        if (this.f213398x) {
            y();
        }
    }

    public final void t(android.graphics.RectF rectF) {
        float f17;
        int i17;
        int i18;
        if (rectF.width() <= this.f213379J.width()) {
            if (!(java.lang.Math.abs(((float) java.lang.Math.round(rectF.left)) - ((this.f213379J.width() - rectF.width()) / 2.0f)) < 1.0f)) {
                i17 = -((int) (((this.f213379J.width() - rectF.width()) / 2.0f) - rectF.left));
            }
            i17 = 0;
        } else {
            float f18 = rectF.left;
            android.graphics.RectF rectF2 = this.f213379J;
            float f19 = rectF2.left;
            if (f18 > f19) {
                f17 = f18 - f19;
            } else {
                float f27 = rectF.right;
                float f28 = rectF2.right;
                if (f27 < f28) {
                    f17 = f27 - f28;
                }
                i17 = 0;
            }
            i17 = (int) f17;
        }
        if (rectF.height() <= this.f213379J.height()) {
            if (!(java.lang.Math.abs(((float) java.lang.Math.round(rectF.top)) - ((this.f213379J.height() - rectF.height()) / 2.0f)) < 1.0f)) {
                i18 = -((int) (((this.f213379J.height() - rectF.height()) / 2.0f) - rectF.top));
            }
            i18 = 0;
        } else {
            float f29 = rectF.top;
            android.graphics.RectF rectF3 = this.f213379J;
            float f37 = rectF3.top;
            if (f29 > f37) {
                i18 = (int) (f29 - f37);
            } else {
                float f38 = rectF.bottom;
                float f39 = rectF3.bottom;
                if (f38 < f39) {
                    i18 = (int) (f38 - f39);
                }
                i18 = 0;
            }
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        ym5.j3 j3Var = this.S;
        if (!j3Var.f463395f.isFinished()) {
            j3Var.f463395f.abortAnimation();
        }
        j3Var.f463402p = 0;
        j3Var.f463403q = 0;
        j3Var.f463394e.startScroll(0, 0, -i17, -i18, j3Var.f463406t.f213380f);
    }

    public final void u() {
        this.f213388p.set(this.f213386n);
        this.f213388p.postConcat(this.f213387o);
        setImageMatrix(this.f213388p);
        this.f213387o.mapRect(this.L, this.K);
        this.B = this.L.width() > this.f213379J.width();
        this.C = this.L.height() > this.f213379J.height();
    }

    public final void x() {
        super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        if (this.f213393s == null) {
            this.f213393s = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        }
        new android.view.GestureDetector(getContext(), this.f213384l1);
        new android.view.ScaleGestureDetector(getContext(), this.f213399x0);
        float f17 = getResources().getDisplayMetrics().density;
        this.f213382h = (int) (30.0f * f17);
        this.f213383i = (int) (f17 * 140.0f);
        this.f213380f = 200;
        this.f213381g = 3.0f;
    }

    public final void y() {
        if (this.f213395u && this.f213396v) {
            android.graphics.RectF rectF = this.T;
            if (rectF != null) {
                rectF.setEmpty();
            }
            this.f213386n.reset();
            this.f213387o.reset();
            this.f213388p.reset();
            this.f213391q.reset();
            this.f213402z = false;
            android.graphics.drawable.Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int w17 = w(drawable);
            int v17 = v(drawable);
            float f17 = w17;
            float f18 = v17;
            this.K.set(0.0f, 0.0f, f17, f18);
            int i17 = (width - w17) / 2;
            int i18 = (height - v17) / 2;
            float f19 = w17 > width ? width / f17 : 1.0f;
            float f27 = v17 > height ? height / f18 : 1.0f;
            if (f19 >= f27) {
                f19 = f27;
            }
            this.f213386n.reset();
            this.f213386n.postTranslate(i17, i18);
            android.graphics.Matrix matrix = this.f213386n;
            android.graphics.PointF pointF = this.P;
            matrix.postScale(f19, f19, pointF.x, pointF.y);
            this.f213386n.mapRect(this.K);
            this.H = this.K.width() / 2.0f;
            this.I = this.K.height() / 2.0f;
            this.Q.set(this.P);
            this.R.set(this.Q);
            u();
            switch (ym5.c3.f463231a[this.f213393s.ordinal()]) {
                case 1:
                    if (this.f213395u && this.f213396v) {
                        android.graphics.drawable.Drawable drawable2 = getDrawable();
                        int w18 = w(drawable2);
                        int v18 = v(drawable2);
                        float f28 = w18;
                        if (f28 > this.f213379J.width() || v18 > this.f213379J.height()) {
                            float width2 = f28 / this.L.width();
                            float height2 = v18 / this.L.height();
                            if (width2 <= height2) {
                                width2 = height2;
                            }
                            this.E = width2;
                            android.graphics.Matrix matrix2 = this.f213387o;
                            android.graphics.PointF pointF2 = this.P;
                            matrix2.postScale(width2, width2, pointF2.x, pointF2.y);
                            u();
                            A();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (this.L.width() < this.f213379J.width() || this.L.height() < this.f213379J.height()) {
                        float width3 = this.f213379J.width() / this.L.width();
                        float height3 = this.f213379J.height() / this.L.height();
                        if (width3 <= height3) {
                            width3 = height3;
                        }
                        this.E = width3;
                        android.graphics.Matrix matrix3 = this.f213387o;
                        android.graphics.PointF pointF3 = this.P;
                        matrix3.postScale(width3, width3, pointF3.x, pointF3.y);
                        u();
                        A();
                        break;
                    }
                    break;
                case 3:
                    if (this.L.width() > this.f213379J.width() || this.L.height() > this.f213379J.height()) {
                        float width4 = this.f213379J.width() / this.L.width();
                        float height4 = this.f213379J.height() / this.L.height();
                        if (width4 >= height4) {
                            width4 = height4;
                        }
                        this.E = width4;
                        android.graphics.Matrix matrix4 = this.f213387o;
                        android.graphics.PointF pointF4 = this.P;
                        matrix4.postScale(width4, width4, pointF4.x, pointF4.y);
                        u();
                        A();
                        break;
                    }
                    break;
                case 4:
                    z();
                    break;
                case 5:
                    z();
                    float f29 = -this.L.top;
                    this.f213387o.postTranslate(0.0f, f29);
                    u();
                    A();
                    this.G = (int) (this.G + f29);
                    break;
                case 6:
                    z();
                    float f37 = this.f213379J.bottom - this.L.bottom;
                    this.G = (int) (this.G + f37);
                    this.f213387o.postTranslate(0.0f, f37);
                    u();
                    A();
                    break;
                case 7:
                    float width5 = this.f213379J.width() / this.L.width();
                    float height5 = this.f213379J.height() / this.L.height();
                    android.graphics.Matrix matrix5 = this.f213387o;
                    android.graphics.PointF pointF5 = this.P;
                    matrix5.postScale(width5, height5, pointF5.x, pointF5.y);
                    u();
                    A();
                    break;
            }
            this.f213398x = true;
            if (this.U != null && java.lang.System.currentTimeMillis() - this.V < this.f213385m) {
                com.tencent.mm.view.PhotoView.Info info = this.U;
                if (this.f213398x) {
                    this.f213387o.reset();
                    u();
                    this.E = 1.0f;
                    this.F = 0;
                    this.G = 0;
                    this.f213390p1.set(info.f213408i);
                    com.tencent.mm.view.PhotoView.Info info2 = getInfo();
                    android.graphics.RectF rectF2 = info.f213404e;
                    float width6 = rectF2.width() / info2.f213404e.width();
                    float height6 = rectF2.height() / info2.f213404e.height();
                    if (width6 >= height6) {
                        width6 = height6;
                    }
                    android.graphics.RectF rectF3 = info.f213403d;
                    float width7 = rectF3.left + (rectF3.width() / 2.0f);
                    float height7 = rectF3.top + (rectF3.height() / 2.0f);
                    android.graphics.RectF rectF4 = info2.f213403d;
                    float width8 = rectF4.left + (rectF4.width() / 2.0f);
                    float height8 = rectF4.top + (rectF4.height() / 2.0f);
                    this.f213387o.reset();
                    float f38 = width7 - width8;
                    float f39 = height7 - height8;
                    this.f213387o.postTranslate(f38, f39);
                    this.f213387o.postScale(width6, width6, width7, height7);
                    android.graphics.Matrix matrix6 = this.f213387o;
                    float f47 = info.f213410n;
                    matrix6.postRotate(f47, width7, height7);
                    u();
                    this.Q.set(width7, height7);
                    this.R.set(width7, height7);
                    ym5.j3 j3Var = this.S;
                    j3Var.f463402p = 0;
                    j3Var.f463403q = 0;
                    j3Var.f463394e.startScroll(0, 0, (int) (-f38), (int) (-f39), j3Var.f463406t.f213380f);
                    com.tencent.mm.view.PhotoView photoView = j3Var.f463406t;
                    j3Var.f463396g.startScroll((int) (width6 * 10000.0f), 0, (int) ((1.0f - width6) * 10000.0f), 0, photoView.f213380f);
                    int i19 = (int) f47;
                    j3Var.f463398i.startScroll(i19, 0, 0 - i19, 0, photoView.f213380f);
                    android.graphics.RectF rectF5 = info.f213405f;
                    if (rectF5.width() < rectF2.width() || rectF5.height() < rectF2.height()) {
                        float width9 = rectF5.width() / rectF2.width();
                        float height9 = rectF5.height() / rectF2.height();
                        if (width9 > 1.0f) {
                            width9 = 1.0f;
                        }
                        if (height9 > 1.0f) {
                            height9 = 1.0f;
                        }
                        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_START;
                        android.widget.ImageView.ScaleType scaleType2 = info.f213411o;
                        ym5.d3 h3Var = scaleType2 == scaleType ? new ym5.h3(this) : scaleType2 == android.widget.ImageView.ScaleType.FIT_END ? new ym5.e3(this) : new ym5.g3(this);
                        j3Var.f463397h.startScroll((int) (width9 * 10000.0f), (int) (height9 * 10000.0f), (int) ((1.0f - width9) * 10000.0f), (int) ((1.0f - height9) * 10000.0f), this.f213380f / 3);
                        j3Var.f463399m = h3Var;
                        android.graphics.Matrix matrix7 = this.f213391q;
                        android.graphics.RectF rectF6 = this.L;
                        matrix7.setScale(width9, height9, (rectF6.left + rectF6.right) / 2.0f, h3Var.a());
                        android.graphics.Matrix matrix8 = this.f213391q;
                        android.graphics.RectF rectF7 = j3Var.f463404r;
                        matrix8.mapRect(rectF7, this.L);
                        this.T = rectF7;
                    }
                    j3Var.f463393d = true;
                    photoView.post(j3Var);
                } else {
                    this.U = info;
                    this.V = java.lang.System.currentTimeMillis();
                }
            }
            this.U = null;
        }
    }

    public final void z() {
        if (this.L.width() < this.f213379J.width()) {
            float width = this.f213379J.width() / this.L.width();
            this.E = width;
            android.graphics.Matrix matrix = this.f213387o;
            android.graphics.PointF pointF = this.P;
            matrix.postScale(width, width, pointF.x, pointF.y);
            u();
            A();
        }
    }

    /* loaded from: classes14.dex */
    public static class Info implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.view.PhotoView.Info> CREATOR = new com.tencent.mm.view.a();

        /* renamed from: d, reason: collision with root package name */
        public final android.graphics.RectF f213403d;

        /* renamed from: e, reason: collision with root package name */
        public final android.graphics.RectF f213404e;

        /* renamed from: f, reason: collision with root package name */
        public final android.graphics.RectF f213405f;

        /* renamed from: g, reason: collision with root package name */
        public final android.graphics.RectF f213406g;

        /* renamed from: h, reason: collision with root package name */
        public final android.graphics.PointF f213407h;

        /* renamed from: i, reason: collision with root package name */
        public final android.graphics.Rect f213408i;

        /* renamed from: m, reason: collision with root package name */
        public final float f213409m;

        /* renamed from: n, reason: collision with root package name */
        public final float f213410n;

        /* renamed from: o, reason: collision with root package name */
        public final android.widget.ImageView.ScaleType f213411o;

        public Info(android.graphics.Rect rect, android.graphics.RectF rectF, android.graphics.RectF rectF2, android.graphics.RectF rectF3, android.graphics.PointF pointF, float f17, float f18, android.widget.ImageView.ScaleType scaleType, android.graphics.Rect rect2) {
            android.graphics.RectF rectF4 = new android.graphics.RectF();
            this.f213403d = rectF4;
            android.graphics.RectF rectF5 = new android.graphics.RectF();
            this.f213404e = rectF5;
            android.graphics.RectF rectF6 = new android.graphics.RectF();
            this.f213405f = rectF6;
            android.graphics.RectF rectF7 = new android.graphics.RectF();
            this.f213406g = rectF7;
            android.graphics.PointF pointF2 = new android.graphics.PointF();
            this.f213407h = pointF2;
            android.graphics.Rect rect3 = new android.graphics.Rect();
            this.f213408i = rect3;
            rectF4.set(rect);
            rectF5.set(rectF);
            rectF6.set(rectF2);
            this.f213409m = f17;
            this.f213411o = scaleType;
            this.f213410n = f18;
            rectF7.set(rectF3);
            pointF2.set(pointF);
            rect3.set(rect2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "Info{mRect=" + this.f213403d + ", mImgRect=" + this.f213404e + ", mWidgetRect=" + this.f213405f + ", mBaseRect=" + this.f213406g + ", mScale=" + this.f213409m + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f213403d, i17);
            parcel.writeParcelable(this.f213404e, i17);
            parcel.writeParcelable(this.f213405f, i17);
            parcel.writeParcelable(this.f213406g, i17);
            parcel.writeParcelable(this.f213407h, i17);
            parcel.writeParcelable(this.f213408i, i17);
            parcel.writeFloat(this.f213409m);
            parcel.writeFloat(this.f213410n);
            android.widget.ImageView.ScaleType scaleType = this.f213411o;
            parcel.writeInt(scaleType == null ? -1 : scaleType.ordinal());
        }

        public Info(android.os.Parcel parcel) {
            this.f213403d = new android.graphics.RectF();
            this.f213404e = new android.graphics.RectF();
            this.f213405f = new android.graphics.RectF();
            this.f213406g = new android.graphics.RectF();
            this.f213407h = new android.graphics.PointF();
            this.f213408i = new android.graphics.Rect();
            this.f213403d = (android.graphics.RectF) parcel.readParcelable(android.graphics.RectF.class.getClassLoader());
            this.f213404e = (android.graphics.RectF) parcel.readParcelable(android.graphics.RectF.class.getClassLoader());
            this.f213405f = (android.graphics.RectF) parcel.readParcelable(android.graphics.RectF.class.getClassLoader());
            this.f213406g = (android.graphics.RectF) parcel.readParcelable(android.graphics.RectF.class.getClassLoader());
            this.f213407h = (android.graphics.PointF) parcel.readParcelable(android.graphics.PointF.class.getClassLoader());
            this.f213408i = (android.graphics.Rect) parcel.readParcelable(android.graphics.Rect.class.getClassLoader());
            this.f213409m = parcel.readFloat();
            this.f213410n = parcel.readFloat();
            int readInt = parcel.readInt();
            this.f213411o = readInt == -1 ? null : android.widget.ImageView.ScaleType.values()[readInt];
        }
    }

    public PhotoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213382h = 0;
        this.f213383i = 0;
        this.f213385m = 500;
        this.f213386n = new android.graphics.Matrix();
        this.f213387o = new android.graphics.Matrix();
        this.f213388p = new android.graphics.Matrix();
        this.f213391q = new android.graphics.Matrix();
        this.E = 1.0f;
        this.f213379J = new android.graphics.RectF();
        this.K = new android.graphics.RectF();
        this.L = new android.graphics.RectF();
        this.M = new android.graphics.RectF();
        this.N = new android.graphics.RectF();
        this.P = new android.graphics.PointF();
        this.Q = new android.graphics.PointF();
        this.R = new android.graphics.PointF();
        this.S = new ym5.j3(this);
        new ym5.y2(this);
        this.f213399x0 = new ym5.z2(this);
        this.f213401y0 = new ym5.a3(this);
        this.f213384l1 = new ym5.b3(this);
        this.f213390p1 = new android.graphics.Rect();
        x();
    }
}
