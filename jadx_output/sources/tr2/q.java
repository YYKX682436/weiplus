package tr2;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr2.v f421408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tr2.v vVar) {
        super(1);
        this.f421408d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.pw0 resp = (r45.pw0) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        tr2.v vVar = this.f421408d;
        kotlinx.coroutines.y0 b17 = v65.m.b(vVar.getActivity());
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new tr2.p(resp, vVar, null), 2, null);
        return jz5.f0.f302826a;
    }
}
