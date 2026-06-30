package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gk implements y51.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc4.p f168440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f168441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bk f168442c;

    public gk(com.tencent.mm.plugin.sns.ui.bk bkVar, xc4.p pVar, r45.jj4 jj4Var) {
        this.f168442c = bkVar;
        this.f168440a = pVar;
        this.f168441b = jj4Var;
    }

    @Override // y51.e
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayFirstFrameAvailable", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$5");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.G(this.f168442c.f167925r, this.f168440a.c1(), this.f168441b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayFirstFrameAvailable", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$5");
    }

    @Override // y51.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayComplete", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayComplete", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$5");
    }
}
