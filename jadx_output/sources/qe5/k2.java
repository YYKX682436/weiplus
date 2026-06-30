package qe5;

/* loaded from: classes12.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f362135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe5.m2 f362136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(androidx.appcompat.app.AppCompatActivity appCompatActivity, qe5.m2 m2Var) {
        super(0);
        this.f362135d = appCompatActivity;
        this.f362136e = m2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j75.f Q6;
        androidx.appcompat.app.AppCompatActivity activity = this.f362135d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).X6(0L);
        qe5.m2 m2Var = this.f362136e;
        m2Var.getClass();
        jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
        kd5.e U6 = m2Var.U6();
        java.lang.String str = U6 != null ? U6.f306893x : null;
        ((ht.s) a0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.t3.l(str) && (Q6 = m2Var.Q6()) != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209727o);
            nVar.f306906e = false;
            nVar.f306907f = false;
            Q6.B3(nVar);
        }
        return jz5.f0.f302826a;
    }
}
