package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.t3 f207153d;

    public r3(com.tencent.mm.ui.contact.t3 t3Var) {
        this.f207153d = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/EnterpriseBizViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enterprise_from_scene", 2);
        intent.putExtra("enterprise_biz_name", this.f207153d.f207191e);
        j45.l.j(view.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/contact/EnterpriseBizViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
