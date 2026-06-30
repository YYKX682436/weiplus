package tx0;

/* loaded from: classes.dex */
public final class j implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f422522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f422523c;

    public j(java.lang.Object obj, kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f422521a = obj;
        this.f422522b = c0Var;
        this.f422523c = qVar;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        java.lang.Object obj = this.f422521a;
        kotlin.jvm.internal.c0 c0Var = this.f422522b;
        kotlinx.coroutines.q qVar = this.f422523c;
        synchronized (obj) {
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Object obj2 = addr;
            if (addr == null) {
                obj2 = kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No Address"));
            }
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(obj2))));
        }
    }
}
