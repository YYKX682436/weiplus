package s74;

/* loaded from: classes4.dex */
public final class x0 implements z74.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.z0 f404586a;

    public x0(s74.z0 z0Var) {
        this.f404586a = z0Var;
    }

    @Override // z74.a
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldLoopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$videoCallbackHelper$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.z0 z0Var = this.f404586a;
        z0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        boolean z17 = z0Var.f404624z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        boolean z18 = !z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldLoopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$videoCallbackHelper$1");
        return z18;
    }
}
