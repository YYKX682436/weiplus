package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j40 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.k40 f118724d;

    public j40(com.tencent.mm.plugin.finder.live.widget.k40 k40Var) {
        this.f118724d = k40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f118724d.f118811c;
        android.graphics.drawable.Drawable background = view != null ? view.getBackground() : null;
        if (background == null) {
            return;
        }
        background.setAlpha(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f118724d.f118811c;
        android.graphics.drawable.Drawable background = view != null ? view.getBackground() : null;
        if (background == null) {
            return;
        }
        background.setAlpha(0);
    }
}
