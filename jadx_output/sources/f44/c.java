package f44;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f259545d;

    /* renamed from: e, reason: collision with root package name */
    public final f44.f f259546e;

    /* renamed from: f, reason: collision with root package name */
    public final n64.a f259547f;

    public c(f44.f fVar, java.lang.String str) {
        this.f259546e = fVar;
        this.f259545d = str;
        n64.a aVar = new n64.a();
        this.f259547f = aVar;
        aVar.e(new f44.b(this));
    }

    public final java.lang.String a(int i17, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        }
        if (adClickActionInfo.f162571b != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        }
        java.lang.String str = adClickActionInfo.f162573c;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i17);
        boolean z17 = adClickActionInfo.f162579f;
        if (adInfo != null && !z17) {
            str = ca4.z0.b(str, adInfo.uxInfo);
        }
        java.lang.String b17 = f44.a.b(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        return b17;
    }

    public final void b(java.lang.Object obj, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDetectClickInfoUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        java.util.List b17 = this.f259547f.b(obj);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDetectClickInfoUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClickInfoUrls, clickInfo.size=");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        sb6.append(arrayList.size());
        sb6.append(", target=");
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("SnsAd.H5PrefetchTask", sb6.toString());
        try {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n64.f fVar = (n64.f) it.next();
                java.util.Objects.toString(fVar);
                if (fVar instanceof n64.c) {
                    java.lang.String a17 = a(i17, ((n64.c) fVar).c(), snsInfo);
                    if (!android.text.TextUtils.isEmpty(a17) && !list.contains(a17)) {
                        com.tencent.mars.xlog.Log.i("SnsAd.H5PrefetchTask", "handleClickInfoUrls, addUrl=" + a17);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 10);
                        list.add(a17);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineAdPreloader doDetectClickInfoUrls", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDetectClickInfoUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f44.c.run():void");
    }
}
