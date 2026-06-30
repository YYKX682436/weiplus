package pi0;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.m1 f354683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354684e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pi0.m1 m1Var, yz5.l lVar) {
        super(1);
        this.f354683d = m1Var;
        this.f354684e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pi0.u0 it = (pi0.u0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pi0.m1 m1Var = this.f354683d;
        sb6.append(m1Var.f354665a);
        sb6.append('/');
        sb6.append(m1Var.f354667c);
        it.f354734e = sb6.toString();
        yz5.l lVar = this.f354684e;
        if (lVar != null) {
            lVar.invoke(it);
        }
        pi0.r.f354717a.b(it);
        return jz5.f0.f302826a;
    }
}
