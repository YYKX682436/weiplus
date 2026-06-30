package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ek implements y51.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f168248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bk f168249b;

    public ek(com.tencent.mm.plugin.sns.ui.bk bkVar, r45.jj4 jj4Var) {
        this.f168249b = bkVar;
        this.f168248a = jj4Var;
    }

    @Override // y51.e
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayFirstFrameAvailable", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$3");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip.G(this.f168249b.f167925r, null, this.f168248a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayFirstFrameAvailable", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$3");
    }

    @Override // y51.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayComplete", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayComplete", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$3");
    }
}
