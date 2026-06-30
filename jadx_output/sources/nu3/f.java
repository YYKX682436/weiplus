package nu3;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.f f340210a = new nu3.f();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct f340211b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f340212c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f340213d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f340214e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f340215f;

    public final void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setContentType >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.f55513i = i17;
    }

    public final void b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentLight >> ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.f55520p = i17;
    }

    public final void c(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setEnterScene >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.f55508d = i17;
    }

    public final void d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f340212c = java.lang.String.valueOf(currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", "setEnterTimeStamp >> " + currentTimeMillis + ", " + f340212c);
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = new com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct();
        f340211b = cameraActionsLogStruct;
        cameraActionsLogStruct.f55510f = currentTimeMillis;
        cameraActionsLogStruct.f55519o = cameraActionsLogStruct.b("CameraSessionID", f340212c, true);
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.C = cameraActionsLogStruct2.b("CameraEnterSessionID", f340213d, true);
    }

    public final void e(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setExitResult >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        sb6.append(", ");
        sb6.append(currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 != null) {
            cameraActionsLogStruct2.f55509e = i17;
        }
        if (cameraActionsLogStruct2 != null) {
            cameraActionsLogStruct2.f55511g = currentTimeMillis;
        }
        if (cameraActionsLogStruct2 != null) {
            cameraActionsLogStruct2.D = cameraActionsLogStruct2.b("ChatUserName", f340214e, true);
        }
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct3 = f340211b;
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.E = f340215f;
        }
        if (cameraActionsLogStruct3 != null) {
            cameraActionsLogStruct3.k();
        }
    }

    public final void f(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFinalContentSource >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.f55512h = i17;
    }

    public final void g(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFlashLightStatus >> ");
        sb6.append(i17);
        sb6.append(", ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.f55514j = i17;
    }

    public final void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", "setRecordVideoResult >> code: " + i17);
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = new com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct();
        cameraActionsLogStruct.f55526v = i17;
        cameraActionsLogStruct.k();
    }

    public final void i(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoDuration >> ");
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = f340211b;
        sb6.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
        sb6.append(", ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = f340211b;
        if (cameraActionsLogStruct2 == null) {
            return;
        }
        cameraActionsLogStruct2.f55518n = i17;
    }
}
