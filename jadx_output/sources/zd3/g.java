package zd3;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.k f471609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f471612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f471613h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f471614i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zd3.k kVar, int i17, int i18, int i19, yz5.p pVar, org.json.JSONObject jSONObject) {
        super(1);
        this.f471609d = kVar;
        this.f471610e = i17;
        this.f471611f = i18;
        this.f471612g = i19;
        this.f471613h = pVar;
        this.f471614i = jSONObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        int i17 = this.f471610e;
        if (surfaceTexture == null) {
            this.f471609d.w(lc3.x.f317936c, "surfaceTexture is null, id: " + i17);
        } else {
            int i18 = this.f471611f;
            int i19 = this.f471612g;
            surfaceTexture.setDefaultBufferSize(i18, i19);
            rk0.c.c("MB_External_surface", "registerExternalTexture surface created, w=" + i18 + ", h=" + i19 + ", id=" + i17, new java.lang.Object[0]);
            this.f471613h.invoke(new android.view.Surface(surfaceTexture), this.f471614i);
        }
        return jz5.f0.f302826a;
    }
}
