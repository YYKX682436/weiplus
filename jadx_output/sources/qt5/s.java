package qt5;

/* loaded from: classes14.dex */
public class s extends qt5.h {

    /* renamed from: e, reason: collision with root package name */
    public final qt5.i0 f366698e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366699f;

    public s(qt5.i0 i0Var, int i17) {
        this.f366698e = i0Var;
        this.f366699f = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            qt5.d dVar = this.f366688d;
            if (dVar != null) {
                dVar.f366680d = false;
            }
            if (((qt5.c) this.f366698e).f366657b) {
                com.tencent.stubs.logger.Log.i("CameraTask.DefaultOpenTask", "camera is already opened, do not open again");
                return null;
            }
            com.tencent.stubs.logger.Log.i("CameraTask.DefaultOpenTask", "do open camera");
            ((qt5.c) this.f366698e).i(this.f366699f);
            qt5.d dVar2 = ((qt5.c) this.f366698e).f366659d;
            this.f366688d = dVar2;
            if (dVar2 != null) {
                dVar2.f366680d = true;
            }
            ((qt5.c) this.f366698e).n(new qt5.r(this));
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("CameraTask.DefaultOpenTask", e17, "openCamera exception");
            java.lang.String message = e17.getMessage();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (message == null) {
                message = "";
            }
            qt5.d dVar3 = new qt5.d(1002, message, e17);
            this.f366688d = dVar3;
            dVar3.f366680d = true;
            return null;
        }
    }
}
