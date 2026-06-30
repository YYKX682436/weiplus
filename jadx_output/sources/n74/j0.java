package n74;

/* loaded from: classes4.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f335377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f335378e;

    public j0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.util.List list) {
        this.f335377d = snsInfo;
        this.f335378e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper$preload$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f335377d;
        java.util.List list = this.f335378e;
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context != null) {
                com.tencent.mars.xlog.Log.i("AdMiniShopPreloadHelper", "start preload, snsId = " + ca4.z0.t0(snsInfo.field_snsId));
                n74.k0.a(n74.k0.f335383a, list, context);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdMiniShopPreloadHelper", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper$preload$1");
    }
}
