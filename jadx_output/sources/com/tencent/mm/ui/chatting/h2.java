package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class h2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChatFooterCustom f201631d;

    public h2(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom) {
        this.f201631d = chatFooterCustom;
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
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustom$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f201631d;
        chatFooterCustom.onClick(view);
        if (com.tencent.mm.storage.z3.L3(chatFooterCustom.f198179s)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", chatFooterCustom.f198179s);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(chatFooterCustom.E)));
            hashMap.put("enter_sessionid", chatFooterCustom.D);
            hashMap.put("item_index", java.lang.Integer.valueOf(i17));
            hashMap.put("view_id", "yuanbao_menu_item");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
