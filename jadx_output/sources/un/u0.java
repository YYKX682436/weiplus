package un;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(un.g1 g1Var) {
        super(1);
        this.f429330d = g1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.c)) {
            un.g1 g1Var = this.f429330d;
            boolean z17 = g1Var.f429261i;
            if (z17 || g1Var.f429265p) {
                un.a aVar = new un.a(true);
                aVar.f429231b = z17;
                aVar.f429232c = g1Var.f429265p;
                dVar.a(aVar);
            } else if (g1Var.f429262m || g1Var.f429266q) {
                un.a aVar2 = new un.a(true);
                aVar2.f429233d = g1Var.f429266q;
                dVar.a(aVar2);
            }
        }
        return jz5.f0.f302826a;
    }
}
