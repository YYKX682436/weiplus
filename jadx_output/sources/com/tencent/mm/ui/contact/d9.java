package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class d9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206668d;

    public d9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206668d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206668d;
        intent.setClassName(selectContactUI, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", false);
        selectContactUI.startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
