package com.tencent.mm.plugin.sns.ui.item.fullcard;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/fullcard/BreakFrameAdTimelineItem;", "Lcom/tencent/mm/plugin/sns/ui/item/FullCardAdTimeLineItemNew;", "", "breakType", "<init>", "(I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BreakFrameAdTimelineItem extends com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew {
    public final gd4.y F;

    public BreakFrameAdTimelineItem(int i17) {
        this.F = new gd4.y(i17);
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public fd4.l H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        return this.F;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public boolean J(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.BreakFrameAdTimelineItem");
        return "BreakFrameAdTimelineItem";
    }
}
