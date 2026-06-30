package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145820d;

    public b0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145820d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145820d;
        envelopeAppBarLayout.B1.B(-(envelopeAppBarLayout.getTotalScrollRange() - envelopeAppBarLayout.f145796z1));
        envelopeAppBarLayout.f145792y.setAlpha(1.0f);
    }
}
