package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.n1 f152176d;

    public l1(com.tencent.mm.plugin.nearby.ui.n1 n1Var) {
        this.f152176d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.n1 n1Var = this.f152176d;
        n1Var.f152192u.b();
        db5.e6 e6Var = n1Var.f152191t;
        if (e6Var != null) {
            e6Var.a(view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
