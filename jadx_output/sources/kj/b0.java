package kj;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.trace.tracer.StackTracer f308186d;

    public b0(com.tencent.matrix.trace.tracer.StackTracer stackTracer) {
        this.f308186d = stackTracer;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean nativeInit;
        com.tencent.matrix.trace.tracer.StackTracer stackTracer = this.f308186d;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        com.tencent.matrix.trace.tracer.StackTracer stackTracer2 = this.f308186d;
        nativeInit = stackTracer.nativeInit(currentThread, stackTracer2.f53022f, stackTracer2.f53023g, android.os.Build.VERSION.SDK_INT);
        if (!nativeInit) {
            oj.j.c("StackTracer", "native init failed!", new java.lang.Object[0]);
            this.f308186d.f();
            return;
        }
        oj.j.c("StackTracer", "native init complete!", new java.lang.Object[0]);
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
            this.f308186d.onProcessForeground();
        } else {
            this.f308186d.onProcessBackground();
        }
    }
}
