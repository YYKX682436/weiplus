package i64;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f289383a = new java.util.HashMap();

    public static synchronized int a(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        int i17;
        boolean z17;
        synchronized (i64.z0.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            int i18 = 0;
            if (adSnsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                return 0;
            }
            java.lang.String t07 = ca4.z0.t0(adSnsInfo.field_snsId);
            java.util.Map map = f289383a;
            if (((java.util.HashMap) map).containsKey(t07)) {
                i17 = ((java.lang.Integer) ((java.util.HashMap) map).get(t07)).intValue();
                z17 = true;
            } else {
                i17 = adSnsInfo.field_exposureCount;
                z17 = false;
            }
            if (i17 >= 0) {
                i18 = i17;
            }
            com.tencent.mars.xlog.Log.i("AdExposureCountCache", "getExposureCount, id=" + t07 + ", count=" + i18 + ", useCache=" + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            return i18;
        }
    }

    public static synchronized void b(java.lang.String str) {
        synchronized (i64.z0.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                return;
            }
            ((java.util.HashMap) f289383a).remove(str);
            com.tencent.mars.xlog.Log.i("AdExposureCountCache", "removeExposureCount, id=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
        }
    }
}
