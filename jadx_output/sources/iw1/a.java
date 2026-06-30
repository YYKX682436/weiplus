package iw1;

/* loaded from: classes13.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static int f295189o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f295190d;

    /* renamed from: e, reason: collision with root package name */
    public final android.opengl.EGLContext f295191e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f295192f;

    /* renamed from: g, reason: collision with root package name */
    public final long f295193g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f295194h;

    /* renamed from: i, reason: collision with root package name */
    public final int f295195i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f295196m;

    /* renamed from: n, reason: collision with root package name */
    public rs0.h f295197n;

    public a(java.util.concurrent.BlockingQueue workerQueue, android.opengl.EGLContext sharedEGLContext, yz5.l onComplete, long j17) {
        kotlin.jvm.internal.o.g(workerQueue, "workerQueue");
        kotlin.jvm.internal.o.g(sharedEGLContext, "sharedEGLContext");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        this.f295190d = workerQueue;
        this.f295191e = sharedEGLContext;
        this.f295192f = onComplete;
        this.f295193g = j17;
        this.f295194h = true;
        int i17 = f295189o;
        f295189o = i17 + 1;
        this.f295195i = i17;
        this.f295196m = "MicroMsg.MTR.GLEnvironmentRunnable-" + i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object m521constructorimpl;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i(this.f295196m, "start run, shareContext " + this.f295191e);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.os.Process.setThreadPriority(-10);
        } else {
            android.os.Process.setThreadPriority(-1);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(rs0.i.f399296a.m(null, null, 1, 1, this.f295191e));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        rs0.h hVar = (rs0.h) m521constructorimpl;
        if (hVar != null) {
            android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
            android.opengl.EGLSurface eGLSurface = hVar.f399293b;
            android.opengl.EGLSurface eGLSurface2 = eGLSurface == null ? android.opengl.EGL14.EGL_NO_SURFACE : eGLSurface;
            if (eGLSurface == null) {
                eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface, hVar.f399294c);
            com.tencent.mars.xlog.Log.i(this.f295196m, "eglMakeCurrent");
        } else {
            com.tencent.mars.xlog.Log.e(this.f295196m, "create gl environment error");
            this.f295194h = false;
            hVar = null;
        }
        this.f295197n = hVar;
        try {
            try {
                com.tencent.mars.xlog.Log.i(this.f295196m, "enter loop " + this.f295195i);
                while (this.f295194h) {
                    long j17 = this.f295193g;
                    java.lang.Runnable runnable = j17 > 0 ? (java.lang.Runnable) this.f295190d.poll(j17, java.util.concurrent.TimeUnit.MILLISECONDS) : (java.lang.Runnable) this.f295190d.take();
                    if (runnable != null) {
                        runnable.run();
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        this.f295194h = false;
                        com.tencent.mars.xlog.Log.w(this.f295196m, "timeout, quit");
                    }
                }
                com.tencent.mars.xlog.Log.i(this.f295196m, "quit loop " + this.f295195i);
                this.f295192f.invoke(this);
                str = this.f295196m;
                sb6 = new java.lang.StringBuilder("release gl environment ");
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.w(this.f295196m, "on interrupt " + this.f295195i + ' ' + e17 + ' ');
                this.f295192f.invoke(this);
                str = this.f295196m;
                sb6 = new java.lang.StringBuilder("release gl environment ");
            }
            sb6.append(this.f295195i);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            rs0.i.f399296a.u(this.f295197n);
        } catch (java.lang.Throwable th7) {
            this.f295192f.invoke(this);
            com.tencent.mars.xlog.Log.i(this.f295196m, "release gl environment " + this.f295195i);
            rs0.i.f399296a.u(this.f295197n);
            throw th7;
        }
    }
}
