package df2;

/* loaded from: classes3.dex */
public final class z8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a9 f231934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(df2.a9 a9Var) {
        super(2);
        this.f231934d = a9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.e84 e84Var = (r45.e84) obj;
        r45.e84 e84Var2 = (r45.e84) obj2;
        this.f231934d.getClass();
        r45.nz3 nz3Var = null;
        r45.nz3 nz3Var2 = (e84Var == null || (list2 = e84Var.getList(2)) == null) ? null : (r45.nz3) kz5.n0.Z(list2);
        if (e84Var2 != null && (list = e84Var2.getList(2)) != null) {
            nz3Var = (r45.nz3) kz5.n0.Z(list);
        }
        boolean z17 = true;
        if (nz3Var2 == null || nz3Var == null ? nz3Var2 != null || nz3Var != null : !kotlin.jvm.internal.o.b(nz3Var2.getString(0), nz3Var.getString(0)) || nz3Var2.getInteger(1) != nz3Var.getInteger(1) || nz3Var2.getInteger(2) != nz3Var.getInteger(2)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
