package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f158740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ImageQBarDataBean f158742f;

    public i0(com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView, java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        this.f158740d = multiCodeMaskView;
        this.f158741e = arrayList;
        this.f158742f = imageQBarDataBean;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f158740d;
        com.tencent.mm.plugin.scanner.f0 mMultiCodeMaskViewListener = multiCodeMaskView.getMMultiCodeMaskViewListener();
        if (mMultiCodeMaskViewListener != null) {
            mMultiCodeMaskViewListener.a(this.f158741e, this.f158742f, true);
        }
        multiCodeMaskView.a();
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
