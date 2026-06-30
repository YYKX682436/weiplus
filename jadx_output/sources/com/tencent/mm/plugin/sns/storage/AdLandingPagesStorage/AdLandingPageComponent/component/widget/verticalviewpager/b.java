package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f165758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f165759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f165760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.f f165761h;

    public b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.f fVar, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f165761h = fVar;
        this.f165757d = str;
        this.f165758e = j17;
        this.f165759f = j18;
        this.f165760g = videoInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$1");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 27);
        t21.h0 f17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.g.f(this.f165761h.f165773d);
        ((com.tencent.mm.modelvideo.MMVideoView) f17).e0(this.f165757d, this.f165758e, this.f165759f, this.f165760g.svrFlag);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$1");
    }
}
