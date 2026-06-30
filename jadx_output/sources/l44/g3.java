package l44;

/* loaded from: classes.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316144d;

    public g3(java.lang.String str) {
        this.f316144d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f316144d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper$1");
        try {
            com.tencent.mars.xlog.Log.i("AdPassThroughInfoHelper", "start send get http req to dest IPv4, url is " + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportStartReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.A(1612, 40);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportStartReqToDestIPv4", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
            hy4.e e17 = hy4.f.e(str, null, null);
            if (e17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1612, 42);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", "not receive http response, url is " + str);
            } else if (e17.f286097a == 200) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportReqToDestIPv4Success", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1612, 41);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportReqToDestIPv4Success", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mars.xlog.Log.i("AdPassThroughInfoHelper", "get http response success, url is " + str);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                g0Var.A(1612, 42);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportReqToDestIPv4Fail", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper");
                com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", "get http response failed, url is " + str + ", statusCode is " + e17.f286097a);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPassThroughInfoHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdPassThroughInfoHelper$1");
    }
}
