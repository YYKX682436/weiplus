package cr0;

/* loaded from: classes12.dex */
public final class d0 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221604d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.x2 f221605e;

    public d0(java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f221604d = name;
        this.f221605e = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        cr0.d0 bgn = (cr0.d0) d3Var;
        kotlin.jvm.internal.o.g(bgn, "bgn");
        return new cr0.c0(bgn, this);
    }
}
