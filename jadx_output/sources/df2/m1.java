package df2;

/* loaded from: classes3.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.p1 f230743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v94 f230744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(df2.p1 p1Var, r45.v94 v94Var) {
        super(0);
        this.f230743d = p1Var;
        this.f230744e = v94Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.p1 p1Var = this.f230743d;
        ((mm2.c1) p1Var.business(mm2.c1.class)).Y5 = this.f230744e;
        r45.v94 v94Var = ((mm2.c1) p1Var.business(mm2.c1.class)).Y5;
        if (v94Var != null) {
            df2.p1.Z6(p1Var, v94Var);
        }
        return jz5.f0.f302826a;
    }
}
