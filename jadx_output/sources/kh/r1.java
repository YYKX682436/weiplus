package kh;

/* loaded from: classes12.dex */
public final class r1 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f307902d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.x2 f307903e;

    /* renamed from: f, reason: collision with root package name */
    public final rh.x2 f307904f;

    public r1(java.lang.String name, int i17, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f307902d = name;
        this.f307903e = rh.x2.b(java.lang.Integer.valueOf(i17));
        this.f307904f = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        kh.r1 bgn = (kh.r1) d3Var;
        kotlin.jvm.internal.o.g(bgn, "bgn");
        return new kh.q1(bgn, this);
    }
}
