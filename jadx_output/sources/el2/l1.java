package el2;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.n1 f253850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.pc2 f253852f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(el2.n1 n1Var, r45.y42 y42Var, r45.pc2 pc2Var) {
        super(0);
        this.f253850d = n1Var;
        this.f253851e = y42Var;
        this.f253852f = pc2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        el2.n1 n1Var = this.f253850d;
        r45.y42 y42Var = this.f253851e;
        n1Var.f253874p = y42Var;
        if (this.f253852f.getInteger(1) > 0) {
            n1Var.f253875q.postValue(y42Var);
        }
        return jz5.f0.f302826a;
    }
}
