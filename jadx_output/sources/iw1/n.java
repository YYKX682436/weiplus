package iw1;

/* loaded from: classes12.dex */
public final class n extends kotlinx.coroutines.p0 implements java.io.Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static int f295225g;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f295226e = jz5.h.b(iw1.m.f295224d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f295227f = jz5.h.b(new iw1.l(this));

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        ((android.os.Handler) ((jz5.n) this.f295227f).getValue()).post(block);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((android.os.Handler) ((jz5.n) this.f295227f).getValue()).removeMessages(0);
        java.lang.Object value = ((jz5.n) this.f295226e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.os.HandlerThread) value).quit();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped");
    }
}
