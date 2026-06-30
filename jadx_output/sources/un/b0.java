package un;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(un.k0 k0Var) {
        super(1);
        this.f429237d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            un.k0 k0Var = this.f429237d;
            k0Var.f429300h = a17.z0(un.k0.U6(k0Var));
        }
        return jz5.f0.f302826a;
    }
}
