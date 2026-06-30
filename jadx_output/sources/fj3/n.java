package fj3;

/* loaded from: classes12.dex */
public final class n extends kotlinx.coroutines.p0 implements java.io.Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static int f263220g;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f263221e = jz5.h.b(fj3.m.f263219d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f263222f = jz5.h.b(new fj3.l(this));

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        ((android.os.Handler) ((jz5.n) this.f263222f).getValue()).post(block);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((android.os.Handler) ((jz5.n) this.f263222f).getValue()).removeMessages(0);
        java.lang.Object value = ((jz5.n) this.f263221e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.os.HandlerThread) value).quit();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped");
    }
}
