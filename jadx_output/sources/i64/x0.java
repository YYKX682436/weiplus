package i64;

/* loaded from: classes4.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289356e;

    public x0(i64.b1 b1Var, long j17) {
        this.f289356e = b1Var;
        this.f289355d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$7");
        i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f289356e.f289092g).get(java.lang.Long.valueOf(this.f289355d));
        if (c1Var != null) {
            i64.b1 b1Var = this.f289356e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            b1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            android.app.Activity activity = b1Var.f289099n;
            boolean z17 = activity != null && activity.isFinishing();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "isFinishing:" + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            if (!z17) {
                synchronized (c1Var) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                    if (c1Var.f289121i.f297915g > 0 && c1Var.f289124l == 0) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        c1Var.f289124l = android.os.SystemClock.elapsedRealtime();
                        com.tencent.mars.xlog.Log.i(c1Var.f289113a, "onPausePlay, pauseBeginTime=" + c1Var.f289124l);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$7");
    }
}
