package dc4;

/* loaded from: classes4.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f228865d;

    public y(dc4.d0 d0Var) {
        this.f228865d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
        dc4.d0 d0Var = this.f228865d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = d0Var.f228832e;
        if (snsInfo != null && snsInfo.isAdForbidAutoPlay()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "forbidAutoPlay");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            d0Var.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
            return;
        }
        if (d0Var.X.w() || d0Var.X.f0()) {
            d0Var.X.K();
        } else {
            l44.b3.f316041a.h(d0Var.f228832e);
            d0Var.X.C();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
    }
}
