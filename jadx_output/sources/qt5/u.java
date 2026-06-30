package qt5;

/* loaded from: classes14.dex */
public class u extends qt5.k {

    /* renamed from: e, reason: collision with root package name */
    public final qt5.i0 f366700e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366701f;

    public u(qt5.i0 i0Var, int i17) {
        this.f366700e = i0Var;
        this.f366701f = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            com.tencent.stubs.logger.Log.i("CameraTask.CameraReOpenTask", "reopen camera");
            ((qt5.c) this.f366700e).a();
            ((qt5.c) this.f366700e).i(this.f366701f);
            qt5.d dVar = ((qt5.c) this.f366700e).f366659d;
            this.f366695d = dVar;
            if (dVar != null) {
                dVar.f366680d = true;
            }
            ((qt5.c) this.f366700e).n(new qt5.t(this));
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("CameraTask.CameraReOpenTask", e17, "reOpenCamera exception");
            qt5.d dVar2 = this.f366695d;
            if (dVar2 == null) {
                return null;
            }
            dVar2.f366680d = true;
            return null;
        }
    }
}
