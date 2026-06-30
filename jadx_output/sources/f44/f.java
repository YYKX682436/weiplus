package f44;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f259555a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f259556b = new java.util.concurrent.ConcurrentHashMap();

    public f44.e a(f44.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        if (eVar != null) {
            java.lang.String str = eVar.f259550a;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                boolean isEmpty = android.text.TextUtils.isEmpty(str);
                java.util.Map map = this.f259555a;
                boolean z17 = false;
                if (isEmpty) {
                    com.tencent.mars.xlog.Log.i("SnsAd.H5Prefetch", "the task info is empty!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                } else if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
                    com.tencent.mars.xlog.Log.i("SnsAd.H5Prefetch", "the task key is in pending task, the task key is : " + str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    f44.d dVar = (f44.d) ((java.util.concurrent.ConcurrentHashMap) this.f259556b).get(str);
                    if (dVar == null || currentTimeMillis >= dVar.f259549b + 600000) {
                        int i17 = eVar.f259551b;
                        if (i17 == 0) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = eVar.f259553d;
                            if (snsInfo == null || !snsInfo.isAd()) {
                                com.tencent.mars.xlog.Log.i("SnsAd.H5Prefetch", "the sns info is not ad!");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetchOuterInfo", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                                z17 = true;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        } else if (i17 == 1) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            if (a84.b0.d(eVar.f259552c)) {
                                com.tencent.mars.xlog.Log.i("SnsAd.H5Prefetch", "the urls is empty!");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetchNativeLanding", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                                z17 = true;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("SnsAd.H5Prefetch", "the task key has been prefetch, the task key is : " + str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    }
                }
                if (!z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                    return null;
                }
                com.tencent.mars.xlog.Log.i("SnsAd.H5Prefetch", "the task info is to prefetch, the task key  is : " + str);
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, eVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
                return eVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("offerTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        return null;
    }

    public final void b(f44.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
        if (eVar != null && !android.text.TextUtils.isEmpty(eVar.f259550a) && ku5.t0.f312615d != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new f44.c(this, eVar.f259550a));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishTask", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager");
    }
}
