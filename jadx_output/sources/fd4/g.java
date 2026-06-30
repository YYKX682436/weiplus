package fd4;

/* loaded from: classes4.dex */
public abstract class g {
    public static int a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        if (snsInfo.isAdIpInteractVideo()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 39;
        }
        if (snsInfo.isBreakFrameAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 32;
        }
        if (snsInfo.isSolidBreakFrameAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 47;
        }
        if (snsInfo.isTwistAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 28;
        }
        if (snsInfo.isGestureAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 29;
        }
        if (snsInfo.isLongPressGestureAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 30;
        }
        if (snsInfo.isShakeAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 31;
        }
        if (snsInfo.isDragAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 35;
        }
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(snsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
            return 41;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullCardItemType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        return 27;
    }

    public static boolean b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFullCardViewType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        boolean z17 = i17 == 27 || i17 == 28 || i17 == 29 || i17 == 30 || i17 == 31 || i17 == 32 || i17 == 39 || i17 == 47 || i17 == 35 || i17 == 41;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFullCardViewType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        return z17;
    }
}
