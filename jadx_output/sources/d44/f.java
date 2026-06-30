package d44;

/* loaded from: classes4.dex */
public class f extends d44.d implements vd2.g5 {
    @Override // vd2.g5
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        if (bool == null) {
            try {
                com.tencent.mars.xlog.Log.w("SnsAd.FinderLivingRequest", "the RequestSuccessCallBack value is null");
            } catch (java.lang.Throwable unused) {
            }
        }
        c(0, bool == null ? false : bool.booleanValue());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
    }

    public final void c(int i17, boolean z17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSuccessCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        int i19 = this.f226429b;
        if (i19 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 513;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 257;
            }
        } else if (i19 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 770;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 771;
            }
        } else {
            i18 = 0;
        }
        b(i17, java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSuccessCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
    }
}
