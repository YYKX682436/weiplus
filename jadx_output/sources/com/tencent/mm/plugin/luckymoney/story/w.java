package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145923d;

    public w(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145923d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145923d;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior envelopeStoryBehavior = (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior) ((androidx.coordinatorlayout.widget.c) envelopeAppBarLayout.getLayoutParams()).f11006a;
        envelopeAppBarLayout.B1 = envelopeStoryBehavior;
        envelopeStoryBehavior.G = envelopeAppBarLayout.M1;
        int i17 = envelopeAppBarLayout.K1;
        envelopeStoryBehavior.I = i17 == 1;
        envelopeStoryBehavior.F = i17 == 1 || i17 == 2;
        envelopeStoryBehavior.H = envelopeAppBarLayout.T1;
        com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout touchCoordinatorLayout = (com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout) envelopeAppBarLayout.getParent();
        envelopeAppBarLayout.f145789x = touchCoordinatorLayout;
        envelopeAppBarLayout.K = touchCoordinatorLayout.findViewById(com.tencent.mm.R.id.iza);
        ((java.util.ArrayList) envelopeAppBarLayout.f145789x.D).add(new com.tencent.mm.plugin.luckymoney.story.m(this));
        envelopeAppBarLayout.K.setOnTouchListener(new com.tencent.mm.plugin.luckymoney.story.n(this));
        envelopeAppBarLayout.m();
    }
}
