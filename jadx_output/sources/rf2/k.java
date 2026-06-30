package rf2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ul4 f394784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(rf2.q qVar, r45.ul4 ul4Var) {
        super(0);
        this.f394783d = qVar;
        this.f394784e = ul4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rf2.q qVar = this.f394783d;
        r45.f02 f02Var = qVar.f394854e.f230685v;
        r45.ul4 ul4Var = this.f394784e;
        if (f02Var != null) {
            f02Var.f373885n = ul4Var;
        }
        rf2.q.b(qVar, ul4Var);
        return jz5.f0.f302826a;
    }
}
