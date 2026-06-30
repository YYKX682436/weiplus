package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherItemLoadHandle;", "", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Landroid/view/ViewGroup;", "layout", "Ljz5/l;", "", "handle", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "Lkotlin/collections/ArrayList;", "handleList", "Ljava/util/ArrayList;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveOtherItemLoadHandle {
    public static final com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle INSTANCE = new com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle();
    private static final java.util.ArrayList<com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle> handleList;

    static {
        java.util.ArrayList<com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle> arrayList = new java.util.ArrayList<>();
        handleList = arrayList;
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveProductHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveEmojiShareHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveEmojiDesignerShareHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveEcsShareHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveEmotionListShareHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveEmojiListShareHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveEmotionSetShareHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectTvHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveMallHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGeneralCardHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveSinglePageHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveWNNotePageHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderFeedHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderNativeDramaFeedHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMemberHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderTopicHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderFollowTopicHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderColumnCardHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderLiveThemeHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderLiveHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPurchaseHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMegaVideoHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPoiHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicAudioHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderTemplateHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveLiteAppHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderAggreateHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectMusicHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectFeedHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectVideoHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveGameShareCardHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTingMusicHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTingCategoryHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderPaidCollectionHandle.INSTANCE);
        arrayList.add(com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderCollectionHandle.INSTANCE);
    }

    private ImproveOtherItemLoadHandle() {
    }

    public final jz5.l handle(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.view.ViewGroup layout) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        int i17 = timeLine.ContentObj.f369837e;
        java.util.Iterator<T> it = handleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle) obj).getContentStyle() == i17) {
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle improveOtherTimelineItemHandle = (com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle) obj;
        if (improveOtherTimelineItemHandle == null) {
            improveOtherTimelineItemHandle = com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveDefaultHandle.INSTANCE;
        }
        jz5.l handle = improveOtherTimelineItemHandle.handle(snsInfo, timeLine, layout);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle");
        return handle;
    }
}
