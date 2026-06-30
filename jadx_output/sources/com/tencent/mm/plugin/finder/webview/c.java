package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.BaseBoxDialogView f136851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f136852e;

    public c(com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView, boolean z17) {
        this.f136851d = baseBoxDialogView;
        this.f136852e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f136852e;
        com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView = this.f136851d;
        baseBoxDialogView.K = z17;
        android.view.View view = baseBoxDialogView.f136791m;
        if (view == null) {
            kotlin.jvm.internal.o.o("dialogContainer");
            throw null;
        }
        baseBoxDialogView.f136798s = view.getTranslationY();
        baseBoxDialogView.f136796q = 0.0f;
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
