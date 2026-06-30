package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class z0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f143092d;

    public z0(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f143092d = iPCallContactUI;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f143092d;
        if (iPCallContactUI.f142552g.p(i17)) {
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        s83.c item = iPCallContactUI.f142552g.getItem(i17);
        if (item != null) {
            if (!iPCallContactUI.f142564v) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12767, 2);
            }
            android.content.Intent intent = new android.content.Intent(iPCallContactUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.class);
            intent.putExtra("IPCallProfileUI_contactid", item.field_contactId);
            intent.putExtra("IPCallProfileUI_systemUsername", item.field_systemAddressBookUsername);
            intent.putExtra("IPCallProfileUI_wechatUsername", item.field_wechatUsername);
            androidx.appcompat.app.AppCompatActivity context = iPCallContactUI.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
