package fp3;

/* loaded from: classes9.dex */
public class k implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderProductListUI f265313d;

    public k(com.tencent.mm.plugin.order.ui.MallOrderProductListUI mallOrderProductListUI) {
        this.f265313d = mallOrderProductListUI;
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
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderProductListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.order.ui.MallOrderProductListUI mallOrderProductListUI = this.f265313d;
        com.tencent.mm.plugin.order.model.ProductSectionItem productSectionItem = (com.tencent.mm.plugin.order.model.ProductSectionItem) ((java.util.ArrayList) mallOrderProductListUI.f152849f).get(i17);
        if (productSectionItem != null) {
            mallOrderProductListUI.getClass();
            if (!hp3.d.c(mallOrderProductListUI, productSectionItem.f152814i)) {
                hp3.d.b(mallOrderProductListUI, productSectionItem.f152815m);
            }
            hp3.d.d(java.lang.Boolean.FALSE, mallOrderProductListUI.f152851h, mallOrderProductListUI.f152850g, productSectionItem.f152810e, productSectionItem.f152815m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderProductListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
