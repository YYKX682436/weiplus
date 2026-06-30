package com.tencent.mm.ui.widget;

/* loaded from: classes10.dex */
public class MMSwitchBtn extends android.view.View implements android.view.View.OnClickListener {
    public static final /* synthetic */ int Q = 0;
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
    public android.os.Vibrator f211345J;
    public final android.content.Context K;
    public boolean L;
    public final al5.f2 M;
    public al5.c2 N;
    public boolean P;

    /* renamed from: d, reason: collision with root package name */
    public float f211346d;

    /* renamed from: e, reason: collision with root package name */
    public float f211347e;

    /* renamed from: f, reason: collision with root package name */
    public long f211348f;

    /* renamed from: g, reason: collision with root package name */
    public int f211349g;

    /* renamed from: h, reason: collision with root package name */
    public int f211350h;

    /* renamed from: i, reason: collision with root package name */
    public int f211351i;

    /* renamed from: m, reason: collision with root package name */
    public int f211352m;

    /* renamed from: n, reason: collision with root package name */
    public int f211353n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f211354o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f211355p;

    /* renamed from: q, reason: collision with root package name */
    public int f211356q;

    /* renamed from: r, reason: collision with root package name */
    public int f211357r;

    /* renamed from: s, reason: collision with root package name */
    public float f211358s;

    /* renamed from: t, reason: collision with root package name */
    public float f211359t;

    /* renamed from: u, reason: collision with root package name */
    public int f211360u;

    /* renamed from: v, reason: collision with root package name */
    public int f211361v;

    /* renamed from: w, reason: collision with root package name */
    public int f211362w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f211363x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Paint f211364y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.RectF f211365z;

    public MMSwitchBtn(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f211354o = false;
        this.f211355p = false;
        this.f211363x = false;
        this.f211364y = new android.graphics.Paint(1);
        this.f211365z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = true;
        this.M = new al5.f2(this, null);
        this.P = false;
        this.K = context;
        c();
        e(context, attributeSet);
    }

    public final void a(boolean z17) {
        android.os.Vibrator vibrator = this.f211345J;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        boolean z18 = this.L;
        al5.f2 f2Var = this.M;
        if (!z18) {
            this.f211363x = z17;
            this.f211354o = false;
            f2Var.reset();
            f2Var.f5903d = z17 ? 1 : 0;
            f();
            invalidate();
            al5.c2 c2Var = this.N;
            if (c2Var != null) {
                c2Var.onStatusChange(this.f211363x);
                return;
            }
            return;
        }
        this.f211354o = true;
        f2Var.reset();
        android.graphics.RectF rectF = this.A;
        if (z17) {
            f2Var.f5905f = (this.f211350h - rectF.left) + this.f211357r;
            f2Var.f5903d = 1;
        } else {
            f2Var.f5905f = rectF.left;
            f2Var.f5903d = 0;
        }
        f2Var.f5904e = rectF.left;
        f2Var.setDuration((f2Var.f5905f * 150) / this.f211350h);
        startAnimation(f2Var);
    }

