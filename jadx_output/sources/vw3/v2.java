package vw3;

/* loaded from: classes5.dex */
public final class v2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI f441157d;

    public v2(com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI) {
        this.f441157d = repairerMagicBootsUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMagicBootsUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMagicBootsUI repairerMagicBootsUI = this.f441157d;
        vw3.q2 q2Var = repairerMagicBootsUI.e;
        if (q2Var == null) {
            kotlin.jvm.internal.o.o("listAdapter");
            throw null;
        }
        java.lang.String str = (java.lang.String) q2Var.f441081e.get(i17);
        dp.a.makeText(repairerMagicBootsUI.getContext(), "start check " + str, 0).show();
        com.tencent.mm.plugin.magicbrush.s4 s4Var = (com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        ((com.tencent.mm.plugin.magicbrush.s7) s4Var).wi(lowerCase, "", false, new vw3.u2(repairerMagicBootsUI));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMagicBootsUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
