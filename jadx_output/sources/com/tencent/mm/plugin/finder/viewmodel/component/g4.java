package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f134463d;

    public g4(com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var) {
        this.f134463d = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        android.view.View view3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var = this.f134463d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = q4Var.f135658d;
        android.widget.CheckBox checkBox = null;
        android.view.View findViewById = (y1Var == null || (view3 = y1Var.f212027f) == null) ? null : view3.findViewById(com.tencent.mm.R.id.g4c);
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = q4Var.f135658d;
        if (y1Var2 != null && (view2 = y1Var2.f212027f) != null) {
            checkBox = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.g4b);
        }
        if (checkBox != null && checkBox.isChecked()) {
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(com.tencent.mm.plugin.finder.viewmodel.component.q4.f135656g);
            int k17 = (int) com.tencent.mm.vfs.w6.k(com.tencent.mm.plugin.finder.viewmodel.component.q4.f135656g);
            java.lang.String a17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1.a(p17, k17);
            java.lang.String str = (java.lang.String) com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.U1.get(a17);
            if ((a17.length() == 0) || str == null) {
                kotlin.jvm.internal.o.d(p17);
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                cq.k kVar = (cq.k) c17;
                java.lang.String str2 = com.tencent.mm.plugin.finder.viewmodel.component.q4.f135656g;
                androidx.lifecycle.y fragment = q4Var.getFragment();
                if (fragment == null) {
                    fragment = q4Var.getActivity();
                }
                cq.j1.j(kVar, str2, 1, p17, k17, fragment, new com.tencent.mm.plugin.finder.viewmodel.component.k4(q4Var), new com.tencent.mm.plugin.finder.viewmodel.component.m4(q4Var));
            } else {
                q4Var.Y6(str);
            }
            az2.f fVar = q4Var.f135659e;
            if (fVar != null) {
                fVar.b();
            }
            az2.f a18 = az2.c.a(az2.f.f16125d, q4Var.getContext(), q4Var.getContext().getString(com.tencent.mm.R.string.f490552yb), 500L, null, 8, null);
            q4Var.f135659e = a18;
            a18.a();
        } else {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(q4Var.getContext(), com.tencent.mm.R.anim.f477737y);
            if (findViewById != null) {
                findViewById.startAnimation(loadAnimation);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderBaseCreateAccountHalfScreenUIC$initView$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
