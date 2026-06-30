package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f173046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f173047e;

    public k1(android.widget.Button button, com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI) {
        this.f173046d = button;
        this.f173047e = bindGuardianUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = this.f173046d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(button.getContext());
        com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI = this.f173047e;
        u1Var.u(bindGuardianUI.getString(com.tencent.mm.R.string.jrd));
        u1Var.g(bindGuardianUI.getString(com.tencent.mm.R.string.jrc));
        u1Var.m(com.tencent.mm.R.string.jre);
        u1Var.k(button.getContext().getResources().getColor(com.tencent.mm.R.color.f479482a31));
        u1Var.b(new com.tencent.mm.plugin.teenmode.ui.j1(bindGuardianUI));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
