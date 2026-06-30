package n0;

/* loaded from: classes14.dex */
public final class x2 implements n0.e {

    /* renamed from: a, reason: collision with root package name */
    public final n0.e f333747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f333748b;

    /* renamed from: c, reason: collision with root package name */
    public int f333749c;

    public x2(n0.e applier, int i17) {
        kotlin.jvm.internal.o.g(applier, "applier");
        this.f333747a = applier;
        this.f333748b = i17;
    }

    @Override // n0.e
    public java.lang.Object a() {
        return this.f333747a.a();
    }

    @Override // n0.e
    public void b(int i17, int i18) {
        this.f333747a.b(i17 + (this.f333749c == 0 ? this.f333748b : 0), i18);
    }

    @Override // n0.e
    public void c() {
    }

    @Override // n0.e
    public void clear() {
        n0.e1.c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // n0.e
    public void d() {
    }

    @Override // n0.e
    public void e(int i17, int i18, int i19) {
        int i27 = this.f333749c == 0 ? this.f333748b : 0;
        this.f333747a.e(i17 + i27, i18 + i27, i19);
    }

    @Override // n0.e
    public void f(int i17, java.lang.Object obj) {
        this.f333747a.f(i17 + (this.f333749c == 0 ? this.f333748b : 0), obj);
    }

    @Override // n0.e
    public void g(int i17, java.lang.Object obj) {
        this.f333747a.g(i17 + (this.f333749c == 0 ? this.f333748b : 0), obj);
    }

    @Override // n0.e
    public void h(java.lang.Object obj) {
        this.f333749c++;
        this.f333747a.h(obj);
    }

    @Override // n0.e
    public void i() {
        int i17 = this.f333749c;
        if (!(i17 > 0)) {
            n0.e1.c("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.f333749c = i17 - 1;
        this.f333747a.i();
    }
}
