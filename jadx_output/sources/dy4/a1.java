package dy4;

/* loaded from: classes15.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(dy4.f1 f1Var) {
        super(0);
        this.f244608d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ye1.e eVar;
        dy4.f1 f1Var = this.f244608d;
        f25.m0 m0Var = f1Var.Z;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.h.f259096c, new dy4.o0(f1Var));
        f1Var.Z = m96;
        if (!f1Var.f244641y0 && (eVar = f1Var.f244627n) != null) {
            eVar.setMute(!(m96 != null && ((g25.e) m96).f267980c));
        }
        return jz5.f0.f302826a;
    }
}
