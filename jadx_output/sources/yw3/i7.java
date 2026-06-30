package yw3;

/* loaded from: classes11.dex */
public final class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI f466772d;

    public i7(com.tencent.mm.plugin.repairer.ui.demo.RepairerTextStatusShowConfigUI repairerTextStatusShowConfigUI) {
        this.f466772d = repairerTextStatusShowConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((we0.c1) ((xe0.f0) i95.n0.c(xe0.f0.class))).getClass();
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        java.util.Iterator it = ((kz5.h) ai4.a.f5119m).iterator();
        while (it.hasNext()) {
            L.G(ai4.b0.f5123a.c((ai4.a) it.next()), false);
        }
        for (int n17 = L.n(ai4.b0.f5123a.d()); -1 < n17; n17--) {
            L.B(ai4.b0.f5123a.b(n17), 0L);
        }
        L.A(ai4.b0.f5123a.d(), 0);
        L.A("V7_T2_P13_StateDailyReportTime_StatusAffDBTransfer_" + gm0.j1.b().h(), 0);
        android.widget.Toast.makeText(this.f466772d.getContext(), "done", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
