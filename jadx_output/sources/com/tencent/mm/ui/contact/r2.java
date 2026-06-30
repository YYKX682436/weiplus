package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207152d;

    public r2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f207152d = contactRemarkInfoModUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f207152d;
        contactRemarkInfoModUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) contactRemarkInfoModUI.getContext(), 1, true);
        k0Var.f211872n = new com.tencent.mm.ui.contact.d2(contactRemarkInfoModUI);
        k0Var.f211881s = new com.tencent.mm.ui.contact.e2(contactRemarkInfoModUI);
        k0Var.v();
        contactRemarkInfoModUI.Z6();
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
