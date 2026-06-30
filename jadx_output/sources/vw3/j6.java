package vw3;

/* loaded from: classes5.dex */
public final class j6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f441004d;

    public j6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI) {
        this.f441004d = repairerUDRUI;
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
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUDRUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI = this.f441004d;
        vw3.e6 e6Var = repairerUDRUI.e;
        if (e6Var == null) {
            kotlin.jvm.internal.o.o("listAdapter");
            throw null;
        }
        java.lang.String str = (java.lang.String) e6Var.f440943e.get(i17);
        dp.a.makeText(repairerUDRUI.getContext(), "start check " + str, 0).show();
        ea5.l wi6 = ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).wi(str);
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c(str);
        java.util.LinkedList linkedList = qVar.f217549f;
        java.util.RandomAccess parameter = wi6 != null ? wi6.getParameter() : null;
        if (parameter == null) {
            parameter = kz5.p0.f313996d;
        }
        linkedList.addAll(parameter);
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new vw3.i6(repairerUDRUI));
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUDRUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
