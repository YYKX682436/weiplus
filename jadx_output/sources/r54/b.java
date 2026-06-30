package r54;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f392724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f392726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f392727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f392728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f392729i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r54.d f392730m;

    public b(r54.d dVar, int i17, java.lang.String str, double d17, double d18, double d19, double d27) {
        this.f392730m = dVar;
        this.f392724d = i17;
        this.f392725e = str;
        this.f392726f = d17;
        this.f392727g = d18;
        this.f392728h = d19;
        this.f392729i = d27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$2");
        try {
            r54.d dVar = this.f392730m;
            int i17 = this.f392724d;
            java.lang.String str = this.f392725e;
            double d17 = this.f392726f;
            double d18 = this.f392727g;
            double d19 = this.f392728h;
            double d27 = this.f392729i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            dVar.c(i17, str, d17, d18, d19, d27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester$2");
    }
}
