package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class o4 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.VcardContactUI f159603a;

    public o4(com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI) {
        this.f159603a = vcardContactUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI = this.f159603a;
        if (i17 == 0) {
            c01.sc.d().a(10238, 1);
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
            com.tencent.mm.plugin.scanner.ui.VcardContactUI.V6(vcardContactUI, intent);
            com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI2 = this.f159603a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(vcardContactUI2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            vcardContactUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(vcardContactUI2, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 != 1) {
            return;
        }
        c01.sc.d().a(10239, 1);
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent2.setType("vnd.android.cursor.item/person");
        com.tencent.mm.plugin.scanner.ui.VcardContactUI.V6(vcardContactUI, intent2);
        com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI3 = this.f159603a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(vcardContactUI3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        vcardContactUI3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(vcardContactUI3, "com/tencent/mm/plugin/scanner/ui/VcardContactUI$4", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
