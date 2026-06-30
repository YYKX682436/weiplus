package w54;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f443023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f443024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f443025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w54.f f443026h;

    public b(w54.f fVar, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f443026h = fVar;
        this.f443022d = str;
        this.f443023e = j17;
        this.f443024f = j18;
        this.f443025g = videoInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$1");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 27);
        t21.h0 f17 = w54.g.f(this.f443026h.f443038d);
        ((com.tencent.mm.modelvideo.MMVideoView) f17).e0(this.f443022d, this.f443023e, this.f443024f, this.f443025g.svrFlag);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$1");
    }
}
