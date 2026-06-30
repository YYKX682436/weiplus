package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.f0 f206655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.g0 f206656e;

    public d0(com.tencent.mm.ui.contact.g0 g0Var, com.tencent.mm.ui.contact.f0 f0Var) {
        this.f206656e = g0Var;
        this.f206655d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.f0 f0Var = this.f206655d;
        int ordinal = f0Var.ordinal();
        com.tencent.mm.ui.contact.g0 g0Var = this.f206656e;
        if (ordinal == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(g0Var.f206713d, "com.tencent.mm.ui.contact.ChatroomContactUI");
            android.content.Context context = g0Var.f206713d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (ordinal == 1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_label_click_source", 2);
            j45.l.j(g0Var.f206713d, "label", ".ui.ContactLabelManagerUI", intent2, null);
        } else if (ordinal == 2) {
            j45.l.j(g0Var.f206713d, "ipcall", ".ui.IPCallAddressUI", new android.content.Intent(), null);
        } else if (ordinal != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactEntranceView", "[cpan] unknow type for click. type:%s", f0Var);
        } else {
            android.content.Intent intent3 = new android.content.Intent(g0Var.f206713d, (java.lang.Class<?>) com.tencent.mm.ui.contact.OnlyChatContactMgrUI.class);
            android.content.Context context2 = g0Var.f206713d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context2, arrayList3.toArray(), "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
