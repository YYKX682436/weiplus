package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class l9 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207856d;

    public l9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207856d = openImKefuServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207856d;
        com.tencent.mm.ui.conversation.h8 h8Var = openImKefuServiceConversationFmUI.f207402g;
        openImKefuServiceConversationFmUI.f207404i = h8Var != null ? (com.tencent.mm.storage.l4) h8Var.getItem(i17) : null;
        com.tencent.mm.storage.l4 l4Var = openImKefuServiceConversationFmUI.f207404i;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        if (h17 == null) {
            h17 = "";
        }
        openImKefuServiceConversationFmUI.f207403h = h17;
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI2 = this.f207856d;
        rl5.r rVar = openImKefuServiceConversationFmUI2.f207406n;
        if (rVar != null) {
            rVar.g(view, i17, j17, openImKefuServiceConversationFmUI2, openImKefuServiceConversationFmUI2.f207411s, openImKefuServiceConversationFmUI2.f207407o, openImKefuServiceConversationFmUI2.f207408p);
        }
        com.tencent.mm.ui.report.k0.b(5, openImKefuServiceConversationFmUI.f207403h, openImKefuServiceConversationFmUI.f207404i);
        return true;
    }
}
