package sp2;

/* loaded from: classes2.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f411045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f411045d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.isEmpty()) {
            sp2.z3.f411300a.c(it);
            kotlin.jvm.internal.f0 f0Var = this.f411045d;
            int size = f0Var.f310116d - it.size();
            if (size < 0) {
                size = 0;
            }
            f0Var.f310116d = size;
        }
        return jz5.f0.f302826a;
    }
}
