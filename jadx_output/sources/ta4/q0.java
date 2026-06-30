package ta4;

/* loaded from: classes15.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f416814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str, int i17, int i18) {
        super(0);
        this.f416812d = str;
        this.f416813e = i17;
        this.f416814f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f416812d;
        int i17 = this.f416813e;
        int i18 = this.f416814f;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f416838a;
                ta4.a b17 = ta4.u0.b(u0Var, str);
                if (b17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
                } else {
                    ta4.u0.g(u0Var, b17, ta4.j.f416772g);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    ta4.l lVar = b17.f416713k;
                    lVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPendingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    lVar.f416796a = i17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPendingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartDownloadQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    ta4.l lVar2 = b17.f416713k;
                    lVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDownloadingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    lVar2.f416797b = i18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDownloadingQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "startDownload:" + str + ", pendingListSize:" + i17 + ", downloadingQueueSize:" + i18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
                throw th6;
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$startDownload$1");
        return f0Var;
    }
}
