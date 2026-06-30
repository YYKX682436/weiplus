package xe5;

/* loaded from: classes10.dex */
public final class n implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.g0 f454070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454073g;

    public n(xe5.g0 g0Var, xe5.i iVar, java.lang.String str, yb5.d dVar) {
        this.f454070d = g0Var;
        this.f454071e = iVar;
        this.f454072f = str;
        this.f454073g = dVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.zh2 req = (r45.zh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        xe5.g0.c(this.f454070d, ret, this.f454071e, this.f454072f, this.f454073g);
    }
}
