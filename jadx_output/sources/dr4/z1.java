package dr4;

/* loaded from: classes14.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.d2 f242770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(dr4.d2 d2Var) {
        super(1);
        this.f242770d = d2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        is0.c cVar = (is0.c) obj;
        if (cVar != null) {
            dr4.d2 d2Var = this.f242770d;
            dr4.r1 r1Var = d2Var.f242686l;
            if (r1Var != null) {
                r1Var.F(!cVar.f294396f);
            }
            d2Var.d(new dr4.m(d2Var, cVar));
            d2Var.i(cVar);
        }
        return jz5.f0.f302826a;
    }
}
