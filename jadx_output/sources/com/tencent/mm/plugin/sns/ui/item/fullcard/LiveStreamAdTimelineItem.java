package com.tencent.mm.plugin.sns.ui.item.fullcard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/fullcard/LiveStreamAdTimelineItem;", "Lcom/tencent/mm/plugin/sns/ui/item/FullCardAdTimeLineItemNew;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LiveStreamAdTimelineItem extends com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew {
    public final fd4.m F = new fd4.m();

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public boolean F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        com.tencent.mars.xlog.Log.i("LiveStreamAdTimelineItem", "doPause: hash is " + hashCode() + ", snsId is " + ca4.z0.T(this.f169314u));
        this.F.onVideoPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public fd4.l H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        return this.F;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew, xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        com.tencent.mars.xlog.Log.i("LiveStreamAdTimelineItem", "play: hash is " + hashCode() + ", pos is " + i17 + ", snsId is " + ca4.z0.T(this.f169314u));
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.F.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.LiveStreamAdTimelineItem");
        return "LiveStreamAdTimelineItem";
    }
}
