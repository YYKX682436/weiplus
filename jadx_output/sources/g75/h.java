package g75;

/* loaded from: classes10.dex */
public final class h implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f269373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f269374b;

    public h(kotlin.jvm.internal.h0 h0Var, v65.n nVar) {
        this.f269373a = h0Var;
        this.f269374b = nVar;
    }

    @Override // g75.s
    public void a(g75.x result) {
        kotlin.jvm.internal.o.g(result, "result");
        g75.r rVar = (g75.r) this.f269373a.f310123d;
        if (rVar != null) {
            rVar.f269395g = null;
        }
        this.f269374b.a(result);
    }
}
