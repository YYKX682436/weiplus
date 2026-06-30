package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveObjectFeedHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "Ljz5/f0;", "bizUrlClick", "outsideUrlClick", "", "getContentStyle", "Landroid/view/View;", "layout", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "postClickEvent", "", dm.i4.COL_ID, "Ljava/lang/String;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveObjectFeedHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle();
    private static java.lang.String id = "";

    private ImproveObjectFeedHandle() {
    }

    private final void bizUrlClick() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bizUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bizUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        zy1.e eVar = zy1.e.f477325a;
        eVar.e(12076, "ClickBrandUrlFeedCount", id);
        eVar.d(12076, "BrowseMPArticleTime");
    }

    private final void outsideUrlClick() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("outsideUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("outsideUrlClick", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        zy1.e eVar = zy1.e.f477325a;
        eVar.e(12076, "ClickNotBrandUrlFeedCount", id);
        eVar.d(12076, "BrowseExternalArticleTime");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public int getContentStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        return 3;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public void postClickEvent(android.view.View layout, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        super.postClickEvent(layout, snsInfo);
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        id = t07;
        if (com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().publicUserName)) {
            outsideUrlClick();
        } else {
            bizUrlClick();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle");
    }
}
