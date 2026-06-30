package e0;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f245615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.q0 f245616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.util.List list, e0.q0 q0Var) {
        super(1);
        this.f245615d = list;
        this.f245616e = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.q0 q0Var;
        s1.n1 invoke = (s1.n1) obj;
        kotlin.jvm.internal.o.g(invoke, "$this$invoke");
        java.util.List list = this.f245615d;
        int size = list.size();
        int i17 = 0;
        while (true) {
            q0Var = this.f245616e;
            if (i17 >= size) {
                break;
            }
            e0.q0 q0Var2 = (e0.q0) list.get(i17);
            if (q0Var2 != q0Var) {
                q0Var2.d(invoke);
            }
            i17++;
        }
        if (q0Var != null) {
            q0Var.d(invoke);
        }
        return jz5.f0.f302826a;
    }
}
