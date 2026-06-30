package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208146d;

    public l(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208146d = unreadConversationFmUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208146d;
        unreadConversationFmUI.updateEmptyView();
        unreadConversationFmUI.updateUnreadCount();
    }
}
