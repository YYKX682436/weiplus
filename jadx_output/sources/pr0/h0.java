package pr0;

/* loaded from: classes14.dex */
public abstract class h0 extends pr0.n {

    /* renamed from: r, reason: collision with root package name */
    public static int f357842r;

    public h0() {
        as0.a aVar = as0.a.f13425a;
        int i17 = this.f357833d;
        int i18 = f357842r;
        f357842r = i18 + 1;
        android.util.SparseArray sparseArray = as0.a.f13426b;
        if (sparseArray.get(i17) == null) {
            sparseArray.put(i17, new com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct());
        }
        java.lang.Object obj = sparseArray.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct cameraReportStruct = (com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct) obj;
        cameraReportStruct.f55564m = java.lang.System.currentTimeMillis();
        qr0.a aVar2 = qr0.a.f366055a;
        cameraReportStruct.f55556e = aVar2.d(true) ? 2 : 1;
        cameraReportStruct.f55557f = aVar2.a();
        cameraReportStruct.f55573v = aVar2.c() ? 1 : 0;
        com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo = nr0.a.f339066c;
        cameraReportStruct.F = cameraReportStruct.b("FrontCameraId", cameraSupportInfo.f68856d, true);
        cameraReportStruct.G = cameraReportStruct.b("FrontCameraSupportLevel", cameraSupportInfo.f68859g, true);
        com.tencent.mm.media.camera.CameraSupportInfo cameraSupportInfo2 = nr0.a.f339067d;
        cameraReportStruct.H = cameraReportStruct.b("BackCameraId", cameraSupportInfo2.f68856d, true);
        cameraReportStruct.I = cameraReportStruct.b("BackCameraSupportLevel", cameraSupportInfo2.f68859g, true);
        cameraReportStruct.f55553J = i18;
    }
}
