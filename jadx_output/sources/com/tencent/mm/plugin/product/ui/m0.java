package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class m0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI f153315d;

    public m0(com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI) {
        this.f153315d = mallProductSelectSkuUI;
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
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.util.Pair pair = (android.util.Pair) view.getTag();
        com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI = this.f153315d;
        wq3.j jVar = mallProductSelectSkuUI.f153224p;
        java.lang.String str = (java.lang.String) pair.first;
        java.lang.String str2 = (java.lang.String) pair.second;
        java.util.Map map = jVar.f448562o;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        if (!hashMap.containsKey(str) || !((java.lang.String) hashMap.get(str)).equals(str2)) {
            hashMap.put(str, str2);
            java.lang.String m17 = wq3.j.m(map);
            jVar.f448554g = m17;
            java.util.Map map2 = jVar.f448561n;
            if (map2 != null) {
                jVar.f448565r = (wq3.l) ((java.util.HashMap) map2).get(m17);
            }
            mallProductSelectSkuUI.f153226r = r2;
            mallProductSelectSkuUI.T6();
            yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
        hashMap.remove(str);
        java.lang.String m18 = wq3.j.m(map);
        jVar.f448554g = m18;
        java.util.Map map3 = jVar.f448561n;
        jVar.f448565r = map3 != null ? (wq3.l) ((java.util.HashMap) map3).get(m18) : null;
        jVar.v();
        r2 = jVar.f448565r;
        mallProductSelectSkuUI.f153226r = r2;
        mallProductSelectSkuUI.T6();
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
