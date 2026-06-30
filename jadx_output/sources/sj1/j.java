package sj1;

/* loaded from: classes7.dex */
public final class j implements sj1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final sj1.j f408370a = new sj1.j();

    static {
        java.lang.Object m521constructorimpl;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!sj1.f.f408364a.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageSystrace", "enable, hasTryEnable");
            return;
        }
        if ((context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageSystrace", "enable, isDebuggable");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(android.os.Trace.class.getDeclaredMethod("setAppTracingAllowed", java.lang.Boolean.TYPE).invoke(null, java.lang.Boolean.TRUE));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl == null) {
            return;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageSystrace", m524exceptionOrNullimpl, "enable, reflect setAppTracingAllowed failure", new java.lang.Object[0]);
    }

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f408364a;
        java.lang.String E0 = r26.p0.E0(name, 127);
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.a(E0);
    }

    @Override // pb.b
    public void d(long j17, long j18) {
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // sj1.b
    public void flush() {
    }

    @Override // pb.b
    public void g() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f408364a;
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.b();
    }

    @Override // pb.b
    public com.luggage.trace.ProfileInfo h() {
        return null;
    }

    @Override // pb.b
    public void i() {
    }

    @Override // pb.b
    public void init() {
    }

    @Override // pb.b
    /* renamed from: isTracing */
    public boolean getF45816a() {
        return false;
    }

    @Override // pb.b
    public void j(int i17) {
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        return -1;
    }

    @Override // pb.b
    public void release() {
    }
}
