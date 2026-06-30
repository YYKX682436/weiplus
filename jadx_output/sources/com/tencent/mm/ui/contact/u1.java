package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class u1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207203d;

    public u1(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f207203d = contactRemarkInfoModUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ContactRemarkInfoModUI$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f207203d.getContext(), view);
        rVar.f397351u = new com.tencent.mm.ui.contact.s1(this);
        rVar.f397354x = new com.tencent.mm.ui.contact.t1(this);
        rVar.m();
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/ContactRemarkInfoModUI$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
