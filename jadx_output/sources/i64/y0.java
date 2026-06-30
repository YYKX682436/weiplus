package i64;

/* loaded from: classes4.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f289361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289362f;

    public y0(i64.b1 b1Var, long j17, long j18) {
        this.f289362f = b1Var;
        this.f289360d = j17;
        this.f289361e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$8");
        i64.c1 c1Var = (i64.c1) this.f289362f.f289092g.get(java.lang.Long.valueOf(this.f289360d));
        if (c1Var != null) {
            c1Var.f289125m = this.f289361e;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$8");
    }
}
