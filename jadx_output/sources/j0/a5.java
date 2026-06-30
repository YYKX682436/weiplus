package j0;

/* loaded from: classes14.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(j0.c5 c5Var) {
        super(1);
        this.f296211d = c5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g2.e0 it = (g2.e0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.f267693a.f681d;
        j0.c5 c5Var = this.f296211d;
        if (!kotlin.jvm.internal.o.b(str, c5Var.f296233a.f296403a.f681d)) {
            ((n0.q4) c5Var.f296240h).setValue(j0.v1.None);
        }
        c5Var.f296246n.invoke(it);
        n0.l3 l3Var = (n0.l3) c5Var.f296234b;
        n0.j1 j1Var = l3Var.f333605a;
        if (j1Var != null) {
            j1Var.l(l3Var, null);
        }
        return jz5.f0.f302826a;
    }
}
