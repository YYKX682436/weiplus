package yo5;

/* loaded from: classes12.dex */
public final class h extends kotlinx.coroutines.p0 implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static int f464368h;

    /* renamed from: e, reason: collision with root package name */
    public final int f464369e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_ilink_usesafequit, 0);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f464370f = jz5.h.b(yo5.g.f464367d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f464371g = jz5.h.b(new yo5.f(this));

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        ((android.os.Handler) ((jz5.n) this.f464371g).getValue()).post(block);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jz5.g gVar = this.f464370f;
        int i17 = this.f464369e;
        if (i17 == 0) {
            ((android.os.Handler) ((jz5.n) this.f464371g).getValue()).removeMessages(0);
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.os.HandlerThread) value).quit();
        } else {
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.os.HandlerThread) value2).quitSafely();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped, safeQuit: " + i17);
    }
}
