package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class sa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129800d;

    public sa(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI) {
        this.f129800d = finderModifyNameUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (hz2.d.f286313a.a("personalInfo")) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderModifyNameUI", "doClick create contact btn");
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f129800d;
        android.widget.EditText editText = finderModifyNameUI.f128629u;
        if (editText == null) {
            kotlin.jvm.internal.o.o("edit");
            throw null;
        }
        java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
        ya2.b2 b2Var = finderModifyNameUI.G;
        if (kotlin.jvm.internal.o.b(obj, b2Var != null ? b2Var.w0() : null)) {
            finderModifyNameUI.finish();
        } else {
            int i17 = finderModifyNameUI.H;
            if (i17 == 1) {
                java.lang.String t17 = r26.i0.t(finderModifyNameUI.E, finderModifyNameUI.F, obj, true);
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(finderModifyNameUI);
                u1Var.g(t17);
                u1Var.a(true);
                u1Var.n(finderModifyNameUI.getString(com.tencent.mm.R.string.f491315cq4));
                u1Var.j(finderModifyNameUI.getString(com.tencent.mm.R.string.f491316cq5));
                u1Var.l(new com.tencent.mm.plugin.finder.ui.ra(finderModifyNameUI, obj));
                u1Var.q(false);
            } else if (i17 == 2) {
                com.tencent.mm.plugin.finder.ui.FinderModifyNameUI.c7(finderModifyNameUI, obj);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderModifyNameUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
