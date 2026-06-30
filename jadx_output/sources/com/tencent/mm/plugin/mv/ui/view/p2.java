package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class p2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f151921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView f151922e;

    public p2(long j17, com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView) {
        this.f151921d = j17;
        this.f151922e = musicMvLyricPreludeView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        long currentPlayTime = animation.getCurrentPlayTime();
        long j17 = this.f151921d;
        long j18 = j17 - 3000;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = this.f151922e;
        if (currentPlayTime > j18) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            float f17 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView.f151663u;
            musicMvLyricPreludeView.e(j17);
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        musicMvLyricPreludeView.f151672m = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView.f151663u * ((java.lang.Float) animatedValue).floatValue();
        int currentPlayTime2 = 1 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        musicMvLyricPreludeView.f151670h = currentPlayTime2;
        if (currentPlayTime2 < 0) {
            musicMvLyricPreludeView.f151670h = currentPlayTime2 + 3;
        }
        musicMvLyricPreludeView.invalidate();
    }
}
