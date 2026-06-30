package yf2;

/* loaded from: classes3.dex */
public final class i implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f461711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f461712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf2.o f461713f;

    public i(kotlin.jvm.internal.g0 g0Var, mm2.n0 n0Var, yf2.o oVar) {
        this.f461711d = g0Var;
        this.f461712e = n0Var;
        this.f461713f = oVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17;
        re2.e0 e0Var = re2.j1.f394438b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (e0Var == null) {
            return f0Var;
        }
        long j17 = e0Var.f394390c;
        if (j17 == 0) {
            return f0Var;
        }
        kotlin.jvm.internal.g0 g0Var = this.f461711d;
        return (j17 == g0Var.f310121d || (a17 = yf2.l.a(g0Var, this.f461712e, this.f461713f, continuation)) != pz5.a.f359186d) ? f0Var : a17;
    }
}
