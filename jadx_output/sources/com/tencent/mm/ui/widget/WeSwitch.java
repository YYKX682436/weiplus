package com.tencent.mm.ui.widget;

/* loaded from: classes5.dex */
public class WeSwitch extends android.view.View implements android.view.View.OnClickListener {
    public static final /* synthetic */ int N = 0;
    public final android.graphics.RectF A;
    public int B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.os.Vibrator f211497J;
    public final android.content.Context K;
    public final al5.z4 L;
    public al5.w4 M;

    /* renamed from: d, reason: collision with root package name */
    public float f211498d;

    /* renamed from: e, reason: collision with root package name */
    public float f211499e;

    /* renamed from: f, reason: collision with root package name */
    public long f211500f;

    /* renamed from: g, reason: collision with root package name */
    public int f211501g;

    /* renamed from: h, reason: collision with root package name */
    public int f211502h;

    /* renamed from: i, reason: collision with root package name */
    public int f211503i;

    /* renamed from: m, reason: collision with root package name */
    public int f211504m;

    /* renamed from: n, reason: collision with root package name */
    public int f211505n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f211506o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f211507p;

    /* renamed from: q, reason: collision with root package name */
    public int f211508q;

    /* renamed from: r, reason: collision with root package name */
    public int f211509r;

    /* renamed from: s, reason: collision with root package name */
    public float f211510s;

    /* renamed from: t, reason: collision with root package name */
    public float f211511t;

    /* renamed from: u, reason: collision with root package name */
    public int f211512u;

    /* renamed from: v, reason: collision with root package name */
    public int f211513v;

    /* renamed from: w, reason: collision with root package name */
    public int f211514w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f211515x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f211516y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.RectF f211517z;

    public WeSwitch(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211506o = false;
        this.f211507p = false;
        this.f211515x = false;
        this.f211516y = new android.graphics.Paint(1);
        this.f211517z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = new al5.z4(this, null);
        this.K = context;
        c();
        d(context, attributeSet);
    }

    public final void a(boolean z17) {
        android.os.Vibrator vibrator = this.f211497J;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        this.f211506o = true;
        al5.z4 z4Var = this.L;
        z4Var.reset();
        android.graphics.RectF rectF = this.A;
        if (z17) {
            z4Var.f6108f = (this.f211502h - rectF.left) + this.f211509r;
            z4Var.f6106d = 1;
        } else {
            z4Var.f6108f = rectF.left;
            z4Var.f6106d = 0;
        }
        z4Var.f6107e = rectF.left;
        z4Var.setDuration((z4Var.f6108f * 150) / this.f211502h);
        startAnimation(z4Var);
    }

