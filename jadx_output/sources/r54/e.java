package r54;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r54.f f392737d;

    public e(r54.f fVar) {
        this.f392737d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r54.f fVar = this.f392737d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester$1");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            i11.e eVar = fVar.f392741g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            ((i11.h) eVar).m(fVar);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester$1");
    }
}