    public final void b(boolean z17) {
        android.graphics.RectF rectF = this.A;
        float f17 = rectF.left;
        int i17 = this.f211357r;
        if (f17 < i17) {
            rectF.left = i17;
        }
        float f18 = this.f211350h + i17;
        if (z17) {
            f18 -= getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn);
        }
        if (rectF.left > f18) {
            rectF.left = f18;
        }
        if (this.G) {
            rectF.right = rectF.left + ((int) (this.f211359t * 2.0f));
        } else {
            rectF.right = rectF.left + getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho);
        }
        float f19 = this.f211351i - this.f211357r;
        if (rectF.right > f19) {
            rectF.right = f19;
        }
    }

    public final void c() {
        this.f211357r = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        this.f211358s = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahm) / 2.0f;
        this.f211359t = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn) / 2.0f;
        this.f211360u = getResources().getColor(com.tencent.mm.R.color.ahe);
        this.f211361v = getResources().getColor(com.tencent.mm.R.color.adn);
        this.f211362w = getResources().getColor(com.tencent.mm.R.color.ado);
        getResources().getColor(com.tencent.mm.R.color.adn);
        this.C = this.f211362w;
        this.B = this.f211361v;
        this.D = this.f211360u;
        this.f211356q = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        setOnClickListener(this);
        this.f211345J = (android.os.Vibrator) this.K.getSystemService("vibrator");
    }

    public boolean d() {
        return this.f211363x;
    }

    public final void e(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463107n);
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yl5.a.f463097d);
        this.C = obtainStyledAttributes.getColor(2, this.f211362w);
        this.B = obtainStyledAttributes.getColor(0, this.f211361v);
        this.D = obtainStyledAttributes.getColor(4, this.f211360u);
        this.E = obtainStyledAttributes.getString(3);
        this.F = obtainStyledAttributes.getString(1);
        this.H = obtainStyledAttributes2.getBoolean(0, false);
        this.I = obtainStyledAttributes2.getBoolean(1, true);
        this.f211363x = this.H;
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
    }

    public final void f() {
        int i17 = this.f211353n;
        int i18 = this.f211352m;
        android.graphics.RectF rectF = this.A;
        if (i17 < i18) {
            float f17 = ((i18 - i17) / 2) + this.f211357r;
            rectF.top = f17;
            rectF.bottom = (f17 + i17) - (r3 * 2);
        } else {
            rectF.top = this.f211357r;
            rectF.bottom = i18 - r0;
        }
        if (this.f211363x) {
            float f18 = this.f211351i - this.f211357r;
            rectF.right = f18;
            rectF.left = f18 - (this.f211359t * 2.0f);
        } else {
            rectF.left = this.f211357r;
            rectF.right = ((int) (this.f211359t * 2.0f)) + r0;
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
        yj0.a.b("com/tencent/mm/ui/widget/MMSwitchBtn", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a(!this.f211363x);
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        this.f211355p = false;
        yj0.a.h(this, "com/tencent/mm/ui/widget/MMSwitchBtn", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        boolean isEnabled = isEnabled();
        android.graphics.RectF rectF = this.A;
        android.graphics.RectF rectF2 = this.f211365z;
        android.graphics.Paint paint = this.f211364y;
        if (isEnabled) {
            int i17 = this.B;
            paint.setAlpha(255);
            paint.setColor(i17);
            float f17 = this.f211358s;
            canvas.drawRoundRect(rectF2, f17, f17, paint);
            paint.setColor(this.C);
            paint.setAlpha(java.lang.Math.min(255, (int) (((rectF.left - this.f211357r) / this.f211350h) * 255.0f)));
            float f18 = this.f211358s;
            canvas.drawRoundRect(rectF2, f18, f18, paint);
        } else {
            paint.setColor(this.f211363x ? this.C : this.B);
            paint.setAlpha(this.f211363x ? 76 : 7);
            float f19 = this.f211358s;
            canvas.drawRoundRect(rectF2, f19, f19, paint);
        }
        paint.setColor(this.D);
        float f27 = this.f211359t;
        canvas.drawRoundRect(rectF, f27, f27, paint);
        if (this.E == null || this.F == null) {
            return;
        }
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(getResources().getDimension(com.tencent.mm.R.dimen.f479925j4));
        paint2.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint2.setColor(getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        paint2.setAntiAlias(true);
        int min = java.lang.Math.min(255, (int) (((rectF.left - this.f211357r) / this.f211350h) * 255.0f));
        android.graphics.Rect rect = new android.graphics.Rect();
        java.lang.String str = this.E;
        paint2.getTextBounds(str, 0, str.length(), rect);
        paint2.setAlpha(min);
        float a17 = (((rectF2.left + rectF2.right) / 2.0f) - this.f211359t) + com.tencent.mm.ui.zk.a(getContext(), 1);
        float height = (((rectF2.top + rectF2.bottom) / 2.0f) + (rect.height() / 2.0f)) - com.tencent.mm.ui.zk.a(getContext(), 1);
        canvas.drawText(this.E, a17, height, paint2);
        float a18 = (((rectF2.left + rectF2.right) / 2.0f) + this.f211359t) - com.tencent.mm.ui.zk.a(getContext(), 1);
        paint2.setAlpha(255 - min);
        canvas.drawText(this.F, a18, height, paint2);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.f211351i = i19 - i17;
        this.f211352m = i27 - i18;
        float min = java.lang.Math.min((java.lang.Math.min(r5, r4) - (this.f211357r * 2)) / 2, this.f211359t);
        this.f211359t = min;
        int i28 = (this.f211351i - ((int) (min * 2.0f))) - (this.f211357r * 2);
        this.f211350h = i28;
        this.f211349g = i28 / 2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479934je);
        this.f211353n = dimensionPixelSize;
        int i29 = this.f211352m;
        android.graphics.RectF rectF = this.f211365z;
        if (dimensionPixelSize < i29) {
            float f17 = (i29 - dimensionPixelSize) / 2;
            rectF.top = f17;
            rectF.bottom = f17 + dimensionPixelSize;
        } else {
            rectF.top = 0.0f;
            rectF.bottom = i29;
        }
        rectF.left = 0.0f;
        rectF.right = this.f211351i;
        f();
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.f211364y;
        paint.setStyle(style);
        paint.setColor(this.f211361v);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f211354o || !isEnabled()) {
            return true;
        }
        int action = motionEvent.getAction();
        android.graphics.RectF rectF = this.A;
        boolean z17 = false;
        if (action == 0) {
            clearAnimation();
            this.f211346d = motionEvent.getX();
            this.f211347e = motionEvent.getY();
            this.f211348f = android.os.SystemClock.elapsedRealtime();
            this.f211355p = false;
            if (this.f211363x) {
                rectF.left -= getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn);
            } else {
                rectF.right += getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aho) - getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ahn);
            }
            invalidate();
        } else if (action == 1) {
            if (android.os.SystemClock.elapsedRealtime() - this.f211348f < 300) {
                this.G = true;
            } else if (this.f211363x) {
                this.G = true;
            } else {
                this.G = false;
            }
            a(!this.f211363x);
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.f211355p = false;
        } else if (action == 2) {
            if (this.f211355p) {
                android.view.ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                rectF.left += motionEvent.getX() - this.f211346d;
                this.G = false;
                b(true);
            } else {
                float x17 = motionEvent.getX() - this.f211346d;
                float y17 = motionEvent.getY() - this.f211347e;
                if (java.lang.Math.abs(x17) >= this.f211356q / 10.0f) {
                    if (y17 == 0.0f) {
                        y17 = 1.0f;
                    }
                    if (java.lang.Math.abs(x17 / y17) > 3.0f) {
                        z17 = true;
                    }
                }
                if (z17) {
                    this.f211355p = true;
                    android.view.ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            this.f211346d = motionEvent.getX();
            this.f211347e = motionEvent.getY();
        } else if (action == 3) {
            this.G = true;
            if (rectF.left > this.f211349g) {
                a(true);
            } else {
                a(false);
            }
            android.view.ViewParent parent4 = getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            this.f211355p = false;
        }
        if (this.f211355p) {
            invalidate();
        }
        return true;
    }

    public void setCheck(boolean z17) {
        if (this.f211363x != z17) {
            clearAnimation();
            this.f211363x = z17;
            f();
            this.f211354o = false;
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

    public void setRemoveAnimateEndPost(boolean z17) {
        this.P = z17;
    }

    public void setSlideAnimationEnabled(boolean z17) {
        if (this.L != z17) {
            this.L = z17;
            if (z17) {
                return;
            }
            if (this.f211354o) {
                this.f211363x = this.M.f5903d == 1;
            }
            clearAnimation();
            f();
            this.f211354o = false;
            invalidate();
        }
    }

    public void setSwitchListener(al5.c2 c2Var) {
        this.N = c2Var;
    }

    public MMSwitchBtn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f211354o = false;
        this.f211355p = false;
        this.f211363x = false;
        this.f211364y = new android.graphics.Paint(1);
        this.f211365z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = true;
        this.M = new al5.f2(this, null);
        this.P = false;
        this.K = context;
        c();
        e(context, attributeSet);
    }

    public MMSwitchBtn(android.content.Context context) {
        super(context);
        this.f211354o = false;
        this.f211355p = false;
        this.f211363x = false;
        this.f211364y = new android.graphics.Paint(1);
        this.f211365z = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.G = false;
        this.H = false;
        this.I = true;
        this.L = true;
        this.M = new al5.f2(this, null);
        this.P = false;
        this.K = context;
        c();
    }
}