    public final void b(boolean z17) {
        android.graphics.RectF rectF = this.A;
        float f17 = rectF.left;
        int i17 = this.f211509r;
        if (f17 < i17) {
            rectF.left = i17;
        }
        float f18 = this.f211502h + i17;
        if (z17) {
            f18 -= getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn);
        }
        if (rectF.left > f18) {
            rectF.left = f18;
        }
        if (this.G) {
            rectF.right = rectF.left + ((int) (this.f211511t * 2.0f));
        } else {
            rectF.right = rectF.left + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho);
        }
        float dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahp) - this.f211509r;
        if (rectF.right > dimensionPixelSize) {
            rectF.right = dimensionPixelSize;
        }
    }

    public final void c() {
        this.f211509r = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        this.f211510s = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahm) / 2.0f;
        this.f211511t = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn) / 2.0f;
        this.f211512u = getResources().getColor(com.tencent.mm.R.color.ahe);
        this.f211513v = getResources().getColor(com.tencent.mm.R.color.adn);
        this.f211514w = getResources().getColor(com.tencent.mm.R.color.ado);
        getResources().getColor(com.tencent.mm.R.color.adn);
        this.C = this.f211514w;
        this.B = this.f211513v;
        this.D = this.f211512u;
        this.f211508q = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnClickListener(this);
        this.f211497J = (android.os.Vibrator) this.K.getSystemService("vibrator");
    }

    public final void d(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463107n);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yl5.a.f463097d);
        this.C = obtainStyledAttributes.getColor(2, this.f211514w);
        this.B = obtainStyledAttributes.getColor(0, this.f211513v);
        this.D = obtainStyledAttributes.getColor(4, this.f211512u);
        this.E = obtainStyledAttributes.getString(3);
        this.F = obtainStyledAttributes.getString(1);
        this.H = obtainStyledAttributes2.getBoolean(0, false);
        this.I = obtainStyledAttributes2.getBoolean(1, true);
        this.f211515x = this.H;
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    public final void e() {
        int i17 = this.f211505n;
        int i18 = this.f211504m;
        android.graphics.RectF rectF = this.A;
        if (i17 < i18) {
            float f17 = ((i18 - i17) / 2) + this.f211509r;
            rectF.top = f17;
            rectF.bottom = (f17 + i17) - (r3 * 2);
        } else {
            rectF.top = this.f211509r;
            rectF.bottom = i18 - r0;
        }
        if (!this.f211515x) {
            rectF.left = this.f211509r;
            rectF.right = ((int) (this.f211511t * 2.0f)) + r0;
        } else {
            int i19 = this.f211502h;
            int i27 = this.f211509r;
            rectF.left = i19 + i27;
            rectF.right = this.f211503i - i27;
        }
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.I;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/WeSwitch", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a(!this.f211515x);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f211507p = false;
        yj0.a.h(this, "com/tencent/mm/ui/widget/WeSwitch", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean isEnabled = isEnabled();
        android.graphics.RectF rectF = this.A;
        android.graphics.RectF rectF2 = this.f211517z;
        android.graphics.Paint paint = this.f211516y;
        if (isEnabled) {
            int i17 = this.B;
            paint.setAlpha(255);
            paint.setColor(i17);
            float f17 = this.f211510s;
            canvas.drawRoundRect(rectF2, f17, f17, paint);
            paint.setColor(this.C);
            paint.setAlpha(java.lang.Math.min(255, (int) (((rectF.left - this.f211509r) / this.f211502h) * 255.0f)));
            float f18 = this.f211510s;
            canvas.drawRoundRect(rectF2, f18, f18, paint);
        } else {
            paint.setColor(this.f211515x ? this.C : this.B);
            paint.setAlpha(this.f211515x ? 76 : 7);
            float f19 = this.f211510s;
            canvas.drawRoundRect(rectF2, f19, f19, paint);
        }
        paint.setColor(this.D);
        float f27 = this.f211511t;
        canvas.drawRoundRect(rectF, f27, f27, paint);
        if (this.E == null || this.F == null) {
            return;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(getResources().getDimension(com.tencent.mm.R.dimen.f479925j4));
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setColor(getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        paint2.setAntiAlias(true);
        int min = java.lang.Math.min(255, (int) (((rectF.left - this.f211509r) / this.f211502h) * 255.0f));
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String str = this.E;
        paint2.getTextBounds(str, 0, str.length(), rect);
        paint2.setAlpha(min);
        float a17 = (((rectF2.left + rectF2.right) / 2.0f) - this.f211511t) + com.tencent.mm.ui.zk.a(getContext(), 1);
        float height = (((rectF2.top + rectF2.bottom) / 2.0f) + (rect.height() / 2.0f)) - com.tencent.mm.ui.zk.a(getContext(), 1);
        canvas.drawText(this.E, a17, height, paint2);
        float a18 = (((rectF2.left + rectF2.right) / 2.0f) + this.f211511t) - com.tencent.mm.ui.zk.a(getContext(), 1);
        paint2.setAlpha(255 - min);
        canvas.drawText(this.F, a18, height, paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i19 - i17;
        this.f211503i = i28;
        this.f211504m = i27 - i18;
        int i29 = (i28 - ((int) (this.f211511t * 2.0f))) - (this.f211509r * 2);
        this.f211502h = i29;
        this.f211501g = i29 / 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479934je);
        this.f211505n = dimensionPixelSize;
        int i37 = this.f211504m;
        android.graphics.RectF rectF = this.f211517z;
        if (dimensionPixelSize < i37) {
            float f17 = (i37 - dimensionPixelSize) / 2;
            rectF.top = f17;
            rectF.bottom = f17 + dimensionPixelSize;
        } else {
            rectF.top = 0.0f;
            rectF.bottom = i37;
        }
        rectF.left = 0.0f;
        rectF.right = this.f211503i;
        e();
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.f211516y;
        paint.setStyle(style);
        paint.setColor(this.f211513v);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f211506o || !isEnabled()) {
            return true;
        }
        int action = motionEvent.getAction();
        android.graphics.RectF rectF = this.A;
        boolean z17 = false;
        if (action == 0) {
            clearAnimation();
            this.f211498d = motionEvent.getX();
            this.f211499e = motionEvent.getY();
            this.f211500f = android.os.SystemClock.elapsedRealtime();
            this.f211507p = false;
            if (this.f211515x) {
                rectF.left -= getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn);
            } else {
                rectF.right += getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn);
            }
            invalidate();
        } else if (action == 1) {
            if (android.os.SystemClock.elapsedRealtime() - this.f211500f < 300) {
                this.G = true;
            } else if (this.f211515x) {
                this.G = true;
            } else {
                this.G = false;
            }
            a(!this.f211515x);
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f211507p = false;
        } else if (action == 2) {
            if (this.f211507p) {
                android.view.ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                rectF.left += motionEvent.getX() - this.f211498d;
                this.G = false;
                b(true);
            } else {
                float x17 = motionEvent.getX() - this.f211498d;
                float y17 = motionEvent.getY() - this.f211499e;
                if (java.lang.Math.abs(x17) >= this.f211508q / 10.0f) {
                    if (y17 == 0.0f) {
                        y17 = 1.0f;
                    }
                    if (java.lang.Math.abs(x17 / y17) > 3.0f) {
                        z17 = true;
                    }
                }
                if (z17) {
                    this.f211507p = true;
                    android.view.ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            this.f211498d = motionEvent.getX();
            this.f211499e = motionEvent.getY();
        } else if (action == 3) {
            this.G = true;
            if (rectF.left > this.f211501g) {
                a(true);
            } else {
                a(false);
            }
            android.view.ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            this.f211507p = false;
        }
        if (this.f211507p) {
            invalidate();
        }
        return true;
    }

    public void setCheck(boolean z17) {
        if (this.f211515x != z17) {
            clearAnimation();
            this.f211515x = z17;
            e();
            this.f211506o = false;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.I = z17;
    }

    public void setOffColor(int i17) {
        this.B = i17;
    }

    public void setSwitchListener(al5.w4 w4Var) {
        this.M = w4Var;
    }

    public WeSwitch(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211506o = false;
        this.f211507p = false;
        this.f211515x = false;
        this.f211516y = new android.graphics.Paint(1);
        this.f211517z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = new al5.z4(this, null);
        this.K = context;
        c();
        d(context, attributeSet);
    }
}
