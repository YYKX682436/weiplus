package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class d3 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207629d;

    public d3(com.tencent.mm.ui.conversation.ConversationListView conversationListView) {
        this.f207629d = conversationListView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207629d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "onItemClick isCanClose: %b", java.lang.Boolean.valueOf(conversationListView.U));
        android.widget.AdapterView.OnItemClickListener onItemClickListener = conversationListView.f207322p0;
        if (onItemClickListener == null || conversationListView.U) {
            return;
        }
        onItemClickListener.onItemClick(adapterView, view, i17, j17);
    }
}
