package j0;

/* loaded from: classes14.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(j0.j3 j3Var) {
        super(1);
        this.f296219d = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.z it = (s1.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        j0.j3 j3Var = this.f296219d;
        j0.f5 f5Var = j3Var.f296382d;
        f5Var.f296291d = it;
        if (k0.k0.a(null, f5Var.f296289b)) {
            long u07 = ((u1.c1) it).u0(d1.e.f225623b);
            j0.f5 f5Var2 = j3Var.f296382d;
            long j17 = f5Var2.f296293f;
            f5Var2.f296293f = u07;
        }
        return jz5.f0.f302826a;
    }
}
