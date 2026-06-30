package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI f207819d;

    public l0(com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f207819d = convBoxServiceConversationFmUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.o2 o2Var;
        com.tencent.mm.storage.l4 l4Var;
        com.tencent.mm.ui.conversation.b3 b3Var;
        com.tencent.mm.storage.l4 l4Var2;
        com.tencent.mm.storage.l4 l4Var3;
        com.tencent.mm.ui.conversation.o2 o2Var2;
        com.tencent.mm.ui.conversation.o2 o2Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f207819d;
        o2Var = convBoxServiceConversationFmUI.adapter;
        convBoxServiceConversationFmUI.conversation = (com.tencent.mm.storage.l4) o2Var.getItem(i17);
        l4Var = convBoxServiceConversationFmUI.conversation;
        if (l4Var == null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            o2Var2 = convBoxServiceConversationFmUI.adapter;
            com.tencent.mars.xlog.Log.e("MicroMsg.ConvBoxServiceConversationFmUI", "user should not be null. position:%d, size:%d", valueOf, java.lang.Integer.valueOf(o2Var2.getCount()));
            o2Var3 = convBoxServiceConversationFmUI.adapter;
            o2Var3.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(l4Var.h1(), true) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConvBoxServiceConversationFmUI", "position=%s cont is null", java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (l4Var.I0() > 0) {
            l4Var.C1(0);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(l4Var, l4Var.h1());
        }
        if (l4Var.d2(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
            l4Var.e2(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(l4Var, l4Var.h1());
        }
        b3Var = convBoxServiceConversationFmUI.clickStatusController;
        l4Var2 = convBoxServiceConversationFmUI.conversation;
        java.lang.String h17 = l4Var2.h1();
        l4Var3 = convBoxServiceConversationFmUI.conversation;
        b3Var.a(h17, view, new com.tencent.mm.ui.conversation.r0(view, l4Var3.h1()));
        ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).Vi(l4Var.h1());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("specific_chat_from_scene", 7);
        bundle.putInt("KOpenArticleSceneFromScene", 93);
        bundle.putInt("chat_from_scene_for_group_chats", 3);
        bundle.putInt("Main_IndexInSessionList", i17);
        bundle.putInt("Main_UnreadCount", l4Var.d1());
        bundle.putInt("chat_from_scene", 0);
        convBoxServiceConversationFmUI.f207287ui.startChatting(l4Var.h1(), bundle, true);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
