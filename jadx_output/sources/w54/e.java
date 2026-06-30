package w54;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w54.f f443037f;

    public e(w54.f fVar, java.lang.String str, int i17) {
        this.f443037f = fVar;
        this.f443035d = str;
        this.f443036e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$4");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 31);
        w54.g.f(this.f443037f.f443038d).o(this.f443035d, this.f443036e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$4");
    }
}
