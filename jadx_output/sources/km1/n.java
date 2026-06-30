package km1;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(km1.s sVar, yz5.l lVar) {
        super(1);
        this.f309018d = sVar;
        this.f309019e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.tencent.mars.xlog.Log.i(this.f309018d.f309029f, "replaceCallback#setupWebGLExtTextureIfNeed, extTexture: " + surfaceTexture);
        this.f309018d.f309039s = surfaceTexture;
        if (surfaceTexture != null) {
            this.f309019e.invoke(surfaceTexture);
        }
        return jz5.f0.f302826a;
    }
}
