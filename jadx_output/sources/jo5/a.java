package jo5;

/* loaded from: classes14.dex */
public final class a extends android.hardware.camera2.CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jo5.b f300924a;

    public a(jo5.b bVar) {
        this.f300924a = bVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(android.hardware.camera2.CameraDevice camera) {
        kotlin.jvm.internal.o.g(camera, "camera");
        com.tencent.mm.plugin.voipmp.platform.e eVar = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusClosed;
        jo5.b bVar = this.f300924a;
        bVar.f300930f = eVar;
        bVar.f300931g.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(android.hardware.camera2.CameraDevice camera) {
        kotlin.jvm.internal.o.g(camera, "camera");
        jo5.b bVar = this.f300924a;
        java.lang.String str = bVar.f300926b;
        camera.close();
        bVar.f300929e = null;
        bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusDisconnected;
        bVar.f300931g.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(android.hardware.camera2.CameraDevice camera, int i17) {
        kotlin.jvm.internal.o.g(camera, "camera");
        jo5.b bVar = this.f300924a;
        java.lang.String str = bVar.f300926b;
        camera.close();
        bVar.f300929e = null;
        if (i17 == 1 || i17 == 3) {
            bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusDisconnected;
        } else {
            bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusClosed;
        }
        bVar.f300931g.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(android.hardware.camera2.CameraDevice camera) {
        kotlin.jvm.internal.o.g(camera, "camera");
        jo5.b bVar = this.f300924a;
        bVar.f300929e = camera;
        bVar.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusOpened;
        bVar.f300932h = true;
        bVar.f300931g.release();
    }
}
