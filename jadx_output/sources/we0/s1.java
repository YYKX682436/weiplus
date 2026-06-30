package we0;

/* loaded from: classes11.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.e1 f445164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f445165e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(pj4.e1 e1Var, com.tencent.mm.modelbase.m1 m1Var) {
        super(0);
        this.f445164d = e1Var;
        this.f445165e = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bk4.f a17 = bk4.i.a();
        ej4.e eVar = (ej4.e) this.f445165e;
        pj4.e1 e1Var = this.f445164d;
        if (!a17.u(e1Var, eVar)) {
            a17.t(e1Var);
            a17.r(e1Var);
            a17.s(e1Var);
        }
        return jz5.f0.f302826a;
    }
}
