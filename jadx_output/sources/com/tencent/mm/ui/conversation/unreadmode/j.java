package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208144d;

    public j(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208144d = unreadConversationFmUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.conversation.unreadmode.g0 reporter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$initView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208144d;
        reporter = unreadConversationFmUI.getReporter();
        if (reporter != null) {
            reporter.f208141c = 1;
        }
        unreadConversationFmUI.animateDismiss();
        yj0.a.h(this, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$initView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
