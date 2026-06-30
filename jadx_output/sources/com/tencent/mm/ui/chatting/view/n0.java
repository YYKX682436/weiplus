package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public class n0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f203020d;

    public n0(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView) {
        this.f203020d = mMChattingListView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f203020d.W.setEmpty();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f203020d.f202848y0 = true;
    }
}
