package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class o3 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207922d;

    public o3(com.tencent.mm.ui.conversation.ConversationListView conversationListView) {
        this.f207922d = conversationListView;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207922d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "onItemLongClick isCanClose: %b", java.lang.Boolean.valueOf(conversationListView.U));
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = conversationListView.W;
        if (onItemLongClickListener == null || conversationListView.U) {
            return false;
        }
        return onItemLongClickListener.onItemLongClick(adapterView, view, i17, j17);
    }
}
