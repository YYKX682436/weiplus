package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.pa f207906d;

    public na(com.tencent.mm.ui.conversation.pa paVar) {
        this.f207906d = paVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.pa paVar = this.f207906d;
        com.tencent.mm.ui.LauncherUI launcherUI = (com.tencent.mm.ui.LauncherUI) paVar.f207969d;
        if (launcherUI == null || launcherUI.f7().f196925e == 0) {
            com.tencent.mm.ui.conversation.ConversationListView conversationListView = paVar.f207971f;
            int firstHeaderVisible = conversationListView.getFirstHeaderVisible() + 16;
            if (conversationListView.getFirstVisiblePosition() > firstHeaderVisible) {
                conversationListView.setSelection(firstHeaderVisible);
            }
            conversationListView.post(new com.tencent.mm.ui.conversation.f3(conversationListView));
        }
    }
}
