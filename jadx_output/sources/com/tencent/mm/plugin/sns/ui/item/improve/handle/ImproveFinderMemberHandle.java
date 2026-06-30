package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderMemberHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderShareHandle;", "()V", "getContentStyle", "", "plugin-sns_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImproveFinderMemberHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMemberHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMemberHandle();

    private ImproveFinderMemberHandle() {
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle, com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle
    public int getContentStyle() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMemberHandle");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMemberHandle");
        return 50;
    }
}
