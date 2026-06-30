package v73;

/* loaded from: classes8.dex */
public class m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433710d;

    public m(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f433710d = honeyPayCardManagerUI;
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
        yj0.a.b("com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        r45.v55 v55Var = (r45.v55) adapterView.getAdapter().getItem(i17);
        if (v55Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(v55Var.f387919f)) {
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433710d;
            com.tencent.mars.xlog.Log.i(honeyPayCardManagerUI.f142260d, "click item: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(v55Var.f387918e));
            com.tencent.mm.wallet_core.ui.r1.V(honeyPayCardManagerUI.getContext(), v55Var.f387919f, false);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 0, 0, 0, 1, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
