package d13;

/* loaded from: classes14.dex */
public final class c implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f225722d;

    /* renamed from: e, reason: collision with root package name */
    public d13.b f225723e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f225724f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.b0 f225725g;

    public c(android.graphics.SurfaceTexture st6) {
        kotlin.jvm.internal.o.g(st6, "st");
        this.f225722d = st6;
        this.f225725g = new androidx.lifecycle.b0(this, true);
        new androidx.lifecycle.j0().observe(this, new d13.a(this));
    }

    public final void a() {
        d13.b bVar = this.f225723e;
        if (bVar != null) {
            b13.g gVar = (b13.g) bVar;
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipMgr", "onSurfaceTextureDestroy");
            dr4.p1 p1Var = gVar.f17102a;
            p1Var.getClass();
            dr4.q renderGLSurface = gVar.f17103b;
            kotlin.jvm.internal.o.g(renderGLSurface, "renderGLSurface");
            dr4.x1 x1Var = p1Var.f242708g;
            if (x1Var != null) {
                x1Var.c(renderGLSurface, gVar.f17104c);
            }
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f225725g;
    }
}
