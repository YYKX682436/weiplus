package i64;

/* loaded from: classes4.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f289326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289327f;

    public u0(i64.b1 b1Var, long j17, long j18, boolean z17) {
        this.f289327f = b1Var;
        this.f289325d = j17;
        this.f289326e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$4");
        i64.b1 b1Var = this.f289327f;
        long j17 = this.f289325d;
        if (b1Var.l(j17)) {
            b1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayStartTimeImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            java.util.HashMap hashMap = (java.util.HashMap) b1Var.f289092g;
            i64.c1 c1Var = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (i64.c1) hashMap.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
            j64.b bVar = c1Var.f289121i;
            if (bVar.f297915g == 0) {
                bVar.f297915g = this.f289326e;
            }
            hashMap.put(java.lang.Long.valueOf(j17), c1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayStartTimeImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$4");
    }
}
