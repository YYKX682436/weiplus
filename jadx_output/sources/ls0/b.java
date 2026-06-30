package ls0;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f320793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f320795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f320796g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320797h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.opengl.EGLContext eGLContext, ls0.k kVar, int i17, int i18, yz5.l lVar) {
        super(0);
        this.f320793d = eGLContext;
        this.f320794e = kVar;
        this.f320795f = i17;
        this.f320796g = i18;
        this.f320797h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture;
        try {
            if (this.f320793d == null) {
                this.f320794e.getClass();
                this.f320794e.f320851e = rs0.g.n(rs0.i.f399296a, null, null, this.f320795f, this.f320796g, null, 16, null);
                this.f320794e.f320847a.k(true);
                ls0.k kVar = this.f320794e;
                ms0.c cVar = kVar.f320847a;
                synchronized (cVar) {
                    surfaceTexture = cVar.f330953i;
                }
                kVar.f320854h = surfaceTexture;
            } else {
                this.f320794e.getClass();
                this.f320794e.f320851e = rs0.i.f399296a.a(this.f320793d, null, this.f320795f, this.f320796g);
                this.f320794e.f320847a.k(false);
            }
            com.tencent.mars.xlog.Log.i(this.f320794e.f320848b, this.f320794e.hashCode() + " initWithSize finish");
            this.f320794e.f320868v = true;
            yz5.l lVar = this.f320797h;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f320794e.f320848b, e17, "initWithSize error!", new java.lang.Object[0]);
            yz5.l lVar2 = this.f320797h;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
