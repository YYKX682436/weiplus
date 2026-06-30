package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class l2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView f151890d;

    public l2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView) {
        this.f151890d = musicMvLyricPreludeView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = this.f151890d;
        musicMvLyricPreludeView.setEnableAnim(false);
        musicMvLyricPreludeView.invalidate();
    }
}
