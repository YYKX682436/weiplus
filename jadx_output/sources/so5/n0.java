package so5;

/* loaded from: classes14.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.camera2.CameraManager f410891a;

    /* renamed from: b, reason: collision with root package name */
    public android.hardware.camera2.CameraManager.AvailabilityCallback f410892b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f410893c;

    /* renamed from: d, reason: collision with root package name */
    public long f410894d;

    public final void a(so5.l0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("camera");
        this.f410891a = systemService instanceof android.hardware.camera2.CameraManager ? (android.hardware.camera2.CameraManager) systemService : null;
        this.f410892b = new so5.m0(this, listener);
    }

    public final void b() {
        if (this.f410893c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPCameraStatusManager", "Already monitoring camera availability");
            return;
        }
        this.f410893c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPCameraStatusManager", "Start monitoring camera availability");
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f410891a;
            if (cameraManager != null) {
                android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback = this.f410892b;
                kotlin.jvm.internal.o.d(availabilityCallback);
                cameraManager.registerAvailabilityCallback(availabilityCallback, new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPCameraStatusManager", "Failed to register camera availability callback: %s", e17.getMessage());
            c();
        }
    }

    public final void c() {
        android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback;
        if (!this.f410893c) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPCameraStatusManager", "Already Not monitoring camera availability");
            return;
        }
        this.f410893c = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPCameraStatusManager", "Stop monitoring camera availability");
        try {
            android.hardware.camera2.CameraManager cameraManager = this.f410891a;
            if (cameraManager == null || (availabilityCallback = this.f410892b) == null) {
                return;
            }
            cameraManager.unregisterAvailabilityCallback(availabilityCallback);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPCameraStatusManager", "Failed to unregister camera availability callback: %s", e17.getMessage());
        }
    }
}
