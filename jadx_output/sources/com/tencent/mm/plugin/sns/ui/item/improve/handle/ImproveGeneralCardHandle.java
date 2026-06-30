package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveGeneralCardHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "()V", "checkClickValid", "", "snsInfo", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "getContentStyle", "", "plugin-sns_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImproveGeneralCardHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle();

    private ImproveGeneralCardHandle() {
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public boolean checkClickValid(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        boolean checkMediaValid = checkMediaValid(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle");
        return checkMediaValid;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public int getContentStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle");
        return 13;
    }
}
