package xe5;

/* loaded from: classes10.dex */
public final class p implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f454076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454079g;

    public p(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f454076d = g0Var;
        this.f454077e = iVar;
        this.f454078f = str;
        this.f454079g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ph2 req = (r45.ph2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        xe5.g0.b(this.f454076d, ret, this.f454077e, this.f454078f, this.f454079g);
    }
}
