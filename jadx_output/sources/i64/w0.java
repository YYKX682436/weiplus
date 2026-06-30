package i64;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289351e;

    public w0(i64.b1 b1Var, long j17) {
        this.f289351e = b1Var;
        this.f289350d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$6");
        i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f289351e.f289092g).get(java.lang.Long.valueOf(this.f289350d));
        if (c1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            c1Var.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$6");
    }
}
