package tc4;

/* loaded from: classes4.dex */
public final class c0 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f417300a;

    public c0(r45.kv2 kv2Var) {
        this.f417300a = kv2Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
        java.lang.String string = this.f417300a.getString(0);
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadFinish", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
        ta4.u0.j(string == null ? "" : string, intValue);
        ta4.u0.h(string == null ? "" : string, -1, -1);
        if (string == null) {
            string = "";
        }
        ta4.u0.o(string);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadFinish", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
    }
}
