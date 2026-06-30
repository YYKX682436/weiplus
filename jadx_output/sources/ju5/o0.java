package ju5;

/* loaded from: classes15.dex */
public class o0 implements hu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju5.q0 f302138a;

    public o0(ju5.q0 q0Var) {
        this.f302138a = q0Var;
    }

    @Override // hu5.a
    public void a(int i17, java.lang.String str) {
        zt5.h.f("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate failed. errcode: %d, errmsg: %s", java.lang.Integer.valueOf(i17), str);
        java.lang.String str2 = zt5.j.a().f475604a;
        ju5.q0 q0Var = this.f302138a;
        q0Var.h(str2, 0);
        q0Var.b(new eu5.c(i17, str));
    }

    @Override // hu5.a
    public void onSuccess() {
        zt5.h.c("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate successfully. start upload ask", new java.lang.Object[0]);
        ju5.q0 q0Var = this.f302138a;
        if (q0Var.f302142c != null) {
            q0Var.h(zt5.j.a().f475604a, 2);
        } else {
            q0Var.h(zt5.j.a().f475604a, 0);
        }
        q0Var.getClass();
        zt5.r c17 = wt5.a.c();
        if (c17 == null) {
            zt5.h.b("Soter.TaskPrepareAppSecureKey", "soter: ask model is null even after generation. fatal error", new java.lang.Object[0]);
            wt5.a.r();
            q0Var.b(new eu5.c(3, "ask model is null even after generation."));
            return;
        }
        iu5.e eVar = q0Var.f302142c;
        if (eVar == null) {
            zt5.h.a("Soter.TaskPrepareAppSecureKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new java.lang.Object[0]);
            q0Var.b(new eu5.c(0, "treat as normal because you do not provide the net wrapper", c17));
        } else {
            eVar.j(new iu5.c(c17.f475619g, c17.f475617e));
            eVar.B(new ju5.p0(q0Var, c17));
            eVar.x();
        }
    }
}
