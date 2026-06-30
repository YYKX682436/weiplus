package rv0;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.AspectRatio f400263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.j f400264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.c f400265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(rv0.n1 n1Var, com.tencent.maas.moviecomposing.AspectRatio aspectRatio, rv0.j jVar, com.tencent.maas.moviecomposing.c cVar) {
        super(0);
        this.f400262d = n1Var;
        this.f400263e = aspectRatio;
        this.f400264f = jVar;
        this.f400265g = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mv0.b bVar;
        rv0.n1 n1Var = this.f400262d;
        n1Var.o7().q7((float) this.f400263e.f48363b, this.f400264f.getPanelHeight());
        ex0.a0 s76 = n1Var.s7();
        com.tencent.maas.moviecomposing.c cVar = (s76 == null || (bVar = s76.f257095e) == null) ? null : bVar.f331530a;
        com.tencent.maas.moviecomposing.c cVar2 = this.f400265g;
        mv0.b bVar2 = new mv0.b(cVar2, cVar2 == cVar);
        gx0.kh q76 = n1Var.q7();
        q76.getClass();
        ex0.a0 a0Var = q76.f276642r;
        if (a0Var != null) {
            a0Var.f257103m = bVar2;
        }
        com.tencent.maas.moviecomposing.AspectRatio a17 = com.tencent.maas.moviecomposing.AspectRatio.a(bVar2.f331530a);
        com.tencent.maas.moviecomposing.Timeline o76 = q76.o7();
        if (o76 != null) {
            o76.C(a17);
        }
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.t(n1Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
