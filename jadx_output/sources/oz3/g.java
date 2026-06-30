package oz3;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oz3.g f350269d = new oz3.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_code_enable_ocr_report_for_pay_code, 0) != 1) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            z17 = true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPayCodeOcrReportReporter", "enablePayCodeOcrReport " + valueOf.booleanValue());
        return valueOf;
    }
}
