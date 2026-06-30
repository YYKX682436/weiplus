package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.z1 f192027d;

    public u1(com.tencent.mm.pluginsdk.ui.z1 z1Var, com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
        this.f192027d = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f192027d.f192104e;
        java.lang.String str = (java.lang.String) view.getTag();
        int i17 = com.tencent.mm.pluginsdk.ui.MultiSelectContactView.f189783x;
        multiSelectContactView.g(str, true, true);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
