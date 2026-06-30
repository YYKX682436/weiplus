package sg0;

/* loaded from: classes15.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg0.g1 f407676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tg0.g1 g1Var) {
        super(2);
        this.f407676d = g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String status = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(status, "status");
        boolean b17 = kotlin.jvm.internal.o.b(status, "dismiss");
        jz5.f0 f0Var = jz5.f0.f302826a;
        tg0.g1 g1Var = this.f407676d;
        if (b17) {
            if (g1Var != null) {
                g1Var.onDismiss();
                return f0Var;
            }
        } else {
            if (!kotlin.jvm.internal.o.b(status, "enter")) {
                return f0Var;
            }
            if (g1Var != null) {
                g1Var.onEnter();
                return f0Var;
            }
        }
        return null;
    }
}
