package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206808d;

    public i9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206808d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!com.tencent.mm.sdk.platformtools.f9.ContactWeCom.k(view.getContext(), null)) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206808d;
        android.content.Intent intent = new android.content.Intent(selectContactUI.getIntent());
        intent.setClass(selectContactUI.getContext(), com.tencent.mm.ui.contact.OpenIMSelectContactUI.class);
        intent.removeExtra("titile");
        intent.putExtra("openim_appid", "3552365301");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : selectContactUI.R) {
            if (com.tencent.mm.storage.z3.m4(str)) {
                arrayList2.add(str);
            }
        }
        intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ","));
        selectContactUI.startActivityForResult(intent, 5);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
