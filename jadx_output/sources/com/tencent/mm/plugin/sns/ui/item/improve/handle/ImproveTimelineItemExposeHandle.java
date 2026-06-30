package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\rj\b\u0012\u0004\u0012\u00020\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemExposeHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Ljz5/f0;", "onViewExposed", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "handleList", "Ljava/util/ArrayList;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveTimelineItemExposeHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle();
    private static final java.util.ArrayList<com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle> handleList;

    static {
        java.util.ArrayList<com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle> arrayList = new java.util.ArrayList<>();
        handleList = arrayList;
        arrayList.add(new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizFinderHandle());
        arrayList.add(new com.tencent.mm.plugin.sns.ui.item.improve.handle.expose.ImproveExposeReportHandle());
        arrayList.add(new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle());
        arrayList.add(new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizSpringHandle());
    }

    private ImproveTimelineItemExposeHandle() {
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle
    public void onViewExposed(com.tencent.mm.plugin.sns.storage.SnsInfo info, android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(view, "view");
        java.util.Iterator<T> it = handleList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle) it.next()).onViewExposed(info, view, j17, j18, z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemExposeHandle");
    }
}
