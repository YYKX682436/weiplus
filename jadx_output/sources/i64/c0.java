package i64;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i64.d0 f289112d;

    public c0(i64.d0 d0Var) {
        this.f289112d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        i64.d0 d0Var = this.f289112d;
        boolean z17 = d0Var.f289133a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        if (!z17) {
            d0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            d0Var.a(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic$1");
    }
}
