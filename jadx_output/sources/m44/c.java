package m44;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323461d;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f323461d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f323461d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter$reportFileAvif$1");
        try {
            java.lang.System.currentTimeMillis();
            if (com.tencent.mm.vfs.w6.j(str)) {
                if (m44.a.f323458a.j(str)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(2001L, 3L);
                    java.lang.System.currentTimeMillis();
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(2001L, 4L);
                    java.lang.System.currentTimeMillis();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdAvifReporter", "reportFileAvif, exp=" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.avif.AdAvifReporter$reportFileAvif$1");
    }
}
