package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class g0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout f115515d;

    public g0(com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout finderLivePushReplaceLayout) {
        this.f115515d = finderLivePushReplaceLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout.f115431d;
        com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout finderLivePushReplaceLayout = this.f115515d;
        finderLivePushReplaceLayout.getClass();
        finderLivePushReplaceLayout.post(new com.tencent.mm.plugin.finder.live.util.f0(finderLivePushReplaceLayout));
    }
}
