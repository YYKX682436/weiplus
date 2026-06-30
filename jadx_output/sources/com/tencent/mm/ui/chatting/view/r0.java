package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class r0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203069d;

    public r0(com.tencent.mm.ui.chatting.view.c1 c1Var) {
        this.f203069d = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f203069d.f202891g;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
