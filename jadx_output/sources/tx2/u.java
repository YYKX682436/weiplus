package tx2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.k94 f422660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l94 f422661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r45.k94 k94Var, r45.l94 l94Var, tx2.i0 i0Var) {
        super(0);
        this.f422660d = k94Var;
        this.f422661e = l94Var;
        this.f422662f = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list;
        java.lang.Object obj;
        r45.k94 k94Var = this.f422660d;
        r45.bd5 bd5Var = (r45.bd5) k94Var.getCustom(6);
        if (bd5Var != null) {
            r45.bd5 bd5Var2 = (r45.bd5) k94Var.getCustom(6);
            bd5Var.set(13, java.lang.Integer.valueOf(bd5Var2 != null && bd5Var2.getInteger(13) == 1 ? 2 : 1));
        }
        r45.l94 l94Var = this.f422661e;
        java.util.LinkedList list2 = l94Var.getList(0);
        kotlin.jvm.internal.o.f(list2, "getProducts(...)");
        kz5.h0.C(list2);
        l94Var.getList(0).add(k94Var);
        tx2.i0 i0Var = this.f422662f;
        r45.h32 h32Var = i0Var.C;
        if (h32Var != null && (list = h32Var.getList(11)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.k34) obj).getInteger(0) == 22) {
                    break;
                }
            }
            r45.k34 k34Var = (r45.k34) obj;
            if (k34Var != null) {
                k34Var.set(1, hc2.b.a(l94Var));
            }
        }
        i0Var.y();
        return jz5.f0.f302826a;
    }
}
