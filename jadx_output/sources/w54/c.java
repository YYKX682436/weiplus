package w54;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f443029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w54.f f443030g;

    public c(w54.f fVar, java.lang.String str, long j17, long j18) {
        this.f443030g = fVar;
        this.f443027d = str;
        this.f443028e = j17;
        this.f443029f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$2");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 29);
        w54.g.f(this.f443030g.f443038d).onDataAvailable(this.f443027d, this.f443028e, this.f443029f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$2");
    }
}
