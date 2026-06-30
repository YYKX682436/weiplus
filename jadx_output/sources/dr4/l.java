package dr4;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.q f242657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.o f242658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f242659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dr4.q qVar, dr4.o oVar, int i17) {
        super(0);
        this.f242657d = qVar;
        this.f242658e = oVar;
        this.f242659f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.o oVar = this.f242658e;
        dr4.q qVar = this.f242657d;
        if (qVar != null) {
            rs0.h hVar = oVar.f242685k;
            if ((hVar != null ? hVar.f399292a : null) != null) {
                if (kotlin.jvm.internal.o.b(qVar.a(), android.opengl.EGL14.EGL_NO_SURFACE)) {
                    rs0.h hVar2 = oVar.f242685k;
                    if (!kotlin.jvm.internal.o.b(hVar2 != null ? hVar2.f399293b : null, android.opengl.EGL14.EGL_NO_SURFACE)) {
                        rs0.h hVar3 = oVar.f242685k;
                        android.opengl.EGL14.eglDestroySurface(hVar3 != null ? hVar3.f399292a : null, hVar3 != null ? hVar3.f399293b : null);
                    }
                } else {
                    rs0.h hVar4 = oVar.f242685k;
                    android.opengl.EGL14.eglDestroySurface(hVar4 != null ? hVar4.f399292a : null, qVar.a());
                }
            }
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            kotlin.jvm.internal.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            qVar.f242730c = EGL_NO_SURFACE;
            rs0.h hVar5 = oVar.f242685k;
            if (hVar5 != null) {
                hVar5.f399293b = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (this.f242659f == 0) {
                if (kotlin.jvm.internal.o.b(oVar.f242681g, qVar)) {
                    oVar.f242681g = null;
                }
            } else if (kotlin.jvm.internal.o.b(oVar.f242682h, qVar)) {
                oVar.f242682h = null;
            }
            com.tencent.mars.xlog.Log.i(oVar.f242678d, "remove render surface :" + qVar);
        } else {
            com.tencent.mars.xlog.Log.e(oVar.f242678d, "remove a null surface");
        }
        return jz5.f0.f302826a;
    }
}
