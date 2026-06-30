package s7;

/* loaded from: classes16.dex */
public abstract class v1 extends s7.x1 implements s7.t1 {

    /* renamed from: i, reason: collision with root package name */
    public java.util.Set f403861i = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f403862j = null;

    /* renamed from: k, reason: collision with root package name */
    public java.util.Set f403863k = null;

    /* renamed from: l, reason: collision with root package name */
    public java.util.Set f403864l = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.Set f403865m = null;

    @Override // s7.t1
    public java.lang.String a() {
        return this.f403862j;
    }

    @Override // s7.t1
    public void b(java.util.Set set) {
        this.f403865m = set;
    }

    @Override // s7.t1
    public void e(java.util.Set set) {
        this.f403863k = set;
    }

    @Override // s7.t1
    public java.util.Set f() {
        return this.f403864l;
    }

    @Override // s7.t1
    public java.util.Set g() {
        return this.f403863k;
    }

    @Override // s7.t1
    public java.util.Set getRequiredFeatures() {
        return this.f403861i;
    }

    @Override // s7.t1
    public void i(java.util.Set set) {
        this.f403861i = set;
    }

    @Override // s7.t1
    public void j(java.util.Set set) {
        this.f403864l = set;
    }

    @Override // s7.t1
    public void k(java.lang.String str) {
        this.f403862j = str;
    }

    @Override // s7.t1
    public java.util.Set m() {
        return this.f403865m;
    }
}
