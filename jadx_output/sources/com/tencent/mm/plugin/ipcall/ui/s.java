package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.w f142999d;

    public s(com.tencent.mm.plugin.ipcall.ui.w wVar) {
        this.f142999d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.tencent.mm.plugin.ipcall.ui.w wVar = this.f142999d;
            s83.c item = wVar.getItem(intValue);
            android.content.Intent intent = new android.content.Intent(wVar.f212608e, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.class);
            intent.putExtra("IPCallProfileUI_contactid", item.field_contactId);
            intent.putExtra("IPCallProfileUI_systemUsername", item.field_systemAddressBookUsername);
            intent.putExtra("IPCallProfileUI_wechatUsername", item.field_wechatUsername);
            android.content.Context context = wVar.f212608e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
