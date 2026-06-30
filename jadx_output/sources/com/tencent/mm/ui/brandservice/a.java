package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class a implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198040d;

    public a(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198040d = brandServiceNotifyUI;
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
        yj0.a.b("com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198040d;
        brandServiceNotifyUI.f198023g = (com.tencent.mm.storage.l4) brandServiceNotifyUI.f198022f.getItem(i17);
        brandServiceNotifyUI.f198028o = brandServiceNotifyUI.f198023g.h1();
        com.tencent.mm.storage.l4 l4Var = brandServiceNotifyUI.f198023g;
        if (l4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceConversationUI", "user should not be null. position:%d, size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(brandServiceNotifyUI.f198022f.getCount()));
            brandServiceNotifyUI.f198022f.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(brandServiceNotifyUI, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
        intent.putExtra("Chat_User", l4Var.h1());
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", brandServiceNotifyUI.f198023g.d1());
        intent.putExtra("biz_click_item_position", i17 + 1);
        intent.putExtra("KOpenArticleSceneFromScene", 287);
        intent.putExtra("specific_chat_from_scene", 14);
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI2 = this.f198040d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(brandServiceNotifyUI2, arrayList2.toArray(), "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        brandServiceNotifyUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(brandServiceNotifyUI2, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.ui.brandservice.l lVar = brandServiceNotifyUI.f198022f;
        lVar.getClass();
        lVar.x(l4Var, ((com.tencent.mm.storage.m4) c01.d9.b().r()).J(l4Var), i17, true, view);
        yj0.a.h(this, "com/tencent/mm/ui/brandservice/BrandServiceNotifyUI$11", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
