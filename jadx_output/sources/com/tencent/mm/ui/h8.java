package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUI f208783d;

    public h8(com.tencent.mm.ui.LauncherUI launcherUI) {
        this.f208783d = launcherUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMFragment h17 = this.f208783d.getHomeUI().f196761t.h(0);
        if (h17 instanceof com.tencent.mm.ui.conversation.MainUI) {
            com.tencent.mm.ui.conversation.ConversationListView conversationListView = ((com.tencent.mm.ui.conversation.MainUI) h17).f207372o;
            int firstHeaderVisible = conversationListView.getFirstHeaderVisible() + 16;
            if (conversationListView.getFirstVisiblePosition() > firstHeaderVisible) {
                conversationListView.setSelection(firstHeaderVisible);
            }
            conversationListView.post(new com.tencent.mm.ui.conversation.f3(conversationListView));
        }
    }
}
