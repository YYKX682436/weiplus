package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes5.dex */
public final class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f149342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f149343e;

    public i(android.animation.AnimatorListenerAdapter animatorListenerAdapter, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f149342d = animatorListenerAdapter;
        this.f149343e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "playReverseAni no record >> end");
        this.f149342d.onAnimationEnd(animation);
        this.f149343e.setListener(null);
    }
}
