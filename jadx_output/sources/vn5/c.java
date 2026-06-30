package vn5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f438447a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f438448b;

    /* renamed from: c, reason: collision with root package name */
    public int f438449c;

    /* renamed from: d, reason: collision with root package name */
    public float f438450d;

    /* renamed from: e, reason: collision with root package name */
    public float f438451e;

    /* renamed from: f, reason: collision with root package name */
    public float f438452f;

    /* renamed from: g, reason: collision with root package name */
    public float f438453g;

    /* renamed from: h, reason: collision with root package name */
    public float f438454h;

    /* renamed from: i, reason: collision with root package name */
    public int f438455i;

    /* renamed from: j, reason: collision with root package name */
    public int f438456j;

    /* renamed from: k, reason: collision with root package name */
    public int f438457k;

    /* renamed from: l, reason: collision with root package name */
    public int f438458l;

    /* renamed from: m, reason: collision with root package name */
    public float f438459m;

    /* renamed from: n, reason: collision with root package name */
    public float f438460n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f438461o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f438462p;

    public c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f438447a = view;
        this.f438448b = true;
        this.f438452f = 1.0f;
        this.f438461o = jz5.h.b(vn5.a.f438445d);
        this.f438462p = jz5.h.b(vn5.b.f438446d);
    }

    public void a(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        float f19;
        float f27;
        if (!this.f438448b || canvas == null) {
            return;
        }
        android.view.View view = this.f438447a;
        this.f438459m = view.getMeasuredWidth();
        this.f438460n = view.getMeasuredHeight();
        float f28 = this.f438452f;
        float f29 = this.f438453g;
        if (f29 == 0.0f) {
            f17 = this.f438451e * f28;
            f18 = this.f438459m - f17;
        } else if (f29 < 0.0f) {
            f17 = (this.f438451e * f28) - java.lang.Math.abs(f29);
            f18 = (this.f438459m - (this.f438451e * f28)) - java.lang.Math.abs(this.f438453g);
        } else if (f29 > 0.0f) {
            float f37 = this.f438451e * f28;
            f18 = java.lang.Math.abs(f29) + (this.f438459m - f37);
            f17 = f37;
        } else {
            f17 = 0.0f;
            f18 = 0.0f;
        }
        float f38 = this.f438454h;
        if (f38 == 0.0f) {
            f19 = f28 * this.f438451e;
            f27 = this.f438460n - f19;
        } else if (f38 < 0.0f) {
            float abs = (this.f438451e * f28) - java.lang.Math.abs(f38);
            f27 = (this.f438460n - (f28 * this.f438451e)) - java.lang.Math.abs(this.f438454h);
            f19 = abs;
        } else if (f38 > 0.0f) {
            f19 = f28 * this.f438451e;
            f27 = java.lang.Math.abs(f38) + (this.f438460n - f19);
        } else {
            f19 = 0.0f;
            f27 = 0.0f;
        }
        jz5.g gVar = this.f438461o;
        android.graphics.Paint paint = (android.graphics.Paint) ((jz5.n) gVar).getValue();
        paint.setColor(this.f438449c);
        paint.setAntiAlias(true);
        if (this.f438451e > 0.0f) {
            paint.setMaskFilter(new android.graphics.BlurMaskFilter(this.f438451e, android.graphics.BlurMaskFilter.Blur.OUTER));
        }
        jz5.g gVar2 = this.f438462p;
        ((android.graphics.RectF) ((jz5.n) gVar2).getValue()).set(f17, f19, f18, f27);
        if (this.f438450d == 0.0f) {
            canvas.drawRect((android.graphics.RectF) ((jz5.n) gVar2).getValue(), (android.graphics.Paint) ((jz5.n) gVar).getValue());
            return;
        }
        android.graphics.RectF rectF = (android.graphics.RectF) ((jz5.n) gVar2).getValue();
        float f39 = this.f438450d;
        canvas.drawRoundRect(rectF, f39, f39, (android.graphics.Paint) ((jz5.n) gVar).getValue());
    }

    public final void b() {
        float f17 = this.f438453g;
        if (f17 > 0.0f) {
            this.f438456j = (int) (this.f438451e + java.lang.Math.abs(f17));
            this.f438455i = (int) this.f438451e;
        } else {
            if (f17 == 0.0f) {
                float f18 = this.f438451e;
                this.f438455i = (int) f18;
                this.f438456j = (int) f18;
            } else {
                this.f438455i = (int) (this.f438451e + java.lang.Math.abs(f17));
                this.f438456j = (int) this.f438451e;
            }
        }
        float f19 = this.f438454h;
        if (f19 > 0.0f) {
            this.f438458l = (int) (this.f438451e + java.lang.Math.abs(f19));
            this.f438457k = (int) this.f438451e;
        } else {
            if (f19 == 0.0f) {
                float f27 = this.f438451e;
                this.f438457k = (int) f27;
                this.f438458l = (int) f27;
            } else {
                this.f438457k = (int) (this.f438451e + java.lang.Math.abs(f19));
                this.f438458l = (int) this.f438451e;
            }
        }
        this.f438447a.setPadding(this.f438455i, this.f438457k, this.f438456j, this.f438458l);
    }

    public void c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.L);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f438449c = obtainStyledAttributes.getColor(2, 0);
        this.f438450d = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f438451e = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f438452f = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f438453g = obtainStyledAttributes.getDimension(4, 0.0f);
        this.f438454h = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        float f17 = this.f438450d;
        if (f17 < 0.0f) {
            this.f438450d = -f17;
        }
        float f18 = this.f438451e;
        if (f18 < 0.0f) {
            this.f438451e = -f18;
        }
        float f19 = this.f438452f;
        if (f19 < 0.0f) {
            this.f438452f = -f19;
        }
        b();
    }
}
