package r54;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r54.d f392723d;

    public a(r54.d dVar) {
        this.f392723d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$1");
        try {
            r54.d dVar = this.f392723d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCallbackForTimeout", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            dVar.d(3, "get_location:timeout", 0.0d, 0.0d, 0.0d, 0.0d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCallbackForTimeout", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$1");
    }
}
