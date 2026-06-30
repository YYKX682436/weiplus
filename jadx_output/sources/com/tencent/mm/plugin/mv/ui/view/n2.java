package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class n2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView f151909d;

    public n2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView) {
        this.f151909d = musicMvLyricPreludeView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = this.f151909d;
        int i17 = musicMvLyricPreludeView.f151673n;
        if (i17 == 1) {
            musicMvLyricPreludeView.f151667e.setAlpha((int) (floatValue * 255));
        } else if (i17 != 2) {
            musicMvLyricPreludeView.f151668f.setAlpha((int) (floatValue * 255));
        } else {
            musicMvLyricPreludeView.f151666d.setAlpha((int) (floatValue * 255));
        }
        musicMvLyricPreludeView.invalidate();
    }
}
