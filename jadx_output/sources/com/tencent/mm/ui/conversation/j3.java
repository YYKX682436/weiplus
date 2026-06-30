package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class j3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f207772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207773e;

    public j3(com.tencent.mm.ui.conversation.ConversationListView conversationListView, android.view.View view) {
        this.f207773e = conversationListView;
        this.f207772d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207773e;
        this.f207772d.getGlobalVisibleRect(conversationListView.K);
        conversationListView.L.setAlpha((int) (((java.lang.Float) valueAnimator.getAnimatedValue("alpha")).floatValue() * 255.0f));
        com.tencent.mars.xlog.Log.getLogLevel();
        conversationListView.postInvalidate();
    }
}
