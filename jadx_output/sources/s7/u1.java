package s7;

/* loaded from: classes16.dex */
public abstract class u1 extends s7.x1 implements s7.w1, s7.t1 {

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f403846i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public java.util.Set f403847j = null;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f403848k = null;

    /* renamed from: l, reason: collision with root package name */
    public java.util.Set f403849l = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Set f403850m = null;

    @Override // s7.t1
    public java.lang.String a() {
        return this.f403848k;
    }

    @Override // s7.t1
    public void b(java.util.Set set) {
        this.f403850m = set;
    }

    @Override // s7.w1
    public java.util.List c() {
        return this.f403846i;
    }

    @Override // s7.t1
    public void e(java.util.Set set) {
    }

    @Override // s7.t1
    public java.util.Set f() {
        return this.f403849l;
    }

    @Override // s7.t1
    public java.util.Set g() {
        return null;
    }

    @Override // s7.t1
    public java.util.Set getRequiredFeatures() {
        return this.f403847j;
    }

    public void h(s7.a2 a2Var) {
        this.f403846i.add(a2Var);
    }

    @Override // s7.t1
    public void i(java.util.Set set) {
        this.f403847j = set;
    }

    @Override // s7.t1
    public void j(java.util.Set set) {
        this.f403849l = set;
    }

    @Override // s7.t1
    public void k(java.lang.String str) {
        this.f403848k = str;
    }

    @Override // s7.t1
    public java.util.Set m() {
        return this.f403850m;
    }
}
