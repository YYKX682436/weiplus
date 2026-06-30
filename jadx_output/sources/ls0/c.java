package ls0;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f320809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f320811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320812g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.opengl.EGLContext eGLContext, ls0.k kVar, android.view.Surface surface, yz5.l lVar) {
        super(0);
        this.f320809d = eGLContext;
        this.f320810e = kVar;
        this.f320811f = surface;
        this.f320812g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture;
        try {
            if (this.f320809d == null) {
                this.f320810e.getClass();
                this.f320810e.f320851e = rs0.g.n(rs0.i.f399296a, this.f320811f, null, 0, 0, null, 30, null);
                this.f320810e.f320847a.k(true);
                ls0.k kVar = this.f320810e;
                ms0.c cVar = kVar.f320847a;
                synchronized (cVar) {
                    surfaceTexture = cVar.f330953i;
                }
                kVar.f320854h = surfaceTexture;
            } else {
                this.f320810e.getClass();
                this.f320810e.f320851e = rs0.i.f399296a.a(this.f320809d, this.f320811f, 0, 0);
                this.f320810e.f320847a.k(false);
            }
            this.f320810e.f320868v = true;
            yz5.l lVar = this.f320812g;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f320810e.f320848b, e17, "initWithSurface failed", new java.lang.Object[0]);
            yz5.l lVar2 = this.f320812g;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
