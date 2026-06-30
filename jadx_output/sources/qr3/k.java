package qr3;

/* loaded from: classes4.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qr3.o f366095d;

    public k(qr3.o oVar) {
        this.f366095d = oVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        jz5.l lVar = (jz5.l) obj;
        o01.a aVar = (o01.a) lVar.f302833d;
        r45.n14 n14Var = (aVar.f359285b == 0 && aVar.f359286c == 0) ? (r45.n14) aVar.f359289f : null;
        o01.a aVar2 = (o01.a) lVar.f302834e;
        r45.p14 p14Var = (aVar2.f359285b == 0 && aVar2.f359286c == 0) ? (r45.p14) aVar2.f359289f : null;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new qr3.j(p14Var, n14Var, this.f366095d, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }
}
