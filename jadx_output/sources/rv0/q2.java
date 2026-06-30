package rv0;

/* loaded from: classes5.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(rv0.j7 j7Var, ex0.a0 a0Var, rv0.n1 n1Var, ex0.r rVar) {
        super(0);
        this.f400197d = j7Var;
        this.f400198e = a0Var;
        this.f400199f = n1Var;
        this.f400200g = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.j7 j7Var = this.f400197d;
        j7Var.J();
        this.f400198e.b(j7Var.getCurrentSpeed());
        rv0.n1 n1Var = this.f400199f;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.p2(n1Var, this.f400200g, null), 3, null);
        return jz5.f0.f302826a;
    }
}
