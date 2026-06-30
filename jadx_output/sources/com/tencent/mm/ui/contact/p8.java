package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class p8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.s8 f207097d;

    public p8(com.tencent.mm.ui.contact.s8 s8Var) {
        this.f207097d = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.u8 u8Var = this.f207097d.f207175e;
        if (u8Var != null) {
            u8Var.onFinish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
