package yw3;

/* loaded from: classes.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI f466887d;

    public t0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI) {
        this.f466887d = repairerDemoSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDemoSelectContactUI repairerDemoSelectContactUI = this.f466887d;
        kz5.p0 p0Var = kz5.p0.f313996d;
        ((com.tencent.mm.ui.bd) this.f466887d.startActivityForResult(((qd0.q0) e1Var).wi(repairerDemoSelectContactUI, "选择群成员", "", p0Var, p0Var))).f197877a = yw3.s0.f466872a;
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerDemoSelectContactUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
