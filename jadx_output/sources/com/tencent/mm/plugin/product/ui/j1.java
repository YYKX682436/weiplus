package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class j1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153308d;

    public j1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153308d = mallProductUI;
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
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.product.ui.i iVar = (com.tencent.mm.plugin.product.ui.i) view.getTag();
        int i18 = iVar.f153302f;
        com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI = this.f153308d;
        if (i18 == 2) {
            wq3.t tVar = mallProductUI.f153261v.f448549b;
            java.util.LinkedList linkedList = tVar.f448599e.f456064i;
            if (linkedList != null && linkedList.size() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = tVar.f448599e.f456064i.iterator();
                while (it.hasNext()) {
                    arrayList2.add((java.lang.String) it.next());
                }
                iVar.f153303g = arrayList2;
            }
        }
        mallProductUI.f153257r.a(mallProductUI, view, i17);
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
