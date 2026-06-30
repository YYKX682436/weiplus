package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207670d;

    public f3(com.tencent.mm.ui.conversation.ConversationListView conversationListView) {
        this.f207670d = conversationListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f207670d.smoothScrollToPositionFromTop(0, 0, 300);
    }
}
