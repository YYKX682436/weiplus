package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI f142943d;

    public m5(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI) {
        this.f142943d = iPCallUserProfileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI = this.f142943d;
        android.content.Intent intent = new android.content.Intent(iPCallUserProfileUI, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI.class);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCallUserProfileUI.f142734t)) {
            intent.putExtra("IPCallAllRecordUI_contactId", iPCallUserProfileUI.f142734t);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCallUserProfileUI.f142735u)) {
            intent.putExtra("IPCallAllRecordUI_phoneNumber", iPCallUserProfileUI.f142735u);
        }
        intent.putExtra("IPCallAllRecordUI_isSinglePhoneNumber", iPCallUserProfileUI.f142738x);
        com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI2 = this.f142943d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(iPCallUserProfileUI2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        iPCallUserProfileUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(iPCallUserProfileUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
