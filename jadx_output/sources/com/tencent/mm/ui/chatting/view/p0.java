package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public class p0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f203048d;

    public p0(com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView) {
        this.f203048d = mMChattingListView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = this.f203048d;
        mMChattingListView.f202845p1.setEmpty();
        mMChattingListView.A1 = -1;
    }
}
