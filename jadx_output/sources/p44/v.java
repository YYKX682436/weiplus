package p44;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f351858d;

    public v(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f351858d = snsInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion$checkPreload$1");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
            boolean z18 = true;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f351858d;
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                z17 = false;
            } else {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                z17 = (adXml != null ? adXml.randomPickCardAdInfo : null) != null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRandomPickCardAd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
            }
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpEnablePreload", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_preload_egg_canvas_process, 1) <= 0) {
                    z18 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpEnablePreload", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                if (z18) {
                    com.tencent.mars.xlog.Log.i("RandomPickCardLogic", "startToolsProcess");
                    ca4.m0.A0();
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomPickCardLogic", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion$checkPreload$1");
    }
}
