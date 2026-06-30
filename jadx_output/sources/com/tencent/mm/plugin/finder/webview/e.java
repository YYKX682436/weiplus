package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.BaseBoxDialogView f136861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f136862e;

    public e(com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView, int i17) {
        this.f136861d = baseBoxDialogView;
        this.f136862e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f136861d.L = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView = this.f136861d;
        baseBoxDialogView.L = false;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.webview.d(baseBoxDialogView, this.f136862e));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.finder.webview.BaseBoxDialogView.f136783x0;
        this.f136861d.getClass();
    }
}
