package ju5;

/* loaded from: classes15.dex */
public class r0 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju5.u0 f302145a;

    public r0(ju5.u0 u0Var) {
        this.f302145a = u0Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        zt5.h.a("Soter.TaskPrepareAuthKey", "soter: prepare ask end: %s", cVar.toString());
        int i17 = cVar.f475605a;
        ju5.u0 u0Var = this.f302145a;
        if (i17 == 0) {
            u0Var.i();
        } else {
            u0Var.b(cVar);
        }
    }
}
