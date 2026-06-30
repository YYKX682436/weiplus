package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class ha implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206757d;

    public ha(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206757d = selectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SelectContactUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("privacy_from_select_contact_ui", true);
        intent.putExtra("option_button_wording_res_id", com.tencent.mm.R.string.f490459vn);
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206757d;
        intent.setClassName(selectContactUI, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        selectContactUI.startActivityForResult(intent, 7);
        selectContactUI.f206542e2 = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/ui/contact/SelectContactUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
