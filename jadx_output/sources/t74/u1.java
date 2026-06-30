package t74;

/* loaded from: classes4.dex */
public final class u1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416250d;

    public u1(t74.w1 w1Var) {
        this.f416250d = w1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$startPlayByTimeline$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$startPlayByTimeline$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (booleanValue) {
            t74.w1 w1Var = this.f416250d;
            if (t74.w1.l0(w1Var)) {
                com.tencent.mars.xlog.Log.i(w1Var.j(), "startPlayByTimeline, shouldInterceptAction");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$startPlayByTimeline$1$1");
            } else {
                com.tencent.mars.xlog.Log.i(w1Var.j(), "startPlayByTimeline");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInitAnimDone$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                boolean z17 = w1Var.f416270k0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInitAnimDone$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                if (!z17) {
                    t74.w1.B(w1Var);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMCheckVideoCanPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.f416297z0 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMCheckVideoCanPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                t74.w1.f0(w1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$startPlayByTimeline$1$1");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$startPlayByTimeline$1$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$startPlayByTimeline$1$1");
        return f0Var;
    }
}
