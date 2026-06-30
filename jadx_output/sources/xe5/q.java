package xe5;

/* loaded from: classes10.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f454080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454083g;

    public q(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f454080d = g0Var;
        this.f454081e = iVar;
        this.f454082f = str;
        this.f454083g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.zh2 req = (r45.zh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        xe5.g0.b(this.f454080d, ret, this.f454081e, this.f454082f, this.f454083g);
    }
}
