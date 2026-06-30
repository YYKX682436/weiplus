package com.tencent.wemagic.coverview.view;

/* loaded from: classes3.dex */
public class CoverViewContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f220088d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f220089e;

    /* renamed from: f, reason: collision with root package name */
    public float f220090f;

    /* renamed from: g, reason: collision with root package name */
    public int f220091g;

    /* renamed from: h, reason: collision with root package name */
    public int f220092h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f220093i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f220094m;

    /* renamed from: n, reason: collision with root package name */
    public int f220095n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f220096o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f220097p;

    public CoverViewContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        a();
    }

    private android.graphics.drawable.Drawable getShadowDrawable() {
        int i17;
        int i18 = this.f220092h;
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f220096o;
        if (i18 != 0) {
            gradientDrawable.setColor(i18);
        }
        float[] fArr = this.f220089e;
        float f17 = fArr[0];
        float[] fArr2 = this.f220097p;
        fArr2[0] = f17;
        fArr2[1] = fArr[0];
        float f18 = fArr[1];
        fArr2[2] = f18;
        fArr2[3] = f18;
        float f19 = fArr[3];
        fArr2[4] = f19;
        fArr2[5] = f19;
        float f27 = fArr[2];
        fArr2[6] = f27;
        fArr2[7] = f27;
        gradientDrawable.setCornerRadii(fArr2);
        float f28 = this.f220090f;
        if (f28 > 0.0f && (i17 = this.f220091g) != 0) {
            gradientDrawable.setStroke((int) f28, i17);
        }
        return gradientDrawable;
    }

    public void a() {
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f220093i;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        setWillNotDraw(false);
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        if (this.f220095n == 0) {
            this.f220095n = windowManager.getDefaultDisplay().getWidth();
            windowManager.getDefaultDisplay().getHeight();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (i17 < 0) {
            i17 = 0;
        } else if (i17 > getChildCount() - 1) {
            i17 = getChildCount() - 1;
        }
        super.addView(view, i17 + 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean z17 = true;
        boolean contains = new android.graphics.RectF(iArr[0], iArr[1], r5 + getWidth(), iArr[1] + getHeight()).contains(rawX, rawY);
        if (motionEvent.getActionMasked() == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            float f17 = this.f220088d;
            if (f17 > 0.0f) {
                double pow = java.lang.Math.pow(f17, 2.0d);
                float width = getWidth();
                float height = getHeight();
                float f18 = this.f220088d;
                if (x17 >= f18 ? !(x17 <= width - f18 || (y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow((y17 + this.f220088d) - height, 2.0d) <= pow : java.lang.Math.pow((x17 + f18) - width, 2.0d) + java.lang.Math.pow(this.f220088d - y17, 2.0d) <= pow)) : !(y17 >= f18 ? y17 <= height - f18 || java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow((y17 + this.f220088d) - height, 2.0d) <= pow : java.lang.Math.pow(f18 - x17, 2.0d) + java.lang.Math.pow(this.f220088d - y17, 2.0d) <= pow)) {
                    z17 = false;
                }
            }
            if (!z17 && !contains) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        float[] fArr = this.f220089e;
        if (fArr != null && fArr.length > 0) {
            super.draw(canvas);
            return;
        }
        float f17 = 0.0f;
        boolean z17 = true;
        boolean z18 = this.f220088d > 0.0f;
        if (z18) {
            canvas.save();
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f18 = this.f220088d;
            path.addRoundRect(rectF, f18, f18, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        int i17 = this.f220092h;
        if (i17 != 0) {
            canvas.drawColor(i17);
        }
        float f19 = this.f220090f;
        if (f19 > 0.0f) {
            float f27 = f19 / 2.0f;
            android.graphics.RectF rectF2 = new android.graphics.RectF(f27, f27, getWidth() - f27, getHeight() - f27);
            float f28 = this.f220088d;
            canvas.drawRoundRect(rectF2, f28, f28, this.f220093i);
            if (z18) {
                canvas.restore();
            }
            canvas.save();
            android.graphics.Path path2 = new android.graphics.Path();
            float f29 = this.f220088d;
            if (f29 > 0.0f) {
                float f37 = this.f220090f;
                if (f29 - f37 > 0.0f) {
                    f17 = f29 - f37;
                }
            }
            float f38 = this.f220090f;
            path2.addRoundRect(new android.graphics.RectF(f38, f38, getWidth() - this.f220090f, getHeight() - this.f220090f), f17, f17, android.graphics.Path.Direction.CW);
            canvas.clipPath(path2);
        } else {
            z17 = z18;
        }
        super.draw(canvas);
        if (z17) {
            canvas.restore();
        }
    }

    public void setBgColor(int i17) {
        this.f220092h = i17;
    }

    public void setBorderColor(int i17) {
        this.f220091g = i17;
        this.f220093i.setColor(i17);
    }

    public void setBorderRadius(float f17) {
        this.f220088d = f17;
    }

    public void setBorderWidth(float f17) {
        this.f220090f = f17;
        this.f220093i.setStrokeWidth(f17);
    }

    public void setIsInterceptEvent(boolean z17) {
    }

    public void setOnCustomerClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public void setTargetView(android.view.View view) {
        this.f220094m = view;
        super.addView(view, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public void setViewId(int i17) {
    }

    public void setBorderRadius(float[] fArr) {
        this.f220089e = fArr;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        setBackground(getShadowDrawable());
    }

    public CoverViewContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220093i = new android.graphics.Paint();
        this.f220095n = 0;
        this.f220096o = new android.graphics.drawable.GradientDrawable();
        this.f220097p = new float[8];
        new java.util.HashMap();
        a();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (i17 < 0) {
            i17 = 0;
        } else if (i17 > getChildCount() - 1) {
            i17 = getChildCount() - 1;
        }
        super.addView(view, i17 + 1, layoutParams);
    }
}
