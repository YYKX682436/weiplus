package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.d f143347d;

    public c(com.tencent.mm.plugin.label.ui.searchContact.d dVar) {
        this.f143347d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/searchContact/ContactDataItem$fillingViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.storage.z3 z3Var = this.f143347d.f143354m;
        intent.putExtra("Contact_User", z3Var != null ? z3Var.d1() : null);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 62);
        j45.l.j(view.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/searchContact/ContactDataItem$fillingViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
