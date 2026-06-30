package ed4;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew f251314d;

    public m(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew) {
        this.f251314d = fullCardAdTimeLineItemNew;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
        android.app.Activity activity = this.f251314d.f169249f;
        if (activity == null || activity.isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdTimeLineItemNew", "onCompletion, postDelayed-run activity isFinished");
        } else {
            com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew = this.f251314d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            fullCardAdTimeLineItemNew.f169313t = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            if (this.f251314d.f169312s) {
                this.f251314d.f169311r.D0.f425155p.c(true);
                com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew2 = this.f251314d;
                fullCardAdTimeLineItemNew2.f169316w.j(fullCardAdTimeLineItemNew2.f169311r.D0.T.f425133c);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
    }
}
