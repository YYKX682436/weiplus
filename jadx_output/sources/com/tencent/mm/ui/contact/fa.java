package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class fa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206709d;

    public fa(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206709d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206709d;
        intent.setClassName(selectContactUI, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        boolean d17 = com.tencent.mm.ui.contact.i5.d(selectContactUI.D, 16384);
        intent.putExtra("group_select_need_result", d17);
        if (!d17) {
            com.tencent.mm.ui.contact.SelectContactUI selectContactUI2 = this.f206709d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(selectContactUI2, arrayList2.toArray(), "com/tencent/mm/ui/contact/SelectContactUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            selectContactUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(selectContactUI2, "com/tencent/mm/ui/contact/SelectContactUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (selectContactUI.U == 14) {
            intent.putExtra("group_multi_select", true);
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(selectContactUI.E7(true), ","));
            intent.putExtra("max_limit_num", selectContactUI.getIntent().getIntExtra("max_limit_num", 9));
            selectContactUI.startActivityForResult(intent, 4);
        } else {
            selectContactUI.startActivityForResult(intent, 0);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
