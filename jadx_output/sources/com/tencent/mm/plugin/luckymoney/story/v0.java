package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f145920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f145921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.VideoInfo f145922h;

    public v0(com.tencent.mm.plugin.luckymoney.story.w0 w0Var, com.tencent.mm.plugin.luckymoney.story.b1 b1Var, java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        this.f145918d = b1Var;
        this.f145919e = str;
        this.f145920f = j17;
        this.f145921g = j18;
        this.f145922h = videoInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f145918d.f145833m.e0(this.f145919e, this.f145920f, this.f145921g, this.f145922h.svrFlag);
    }
}
