package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f173020d;

    public h1(com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI) {
        this.f173020d = bindGuardianUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.f172827h;
        this.f173020d.U6(false);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianUI$updateView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
