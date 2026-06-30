package com.tencent.mm.plugin.sns.ui.item.improve.handle.expose;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/expose/ImproveExposeReportHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Ljz5/f0;", "onViewExposed", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveExposeReportHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle {
    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle
    public void onViewExposed(com.tencent.mm.plugin.sns.storage.SnsInfo info, android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.expose.ImproveExposeReportHandle");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = info.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        boolean isWsFold = info.isWsFold();
        if (z17) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.n(timeLine.Id, isWsFold);
            java.lang.String str = timeLine.Id;
            r45.y8 y8Var = timeLine.AppInfo;
            java.lang.String str2 = y8Var != null ? y8Var.f390846d : null;
            if (str2 == null) {
                str2 = "";
            }
            s0Var.o(str, str2);
            s0Var.p(info.field_snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.expose.ImproveExposeReportHandle");
    }
}
