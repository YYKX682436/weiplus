package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSubmitUI f153274d;

    public b1(com.tencent.mm.plugin.product.ui.MallProductSubmitUI mallProductSubmitUI) {
        this.f153274d = mallProductSubmitUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.w wVar = this.f153274d.f153246y;
        wVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("launch_from_webview", true);
        j45.l.o(wVar.f153364d, "address", ".ui.WalletSelectAddrUI", intent, 1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
