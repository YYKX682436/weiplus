package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.u0 f206917d;

    public p0(com.tencent.mm.ui.contact.item.u0 u0Var) {
        this.f206917d = u0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem$fillingViewItem$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.item.e1 e1Var = this.f206917d.C;
        if (e1Var != null) {
            e1Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/item/HeaderViewDataItem$HeaderViewItem$fillingViewItem$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
