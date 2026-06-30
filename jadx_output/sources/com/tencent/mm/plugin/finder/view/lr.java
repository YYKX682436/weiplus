package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class lr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LiveMarqueeTextView f132614d;

    public lr(com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView) {
        this.f132614d = liveMarqueeTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView = this.f132614d;
        com.tencent.mars.xlog.Log.i(liveMarqueeTextView.f131536n, "startContinuousScroll onAnimationEnd currentIndex: " + liveMarqueeTextView.f131530e);
        liveMarqueeTextView.postDelayed(new com.tencent.mm.plugin.finder.view.kr(liveMarqueeTextView), liveMarqueeTextView.f131542t);
    }
}
