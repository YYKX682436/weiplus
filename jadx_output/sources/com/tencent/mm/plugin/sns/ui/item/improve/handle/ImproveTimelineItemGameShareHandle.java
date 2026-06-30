package com.tencent.mm.plugin.sns.ui.item.improve.handle;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemGameShareHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveTimelineItemBizHandle;", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "info", "Landroid/view/View;", "view", "", "oldExposedId", "newExposedId", "", "isExposed", "Ljz5/f0;", "onViewExposed", "", "GAME_SHARE_EXPOSE", "I", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveTimelineItemGameShareHandle extends com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle {
    private final int GAME_SHARE_EXPOSE = 1;

    @Override // com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemBizHandle
    public void onViewExposed(com.tencent.mm.plugin.sns.storage.SnsInfo info, android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(view, "view");
        if (info.getTimeLine().ContentObj.f369837e == 101 && z17) {
            m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
            java.lang.String str = info.getTimeLine().Id;
            java.lang.String str2 = info.getTimeLine().AppInfo.f390846d;
            r45.e73 e73Var = info.getTimeLine().gameShareCardObject;
            int i17 = e73Var != null ? e73Var.f373067f : 0;
            r45.e73 e73Var2 = info.getTimeLine().gameShareCardObject;
            java.lang.String str3 = e73Var2 != null ? e73Var2.f373066e : null;
            if (str3 == null) {
                str3 = "";
            }
            ((l63.h) gVar).Bi(str, str2, i17, str3, this.GAME_SHARE_EXPOSE);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveTimelineItemGameShareHandle");
    }
}
