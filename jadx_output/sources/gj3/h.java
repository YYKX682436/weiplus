package gj3;

/* loaded from: classes14.dex */
public final class h implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f272392d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public boolean f272393e = true;

    /* renamed from: f, reason: collision with root package name */
    public final ij3.f f272394f;

    /* renamed from: g, reason: collision with root package name */
    public final nj3.j f272395g;

    /* renamed from: h, reason: collision with root package name */
    public final nj3.b f272396h;

    /* renamed from: i, reason: collision with root package name */
    public final jj3.j f272397i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f272398m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f272399n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f272400o;

    public h() {
        rs0.h hVar;
        ij3.f fVar = new ij3.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "create new worker");
        fj3.f fVar2 = new fj3.f(0, 1, null);
        fj3.f fVar3 = fVar.f291704e;
        android.opengl.EGLContext eGLContext = (fVar3 == null || (hVar = fVar3.f263203e) == null || (eGLContext = hVar.f399294c) == null) ? android.opengl.EGL14.EGL_NO_CONTEXT : eGLContext;
        com.tencent.mars.xlog.Log.i(fVar2.f263199a, "bindGLEnvironment");
        ((android.os.HandlerThread) ((jz5.n) fVar2.f263201c).getValue()).start();
        ((android.os.Handler) ((jz5.n) fVar2.f263202d).getValue()).post(new fj3.b(fVar2, eGLContext));
        fVar.f291704e = fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.GLDispatcher", "create main GLThread");
        b(this, fVar, null, 1, 1, null);
        this.f272394f = fVar;
        nj3.j jVar = new nj3.j(fVar);
        b(this, jVar, fVar.plus(ij3.m.f291713f), 0, 2, null);
        this.f272395g = jVar;
        nj3.b bVar = new nj3.b();
        b(this, bVar, null, 0, 3, null);
        this.f272396h = bVar;
        jj3.j jVar2 = new jj3.j(kotlinx.coroutines.z0.a(fVar.plus(kotlinx.coroutines.t3.a(null, 1, null))));
        b(this, jVar2, null, 0, 3, null);
        this.f272397i = jVar2;
        this.f272398m = jz5.h.b(new gj3.e(this));
        this.f272399n = jz5.h.b(new gj3.g(this));
        this.f272400o = jz5.h.b(new gj3.f(this));
    }

    public static java.lang.Object b(gj3.h hVar, java.lang.Object obj, oz5.l lVar, int i17, int i18, java.lang.Object obj2) {
        if ((i18 & 1) != 0) {
            lVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        hVar.getClass();
        if ((obj instanceof java.io.Closeable ? (java.io.Closeable) obj : null) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRContext", "register " + obj);
            hVar.f272392d.add(new gj3.b((java.io.Closeable) obj, lVar, i17));
        }
        return obj;
    }

    public final fj3.k a() {
        return (fj3.k) ((jz5.n) this.f272399n).getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRContext", "close");
        this.f272393e = false;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new gj3.d(this, null), 3, null);
    }
}
