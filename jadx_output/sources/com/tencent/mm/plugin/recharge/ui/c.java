package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class c implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.MallEditText f155146d;

    public c(com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText) {
        this.f155146d = mallEditText;
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
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/MallEditText$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = this.f155146d;
        mallEditText.f155097u = mallEditText.f155089m.getItem(i17);
        vs3.a aVar = mallEditText.f155097u;
        if (aVar != null) {
            java.lang.String str = aVar.f439875a;
            java.lang.String str2 = aVar.f439876b;
            mallEditText.setInput(aVar);
        }
        mallEditText.f155086g.dismissDropDown();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/MallEditText$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
