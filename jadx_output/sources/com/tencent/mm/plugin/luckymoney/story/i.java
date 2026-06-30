package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145882d;

    public i(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145882d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145882d;
        com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout touchCoordinatorLayout = envelopeAppBarLayout.f145789x;
        if (touchCoordinatorLayout != null) {
            touchCoordinatorLayout.E = true;
        }
        envelopeAppBarLayout.S1.setStartDelay(700L);
        envelopeAppBarLayout.S1.start();
    }
}
