package i64;

/* loaded from: classes4.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f289334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289335e;

    public v0(i64.b1 b1Var, java.util.Map map) {
        this.f289335e = b1Var;
        this.f289334d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean containsKey;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$5");
        for (java.lang.String str : this.f289334d.keySet()) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo L0 = com.tencent.mm.plugin.sns.model.l4.Vi().L0(com.tencent.mm.plugin.sns.storage.w2.m(str));
            if (L0 != null) {
                java.lang.String t07 = ca4.z0.t0(L0.field_snsId);
                com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = L0.convertToSnsInfo();
                L0.setExposures();
                int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
                int i18 = 0;
                if (this.f289334d.containsKey(str)) {
                    currentTimeMillis = ((java.lang.Integer) this.f289334d.get(str)).intValue();
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                if (L0.field_exposureTime <= 0) {
                    L0.field_exposureTime = currentTimeMillis;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "update Ad ExposureTime, snsId=" + t07 + ", exposuretime=" + currentTimeMillis + "， sys.currentTimeMis=" + java.lang.System.currentTimeMillis() + ", type=" + i17);
                }
                i64.b1 b1Var = this.f289335e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                boolean z17 = b1Var.f289107v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                if (z17) {
                    int i19 = L0.field_exposureCount;
                    java.util.Map map = i64.z0.f289383a;
                    synchronized (i64.z0.class) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasCache", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                        if (android.text.TextUtils.isEmpty(t07)) {
                            com.tencent.mars.xlog.Log.e("AdExposureCountCache", "hasCache, err id=" + t07);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasCache", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                            containsKey = false;
                        } else {
                            containsKey = ((java.util.HashMap) i64.z0.f289383a).containsKey(t07);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasCache", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                        }
                    }
                    if (containsKey) {
                        synchronized (i64.z0.class) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                            if (android.text.TextUtils.isEmpty(t07)) {
                                com.tencent.mars.xlog.Log.e("AdExposureCountCache", "getExposureCount, err id=" + t07);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                            } else {
                                java.util.Map map2 = i64.z0.f289383a;
                                if (((java.util.HashMap) map2).containsKey(t07)) {
                                    i18 = ((java.lang.Integer) ((java.util.HashMap) map2).get(t07)).intValue();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                                }
                            }
                        }
                        L0.field_exposureCount = i18;
                    } else {
                        i18 = -1;
                    }
                    com.tencent.mars.xlog.Log.i("AdExposureCountCache", "write db, snsId=" + t07 + ", localId=" + str + ", cacheCount=" + i18 + ", exposureCountInDb=" + i19);
                }
                if (convertToSnsInfo != null) {
                    convertToSnsInfo.setExposures();
                }
                com.tencent.mm.plugin.sns.model.l4.Fj().v3(convertToSnsInfo.field_snsId, convertToSnsInfo);
                com.tencent.mm.plugin.sns.model.l4.Vi().b1(L0.field_snsId, L0);
            } else {
                com.tencent.mars.xlog.Log.i("AdExposureCountCache", "clear, snsInfo==null, localId=" + str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$5");
    }
}
