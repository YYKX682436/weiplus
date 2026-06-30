package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129119d;

    public f4(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        this.f129119d = finderCreateContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$updateDistrict$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String string = this.f129119d.getString(com.tencent.mm.R.string.el7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
        u1Var.g(string);
        u1Var.m(com.tencent.mm.R.string.l_e);
        u1Var.a(true);
        u1Var.l(hz2.b.f286310a);
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI$updateDistrict$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
