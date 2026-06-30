package iw1;

/* loaded from: classes14.dex */
public final class k implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final hw1.c f295219d;

    /* renamed from: e, reason: collision with root package name */
    public final iw1.n f295220e;

    /* renamed from: f, reason: collision with root package name */
    public final u26.w f295221f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f295222g;

    /* JADX WARN: Multi-variable type inference failed */
    public k(hw1.c mtrTask) {
        kotlin.jvm.internal.o.g(mtrTask, "mtrTask");
        this.f295219d = mtrTask;
        iw1.n nVar = new iw1.n();
        this.f295220e = nVar;
        u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        ((u26.o) a17).n(new iw1.g(this));
        this.f295221f = a17;
        this.f295222g = kotlinx.coroutines.z0.a(nVar.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        java.lang.Object m521constructorimpl;
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRExecutor", "executor stopped");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(u26.x0.a(this.f295221f, null, 1, null)));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }
}
