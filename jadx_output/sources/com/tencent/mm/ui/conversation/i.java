package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class i implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207733d;

    public i(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f207733d = appBrandServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.o2 o2Var;
        com.tencent.mm.storage.l4 l4Var;
        com.tencent.mm.ui.tools.s6 s6Var;
        com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI = this.f207733d;
        o2Var = appBrandServiceConversationFmUI.adapter;
        appBrandServiceConversationFmUI.conversation = (com.tencent.mm.storage.l4) o2Var.getItem(i17);
        l4Var = appBrandServiceConversationFmUI.conversation;
        appBrandServiceConversationFmUI.talker = l4Var.h1();
        s6Var = appBrandServiceConversationFmUI.contextMenuHelper;
        com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI2 = this.f207733d;
        s6Var.b(view, i17, j17, appBrandServiceConversationFmUI2, appBrandServiceConversationFmUI2);
        return true;
    }
}
