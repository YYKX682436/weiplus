package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public abstract class VerticalScrollBar extends android.view.View {
    public android.content.Context A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public float f197704d;

    /* renamed from: e, reason: collision with root package name */
    public int f197705e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f197706f;

    /* renamed from: g, reason: collision with root package name */
    public int f197707g;

    /* renamed from: h, reason: collision with root package name */
    public float f197708h;

    /* renamed from: i, reason: collision with root package name */
    public float f197709i;

    /* renamed from: m, reason: collision with root package name */
    public float f197710m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197711n;

    /* renamed from: o, reason: collision with root package name */
    public db5.d5 f197712o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f197713p;

    /* renamed from: q, reason: collision with root package name */
    public db5.o9 f197714q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Paint f197715r;

    /* renamed from: s, reason: collision with root package name */
    public int f197716s;

    /* renamed from: t, reason: collision with root package name */
    public int f197717t;

    /* renamed from: u, reason: collision with root package name */
    public int f197718u;

    /* renamed from: v, reason: collision with root package name */
    public int f197719v;

    /* renamed from: w, reason: collision with root package name */
    public int f197720w;

    /* renamed from: x, reason: collision with root package name */
    public int f197721x;

    /* renamed from: y, reason: collision with root package name */
    public int f197722y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f197723z;

    public VerticalScrollBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197709i = 0.0f;
        this.f197711n = false;
        this.B = 0;
        c();
        this.A = context;
        setFocusable(true);
        setFocusableInTouchMode(true);
        com.tencent.mm.sdk.platformtools.j.d(context, 3.0f);
        this.f197723z = android.view.View.inflate(context, getToastLayoutId(), null);
        this.f197720w = com.tencent.mm.sdk.platformtools.j.d(context, this.f197705e);
        this.f197721x = this.A.getResources().getDisplayMetrics().widthPixels;
        this.f197722y = this.A.getResources().getDisplayMetrics().heightPixels;
        android.view.View view = this.f197723z;
        int i17 = this.f197720w;
        this.f197712o = new db5.d5(view, i17, i17);
        this.f197713p = (android.widget.TextView) this.f197723z.findViewById(com.tencent.mm.R.id.mvd);
        this.f197716s = com.tencent.mm.ui.zk.c(this.A, com.tencent.mm.R.attr.f478050a);
        this.f197717t = this.A.getResources().getColor(com.tencent.mm.R.color.f479549ab0);
        this.f197718u = context.getResources().getColor(com.tencent.mm.R.color.aaq);
        this.f197719v = com.tencent.mm.ui.zk.a(getContext(), 7);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f197715r = paint;
        paint.setAntiAlias(true);
        this.B = (int) (((((java.lang.Math.max(this.f197722y, this.f197721x) - com.tencent.mm.ui.bl.a(this.A)) - com.tencent.mm.ui.bl.h(this.A)) - com.tencent.mm.ui.bl.c(this.A)) - ((int) (i65.a.f(this.A, com.tencent.mm.R.dimen.f479627b2) * i65.a.m(this.A)))) / (this.f197706f.length * this.f197704d));
    }

    public void a(android.graphics.Canvas canvas, float f17, float f18, float f19, android.graphics.Paint paint, int i17) {
        canvas.drawCircle(f17, f18, f19, paint);
    }

    public void b(android.graphics.Canvas canvas, float f17, float f18, android.graphics.Paint paint, int i17, boolean z17) {
        java.lang.String str = this.f197706f[i17];
        if (str == null) {
            return;
        }
        canvas.drawText(str, f17, f18, paint);
    }

    public abstract void c();

    public void d(java.lang.String str) {
        this.f197713p.setText(str);
    }

    public abstract int getToastLayoutId();

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int a17 = com.tencent.mm.ui.zk.a(getContext(), 9);
        float a18 = com.tencent.mm.ui.zk.a(getContext(), 11);
        this.f197708h = a18;
        int i18 = this.B;
        if (a18 > i18) {
            a18 = i18;
        }
        this.f197708h = a18;
        float f17 = a17;
        if (a18 < f17) {
            a18 = f17;
        }
        this.f197708h = a18;
        this.f197715r.setTextSize(a18);
        float f18 = this.f197709i;
        float f19 = this.f197708h;
        if (f18 != f19) {
            this.f197709i = f19;
            post(new db5.n9(this, measuredHeight, measuredWidth));
        }
        if (this.f197711n && this.f197707g != 0) {
            this.f197715r.setStyle(android.graphics.Paint.Style.FILL);
            this.f197715r.setColor(this.f197718u);
            float f27 = this.f197708h;
            a(canvas, measuredWidth / 2.0f, (f27 / 2.0f) + (this.f197707g * f27 * this.f197704d) + com.tencent.mm.ui.zk.a(this.A, 1), this.f197719v, this.f197715r, this.f197707g);
        }
        this.f197715r.setTextAlign(android.graphics.Paint.Align.CENTER);
        int i19 = 0;
        while (i19 < this.f197706f.length) {
            boolean z17 = this.f197711n;
            boolean z18 = z17 && this.f197707g == i19;
            if (z17 && (i17 = this.f197707g) != 0 && i17 == i19) {
                this.f197715r.setColor(this.f197717t);
            } else {
                this.f197715r.setColor(this.f197716s);
            }
            float f28 = this.f197708h;
            b(canvas, measuredWidth / 2, f28 + (i19 * f28 * this.f197704d), this.f197715r, i19, z18);
            i19++;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f197711n = true;
            float y17 = motionEvent.getY();
            this.f197710m = y17;
            if (y17 < 0.0f) {
                this.f197710m = 0.0f;
            }
            if (this.f197710m > getMeasuredHeight()) {
                this.f197710m = getMeasuredHeight();
            }
            int i17 = (int) (this.f197710m / (this.f197708h * this.f197704d));
            java.lang.String[] strArr = this.f197706f;
            if (i17 >= strArr.length) {
                i17 = strArr.length - 1;
            }
            this.f197707g = i17;
            if (i17 == -1) {
                d(getResources().getString(com.tencent.mm.R.string.ibx));
            } else {
                d(strArr[i17]);
            }
            int a17 = this.f197721x - com.tencent.mm.ui.zk.a(getContext(), 120);
            getLocationInWindow(new int[2]);
            float f17 = this.f197708h;
            int i18 = (int) ((((f17 / 2.0f) + ((this.f197707g * f17) * this.f197704d)) - (this.f197720w / 2.0d)) + r6[1]);
            if (motionEvent.getAction() == 0) {
                this.f197712o.showAtLocation(this, 0, a17, i18);
            }
            if (motionEvent.getAction() == 2) {
                db5.d5 d5Var = this.f197712o;
                int i19 = this.f197720w;
                d5Var.update(a17, i18, i19, i19);
            }
            db5.o9 o9Var = this.f197714q;
            if (o9Var != null) {
                int i27 = this.f197707g;
                if (i27 == -1) {
                    o9Var.Q0(i65.a.r(getContext(), com.tencent.mm.R.string.ibx));
                } else {
                    o9Var.Q0(this.f197706f[i27]);
                }
            }
            invalidate();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f197712o.dismiss();
            db5.o9 o9Var2 = this.f197714q;
            if (o9Var2 != null) {
                int i28 = this.f197707g;
                if (i28 == -1) {
                    o9Var2.O4(i65.a.r(getContext(), com.tencent.mm.R.string.ibx));
                } else {
                    o9Var2.O4(this.f197706f[i28]);
                }
            }
            this.f197711n = false;
        }
        return true;
    }

    public void setOnScrollBarTouchListener(db5.o9 o9Var) {
        this.f197714q = o9Var;
    }
}
