package w54;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f443033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w54.f f443034g;

    public d(w54.f fVar, java.lang.String str, long j17, long j18) {
        this.f443034g = fVar;
        this.f443031d = str;
        this.f443032e = j17;
        this.f443033f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$3");
        w54.g.f(this.f443034g.f443038d).f(this.f443031d, this.f443032e, this.f443033f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$3");
    }
}
