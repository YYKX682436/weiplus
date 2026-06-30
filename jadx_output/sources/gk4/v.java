package gk4;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f272632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rs0.h f272633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk4.h0 h0Var, android.graphics.SurfaceTexture surfaceTexture, rs0.h hVar) {
        super(0);
        this.f272631d = h0Var;
        this.f272632e = surfaceTexture;
        this.f272633f = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs0.h hVar;
        gk4.h0 h0Var = this.f272631d;
        android.graphics.SurfaceTexture surfaceTexture = h0Var.f272559d;
        java.lang.String str = h0Var.f272556a;
        if (surfaceTexture != null && (hVar = h0Var.f272562g) != null) {
            com.tencent.mars.xlog.Log.i(str, "do detachSurface");
            rs0.g gVar = rs0.i.f399296a;
            android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
            kotlin.jvm.internal.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
            gVar.p(hVar, EGL_NO_SURFACE);
            hVar.f399293b = android.opengl.EGL14.EGL_NO_SURFACE;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do attachSurface:");
        android.graphics.SurfaceTexture surfaceTexture2 = this.f272632e;
        sb6.append(surfaceTexture2.hashCode());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        h0Var.f272559d = surfaceTexture2;
        rs0.g gVar2 = rs0.i.f399296a;
        rs0.h hVar2 = this.f272633f;
        h0Var.f272562g = gVar2.j(hVar2.f399294c, hVar2.f399292a, new android.view.Surface(surfaceTexture2));
        return jz5.f0.f302826a;
    }
}
