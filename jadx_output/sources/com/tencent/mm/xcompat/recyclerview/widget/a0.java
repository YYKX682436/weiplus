package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.xcompat.recyclerview.widget.k0 f214444a;

    /* renamed from: b, reason: collision with root package name */
    public int f214445b;

    /* renamed from: c, reason: collision with root package name */
    public int f214446c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f214447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f214448e;

    public a0() {
        d();
    }

    public void a() {
        this.f214446c = this.f214447d ? this.f214444a.f() : this.f214444a.i();
    }

    public void b(android.view.View view, int i17) {
        if (this.f214447d) {
            int a17 = this.f214444a.a(view);
            com.tencent.mm.xcompat.recyclerview.widget.k0 k0Var = this.f214444a;
            this.f214446c = a17 + (Integer.MIN_VALUE == k0Var.f214559b ? 0 : k0Var.j() - k0Var.f214559b);
        } else {
            this.f214446c = this.f214444a.d(view);
        }
        this.f214445b = i17;
    }

    public void c(android.view.View view, int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.k0 k0Var = this.f214444a;
        int j17 = Integer.MIN_VALUE == k0Var.f214559b ? 0 : k0Var.j() - k0Var.f214559b;
        if (j17 >= 0) {
            b(view, i17);
            return;
        }
        this.f214445b = i17;
        if (!this.f214447d) {
            int d17 = this.f214444a.d(view);
            int i18 = d17 - this.f214444a.i();
            this.f214446c = d17;
            if (i18 > 0) {
                int f17 = (this.f214444a.f() - java.lang.Math.min(0, (this.f214444a.f() - j17) - this.f214444a.a(view))) - (d17 + this.f214444a.b(view));
                if (f17 < 0) {
                    this.f214446c -= java.lang.Math.min(i18, -f17);
                    return;
                }
                return;
            }
            return;
        }
        int f18 = (this.f214444a.f() - j17) - this.f214444a.a(view);
        this.f214446c = this.f214444a.f() - f18;
        if (f18 > 0) {
            int b17 = this.f214446c - this.f214444a.b(view);
            int i19 = this.f214444a.i();
            int min = b17 - (i19 + java.lang.Math.min(this.f214444a.d(view) - i19, 0));
            if (min < 0) {
                this.f214446c += java.lang.Math.min(f18, -min);
            }
        }
    }

    public void d() {
        this.f214445b = -1;
        this.f214446c = Integer.MIN_VALUE;
        this.f214447d = false;
        this.f214448e = false;
    }

    public java.lang.String toString() {
        return "AnchorInfo{mPosition=" + this.f214445b + ", mCoordinate=" + this.f214446c + ", mLayoutFromEnd=" + this.f214447d + ", mValid=" + this.f214448e + '}';
    }
}
