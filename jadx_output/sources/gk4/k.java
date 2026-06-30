package gk4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk4.x f272587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hk4.a f272588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gk4.r rVar, hk4.x xVar, hk4.a aVar) {
        super(1);
        this.f272586d = rVar;
        this.f272587e = xVar;
        this.f272588f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        gk4.r rVar = this.f272586d;
        com.tencent.mars.xlog.Log.i(rVar.f272602g, "real set videoPlayer inputSurface:" + surfaceTexture);
        hk4.x xVar = this.f272587e;
        xVar.getClass();
        java.lang.String str = xVar.f281985k;
        com.tencent.mars.xlog.Log.i(str, "setInputSurface:" + surfaceTexture);
        kk4.v vVar = xVar.f281986l;
        if (surfaceTexture != null) {
            com.tencent.mars.xlog.Log.i(str, "setInputSurface, default buffer size:[" + xVar.f281989o + ", " + xVar.f281990p + ']');
            int i18 = xVar.f281989o;
            if (i18 > 0 && (i17 = xVar.f281990p) > 0) {
                surfaceTexture.setDefaultBufferSize(i18, i17);
            }
            vVar.J(new android.view.Surface(surfaceTexture), false);
        } else {
            vVar.J(null, false);
        }
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(new gk4.q(rVar, surfaceTexture));
        }
        this.f272588f.f281931j = true;
        return jz5.f0.f302826a;
    }
}
