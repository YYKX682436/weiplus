package et5;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f256674a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f256675b;

    public final void a(com.tencent.wechat.aff.iam_scan.a0 action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanKeyActionReporter", "reportScanKeyAction action: " + action);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(33631, this.f256674a + ',' + this.f256675b + ',' + action.f216946d + ',' + java.lang.System.currentTimeMillis());
    }
}
