package cr0;

/* loaded from: classes12.dex */
public final class r extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221725d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.x2 f221726e;

    /* renamed from: f, reason: collision with root package name */
    public final rh.x2 f221727f;

    public r(java.lang.String name, int i17, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f221725d = name;
        this.f221726e = rh.x2.b(java.lang.Integer.valueOf(i17));
        this.f221727f = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        cr0.r bgn = (cr0.r) d3Var;
        kotlin.jvm.internal.o.g(bgn, "bgn");
        return new cr0.q(bgn, this);
    }
}
