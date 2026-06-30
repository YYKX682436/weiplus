package ju5;

/* loaded from: classes15.dex */
public class t0 implements iu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zt5.r f302153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju5.u0 f302154b;

    public t0(ju5.u0 u0Var, zt5.r rVar) {
        this.f302154b = u0Var;
        this.f302153a = rVar;
    }

    @Override // iu5.b
    public void a(java.lang.Object obj) {
        ju5.u0 u0Var = this.f302154b;
        u0Var.h(u0Var.f302156c, 0);
        boolean z17 = ((iu5.d) obj).f295053a;
        zt5.h.c("Soter.TaskPrepareAuthKey", "soter: auth key upload result: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            u0Var.b(new eu5.c(0, this.f302153a));
        } else {
            wt5.a.s(u0Var.f302156c, false);
            u0Var.b(new eu5.c(1004, java.lang.String.format("upload auth key: %s failed", u0Var.f302156c)));
        }
    }
}
