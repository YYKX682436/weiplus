package qt5;

/* loaded from: classes14.dex */
public class w extends qt5.o {

    /* renamed from: d, reason: collision with root package name */
    public final qt5.i0 f366704d;

    public w(qt5.i0 i0Var) {
        this.f366704d = i0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            if (((qt5.c) this.f366704d).f366658c) {
                com.tencent.stubs.logger.Log.i("CameraTask.DefaultStopPreviewTask", "stop preview");
                qt5.c cVar = (qt5.c) this.f366704d;
                android.hardware.Camera camera = cVar.f366656a;
                if (camera != null) {
                    camera.stopPreview();
                    cVar.f366658c = false;
                    cVar.f366660e = false;
                    cVar.f366661f = null;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("CameraTask.DefaultStopPreviewTask", e17, "stopPreview exception");
        }
        return null;
    }
}
