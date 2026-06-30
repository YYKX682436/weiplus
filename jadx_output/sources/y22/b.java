package y22;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.g f459073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f459074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f459075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f459076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y22.g gVar, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        super(0);
        this.f459073d = gVar;
        this.f459074e = surfaceTexture;
        this.f459075f = i17;
        this.f459076g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.SurfaceTexture surfaceTexture;
        android.graphics.SurfaceTexture surfaceTexture2 = this.f459074e;
        y22.g gVar = this.f459073d;
        gVar.f459087g = surfaceTexture2;
        int i17 = this.f459075f;
        int i18 = this.f459076g;
        android.view.Surface surface = new android.view.Surface(gVar.f459087g);
        gVar.f459088h = surface;
        gVar.f459086f = rs0.g.n(rs0.i.f399296a, surface, null, 0, 0, null, 30, null);
        d32.n nVar = gVar.f459084d;
        nVar.onSurfaceCreated(null, null);
        nVar.t(i17, i18);
        nVar.k(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureView", "previewCallback?.invoke");
        yz5.l lVar = gVar.f459091n;
        if (lVar != null) {
            synchronized (nVar) {
                surfaceTexture = nVar.f330953i;
            }
            lVar.invoke(surfaceTexture);
        }
        return jz5.f0.f302826a;
    }
}
