package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f116685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f116686e;

    public t(float f17, float f18) {
        this.f116685d = f17;
        this.f116686e = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationCancel(animation);
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "onAnimationCancel fromAlpha:" + this.f116685d + " toAlpha:" + this.f116686e + " onAnimationEnd");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "onPluginAlphaModify fromAlpha:" + this.f116685d + " toAlpha:" + this.f116686e + " onAnimationEnd");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "onPluginAlphaModify fromAlpha:" + this.f116685d + " toAlpha:" + this.f116686e + " onAnimationStart");
    }
}
