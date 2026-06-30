package fc;

/* loaded from: classes16.dex */
public abstract class b implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public transient int f260900d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f260901e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f260902f;

    /* renamed from: g, reason: collision with root package name */
    public final float f260903g = 0.8f;

    /* renamed from: h, reason: collision with root package name */
    public int f260904h;

    public b() {
        m(((int) (4 / 0.8f)) + 1);
    }

    public void clear() {
        this.f260900d = 0;
        this.f260901e = d();
        this.f260902f = 0;
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract int d();

    public final void e() {
        if (this.f260902f <= this.f260900d || d() <= 42) {
            return;
        }
        k(fc.a.a(((int) (this.f260900d / this.f260903g)) + 2));
        g(d());
    }

    public final void g(int i17) {
        this.f260904h = java.lang.Math.min(i17 - 1, (int) (i17 * this.f260903g));
        this.f260901e = i17 - this.f260900d;
        this.f260902f = 0;
    }

    public void h(int i17) {
        int i18 = this.f260904h;
        int i19 = this.f260900d;
        if (i17 > i18 - i19) {
            k(fc.a.a(((int) (i17 + (i19 / this.f260903g))) + 2));
            g(d());
        }
    }

    public boolean isEmpty() {
        return this.f260900d == 0;
    }

    public final void j(boolean z17) {
        if (z17) {
            this.f260901e--;
        } else {
            this.f260902f--;
        }
        int i17 = this.f260900d + 1;
        this.f260900d = i17;
        if (i17 > this.f260904h || this.f260901e == 0) {
            k(fc.a.a(d() << 1));
            g(d());
        }
    }

    public abstract void k(int i17);

    public abstract void l(int i17);

    public abstract int m(int i17);

    public int size() {
        return this.f260900d;
    }
}
