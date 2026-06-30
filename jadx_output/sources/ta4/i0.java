package ta4;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f416766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f416767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, int i17, int i18) {
        super(0);
        this.f416765d = str;
        this.f416766e = i17;
        this.f416767f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
        java.lang.Object d17 = ta4.u0.d();
        java.lang.String str = this.f416765d;
        int i17 = this.f416766e;
        int i18 = this.f416767f;
        synchronized (d17) {
            try {
                ta4.u0 u0Var = ta4.u0.f416838a;
                ta4.a b17 = ta4.u0.b(u0Var, str);
                if (b17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
                } else {
                    if (i17 == 0 && i18 == 0) {
                        ta4.u0.g(u0Var, b17, ta4.j.f416784v);
                    } else {
                        ta4.u0.g(u0Var, b17, ta4.j.f416785w);
                        ta4.u0.f(u0Var, b17);
                        kz5.h0.A(ta4.u0.e(), new ta4.h0(b17));
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter$netSceneSnsDownloadFinish$1");
            }
        }
        return jz5.f0.f302826a;
    }
}
