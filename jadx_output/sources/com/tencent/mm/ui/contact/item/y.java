package com.tencent.mm.ui.contact.item;

/* loaded from: classes4.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.u f206945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f206946e;

    public y(com.tencent.mm.ui.contact.item.z zVar, com.tencent.mm.ui.contact.item.u uVar, android.content.Context context) {
        this.f206945d = uVar;
        this.f206946e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/item/ContactViewItemDelegate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.item.u uVar = this.f206945d;
        intent.putExtra("Contact_User", uVar.f206819z);
        intent.putExtra("Contact_Scene", 3);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(uVar.f206819z)) {
            j45.l.j(this.f206946e, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/item/ContactViewItemDelegate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
