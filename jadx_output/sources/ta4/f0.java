package ta4;

/* loaded from: classes15.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, int i17) {
        super(0);
        this.f416741d = str;
        this.f416742e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f416741d;
        int i17 = this.f416742e;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f416838a;
                ta4.a b17 = ta4.u0.b(u0Var, str);
                if (b17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
                } else {
                    ta4.u0.g(u0Var, b17, ta4.j.f416775m);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinishedImageLoaderQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinishedImageLoaderQueueSize", "com.tencent.mm.plugin.sns.report.Data");
                    ta4.l lVar = b17.f416716n;
                    lVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    lVar.f416798c = i17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoaderQueueSize", "com.tencent.mm.plugin.sns.report.QueueSize");
                    com.tencent.mars.xlog.Log.i("MicroMsg.Image.SnsImageLoadReporter", "imageLoaderFinished:" + str + ", imageLoaderQueueSize:" + i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
                throw th6;
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$imageLoaderFinished$1");
        return f0Var;
    }
}
