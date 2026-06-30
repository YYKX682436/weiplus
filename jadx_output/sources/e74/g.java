package e74;

/* loaded from: classes4.dex */
public class g implements d44.b {
    public g(e74.i iVar) {
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$7");
        try {
            com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "the requestFinderLivingState return errorCode is  " + i18);
            if (i18 == 0 && (obj instanceof java.lang.Integer)) {
                com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "requestFinderLivingState, the snsId is " + str + ", livingStatus is " + obj);
                com.tencent.mm.plugin.sns.ad.widget.living.i0.g(str, ((java.lang.Integer) obj).intValue());
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$7");
    }
}
