package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class ji implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderProgressBar f132442d;

    public ji(com.tencent.mm.plugin.finder.view.FinderProgressBar finderProgressBar) {
        this.f132442d = finderProgressBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.widget.SeekBar seekBar;
        kotlin.jvm.internal.o.g(animation, "animation");
        seekBar = this.f132442d.getSeekBar();
        seekBar.setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
