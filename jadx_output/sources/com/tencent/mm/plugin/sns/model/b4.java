package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f164093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f164094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f164095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.f4 f164096h;

    public b4(com.tencent.mm.plugin.sns.model.f4 f4Var, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f164096h = f4Var;
        this.f164092d = str;
        this.f164093e = j17;
        this.f164094f = j18;
        this.f164095g = videoInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$1");
        t21.h0 f17 = com.tencent.mm.plugin.sns.model.g4.f(this.f164096h.f164191d);
        ((com.tencent.mm.modelvideo.MMVideoView) f17).e0(this.f164092d, this.f164093e, this.f164094f, this.f164095g.svrFlag);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$1");
    }
}
