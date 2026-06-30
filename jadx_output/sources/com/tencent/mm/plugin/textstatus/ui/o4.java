package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class o4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f174143d;

    public o4(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity) {
        this.f174143d = textStatusCardFeedsActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f174143d.Z6();
    }
}
