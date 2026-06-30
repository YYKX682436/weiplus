package s74;

/* loaded from: classes4.dex */
public final class l2 implements l44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404407a;

    public l2(s74.o2 o2Var) {
        this.f404407a = o2Var;
    }

    @Override // l44.a
    public final void a(long j17, int i17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$2");
        if (z17) {
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            this.f404407a.d0(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateNewOrderUI", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$2");
    }
}
