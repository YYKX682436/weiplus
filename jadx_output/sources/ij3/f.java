package ij3;

/* loaded from: classes14.dex */
public final class f extends kotlinx.coroutines.p0 implements java.io.Closeable {

    /* renamed from: e, reason: collision with root package name */
    public fj3.f f291704e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Thread f291705f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f291706g = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingDeque f291707h = new java.util.concurrent.LinkedBlockingDeque();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f291708i = new java.util.ArrayList();

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        rs0.h hVar;
        android.opengl.EGLContext eGLContext;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        ij3.m mVar = (ij3.m) context.get(ij3.m.f291712e);
        ij3.k kVar = mVar != null ? mVar.f291715d : null;
        if (kVar instanceof ij3.g) {
            M(this.f291704e, block);
            return;
        }
        if (kVar instanceof ij3.i) {
            M(this.f291704e, new ij3.a(kVar, this, block));
            return;
        }
        if (kVar instanceof ij3.j) {
            if (this.f291705f == null) {
                M(this.f291704e, new ij3.c(this));
            }
            this.f291707h.offer(block);
            return;
        }
        if (kVar instanceof ij3.h) {
            M(this.f291704e, block);
            return;
        }
        java.util.ArrayList arrayList = this.f291708i;
        boolean isEmpty = arrayList.isEmpty();
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f291706g;
        if (isEmpty || (linkedBlockingQueue.size() > arrayList.size() && arrayList.size() < 5)) {
            fj3.f fVar = this.f291704e;
            if (fVar == null || (hVar = fVar.f263203e) == null || (eGLContext = hVar.f399294c) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MTR.GLDispatcher", "main gl context is null");
                return;
            }
            fj3.a aVar = new fj3.a(linkedBlockingQueue, eGLContext, new ij3.d(arrayList), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            arrayList.add(aVar);
            zj3.g gVar = zj3.g.f473302a;
            zj3.g.f473319r = java.lang.Math.max(zj3.g.f473319r, arrayList.size());
            K(aVar);
        }
        linkedBlockingQueue.offer(block);
    }

    public final java.lang.Thread K(fj3.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f263191m);
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(aVar.f263191m, -4);
        a17.start();
        new android.os.Handler(a17.getLooper()).post(new ij3.e(aVar, a17));
        return a17;
    }

    public final void M(fj3.f fVar, java.lang.Runnable runnable) {
        if (fVar == null || kotlin.jvm.internal.o.b((android.os.HandlerThread) ((jz5.n) fVar.f263201c).getValue(), java.lang.Thread.currentThread())) {
            runnable.run();
            return;
        }
        android.os.Handler handler = fVar.f263200b ? (android.os.Handler) ((jz5.n) fVar.f263202d).getValue() : null;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "close");
        java.util.Iterator it = this.f291708i.iterator();
        while (it.hasNext()) {
            ((fj3.a) it.next()).f263189h = false;
        }
        this.f291706g.clear();
        this.f291707h.clear();
        java.lang.Thread thread = this.f291705f;
        if (thread != null) {
            thread.interrupt();
        }
        this.f291705f = null;
        fj3.f fVar = this.f291704e;
        if (fVar != null) {
            ((android.os.Handler) ((jz5.n) fVar.f263202d).getValue()).post(new fj3.c(fVar));
            ((android.os.HandlerThread) ((jz5.n) fVar.f263201c).getValue()).quitSafely();
        }
        this.f291704e = null;
    }
}
