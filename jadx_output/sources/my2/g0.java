package my2;

/* loaded from: classes.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f332732b;

    public g0(my2.k0 k0Var, r45.me2 me2Var) {
        this.f332731a = k0Var;
        this.f332732b = me2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        my2.k0 k0Var = this.f332731a;
        k0Var.A.b();
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.me2 me2Var = this.f332732b;
            if (me2Var != null) {
                me2Var.set(4, 1);
            }
            if (me2Var != null) {
                me2Var.set(3, 0);
            }
            k0Var.u1();
        }
        return jz5.f0.f302826a;
    }
}
