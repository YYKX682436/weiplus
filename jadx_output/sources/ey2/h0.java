package ey2;

/* loaded from: classes8.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.c f257386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey2.k0 f257387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i11.c cVar, ey2.k0 k0Var) {
        super(0);
        this.f257386d = cVar;
        this.f257387e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        i11.c cVar = this.f257386d;
        if (cVar == null) {
            cVar = this.f257387e.f257413g;
        }
        e17.k(cVar, true);
        com.tencent.mm.plugin.report.service.b1.f(5, 10);
        return jz5.f0.f302826a;
    }
}
