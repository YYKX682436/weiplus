package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ir extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LiveMarqueeTextView f132405d;

    public ir(com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView) {
        this.f132405d = liveMarqueeTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView = this.f132405d;
        long j17 = liveMarqueeTextView.f131543u == 1 ? liveMarqueeTextView.f131541s : liveMarqueeTextView.f131542t;
        com.tencent.mars.xlog.Log.i(liveMarqueeTextView.f131536n, "showNextText timeInterval: " + j17);
        liveMarqueeTextView.f131543u = liveMarqueeTextView.f131543u + 1;
        liveMarqueeTextView.f131532g = 0.0f;
        liveMarqueeTextView.postDelayed(new com.tencent.mm.plugin.finder.view.hr(liveMarqueeTextView), j17);
    }
}
