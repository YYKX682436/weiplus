package t74;

/* loaded from: classes4.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.y1 f416300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f416301e;

    public x1(t74.y1 y1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f416300d = y1Var;
        this.f416301e = snsInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem$refreshView$1");
        t74.y1 y1Var = this.f416300d;
        y1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
        if (!y1Var.f416308s.isFinishing()) {
            l44.b3.f316041a.h(this.f416301e);
            y1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdFlipCardLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdFlipCardLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem");
            y1Var.f416312w.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardDetailItem$refreshView$1");
    }
}
