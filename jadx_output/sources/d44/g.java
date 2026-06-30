package d44;

/* loaded from: classes4.dex */
public class g extends d44.d implements vd2.g5 {
    @Override // vd2.g5
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingRequest", "onCallback succ");
            b(0, null);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBackWithoutParam");
    }
}
