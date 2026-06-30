package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI f197957d;

    public b(com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f197957d = bizChatConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f197957d;
        android.content.Intent intent = new android.content.Intent(bizChatConversationFmUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatSearchUI.class);
        intent.putExtra("enterprise_biz_name", bizChatConversationFmUI.f197903m);
        intent.putExtra("biz_chat_search_scene", 1);
        intent.putExtra("biz_chat_search_text", "");
        intent.addFlags(67108864);
        com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI2 = this.f197957d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bizChatConversationFmUI2, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bizChatConversationFmUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(bizChatConversationFmUI2, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$12", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
