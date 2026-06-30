package ee5;

/* loaded from: classes9.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f252024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ee5.z zVar) {
        super(0);
        this.f252024d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.g0 g0Var;
        aq.n nVar = aq.o.f12922c;
        if (nVar != null && (g0Var = nVar.f12913h) != null) {
            ee5.z zVar = this.f252024d;
            g0Var.observe(zVar.getActivity(), new ee5.q(zVar));
        }
        return jz5.f0.f302826a;
    }
}
