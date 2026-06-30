package ir1;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f294059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ir1.i1 i1Var) {
        super(1);
        this.f294059d = i1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ir1.i1 i1Var = this.f294059d;
        if (booleanValue) {
            hr1.a aVar = i1Var.P;
            kotlin.jvm.internal.o.d(aVar);
            kotlin.jvm.internal.o.d(i1Var.P);
            aVar.field_inBlacklist = !r1.field_inBlacklist;
            pm0.v.X(new ir1.s0(i1Var));
        } else {
            pm0.v.X(new ir1.t0(i1Var));
        }
        return jz5.f0.f302826a;
    }
}
