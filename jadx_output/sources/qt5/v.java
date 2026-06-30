package qt5;

/* loaded from: classes14.dex */
public class v extends qt5.n {

    /* renamed from: e, reason: collision with root package name */
    public final qt5.i0 f366702e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f366703f;

    public v(qt5.i0 i0Var, android.graphics.SurfaceTexture surfaceTexture) {
        this.f366702e = i0Var;
        this.f366703f = surfaceTexture;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        qt5.d dVar;
        try {
            qt5.d dVar2 = this.f366696d;
            if (dVar2 != null) {
                dVar2.f366680d = false;
            }
            if (!((qt5.c) this.f366702e).f366657b || ((qt5.c) this.f366702e).f366658c) {
                return null;
            }
            com.tencent.stubs.logger.Log.i("CameraTask.DefaultStartPreviewTask", "do start preview");
            ((qt5.c) this.f366702e).m(this.f366703f);
            this.f366696d = ((qt5.c) this.f366702e).f366661f;
            if (!((qt5.c) this.f366702e).f366660e || (dVar = this.f366696d) == null) {
                return null;
            }
            dVar.f366680d = true;
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("CameraTask.DefaultStartPreviewTask", e17, "startPreview exception");
            java.lang.String message = e17.getMessage();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (message == null) {
                message = "";
            }
            qt5.d dVar3 = new qt5.d(1053, message, e17);
            this.f366696d = dVar3;
            dVar3.f366680d = true;
            return null;
        }
    }
}
