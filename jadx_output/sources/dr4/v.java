package dr4;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.q f242751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(dr4.c0 c0Var, dr4.q qVar, yz5.l lVar) {
        super(0);
        this.f242750d = c0Var;
        this.f242751e = qVar;
        this.f242752f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs0.h hVar = this.f242750d.f242601d;
        if (hVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseSurface:");
            dr4.q qVar = this.f242751e;
            java.lang.Object obj = qVar.f242729b;
            sb6.append(obj != null ? obj.hashCode() : 0);
            sb6.append(", ");
            sb6.append(qVar.a().hashCode());
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", sb6.toString());
            rs0.g gVar = rs0.i.f399296a;
            android.opengl.EGLSurface a17 = qVar.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.GLEnvironmentUtil", "eglUnbindSurface");
            android.opengl.EGL14.eglDestroySurface(hVar.f399292a, a17);
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            kotlin.jvm.internal.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            qVar.f242730c = EGL_NO_SURFACE;
            yz5.l lVar = this.f242752f;
            if (lVar != null) {
                lVar.invoke(qVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
