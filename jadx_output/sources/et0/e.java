package et0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f256532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f256533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f256534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f256535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(et0.k kVar, int i17, int i18, android.view.Surface surface) {
        super(0);
        this.f256532d = kVar;
        this.f256533e = i17;
        this.f256534f = i18;
        this.f256535g = surface;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        et0.k kVar = this.f256532d;
        kVar.getClass();
        android.view.Surface surface = this.f256535g;
        kVar.f256544e = surface;
        kVar.f256543d = rs0.g.n(rs0.i.f399296a, surface, null, 0, 0, null, 30, null);
        ms0.c cVar = kVar.f256547h;
        if (cVar != null) {
            cVar.onSurfaceCreated(null, null);
        }
        ms0.c cVar2 = kVar.f256547h;
        if (cVar2 != null) {
            cVar2.t(this.f256533e, this.f256534f);
        }
        ms0.c cVar3 = kVar.f256547h;
        if (cVar3 != null) {
            cVar3.k(true);
        }
        kVar.f256549m = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewGLTextureRender", "previewCallback?.invoke");
        yz5.l lVar = kVar.f256550n;
        if (lVar != null) {
            ft0.d dVar = kVar.f256548i;
            lVar.invoke(dVar != null ? dVar.b() : null);
        }
        return jz5.f0.f302826a;
    }
}
