package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class y6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f207261d;

    public y6(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f207261d = onlyChatContactMgrUI;
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
        yj0.a.b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f207261d;
        com.tencent.mm.ui.contact.item.d item = onlyChatContactMgrUI.f206503e.getItem(i17);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
        com.tencent.mm.ui.contact.j7 j7Var = onlyChatContactMgrUI.f206503e;
        if (j7Var.f207078f) {
            java.util.LinkedList linkedList = (java.util.LinkedList) j7Var.f206966r;
            if (linkedList.contains(str)) {
                linkedList.remove(str);
            } else {
                linkedList.add(str);
            }
            j7Var.notifyDataSetChanged();
            if (((java.util.LinkedList) onlyChatContactMgrUI.f206503e.f206966r).size() > 0) {
                onlyChatContactMgrUI.f206509n.setText(onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489881ec) + "(" + ((java.util.LinkedList) onlyChatContactMgrUI.f206503e.f206966r).size() + ")");
                onlyChatContactMgrUI.f206509n.setEnabled(true);
            } else {
                onlyChatContactMgrUI.f206509n.setText(onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489881ec));
                onlyChatContactMgrUI.f206509n.setEnabled(false);
            }
        } else {
            if (com.tencent.mm.storage.z3.k4(str)) {
                android.content.Intent intent = new android.content.Intent(onlyChatContactMgrUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.contact.AddressUI.class);
                intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
                com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI2 = this.f207261d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(onlyChatContactMgrUI2, arrayList2.toArray(), "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                onlyChatContactMgrUI2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(onlyChatContactMgrUI2, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", 3);
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
            if (str != null && str.length() > 0) {
                j45.l.j(onlyChatContactMgrUI.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
