package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class o2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f151914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView f151915e;

    public o2(long j17, com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView) {
        this.f151914d = j17;
        this.f151915e = musicMvLyricPreludeView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if (animation.getCurrentPlayTime() > this.f151914d - 3000) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView.f151663u * ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = this.f151915e;
        musicMvLyricPreludeView.f151671i = floatValue;
        musicMvLyricPreludeView.f151669g = 2 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        musicMvLyricPreludeView.invalidate();
    }
}
