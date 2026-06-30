package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class t1 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214637b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.g1 f214638c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f214639d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f214640e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f214641f;

    /* renamed from: a, reason: collision with root package name */
    public int f214636a = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.r1 f214642g = new com.tencent.mm.xcompat.recyclerview.widget.r1(0, 0);

    public void a(int i17, int i18) {
        java.lang.Object obj;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214637b;
        if (this.f214636a == -1 || recyclerView == null) {
            c();
        }
        if (this.f214639d && this.f214641f == null && (obj = this.f214638c) != null) {
            android.graphics.PointF I = obj instanceof com.tencent.mm.xcompat.recyclerview.widget.s1 ? ((com.tencent.mm.xcompat.recyclerview.widget.e0) ((com.tencent.mm.xcompat.recyclerview.widget.s1) obj)).I(this.f214636a) : null;
            if (I != null) {
                float f17 = I.x;
                if (f17 != 0.0f || I.y != 0.0f) {
                    recyclerView.a0((int) java.lang.Math.signum(f17), (int) java.lang.Math.signum(I.y), null);
                }
            }
        }
        this.f214639d = false;
        android.view.View view = this.f214641f;
        com.tencent.mm.xcompat.recyclerview.widget.r1 r1Var = this.f214642g;
        if (view != null) {
            this.f214637b.getClass();
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(view);
            if ((K != null ? K.e() : -1) == this.f214636a) {
                b(this.f214641f, recyclerView.F1, r1Var);
                r1Var.a(recyclerView);
                c();
            } else {
                this.f214641f = null;
            }
        }
        if (this.f214640e) {
            com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var = recyclerView.F1;
            com.tencent.mm.xcompat.recyclerview.widget.f0 f0Var = (com.tencent.mm.xcompat.recyclerview.widget.f0) this;
            if (f0Var.f214637b.f214413t.h() == 0) {
                f0Var.c();
            } else {
                int i19 = f0Var.f214516n;
                int i27 = i19 - i17;
                if (i19 * i27 <= 0) {
                    i27 = 0;
                }
                f0Var.f214516n = i27;
                int i28 = f0Var.f214517o;
                int i29 = i28 - i18;
                if (i28 * i29 <= 0) {
                    i29 = 0;
                }
                f0Var.f214517o = i29;
                if (i27 == 0 && i29 == 0) {
                    int i37 = f0Var.f214636a;
                    java.lang.Object obj2 = f0Var.f214638c;
                    android.graphics.PointF I2 = obj2 instanceof com.tencent.mm.xcompat.recyclerview.widget.s1 ? ((com.tencent.mm.xcompat.recyclerview.widget.e0) ((com.tencent.mm.xcompat.recyclerview.widget.s1) obj2)).I(i37) : null;
                    if (I2 != null) {
                        if (I2.x != 0.0f || I2.y != 0.0f) {
                            float f18 = I2.y;
                            float sqrt = (float) java.lang.Math.sqrt((r9 * r9) + (f18 * f18));
                            float f19 = I2.x / sqrt;
                            I2.x = f19;
                            float f27 = I2.y / sqrt;
                            I2.y = f27;
                            f0Var.f214512j = I2;
                            f0Var.f214516n = (int) (f19 * 10000.0f);
                            f0Var.f214517o = (int) (f27 * 10000.0f);
                            int f28 = f0Var.f(10000);
                            int i38 = (int) (f0Var.f214516n * 1.2f);
                            int i39 = (int) (f0Var.f214517o * 1.2f);
                            android.view.animation.LinearInterpolator linearInterpolator = f0Var.f214510h;
                            r1Var.f214624a = i38;
                            r1Var.f214625b = i39;
                            r1Var.f214626c = (int) (f28 * 1.2f);
                            r1Var.f214628e = linearInterpolator;
                            r1Var.f214629f = true;
                        }
                    }
                    r1Var.f214627d = f0Var.f214636a;
                    f0Var.c();
                }
            }
            boolean z17 = r1Var.f214627d >= 0;
            r1Var.a(recyclerView);
            if (z17 && this.f214640e) {
                this.f214639d = true;
                recyclerView.C1.b();
            }
        }
    }

    public abstract void b(android.view.View view, com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var, com.tencent.mm.xcompat.recyclerview.widget.r1 r1Var);

    public final void c() {
        if (this.f214640e) {
            this.f214640e = false;
            com.tencent.mm.xcompat.recyclerview.widget.f0 f0Var = (com.tencent.mm.xcompat.recyclerview.widget.f0) this;
            f0Var.f214517o = 0;
            f0Var.f214516n = 0;
            f0Var.f214512j = null;
            this.f214637b.F1.f214646a = -1;
            this.f214641f = null;
            this.f214636a = -1;
            this.f214639d = false;
            com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214638c;
            if (g1Var.f214525e == this) {
                g1Var.f214525e = null;
            }
            this.f214638c = null;
            this.f214637b = null;
        }
    }
}
