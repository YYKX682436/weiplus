package ee0;

/* loaded from: classes15.dex */
public class k implements ca4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fe0.q3 f251474a;

    public k(ee0.l lVar, fe0.q3 q3Var) {
        this.f251474a = q3Var;
    }

    @Override // ca4.a0
    public void a(java.lang.String str, boolean z17, java.lang.String str2, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.feature.sns.AdQRScanService$1");
        try {
            fe0.q3 q3Var = this.f251474a;
            if (q3Var != null) {
                ((av4.p0) q3Var).a(str, z17, str2, bundle);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.feature.sns.AdQRScanService$1");
    }
}
