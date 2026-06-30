package s74;

/* loaded from: classes4.dex */
public final class n2 implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404440a;

    public n2(s74.o2 o2Var) {
        this.f404440a = o2Var;
    }

    @Override // zy2.c6
    public final void a(zy2.dc dcVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateAddFinderBtnInfo$1");
        com.tencent.mm.sdk.platformtools.u3.h(new s74.m2(dcVar, this.f404440a));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateAddFinderBtnInfo$1");
    }
}
