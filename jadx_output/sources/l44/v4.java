package l44;

/* loaded from: classes4.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f316390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f316392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADXml f316393g;

    public v4(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        this.f316390d = snsInfo;
        this.f316391e = i17;
        this.f316392f = aDInfo;
        this.f316393g = aDXml;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = this.f316392f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
        try {
            java.lang.String t07 = ca4.z0.t0(this.f316390d.field_snsId);
            com.tencent.mars.xlog.Log.i("FinderAdPreloadHelper", "reqFinderFeedsObjectId, source=" + this.f316391e + ", snsId=" + t07);
            java.lang.String m17 = l44.s4.m(aDInfo.uxInfo, t07, 3);
            l44.a5.a(this.f316393g, m17);
            l44.a5.b(aDInfo, m17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderAdPreloadHelper", "reqFinderFeedsObjectId, exp=" + th6.toString());
            ca4.q.c("reqFinderFeedsObjectId", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$3");
    }
}
