package zr0;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.c f475105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f475106e;

    public a(zr0.c cVar, android.opengl.EGLContext eGLContext) {
        this.f475105d = cVar;
        this.f475106e = eGLContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rs0.h n17 = rs0.g.n(rs0.i.f399296a, null, null, 0, 0, this.f475106e, 14, null);
        zr0.c cVar = this.f475105d;
        cVar.f475114h = n17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCustomRenderCallback", "eglSetupBySurface finish,envCost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        cVar.b();
    }
}
