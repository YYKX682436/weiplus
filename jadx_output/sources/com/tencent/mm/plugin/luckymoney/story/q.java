package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145901d;

    public q(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145901d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145901d;
        android.view.ViewGroup.LayoutParams layoutParams = envelopeAppBarLayout.f145785t.getLayoutParams();
        layoutParams.width = envelopeAppBarLayout.f145784s.getWidth();
        layoutParams.height = envelopeAppBarLayout.f145784s.getHeight();
        envelopeAppBarLayout.f145785t.setLayoutParams(layoutParams);
    }
}
