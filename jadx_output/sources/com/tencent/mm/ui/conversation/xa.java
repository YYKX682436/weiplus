package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class xa implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208248e;

    public xa(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI, java.lang.String str) {
        this.f208248e = serviceNotifyConversationUI;
        this.f208247d = str;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI = this.f208248e;
        serviceNotifyConversationUI.f207418g = (com.tencent.mm.storage.l4) serviceNotifyConversationUI.f207417f.getItem(i17);
        serviceNotifyConversationUI.f207421m = serviceNotifyConversationUI.f207418g.h1();
        com.tencent.mm.storage.l4 l4Var = serviceNotifyConversationUI.f207418g;
        if (l4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceNotifyConversationUI", "user should not be null. position:%d, size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(serviceNotifyConversationUI.f207417f.getCount()));
            serviceNotifyConversationUI.f207417f.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(serviceNotifyConversationUI, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
        if (te5.s1.f418747a.a()) {
            java.lang.String charSequence = view.getTag() instanceof com.tencent.mm.ui.conversation.n2 ? ((com.tencent.mm.ui.conversation.n2) view.getTag()).f207886c.getText().toString() : null;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                charSequence = cm5.k.b(l4Var.h1(), l4Var.j(), view.getContext());
            }
            intent.putExtra("key_notify_message_title", charSequence);
        }
        intent.putExtra("Chat_User", com.tencent.mm.sdk.platformtools.t8.K0(l4Var.W0()) ? l4Var.h1() : l4Var.W0());
        intent.putExtra("key_notify_message_real_username", l4Var.h1());
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", serviceNotifyConversationUI.f207418g.d1());
        intent.putExtra("biz_click_item_position", i17 + 1);
        intent.putExtra("container_enter_scene", 1);
        intent.putExtra("KOpenArticleSceneFromScene", 92);
        intent.putExtra("specific_chat_from_scene", 6);
        intent.putExtra("service_notify_session_id", this.f208247d);
        com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI2 = this.f208248e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(serviceNotifyConversationUI2, arrayList2.toArray(), "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceNotifyConversationUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(serviceNotifyConversationUI2, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        serviceNotifyConversationUI.f207417f.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21825, 5, l4Var.h1(), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, null, 0, 0, 0, java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.viewitems.qg.c(l4Var.h1())), te5.v1.f418758b);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
