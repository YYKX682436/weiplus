package com.tencent.mm.plugin.location.ui;

/* loaded from: classes15.dex */
public class PoiPoint extends android.view.View {
    public final android.graphics.RectF A;
    public za3.w B;
    public za3.v C;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f144629d;

    /* renamed from: e, reason: collision with root package name */
    public final ab3.h f144630e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f144631f;

    /* renamed from: g, reason: collision with root package name */
    public int f144632g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Paint f144633h;

    /* renamed from: i, reason: collision with root package name */
    public int f144634i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f144635m;

    /* renamed from: n, reason: collision with root package name */
    public int f144636n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f144637o;

    /* renamed from: p, reason: collision with root package name */
    public int f144638p;

    /* renamed from: q, reason: collision with root package name */
    public android.animation.ValueAnimator f144639q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f144640r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f144641s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f144642t;

    /* renamed from: u, reason: collision with root package name */
    public double f144643u;

    /* renamed from: v, reason: collision with root package name */
    public double f144644v;

    /* renamed from: w, reason: collision with root package name */
    public int f144645w;

    /* renamed from: x, reason: collision with root package name */
    public int f144646x;

    /* renamed from: y, reason: collision with root package name */
    public float f144647y;

    /* renamed from: z, reason: collision with root package name */
    public int f144648z;

    public PoiPoint(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144642t = false;
        this.A = new android.graphics.RectF();
        this.B = za3.w.SIT;
        a(context);
    }

    public final void a(android.content.Context context) {
        setLayerType(1, null);
        this.f144629d = context;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f144631f = paint;
        paint.setColor(-1);
        this.f144632g = com.tencent.mm.ui.zk.a(context, 12);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f144633h = paint2;
        paint2.setColor(context.getResources().getColor(com.tencent.mm.R.color.aaq));
        int a17 = com.tencent.mm.ui.zk.a(context, 8);
        int a18 = com.tencent.mm.ui.zk.a(context, 16);
        this.f144634i = a17;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.f144635m = paint3;
        paint3.setColor(-1);
        int a19 = com.tencent.mm.ui.zk.a(context, 7);
        this.f144636n = 0;
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.f144637o = paint4;
        paint4.setColor(context.getResources().getColor(com.tencent.mm.R.color.aaq));
        this.f144637o.setStrokeWidth(com.tencent.mm.ui.zk.a(context, 4));
        int a27 = com.tencent.mm.ui.zk.a(context, 20);
        za3.t tVar = new za3.t(this);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(a17, a18);
        this.f144639q = ofInt;
        ofInt.setDuration(300L);
        this.f144639q.addUpdateListener(tVar);
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(0, a19);
        this.f144640r = ofInt2;
        ofInt2.setDuration(300L);
        this.f144640r.addUpdateListener(tVar);
        android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(0, a27);
        this.f144641s = ofInt3;
        ofInt3.setDuration(300L);
        this.f144641s.addUpdateListener(tVar);
        this.f144641s.setStartDelay(100L);
        this.f144645w = com.tencent.mm.ui.zk.a(context, 1);
        this.f144646x = com.tencent.mm.ui.zk.a(context, 4);
        this.f144647y = com.tencent.mm.ui.zk.f(context) * 2.5f;
    }

    public void b(double d17, double d18, boolean z17) {
        if (this.f144642t) {
            return;
        }
        this.f144642t = true;
        this.f144643u = d17;
        this.f144644v = d18;
        this.f144630e.addPinView(this, d17, d18);
        this.f144630e.setMarkerClickListener(this, new za3.u(this));
        if (z17) {
            c();
        }
    }

    public void c() {
        if (za3.w.SIT == this.B) {
            this.B = za3.w.STAND;
            this.f144639q.start();
            this.f144640r.start();
            this.f144641s.start();
        }
    }

    public double getLat() {
        return this.f144643u;
    }

    public double getLng() {
        return this.f144644v;
    }

    public int getPosition() {
        return this.f144648z;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float height = (getHeight() - (getWidth() / 2)) - this.f144638p;
        if (za3.w.SIT == this.B && 0.0f == this.f144639q.getAnimatedFraction()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PoiPoint", "draw shade.");
            this.f144631f.setShadowLayer(com.tencent.mm.ui.zk.a(this.f144629d, 1), 0.0f, this.f144645w, this.f144629d.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        }
        float f17 = width;
        canvas.drawCircle(f17, height, this.f144632g, this.f144631f);
        canvas.drawCircle(f17, height, this.f144634i, this.f144633h);
        canvas.drawCircle(f17, height, this.f144636n, this.f144635m);
        int i17 = this.f144646x;
        int i18 = this.f144634i;
        android.graphics.RectF rectF = this.A;
        rectF.set(f17 - (i17 / 2.0f), (i18 + height) - this.f144647y, f17 + (i17 / 2.0f), height + i18 + this.f144638p);
        float f18 = this.f144647y;
        canvas.drawRoundRect(rectF, f18, f18, this.f144637o);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        setMeasuredDimension(com.tencent.mm.ui.zk.a(this.f144629d, 32), com.tencent.mm.ui.zk.a(this.f144629d, 52));
    }

    public void setOnPointClick(za3.v vVar) {
        this.C = vVar;
    }

    public void setPosition(int i17) {
        this.f144648z = i17;
    }

    public PoiPoint(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f144642t = false;
        this.A = new android.graphics.RectF();
        this.B = za3.w.SIT;
        a(context);
    }

    public PoiPoint(android.content.Context context, ab3.h hVar) {
        super(context);
        this.f144642t = false;
        this.A = new android.graphics.RectF();
        this.B = za3.w.SIT;
        this.f144630e = hVar;
        a(context);
    }
}
