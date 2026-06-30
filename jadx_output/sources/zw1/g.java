package zw1;

/* loaded from: classes9.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillListUI f476632d;

    public g(com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI) {
        this.f476632d = collectBillListUI;
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
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectBillListUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 < 0 || i17 >= adapterView.getAdapter().getCount()) {
            yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f476632d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.collect.ui.CollectBillUI.class);
        ww1.n1 n1Var = (ww1.n1) adapterView.getItemAtPosition(i17);
        if (n1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CollectBillListUI", "invaild record: %d", java.lang.Integer.valueOf(i17));
            yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        intent.putExtra("key_type", n1Var.f450248a);
        intent.putExtra("key_timestamp", n1Var.f450249b);
        intent.putExtra("key_from_scene", 2);
        com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI = this.f476632d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(collectBillListUI, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        collectBillListUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(collectBillListUI, "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillListUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
