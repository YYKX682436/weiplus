package ix5;

/* loaded from: classes13.dex */
public final class u extends kotlinx.coroutines.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f295676e = jz5.h.b(ix5.t.f295675d);

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        ((java.util.concurrent.ExecutorService) ((jz5.n) this.f295676e).getValue()).execute(block);
    }

    @Override // kotlinx.coroutines.f2
    public java.util.concurrent.Executor K() {
        return (java.util.concurrent.ExecutorService) ((jz5.n) this.f295676e).getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((java.util.concurrent.ExecutorService) ((jz5.n) this.f295676e).getValue()).shutdown();
    }
}
