package fj3;

/* loaded from: classes14.dex */
public final class k implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final ej3.c f263214d;

    /* renamed from: e, reason: collision with root package name */
    public final fj3.n f263215e;

    /* renamed from: f, reason: collision with root package name */
    public final u26.w f263216f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f263217g;

    /* JADX WARN: Multi-variable type inference failed */
    public k(ej3.c mtrTask) {
        kotlin.jvm.internal.o.g(mtrTask, "mtrTask");
        this.f263214d = mtrTask;
        fj3.n nVar = new fj3.n();
        this.f263215e = nVar;
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        ((u26.o) a17).n(new fj3.g(this));
        this.f263216f = a17;
        this.f263217g = kotlinx.coroutines.z0.a(nVar.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public final void a(ej3.a input) {
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.Object obj = this.f263216f;
        if (((u26.o) obj).j()) {
            return;
        }
        ((u26.o) obj).e(input);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.lang.Object m521constructorimpl;
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRExecutor", "executor stopped");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(u26.x0.a(this.f263216f, null, 1, null)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }
}
