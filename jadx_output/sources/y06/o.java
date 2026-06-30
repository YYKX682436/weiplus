package y06;

/* loaded from: classes16.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y06.p f458685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y06.p pVar) {
        super(0);
        this.f458685d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p06.t tVar;
        y06.h hVar = y06.h.f458677a;
        e16.b bVar = this.f458685d.f458670d;
        e16.m mVar = bVar instanceof e16.m ? (e16.m) bVar : null;
        t16.k kVar = (mVar == null || (tVar = (p06.t) y06.h.f458679c.get(n16.g.k(((u06.c0) mVar).f423493b.name()).h())) == null) ? null : new t16.k(n16.b.l(l06.w.f314942w), n16.g.k(tVar.name()));
        java.util.Map e17 = kVar != null ? kz5.b1.e(new jz5.l(y06.f.f458674d, kVar)) : null;
        return e17 == null ? kz5.q0.f314001d : e17;
    }
}
