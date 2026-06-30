package d26;

/* loaded from: classes16.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.n f226018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d26.x f226019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d26.n nVar, d26.x xVar) {
        super(1);
        this.f226018d = nVar;
        this.f226019e = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        kotlin.jvm.internal.o.g(name, "name");
        d26.n nVar = this.f226018d;
        i16.c0 c0Var = (i16.c0) ((java.util.LinkedHashMap) nVar.f226029a).get(name);
        if (c0Var == null) {
            return null;
        }
        d26.x xVar = this.f226019e;
        return r06.e0.u0(xVar.f226060r.f17515a.f17483a, xVar, name, nVar.f226031c, new d26.a(xVar.f226060r.f17515a.f17483a, new d26.k(xVar, c0Var)), o06.x1.f342004a);
    }
}
