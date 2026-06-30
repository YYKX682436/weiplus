package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class k3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207804d;

    public k3(com.tencent.mm.ui.conversation.ConversationListView conversationListView) {
        this.f207804d = conversationListView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        this.f207804d.K.setEmpty();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        super.onAnimationStart(animator);
        this.f207804d.M = true;
    }
}
