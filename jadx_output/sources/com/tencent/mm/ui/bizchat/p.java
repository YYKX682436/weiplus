package com.tencent.mm.ui.bizchat;

/* loaded from: classes8.dex */
public class p implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f197972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197973e;

    public p(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI, rl5.r rVar) {
        this.f197973e = bizChatConversationFmUI;
        this.f197972d = rVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        rl5.r rVar = this.f197972d;
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197973e;
        rVar.g(view, i17, j17, bizChatConversationFmUI, bizChatConversationFmUI.f197902i, bizChatConversationFmUI.f197909s, bizChatConversationFmUI.f197910t);
        return true;
    }
}
