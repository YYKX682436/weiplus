package l44;

/* loaded from: classes4.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f316418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316419e;

    public x4(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f316418d = snsInfo;
        this.f316419e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f316419e;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f316418d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$5");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            l44.a5.c(context, snsInfo.getAdXml(), snsInfo, i17);
            l44.a5.d(context, snsInfo.getAdInfo(i17), snsInfo, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$5");
    }
}
