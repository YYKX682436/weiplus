package com.tencent.mm.plugin.sns.ui.item.fullcard;

/* loaded from: classes4.dex */
public class GestureAdTimeLineItem extends com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew {
    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        super.G();
        fd4.l lVar = this.E;
        if (lVar != null && (lVar instanceof fd4.k)) {
            ((fd4.k) lVar).t(this.f169311r.D0, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public fd4.l H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        fd4.k kVar = new fd4.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        return kVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.GestureAdTimeLineItem");
        return "GestureAdTimeLineItem";
    }
}
