package v24;

/* loaded from: classes15.dex */
public class x implements k14.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v24.y f432962a;

    public x(v24.y yVar) {
        this.f432962a = yVar;
    }

    @Override // k14.u
    public void a(android.content.Context context, boolean z17, r45.en0 en0Var) {
        v24.y yVar = this.f432962a;
        if (en0Var != null && z17) {
            v24.o0.m(yVar.f432963a);
            yVar.f432967e.onSuccess();
        } else {
            v24.o0.l(yVar.f432963a);
            v24.n0 n0Var = yVar.f432966d;
            n0Var.b(n0Var.a());
        }
    }
}
