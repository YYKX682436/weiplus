package um5;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.i0 f429158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f429159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f429160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f429161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429162h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f429163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(um5.i0 i0Var, int i17, int i18, int i19, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f429158d = i0Var;
        this.f429159e = i17;
        this.f429160f = i18;
        this.f429161g = i19;
        this.f429162h = str;
        this.f429163i = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int createTexture = com.tencent.tav.decoder.RenderContext.createTexture(36197);
        um5.i0 i0Var = this.f429158d;
        xm5.b.c(i0Var.f429167t, "newVideoInputTexture id:" + createTexture, new java.lang.Object[0]);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(createTexture);
        um5.z zVar = new um5.z(this.f429162h, new um5.a0(createTexture, true, this.f429159e, this.f429160f, this.f429161g, surfaceTexture), null);
        surfaceTexture.setOnFrameAvailableListener(um5.e0.f429149d);
        i0Var.f429168u.add(zVar);
        xm5.d.b(new um5.f0(this.f429163i, surfaceTexture));
        return jz5.f0.f302826a;
    }
}
