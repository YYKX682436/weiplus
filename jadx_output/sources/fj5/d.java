package fj5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj5.e f263244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fj5.e eVar) {
        super(1);
        this.f263244d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            jt.x xVar = (jt.x) i95.n0.c(jt.x.class);
            fj5.e eVar = this.f263244d;
            ((jb0.g) xVar).Ri(eVar.getContext(), 10, new fj5.c(c0Var, eVar));
        }
        return jz5.f0.f302826a;
    }
}
