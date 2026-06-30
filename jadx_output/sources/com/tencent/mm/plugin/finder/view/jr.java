package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class jr implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LiveMarqueeTextView f132470d;

    public jr(com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView) {
        this.f132470d = liveMarqueeTextView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView = this.f132470d;
        liveMarqueeTextView.f131532g = floatValue;
        liveMarqueeTextView.invalidate();
    }
}
