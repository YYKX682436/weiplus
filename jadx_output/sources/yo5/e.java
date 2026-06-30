package yo5;

/* loaded from: classes14.dex */
public final class e extends kotlinx.coroutines.p0 implements java.io.Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static int f464358o;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f464359e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f464360f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f464361g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f464362h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f464363i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f464364m;

    /* renamed from: n, reason: collision with root package name */
    public dp5.d f464365n;

    public e(int i17, java.lang.String name, int i18, kotlin.jvm.internal.i iVar) {
        if ((i18 & 1) != 0) {
            i17 = f464358o;
            f464358o = i17 + 1;
        }
        name = (i18 & 2) != 0 ? "" : name;
        kotlin.jvm.internal.o.g(name, "name");
        this.f464359e = "MicroMsg.MVR.GLHandlerThread-" + name + '-' + i17;
        this.f464361g = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f464362h = jz5.h.b(new yo5.d(name, i17));
        this.f464363i = jz5.h.b(new yo5.c(this));
        this.f464364m = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    @Override // kotlinx.coroutines.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(block, "block");
        if (kotlin.jvm.internal.o.b(M(), java.lang.Thread.currentThread())) {
            block.run();
            return;
        }
        android.os.Handler K = this.f464360f ? K() : null;
        if (K != null) {
            K.post(block);
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f464361g.readLock();
        readLock.lock();
        try {
            if (this.f464360f) {
                com.tencent.mars.xlog.Log.i(this.f464359e, "direct dispatch in lock scope");
                K().post(block);
            } else {
                com.tencent.mars.xlog.Log.i(this.f464359e, "enqueue block");
                this.f464364m.add(block);
            }
        } finally {
            readLock.unlock();
        }
    }

    public final android.os.Handler K() {
        return (android.os.Handler) ((jz5.n) this.f464363i).getValue();
    }

    public final android.os.HandlerThread M() {
        return (android.os.HandlerThread) ((jz5.n) this.f464362h).getValue();
    }

    public final void N(android.opengl.EGLContext eGLContext) {
        com.tencent.mars.xlog.Log.i(this.f464359e, "bindGLEnvironment");
        M().start();
        K().post(new yo5.a(this, eGLContext));
    }

    public final boolean O() {
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), M().getLooper())) {
            P();
        } else {
            K().post(new yo5.b(this));
        }
        return M().quitSafely();
    }

    public final void P() {
        com.tencent.mars.xlog.Log.i(this.f464359e, "release gl environment, " + this.f464365n);
        dp5.d dVar = this.f464365n;
        if (dVar != null) {
            dp5.c cVar = dp5.c.f242278a;
            ((dp5.b) dp5.c.f242279b).getClass();
            android.opengl.EGLDisplay eGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            android.opengl.EGLSurface eGLSurface = dVar.f242281b;
            if (eGLSurface != eGLDisplay) {
                android.opengl.EGLSurface eGLSurface2 = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGLContext eGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
                android.opengl.EGLDisplay eGLDisplay2 = dVar.f242280a;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContext);
                android.opengl.EGL14.eglDestroySurface(eGLDisplay2, eGLSurface);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy eglContext: ");
                android.opengl.EGLContext eGLContext2 = dVar.f242282c;
                sb6.append(eGLContext2.getNativeHandle());
                com.tencent.mars.xlog.Log.i("MicroMsg.GLEnvOp", sb6.toString());
                android.opengl.EGL14.eglDestroyContext(eGLDisplay2, eGLContext2);
                android.opengl.EGL14.eglReleaseThread();
                android.opengl.EGL14.eglTerminate(eGLDisplay2);
            }
        }
        this.f464365n = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i(this.f464359e, "close");
        O();
    }
}
