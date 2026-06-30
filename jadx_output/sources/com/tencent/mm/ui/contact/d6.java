package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class d6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f206665d;

    public d6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        this.f206665d = modRemarkNameUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ModRemarkNameUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.ModRemarkNameUI.V6(this.f206665d, 2);
        yj0.a.h(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
