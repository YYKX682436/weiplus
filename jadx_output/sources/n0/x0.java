package n0;

/* loaded from: classes14.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f333743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.Object obj, int i17) {
        super(3);
        this.f333743d = obj;
        this.f333744e = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.l3 l3Var;
        n0.j1 j1Var;
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g(rememberManager, "rememberManager");
        java.lang.Object obj4 = this.f333743d;
        if (obj4 instanceof n0.e4) {
            ((n0.i1) rememberManager).d((n0.e4) obj4);
        }
        java.lang.Object C = slots.C(this.f333744e, obj4);
        if (C instanceof n0.e4) {
            ((n0.i1) rememberManager).c((n0.e4) C);
        } else if ((C instanceof n0.l3) && (j1Var = (l3Var = (n0.l3) C).f333605a) != null) {
            l3Var.f333605a = null;
            j1Var.f333559t = true;
        }
        return jz5.f0.f302826a;
    }
}
