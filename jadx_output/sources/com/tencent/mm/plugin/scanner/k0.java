package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class k0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f158747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.n0 f158748e;

    public k0(com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView, com.tencent.mm.plugin.scanner.n0 n0Var) {
        this.f158747d = multiCodeMaskView;
        this.f158748e = n0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.scanner.j0(this.f158747d, this.f158748e), 50L);
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
