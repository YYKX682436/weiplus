package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class c5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar f198515d;

    public c5(com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar chattingFooterMoreBtnBar) {
        this.f198515d = chattingFooterMoreBtnBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f198515d.f198214h.setVisibility(8);
    }
}
