package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public class l0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f202987d;

    public l0(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView) {
        this.f202987d = mMChattingListView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f202987d.W.setEmpty();
    }
}
