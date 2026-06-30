package sr2;

/* loaded from: classes10.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gd1 f411794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(sr2.y2 y2Var, r45.gd1 gd1Var) {
        super(2);
        this.f411793d = y2Var;
        this.f411794e = gd1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.cd1 cd1Var = (r45.cd1) obj;
        r45.cd1 cd1Var2 = (r45.cd1) obj2;
        sr2.y2 y2Var = this.f411793d;
        y2Var.f411817x = cd1Var;
        y2Var.f411818y = cd1Var2;
        db2.i1.f228015t.c(y2Var.getActivity(), cd1Var, cd1Var2, new sr2.w1(y2Var, this.f411794e));
        return jz5.f0.f302826a;
    }
}
