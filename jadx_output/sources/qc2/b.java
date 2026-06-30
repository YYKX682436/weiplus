package qc2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qc2.b f361509a = new qc2.b();

    public static void a(qc2.b bVar, int i17, long j17, int i18, long j18, boolean z17, java.lang.String data, int i19, int i27, boolean z18, java.lang.String extraReportInfo, int i28, java.lang.Object obj) {
        if ((i28 & 64) != 0) {
            i19 = 0;
        }
        if ((i28 & 128) != 0) {
            i27 = 0;
        }
        if ((i28 & 256) != 0) {
            z18 = false;
        }
        if ((i28 & 512) != 0) {
            extraReportInfo = "";
        }
        bVar.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(extraReportInfo, "extraReportInfo");
        com.tencent.mars.xlog.Log.i("Finder.AdvertisementReporter", "doReport innerVersion=2 feedId=" + j17 + " commentScene=" + i18 + ", aid=" + j18 + ", isViewable=" + z17 + ", isVideoExpose=" + z18 + ", actionType=" + i17 + ", triggerSource=" + i19 + ", outerDuration=" + i27 + ", extraReportInfo=" + extraReportInfo);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : z18 ? 2 : 0);
        objArr[2] = java.lang.Long.valueOf(j18);
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i27);
        objArr[5] = r26.i0.t(data, ",", ";", false);
        objArr[6] = 0;
        objArr[7] = java.lang.Integer.valueOf(i19);
        objArr[8] = java.lang.Long.valueOf(j17);
        objArr[9] = r26.i0.t(extraReportInfo, ",", ";", false);
        objArr[10] = 2;
        g0Var.d(27032, objArr);
    }
}
