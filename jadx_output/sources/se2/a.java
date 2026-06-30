package se2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se2.d f406830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.c f406831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(se2.d dVar, lm2.c cVar) {
        super(0);
        this.f406830d = dVar;
        this.f406831e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        se2.w wVar = se2.w.f406895a;
        se2.d dVar = this.f406830d;
        java.lang.String str = dVar.f406844c;
        gk2.e S0 = dVar.f406843b.S0();
        lm2.c cVar = this.f406831e;
        wVar.h(str, S0, cVar);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) dVar.a(mm2.c1.class)).T ? ml2.g5.f327480J : ml2.g5.f327493t, 1, cVar.a(), cVar.j());
        return jz5.f0.f302826a;
    }
}
