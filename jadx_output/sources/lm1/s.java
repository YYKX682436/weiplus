package lm1;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm1.t f319357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f319358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(lm1.t tVar, android.view.Surface surface) {
        super(1);
        this.f319357d = tVar;
        this.f319358e = surface;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCanvasExtTextureProducerMBImpl", "replaceCallback, newTexture: " + surfaceTexture);
        if (surfaceTexture == null) {
            bg.f fVar = this.f319357d.f319359a;
            if (fVar == null) {
                kotlin.jvm.internal.o.o("videoPluginHandler");
                throw null;
            }
            fVar.Q(new bg.p0(fVar, this.f319358e));
        } else {
            android.view.Surface surface = this.f319357d.f319364f;
            if (surface != null) {
                surface.release();
            }
            this.f319357d.f319364f = new android.view.Surface(surfaceTexture);
            lm1.t tVar = this.f319357d;
            bg.f fVar2 = tVar.f319359a;
            if (fVar2 == null) {
                kotlin.jvm.internal.o.o("videoPluginHandler");
                throw null;
            }
            fVar2.Q(new bg.p0(fVar2, tVar.f319364f));
        }
        return jz5.f0.f302826a;
    }
}
