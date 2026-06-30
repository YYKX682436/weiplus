package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductReceiptUI f153295d;

    public h0(com.tencent.mm.plugin.product.ui.MallProductReceiptUI mallProductReceiptUI) {
        this.f153295d = mallProductReceiptUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductReceiptUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.MallProductReceiptUI mallProductReceiptUI = this.f153295d;
        wq3.k kVar = mallProductReceiptUI.f153203e;
        ((java.util.ArrayList) kVar.f448568a).clear();
        kVar.a();
        mallProductReceiptUI.f153206h.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductReceiptUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
