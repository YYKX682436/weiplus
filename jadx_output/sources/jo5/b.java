package jo5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.camera2.CameraManager f300925a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f300926b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.Executor f300927c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f300928d;

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.camera2.CameraDevice f300929e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.e f300930f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f300931g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f300932h;

    /* renamed from: i, reason: collision with root package name */
    public final jo5.a f300933i;

    public b(android.hardware.camera2.CameraManager cameraManager, java.lang.String cameraId, java.util.concurrent.Executor executor, android.os.Handler handler) {
        kotlin.jvm.internal.o.g(cameraManager, "cameraManager");
        kotlin.jvm.internal.o.g(cameraId, "cameraId");
        kotlin.jvm.internal.o.g(executor, "executor");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f300925a = cameraManager;
        this.f300926b = cameraId;
        this.f300927c = executor;
        this.f300928d = handler;
        this.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusUninitialized;
        this.f300931g = new java.util.concurrent.Semaphore(0);
        this.f300933i = new jo5.a(this);
        this.f300930f = com.tencent.mm.plugin.voipmp.platform.e.VoIPMPCameraStatusInitialized;
    }
}
