package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f207217d;

    public v5(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI) {
        this.f207217d = modRemarkNameUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ModRemarkNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.contact.ModRemarkNameUI.f206466y1;
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f207217d;
        modRemarkNameUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) modRemarkNameUI.getContext(), 1, true);
        k0Var.f211872n = new com.tencent.mm.ui.contact.z5(modRemarkNameUI);
        k0Var.f211881s = new com.tencent.mm.ui.contact.a6(modRemarkNameUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
