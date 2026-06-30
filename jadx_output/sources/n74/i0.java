package n74;

/* loaded from: classes4.dex */
public final class i0 {
    public static final boolean a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowMiniShopTag", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowMiniShopTag", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMiniShopType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        boolean z17 = adClickActionInfo.f162571b == 26;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMiniShopType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowMiniShopTag", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        return z17;
    }

    public static final boolean b(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        if (aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
            return false;
        }
        java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> list = aDInfo.adClickActionInfoList;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("SnsAd.MiniShopHelper", "the click info in ad info is empty!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
            return false;
        }
        boolean a17 = a(list.get(0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowMiniShopTagWithAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopHelper");
        return a17;
    }
}
