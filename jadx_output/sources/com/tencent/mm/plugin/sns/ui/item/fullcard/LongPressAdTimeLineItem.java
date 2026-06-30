package com.tencent.mm.plugin.sns.ui.item.fullcard;

/* loaded from: classes4.dex */
public class LongPressAdTimeLineItem extends com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew {
    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public fd4.l H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.LongPressAdTimeLineItem");
        fd4.o oVar = new fd4.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.fullcard.LongPressAdTimeLineItem");
        return oVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew
    public boolean J(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.fullcard.LongPressAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.fullcard.LongPressAdTimeLineItem");
        return false;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.LongPressAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.fullcard.LongPressAdTimeLineItem");
        return "LongPressAdTimeLineItem";
    }
}
