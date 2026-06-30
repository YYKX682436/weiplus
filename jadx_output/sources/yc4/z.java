package yc4;

/* loaded from: classes4.dex */
public final class z extends yc4.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.sns.ui.improve.component.w1 uic) {
        super(uic);
        kotlin.jvm.internal.o.g(uic, "uic");
    }

    @Override // yc4.f
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
    }

    @Override // yc4.f
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.improve.component.w1 w1Var = this.f460851d;
        w1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerview", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = w1Var.getRecycleView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerview", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        androidx.recyclerview.widget.f2 adapter = recycleView.getAdapter();
        p52.g gVar = p52.g.f352010d;
        ((c61.w8) paVar).Vi(recycleView, adapter, 3, -1, -1, 1L, com.tencent.maas.MJMaasVersion.BUILD_NUMBER, 3, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
    }

    @Override // yc4.f
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUic", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.improve.component.w1 w1Var = this.f460851d;
        w1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerview", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = w1Var.getRecycleView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerview", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveReportUIC");
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        androidx.recyclerview.widget.f2 adapter = recycleView.getAdapter();
        p52.g gVar = p52.g.f352010d;
        ((c61.w8) paVar).Vi(recycleView, adapter, 2, -1, -1, 1L, com.tencent.maas.MJMaasVersion.BUILD_NUMBER, 2, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
    }

    @Override // yc4.f
    public void f(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        p52.g gVar = p52.g.f352010d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstVisiblePosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisiblePosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        ((c61.w8) paVar).Vi(recyclerView, adapter, 1, struct.f169054a, struct.a().size(), 1L, com.tencent.maas.MJMaasVersion.BUILD_NUMBER, 1, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report21053");
    }
}
