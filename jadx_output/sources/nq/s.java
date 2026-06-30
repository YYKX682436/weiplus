package nq;

/* loaded from: classes8.dex */
public class s extends java.lang.Thread {
    public nq.q B;
    public final java.lang.ref.WeakReference C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f338900d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f338901e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f338902f;

    /* renamed from: g, reason: collision with root package name */
    public final nq.r f338903g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f338904h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f338905i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f338906m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f338907n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f338908o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f338909p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f338910q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f338911r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f338912s;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f338918y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f338919z = true;
    public final java.lang.Object A = new java.lang.Object();

    /* renamed from: t, reason: collision with root package name */
    public int f338913t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f338914u = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f338916w = true;

    /* renamed from: v, reason: collision with root package name */
    public int f338915v = 1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f338917x = false;

    public s(java.lang.ref.WeakReference weakReference) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("MicroMsg.GLCommandThread" + getId());
        this.f338902f = handlerThread;
        handlerThread.start();
        this.f338903g = new nq.r(this, handlerThread.getLooper());
        this.C = weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nq.s.a():void");
    }

    public final void b(javax.microedition.khronos.opengles.GL10 gl10) {
        mq.h.b("MicroMsg.GLThread", "notifyOnEglSurfaceChanged", new java.lang.Object[0]);
        com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView = (com.tencent.mm.dynamicbackground.view.GameGLSurfaceView) this.C.get();
        if (gameGLSurfaceView != null) {
            nq.f fVar = (nq.f) gameGLSurfaceView.f64883g;
            fVar.getClass();
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLSurfaceChanged and do nothing", new java.lang.Object[0]);
            fVar.f338876j = 0;
        }
    }

    public final boolean c() {
        return !this.f338906m && this.f338907n && !this.f338908o && this.f338913t > 0 && this.f338914u > 0 && (this.f338916w || this.f338915v == 1);
    }

    public final void d() {
        if (this.f338910q) {
            this.f338910q = false;
            com.tencent.mm.dynamicbackground.view.GameGLSurfaceView.f64879s.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("MicroMsg.GLThread" + getId());
        mq.h.b("MicroMsg.GLThread", "starting tid=" + getId(), new java.lang.Object[0]);
        try {
            android.os.Process.setThreadPriority(android.os.Process.myTid(), -8);
        } catch (java.lang.Exception unused) {
        }
        try {
            try {
                a();
            } finally {
                com.tencent.mm.dynamicbackground.view.GameGLSurfaceView.f64879s.a(this);
            }
        } catch (java.lang.InterruptedException e17) {
            mq.h.c("MicroMsg.GLThread", e17, "InterruptedException", new java.lang.Object[0]);
            nq.t tVar = com.tencent.mm.dynamicbackground.view.GameGLSurfaceView.f64879s;
        } catch (java.lang.Throwable th6) {
            mq.h.a("MicroMsg.GLThread", "alvinluo GLThread#run() stack = [%s]", android.util.Log.getStackTraceString(th6));
            com.tencent.mm.dynamicbackground.view.GameGLSurfaceView gameGLSurfaceView = (com.tencent.mm.dynamicbackground.view.GameGLSurfaceView) this.C.get();
            if (gameGLSurfaceView != null) {
                ((nq.f) gameGLSurfaceView.f64883g).e(th6);
            }
        }
    }
}
