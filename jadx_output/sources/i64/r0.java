package i64;

/* loaded from: classes4.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289301e;

    public r0(i64.b1 b1Var, long j17, boolean z17) {
        this.f289301e = b1Var;
        this.f289300d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$1");
        i64.b1 b1Var = this.f289301e;
        long j17 = this.f289300d;
        if (b1Var.l(j17)) {
            b1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addVideoCountImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            java.util.HashMap hashMap = (java.util.HashMap) b1Var.f289092g;
            i64.c1 c1Var = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (i64.c1) hashMap.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
            c1Var.f289114b = 1;
            c1Var.f289121i.f297910b++;
            hashMap.put(java.lang.Long.valueOf(j17), c1Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addVideoCountImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$1");
    }
}
