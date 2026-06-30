package cr0;

/* loaded from: classes12.dex */
public final class w2 extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221797d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.x2 f221798e;

    /* renamed from: f, reason: collision with root package name */
    public final rh.x2 f221799f;

    public w2(java.lang.String name, int i17, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f221797d = name;
        this.f221798e = rh.x2.b(java.lang.Integer.valueOf(i17));
        this.f221799f = rh.x2.b(java.lang.Long.valueOf(j17));
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        cr0.w2 bgn = (cr0.w2) d3Var;
        kotlin.jvm.internal.o.g(bgn, "bgn");
        return new cr0.v2(bgn, this);
    }
}
