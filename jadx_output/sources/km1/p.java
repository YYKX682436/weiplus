package km1;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(km1.s sVar) {
        super(1);
        this.f309021d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture cameraPreviewSurface = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(cameraPreviewSurface, "cameraPreviewSurface");
        km1.a aVar = km1.s.E;
        this.f309021d.u(cameraPreviewSurface);
        return jz5.f0.f302826a;
    }
}
