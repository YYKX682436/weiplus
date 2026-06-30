package s34;

/* loaded from: classes4.dex */
public final class y0 {
    public y0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.util.List c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        s34.a1 a1Var = snsInfo.getAdXml().adSliderFullCardInfo;
        if (a1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportOverSlideJump", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        boolean z17 = a1Var.overSlideJumpInfo != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportOverSlideJump", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        if (!z17) {
            com.tencent.mars.xlog.Log.w("AdSlideItemProductInfo", "isAdSlideItemProductInfoValid, adSliderFullCardInfo is not support OverSlideJump");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        s34.z0 z0Var = a1Var.f402569f;
        if (z0Var == null || (c17 = z0Var.c()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        if (c17.size() == a1Var.f402564a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return true;
        }
        com.tencent.mars.xlog.Log.e("AdSlideItemProductInfo", "isAdSlideItemProductInfoValid, productInfoList size is " + c17.size() + ", pushAdNum is " + a1Var.f402564a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
        return false;
    }
}
