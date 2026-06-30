package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153310d;

    public k1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153310d = mallProductUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.w wVar = this.f153310d.f153262w;
        com.tencent.mm.wallet_core.ui.r1.d0(wVar.f153364d, wVar.f153367g.j());
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
