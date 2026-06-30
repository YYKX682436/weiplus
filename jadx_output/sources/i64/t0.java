package i64;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f289319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289320f;

    public t0(i64.b1 b1Var, long j17, long j18) {
        this.f289320f = b1Var;
        this.f289318d = j17;
        this.f289319e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$3");
        long j17 = this.f289318d;
        i64.b1 b1Var = this.f289320f;
        if (b1Var.l(j17)) {
            b1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            java.util.HashSet hashSet = b1Var.f289091f;
            long j18 = this.f289319e;
            if (hashSet.contains(java.lang.Long.valueOf(j18))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            } else {
                hashSet.add(java.lang.Long.valueOf(j18));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$3");
    }
}
