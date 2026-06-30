package lw1;

/* loaded from: classes14.dex */
public final class f extends kotlinx.coroutines.p0 implements java.io.Closeable {

    /* renamed from: e, reason: collision with root package name */
    public iw1.f f321552e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Thread f321553f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f321554g = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingDeque f321555h = new java.util.concurrent.LinkedBlockingDeque();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f321556i = new java.util.ArrayList();

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        lw1.m mVar = (lw1.m) context.get(lw1.m.f321560e);
        lw1.k kVar = mVar != null ? mVar.f321562d : null;
        if (kVar instanceof lw1.g) {
            M(this.f321552e, block);
            return;
        }
        if (kVar instanceof lw1.i) {
            M(this.f321552e, new lw1.a(kVar, this, block));
            return;
        }
        if (kVar instanceof lw1.j) {
            if (this.f321553f == null) {
                M(this.f321552e, new lw1.c(this));
            }
            this.f321555h.offer(block);
            return;
        }
        if (kVar instanceof lw1.h) {
            M(this.f321552e, block);
            return;
        }
        java.util.ArrayList arrayList = this.f321556i;
        boolean isEmpty = arrayList.isEmpty();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f321554g;
        if (isEmpty || (linkedBlockingQueue.size() > arrayList.size() && arrayList.size() < 5)) {
            iw1.f fVar = this.f321552e;
            if (fVar == null || (hVar = fVar.f295208e) == null || (eGLContext = hVar.f399294c) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                return;
            } else {
                iw1.a aVar = new iw1.a(linkedBlockingQueue, eGLContext, new lw1.d(arrayList), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                arrayList.add(aVar);
                K(aVar);
            }
        }
        linkedBlockingQueue.offer(block);
    }

    public final java.lang.Thread K(iw1.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f295196m);
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(aVar.f295196m, -4);
        a17.start();
        new android.os.Handler(a17.getLooper()).post(new lw1.e(aVar, a17));
        return a17;
    }

    public final void M(iw1.f fVar, java.lang.Runnable runnable) {
        if (fVar == null || kotlin.jvm.internal.o.b((android.os.HandlerThread) ((jz5.n) fVar.f295206c).getValue(), java.lang.Thread.currentThread())) {
            runnable.run();
            return;
        }
        android.os.Handler handler = fVar.f295205b ? (android.os.Handler) ((jz5.n) fVar.f295207d).getValue() : null;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "close");
        java.util.Iterator it = this.f321556i.iterator();
        while (it.hasNext()) {
            ((iw1.a) it.next()).f295194h = false;
        }
        this.f321554g.clear();
        this.f321555h.clear();
        java.lang.Thread thread = this.f321553f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f321553f = null;
        iw1.f fVar = this.f321552e;
        if (fVar != null) {
            ((android.os.Handler) ((jz5.n) fVar.f295207d).getValue()).post(new iw1.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f295206c).getValue()).quitSafely();
        }
        this.f321552e = null;
    }
}
