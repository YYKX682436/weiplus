package s1;

/* loaded from: classes14.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f402018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(s1.k2 k2Var) {
        super(2);
        this.f402018d = k2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        u1.w wVar = (u1.w) obj;
        s1.k2 it = (s1.k2) obj2;
        kotlin.jvm.internal.o.g(wVar, "$this$null");
        kotlin.jvm.internal.o.g(it, "it");
        s1.q0 q0Var = wVar.L;
        s1.k2 k2Var = this.f402018d;
        if (q0Var == null) {
            q0Var = new s1.q0(wVar, k2Var.f402026a);
            wVar.L = q0Var;
        }
        k2Var.f402027b = q0Var;
        k2Var.a().b();
        s1.q0 a17 = k2Var.a();
        s1.n2 value = k2Var.f402026a;
        kotlin.jvm.internal.o.g(value, "value");
        if (a17.f402063c != value) {
            a17.f402063c = value;
            a17.a(0);
        }
        return jz5.f0.f302826a;
    }
}
