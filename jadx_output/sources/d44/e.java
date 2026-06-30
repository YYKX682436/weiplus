package d44;

/* loaded from: classes4.dex */
public class e extends d44.d implements vd2.g5 {
    @Override // vd2.g5
    public void a(java.lang.Object obj) {
        int intValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        int i17 = -1;
        if (num == null) {
            intValue = -1;
        } else {
            try {
                intValue = num.intValue();
            } catch (java.lang.Throwable unused) {
            }
        }
        if (intValue != 0) {
            i17 = intValue;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.FinderLivingRequest", "onCallback err, errCode=" + i17);
        b(i17, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
    }
}
