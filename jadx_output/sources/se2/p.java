package se2;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f406873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.c f406874f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, gk2.e eVar, lm2.c cVar) {
        super(0);
        this.f406872d = str;
        this.f406873e = eVar;
        this.f406874f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        se2.w wVar = se2.w.f406895a;
        java.lang.String str = this.f406872d;
        gk2.e eVar = this.f406873e;
        lm2.c cVar = this.f406874f;
        if (wVar.h(str, eVar, cVar)) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) eVar.a(mm2.c1.class)).T ? ml2.g5.K : ml2.g5.f327494u, 1, cVar.a(), cVar.j());
        }
        return jz5.f0.f302826a;
    }
}
