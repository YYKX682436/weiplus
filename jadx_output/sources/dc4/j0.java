package dc4;

/* loaded from: classes4.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f228765d;

    public j0(dc4.l0 l0Var) {
        this.f228765d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        dc4.l0 l0Var = this.f228765d;
        android.app.Activity activity = l0Var.f228769p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        if (activity instanceof android.app.Activity) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            if (!l0Var.f228769p.isFinishing()) {
                dc4.l0.l(l0Var).f425155p.c(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                l0Var.f228772s = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                boolean z17 = l0Var.E;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                if (z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdDetailItemNew", "activity isPaused");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                    l0Var.f228774u.j(dc4.l0.l(l0Var).T.f425133c);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$6");
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdDetailItemNew", "onCompletion, postDelayed-run activity isFinished");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$6");
    }
}
