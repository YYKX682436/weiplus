package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207842d;

    public l3(com.tencent.mm.ui.conversation.ConversationListView conversationListView) {
        this.f207842d = conversationListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f207842d.setSelection(1);
    }
}
