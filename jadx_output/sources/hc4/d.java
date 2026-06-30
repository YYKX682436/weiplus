package hc4;

/* loaded from: classes4.dex */
public final class d implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI f280360d;

    public d(com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI improveSnsTimelineUI) {
        this.f280360d = improveSnsTimelineUI;
    }

    @Override // vj5.k
    public final void n6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI$callback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsTimelineUI", "fixActionBarStuff newHeight=" + i17);
        int i18 = com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI.f168640u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getActionBarContainer$p", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        android.view.View view = this.f280360d.f168641s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getActionBarContainer$p", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        if (view != null) {
            view.setPadding(0, i17, 0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI$callback$1");
    }
}
