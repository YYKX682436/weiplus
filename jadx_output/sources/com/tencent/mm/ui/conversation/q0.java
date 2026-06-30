package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class q0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI f207991d;

    public q0(com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f207991d = convBoxServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.o2 o2Var;
        com.tencent.mm.storage.l4 l4Var;
        int i18;
        int i19;
        com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f207991d;
        o2Var = convBoxServiceConversationFmUI.adapter;
        convBoxServiceConversationFmUI.conversation = (com.tencent.mm.storage.l4) o2Var.getItem(i17);
        l4Var = convBoxServiceConversationFmUI.conversation;
        convBoxServiceConversationFmUI.talker = l4Var.h1();
        rl5.r rVar = new rl5.r(convBoxServiceConversationFmUI.getContext());
        com.tencent.mm.ui.conversation.n0 n0Var = new com.tencent.mm.ui.conversation.n0(this, i17);
        com.tencent.mm.ui.conversation.p0 p0Var = new com.tencent.mm.ui.conversation.p0(this);
        i18 = convBoxServiceConversationFmUI.x_down;
        i19 = convBoxServiceConversationFmUI.y_down;
        rVar.g(view, i17, j17, n0Var, p0Var, i18, i19);
        return true;
    }
}
