package tc4;

/* loaded from: classes4.dex */
public final class y1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc4.z1 f417535a;

    public y1(tc4.z1 z1Var) {
        this.f417535a = z1Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
        kotlin.jvm.internal.o.g(view, "view");
        zc4.b data = this.f417535a.getData();
        long U0 = (data == null || (n17 = data.n()) == null) ? 0L : n17.U0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
        return U0;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.storage.SnsInfo c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
        kotlin.jvm.internal.o.g(view, "view");
        zc4.b data = this.f417535a.getData();
        if (data == null || (n17 = data.n()) == null || (c17 = n17.c1()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
        } else {
            com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle.INSTANCE.onViewExposed(c17, view, j17, j18, z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose$1");
        }
    }
}
