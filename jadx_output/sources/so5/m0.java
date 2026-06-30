package so5;

/* loaded from: classes14.dex */
public final class m0 extends android.hardware.camera2.CameraManager.AvailabilityCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so5.n0 f410884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so5.l0 f410885b;

    public m0(so5.n0 n0Var, so5.l0 l0Var) {
        this.f410884a = n0Var;
        this.f410885b = l0Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPCameraStatusManager", "Camera access priorities changed");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        so5.n0 n0Var = this.f410884a;
        if (currentTimeMillis - n0Var.f410894d >= 500) {
            n0Var.f410894d = currentTimeMillis;
            this.f410885b.a();
        }
    }
}
