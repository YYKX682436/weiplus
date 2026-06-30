package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f152228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152229e;

    public z0(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI, android.view.View view) {
        this.f152229e = nearbySayHiListUI;
        this.f152228d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152229e;
        int i17 = nearbySayHiListUI.f152113g + 8;
        nearbySayHiListUI.f152113g = i17;
        com.tencent.mm.plugin.nearby.ui.n1 n1Var = nearbySayHiListUI.f152111e;
        n1Var.c();
        n1Var.f152187p = i17;
        n1Var.q();
        if (nearbySayHiListUI.f152114h <= nearbySayHiListUI.f152113g) {
            nearbySayHiListUI.f152112f.removeFooterView(this.f152228d);
            int i18 = nearbySayHiListUI.f152113g;
        }
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(7L);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
