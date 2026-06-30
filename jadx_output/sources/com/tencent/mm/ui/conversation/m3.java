package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207867e;

    public m3(com.tencent.mm.ui.conversation.ConversationListView conversationListView, int i17) {
        this.f207867e = conversationListView;
        this.f207866d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207867e;
        if (!conversationListView.f207315g || (rVar = conversationListView.f207318m) == null) {
            return;
        }
        ((com.tencent.mm.plugin.taskbar.ui.z) rVar).a(this.f207866d);
    }
}
