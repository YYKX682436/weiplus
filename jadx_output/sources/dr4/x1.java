package dr4;

/* loaded from: classes14.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.p f242761a;

    /* renamed from: b, reason: collision with root package name */
    public dr4.c0 f242762b;

    /* renamed from: c, reason: collision with root package name */
    public dr4.d2 f242763c;

    /* renamed from: d, reason: collision with root package name */
    public dr4.n0 f242764d;

    /* renamed from: e, reason: collision with root package name */
    public dr4.h f242765e;

    public x1(yz5.p queueScope) {
        kotlin.jvm.internal.o.g(queueScope, "queueScope");
        this.f242761a = queueScope;
    }

    public final void a(dr4.q qVar, int i17) {
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipWindowsSurfaceRenderer", "add a null surface");
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoipWindowsSurfaceRenderer", "add render surface renderSide " + i17 + " and :" + qVar, new java.lang.Object[0]);
        dr4.d2 d2Var = this.f242763c;
        if (d2Var != null) {
            d2Var.a(qVar, i17);
        }
        dr4.n0 n0Var = this.f242764d;
        if (n0Var != null) {
            n0Var.a(qVar, i17);
        }
    }

    public final boolean b(dr4.q glSurface) {
        boolean z17;
        java.lang.Object obj;
        rs0.h hVar;
        kotlin.jvm.internal.o.g(glSurface, "glSurface");
        dr4.c0 c0Var = this.f242762b;
        if (c0Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "createSurface:" + glSurface);
        if (!glSurface.b()) {
            return false;
        }
        synchronized (glSurface.f242733f) {
            z17 = glSurface.f242732e;
        }
        if (z17 || (obj = glSurface.f242729b) == null || (hVar = c0Var.f242601d) == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "start createEGLSurface:" + obj.hashCode());
        glSurface.f242730c = rs0.i.f399296a.k(hVar.f399292a, obj);
        glSurface.c(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "createSurface finished:" + obj.hashCode() + ", " + glSurface.a().hashCode());
        return true;
    }

    public final void c(dr4.q qVar, int i17) {
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipWindowsSurfaceRenderer", "remove a null surface");
            return;
        }
        dr4.d2 d2Var = this.f242763c;
        if (d2Var != null) {
            d2Var.g(qVar, i17);
        }
        dr4.n0 n0Var = this.f242764d;
        if (n0Var != null) {
            n0Var.g(qVar, i17);
        }
    }

    public final void d() {
        dr4.d2 d2Var = this.f242763c;
        if (d2Var != null) {
            d2Var.j();
        }
        dr4.n0 n0Var = this.f242764d;
        if (n0Var != null) {
            n0Var.j();
        }
    }
}
