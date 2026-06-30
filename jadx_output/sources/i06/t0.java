package i06;

/* loaded from: classes15.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f286751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(i06.k1 k1Var) {
        super(0);
        this.f286751d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o06.g u17;
        h16.c cVar;
        int i17 = i06.k1.f286679g;
        i06.k1 k1Var = this.f286751d;
        n16.b v17 = k1Var.v();
        i06.f1 f1Var = (i06.f1) k1Var.f286681f.getValue();
        f1Var.getClass();
        f06.v vVar = i06.o1.f286711b[0];
        java.lang.Object invoke = f1Var.f286712a.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        t06.k kVar = (t06.k) invoke;
        b26.q qVar = kVar.f414542a;
        o06.v0 v0Var = qVar.f17484b;
        boolean z17 = v17.f334158c;
        java.lang.Class cls = k1Var.f286680e;
        o06.g b17 = (z17 && cls.isAnnotationPresent(kotlin.Metadata.class)) ? qVar.b(v17) : o06.l0.a(v0Var, v17);
        if (b17 != null) {
            return b17;
        }
        if (cls.isSynthetic()) {
            u17 = k1Var.u(v17, kVar);
        } else {
            t06.g a17 = t06.g.f414535c.a(cls);
            h16.b bVar = (a17 == null || (cVar = a17.f414537b) == null) ? null : cVar.f278229a;
            switch (bVar == null ? -1 : i06.g1.f286649a[bVar.ordinal()]) {
                case -1:
                case 6:
                    throw new i06.a4("Unresolved class: " + cls + " (kind = " + bVar + ')');
                case 0:
                default:
                    throw new jz5.j();
                case 1:
                case 2:
                case 3:
                case 4:
                    u17 = k1Var.u(v17, kVar);
                    break;
                case 5:
                    throw new i06.a4("Unknown class: " + cls + " (kind = " + bVar + ')');
            }
        }
        return u17;
    }
}
