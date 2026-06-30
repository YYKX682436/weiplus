package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class j9 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207783d;

    public j9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207783d = openImKefuServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.conversation.h8 h8Var = this.f207783d.f207402g;
        com.tencent.mm.storage.l4 l4Var = h8Var != null ? (com.tencent.mm.storage.l4) h8Var.getItem(i17) : null;
        java.lang.String h17 = l4Var != null ? l4Var.h1() : null;
        if (h17 == null || h17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting username invalid, position: " + i17);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.conversation.h9(l4Var));
        com.tencent.mm.ui.conversation.u8 u8Var = com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.f207392n;
        com.tencent.mm.ui.conversation.BaseConversationUI ui6 = this.f207783d.f207287ui;
        kotlin.jvm.internal.o.f(ui6, "ui");
        u8Var.a(ui6, l4Var != null ? l4Var.h1() : null, true, true, com.tencent.mm.ui.conversation.i9.f207757d);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initData$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
