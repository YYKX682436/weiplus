package yw3;

/* loaded from: classes.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI f466932d;

    public y0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
        this.f466932d = repairerDemoSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd0.q0 q0Var = (qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class));
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f466932d;
        repairerDemoSelectContactUI.startActivityForResult(q0Var.Bi(repairerDemoSelectContactUI, "折叠的聊天", false, null), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
