package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207226d;

    public w2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI, com.tencent.mm.ui.contact.h2 h2Var) {
        this.f207226d = contactRemarkInfoModUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T1;
        this.f207226d.e7(false);
        yj0.a.h(this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$LabelEditOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
