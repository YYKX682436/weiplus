package xe5;

/* loaded from: classes10.dex */
public final class m implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f454066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454069g;

    public m(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f454066d = g0Var;
        this.f454067e = iVar;
        this.f454068f = str;
        this.f454069g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ph2 req = (r45.ph2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        xe5.g0.c(this.f454066d, ret, this.f454067e, this.f454068f, this.f454069g);
    }
}
