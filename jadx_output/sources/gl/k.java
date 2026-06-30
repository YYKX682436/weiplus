package gl;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public cv.v0 f272765a;

    /* renamed from: b, reason: collision with root package name */
    public long f272766b;

    public final void a(int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.AudioRouteReportStruct audioRouteReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AudioRouteReportStruct();
        audioRouteReportStruct.f55342e = i17;
        audioRouteReportStruct.f55347j = i18;
        if (i18 == 0 && i19 != -1) {
            cv.v0 v0Var = this.f272765a;
            audioRouteReportStruct.f55348k = audioRouteReportStruct.b("CurrentDevice", java.lang.String.valueOf(v0Var != null ? java.lang.Integer.valueOf(v0Var.f222516a) : null), true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            cv.v0 v0Var2 = this.f272765a;
            sb6.append(v0Var2 != null ? java.lang.Integer.valueOf(v0Var2.f222516a) : null);
            sb6.append('-');
            sb6.append(i19);
            audioRouteReportStruct.f55344g = audioRouteReportStruct.b("RouteTo", sb6.toString(), true);
        }
        audioRouteReportStruct.f55341d = 4;
        audioRouteReportStruct.o();
        audioRouteReportStruct.k();
    }

    public final void b(int i17, cv.v0 targetDevice, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(targetDevice, "targetDevice");
        com.tencent.mm.autogen.mmdata.rpt.AudioRouteReportStruct audioRouteReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AudioRouteReportStruct();
        audioRouteReportStruct.f55342e = i17;
        cv.v0 v0Var = this.f272765a;
        audioRouteReportStruct.f55348k = audioRouteReportStruct.b("CurrentDevice", java.lang.String.valueOf(v0Var != null ? java.lang.Integer.valueOf(v0Var.f222516a) : null), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        cv.v0 v0Var2 = this.f272765a;
        sb6.append(v0Var2 != null ? java.lang.Integer.valueOf(v0Var2.f222516a) : null);
        sb6.append('-');
        sb6.append(targetDevice.f222516a);
        audioRouteReportStruct.f55344g = audioRouteReportStruct.b("RouteTo", sb6.toString(), true);
        long j17 = this.f272766b;
        audioRouteReportStruct.f55346i = j17 != 0 ? android.os.SystemClock.elapsedRealtime() - j17 : 0L;
        audioRouteReportStruct.f55341d = 1;
        audioRouteReportStruct.f55343f = i18;
        audioRouteReportStruct.f55345h = z17 ? 1 : 0;
        audioRouteReportStruct.o();
        audioRouteReportStruct.k();
        this.f272765a = targetDevice;
        this.f272766b = android.os.SystemClock.elapsedRealtime();
    }
}
