package qt5;

/* loaded from: classes14.dex */
public class q extends qt5.e {

    /* renamed from: d, reason: collision with root package name */
    public final qt5.i0 f366697d;

    public q(qt5.i0 i0Var) {
        this.f366697d = i0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            if (((qt5.c) this.f366697d).f366657b) {
                ((qt5.c) this.f366697d).a();
                com.tencent.stubs.logger.Log.i("CameraTask.DefaultCloseTask", "close camera done");
            } else {
                com.tencent.stubs.logger.Log.w("CameraTask.DefaultCloseTask", "camera is closed, do not close again");
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("CameraTask.DefaultCloseTask", e17, "closeCamera exception");
            return null;
        }
    }
}
