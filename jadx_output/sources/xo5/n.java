package xo5;

/* loaded from: classes14.dex */
public final class n implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f455793d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final yo5.e f455794e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f455795f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f455796g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f455797h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f455798i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f455799m;

    /* renamed from: n, reason: collision with root package name */
    public final cp5.j f455800n;

    /* renamed from: o, reason: collision with root package name */
    public final cp5.b f455801o;

    /* renamed from: p, reason: collision with root package name */
    public final bp5.k f455802p;

    public n() {
        yo5.e eVar = new yo5.e(0, "gl_main", 1, null);
        eVar.N(android.opengl.EGL14.EGL_NO_CONTEXT);
        b(this, eVar, null, 1, 1, null);
        this.f455794e = eVar;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(eVar.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f455795f = a17;
        jz5.i iVar = jz5.i.f302830e;
        this.f455796g = jz5.h.a(iVar, new xo5.i(this));
        this.f455797h = jz5.h.a(iVar, new xo5.j(this));
        this.f455798i = jz5.h.a(iVar, new xo5.l(this));
        this.f455799m = jz5.h.a(iVar, new xo5.m(this));
        cp5.j jVar = new cp5.j(eVar);
        a(jVar, eVar, 0);
        this.f455800n = jVar;
        cp5.b bVar = new cp5.b();
        b(this, bVar, null, 0, 1, null);
        this.f455801o = bVar;
        bp5.k kVar = new bp5.k(a17);
        b(this, kVar, null, 0, 1, null);
        this.f455802p = kVar;
    }

    public static /* synthetic */ java.lang.Object b(xo5.n nVar, java.lang.Object obj, oz5.l lVar, int i17, int i18, java.lang.Object obj2) {
        if ((i18 & 1) != 0) {
            lVar = null;
        }
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        nVar.a(obj, lVar, i17);
        return obj;
    }

    public final java.lang.Object a(java.lang.Object obj, oz5.l lVar, int i17) {
        if ((obj instanceof java.io.Closeable ? (java.io.Closeable) obj : null) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.RenderComponentManager", "register " + obj);
            this.f455793d.add(new xo5.b((java.io.Closeable) obj, lVar, i17));
        }
        return obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.RenderComponentManager", "close");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new xo5.g(this, null), 3, null);
    }
}
