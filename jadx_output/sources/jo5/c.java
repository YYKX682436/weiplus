package jo5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.camera2.CameraManager f300934a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f300935b;

    /* renamed from: c, reason: collision with root package name */
    public final jo5.b f300936c;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.camera2.CameraCaptureSession f300937d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f300938e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.Range f300939f;

    public c(android.hardware.camera2.CameraManager cameraManager, java.lang.String cameraId, com.tencent.mm.plugin.voipmp.platform.c facing, jo5.b camera2Device, android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface, android.util.Size size, android.util.Range range, int i17, kotlin.jvm.internal.i iVar) {
        cameraCaptureSession = (i17 & 16) != 0 ? null : cameraCaptureSession;
        surface = (i17 & 64) != 0 ? null : surface;
        range = (i17 & 256) != 0 ? null : range;
        kotlin.jvm.internal.o.g(cameraManager, "cameraManager");
        kotlin.jvm.internal.o.g(cameraId, "cameraId");
        kotlin.jvm.internal.o.g(facing, "facing");
        kotlin.jvm.internal.o.g(camera2Device, "camera2Device");
        this.f300934a = cameraManager;
        this.f300935b = cameraId;
        this.f300936c = camera2Device;
        this.f300937d = cameraCaptureSession;
        this.f300938e = surface;
        this.f300939f = range;
    }
}
