package com.tencent.mm.ui.conversation;

/* loaded from: classes12.dex */
public final class n9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207905d;

    public n9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207905d = openImKefuServiceConversationFmUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent(this.f207905d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.fts.ui.FTSKefuBoxUI.class);
        intent.putExtra("box_search_type", 2);
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207905d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(openImKefuServiceConversationFmUI, arrayList.toArray(), "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initView$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        openImKefuServiceConversationFmUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(openImKefuServiceConversationFmUI, "com/tencent/mm/ui/conversation/OpenImKefuServiceConversationUI$OpenImKefuServiceConversationFmUI$initView$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 2L;
        kFContactSessionSearchLogStruct.f58544e = g23.j.f267931b;
        kFContactSessionSearchLogStruct.p(g23.j.f267933d);
        kFContactSessionSearchLogStruct.f58546g = g23.j.f267934e;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
        return true;
    }
}
