package dr4;

/* loaded from: classes14.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.d2 f242596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(dr4.d2 d2Var) {
        super(0);
        this.f242596d = d2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        rs0.h hVar;
        android.util.Size A;
        dr4.d2 d2Var = this.f242596d;
        dr4.q qVar = d2Var.f242675a ? d2Var.f242681g : d2Var.f242682h;
        boolean z17 = gq4.v.wi().f365977k;
        if (qVar != null) {
            if (!this.f242596d.f242679e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WindowSurfaceRenderer", "pause rendering now");
            } else if (kotlin.jvm.internal.o.b(qVar.a(), android.opengl.EGL14.EGL_NO_SURFACE)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WindowSurfaceRenderer", "render error egl surface:" + qVar);
            } else if (z17) {
                dr4.r1 r1Var = this.f242596d.f242686l;
                if (r1Var != null && (A = r1Var.A()) != null) {
                    dr4.r1 r1Var2 = this.f242596d.f242686l;
                    if (r1Var2 != null) {
                        r1Var2.u(A.getWidth(), A.getHeight());
                    }
                    yz5.q qVar2 = this.f242596d.f242693s;
                    if (qVar2 != null) {
                    }
                    dr4.r1 r1Var3 = this.f242596d.f242686l;
                    if (r1Var3 != null) {
                        r1Var3.f347997f = 1;
                    }
                    hVar = this.f242596d.f242685k;
                    if (hVar != null || hVar.f399293b == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WindowSurfaceRenderer", "error cause eGLEnvironment null");
                    } else {
                        android.opengl.EGLDisplay eGLDisplay = hVar.f399292a;
                        android.opengl.EGLSurface a17 = qVar.a();
                        android.opengl.EGLSurface a18 = qVar.a();
                        rs0.h hVar2 = this.f242596d.f242685k;
                        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, a17, a18, hVar2 != null ? hVar2.f399294c : null);
                        dr4.r1 r1Var4 = this.f242596d.f242686l;
                        if (r1Var4 != null) {
                            r1Var4.o();
                        }
                        rs0.g gVar = rs0.i.f399296a;
                        rs0.h hVar3 = this.f242596d.f242685k;
                        gVar.x(hVar3 != null ? hVar3.f399292a : null, qVar.a());
                    }
                }
            } else {
                dr4.p pVar = qVar.f242731d;
                int i18 = pVar.f242697a;
                if (i18 == 0 || (i17 = pVar.f242698b) == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WindowSurfaceRenderer", "render size zero");
                } else {
                    dr4.r1 r1Var5 = this.f242596d.f242686l;
                    if (r1Var5 != null) {
                        r1Var5.u(i18, i17);
                    }
                    dr4.d2 d2Var2 = this.f242596d;
                    dr4.r1 r1Var6 = d2Var2.f242686l;
                    if (r1Var6 != null) {
                        r1Var6.f347997f = 2;
                    }
                    yz5.q qVar3 = d2Var2.f242693s;
                    if (qVar3 != null) {
                    }
                    hVar = this.f242596d.f242685k;
                    if (hVar != null) {
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.WindowSurfaceRenderer", "error cause eGLEnvironment null");
                }
            }
        } else if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WindowSurfaceRenderer", "error on render surface null");
        } else {
            dr4.d2 d2Var3 = this.f242596d;
            yz5.q qVar4 = d2Var3.f242693s;
            if (qVar4 != null) {
            }
        }
        return jz5.f0.f302826a;
    }
}
