package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class n0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f159113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f159114e;

    public n0(int i17, com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView) {
        this.f159113d = i17;
        this.f159114e = multiCodeMaskView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.scanner.m0(this.f159113d, this.f159114e), 50L);
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
