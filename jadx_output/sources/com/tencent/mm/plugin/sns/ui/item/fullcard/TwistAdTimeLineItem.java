package com.tencent.mm.plugin.sns.ui.item.fullcard;

/* loaded from: classes4.dex */
public class TwistAdTimeLineItem extends com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew {
    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public fd4.l H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.TwistAdTimeLineItem");
        fd4.t tVar = new fd4.t();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.TwistAdTimeLineItem");
        return tVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.TwistAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.TwistAdTimeLineItem");
        return "TwistAdTimeLineItem";
    }
}
