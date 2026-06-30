package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class l1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153313d;

    public l1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153313d = mallProductUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        wq3.u uVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.product.ui.x0 x0Var = (com.tencent.mm.plugin.product.ui.x0) view.getTag();
        com.tencent.mm.plugin.product.ui.w wVar = this.f153313d.f153262w;
        wVar.getClass();
        if (x0Var != null && (uVar = x0Var.f153374f) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallProductUI", "goProductUI type : " + uVar.f448608c);
            int i18 = uVar.f448608c;
            android.app.Activity activity = wVar.f153364d;
            if (i18 == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", uVar.f448609d);
                com.tencent.mm.wallet_core.ui.r1.T(activity, intent);
            } else if (i18 == 1) {
                java.lang.String replace = uVar.f448610e.replace("product_id=", "");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_product_id", replace);
                intent2.putExtra("key_product_scene", 6);
                j45.l.j(activity, "mall", ".product.ui.MallProductUI", intent2, null);
                activity.finish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductUI$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
