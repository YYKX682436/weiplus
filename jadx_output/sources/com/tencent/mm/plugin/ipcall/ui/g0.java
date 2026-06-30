package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class g0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142831d;

    public g0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142831d = m0Var;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142831d;
        if (m0Var.f142930b.p(i17)) {
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (adapterView instanceof android.widget.ListView) {
            s83.l lVar = (s83.l) m0Var.f142930b.f142880q.get(i17 - ((android.widget.ListView) adapterView).getHeaderViewsCount());
            if (lVar == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            s83.c J0 = lVar.field_addressId > 0 ? com.tencent.mm.plugin.ipcall.model.r.wi().J0(lVar.field_addressId) : null;
            android.content.Intent intent = new android.content.Intent(m0Var.f142932d, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.class);
            if (J0 != null) {
                intent.putExtra("IPCallProfileUI_contactid", J0.field_contactId);
                intent.putExtra("IPCallProfileUI_systemUsername", J0.field_systemAddressBookUsername);
                intent.putExtra("IPCallProfileUI_wechatUsername", J0.field_wechatUsername);
            } else {
                intent.putExtra("IPCallProfileUI_phonenumber", lVar.field_phonenumber);
            }
            intent.putExtra("IPCallProfileUI_isNeedShowRecord", true);
            com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI = m0Var.f142932d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(iPCallAddressUI, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            iPCallAddressUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(iPCallAddressUI, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
