package ls0;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f320786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f320787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f320788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320789h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ls0.k kVar, android.view.Surface surface, int i17, int i18, yz5.l lVar) {
        super(0);
        this.f320785d = kVar;
        this.f320786e = surface;
        this.f320787f = i17;
        this.f320788g = i18;
        this.f320789h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture;
        try {
            this.f320785d.getClass();
            this.f320785d.f320851e = rs0.g.n(rs0.i.f399296a, this.f320786e, null, this.f320787f, this.f320788g, null, 18, null);
            this.f320785d.f320847a.k(true);
            ls0.k kVar = this.f320785d;
            ms0.c cVar = kVar.f320847a;
            synchronized (cVar) {
                surfaceTexture = cVar.f330953i;
            }
            kVar.f320854h = surfaceTexture;
            ls0.k kVar2 = this.f320785d;
            android.graphics.SurfaceTexture surfaceTexture2 = kVar2.f320854h;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setOnFrameAvailableListener(new ls0.j(kVar2));
            }
            this.f320785d.f320868v = true;
            yz5.l lVar = this.f320789h;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f320785d.f320848b, e17, "initWithSurface failed", new java.lang.Object[0]);
            yz5.l lVar2 = this.f320789h;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
