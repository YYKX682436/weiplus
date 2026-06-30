package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSelectAmountView f153304d;

    public i0(com.tencent.mm.plugin.product.ui.MallProductSelectAmountView mallProductSelectAmountView) {
        this.f153304d = mallProductSelectAmountView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.MallProductSelectAmountView mallProductSelectAmountView = this.f153304d;
        int i17 = mallProductSelectAmountView.f153213m;
        if (i17 + 1 > mallProductSelectAmountView.f153210g) {
            com.tencent.mm.plugin.product.ui.k0 k0Var = mallProductSelectAmountView.f153214n;
            if (k0Var != null) {
                ((com.tencent.mm.plugin.product.ui.n0) k0Var).b(i17, mallProductSelectAmountView.f153211h);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mallProductSelectAmountView.f153213m = i17 + 1;
        if (mallProductSelectAmountView.a()) {
            mallProductSelectAmountView.f153207d.setText("" + mallProductSelectAmountView.f153213m);
        }
        com.tencent.mm.plugin.product.ui.k0 k0Var2 = mallProductSelectAmountView.f153214n;
        if (k0Var2 != null) {
            ((com.tencent.mm.plugin.product.ui.n0) k0Var2).a(mallProductSelectAmountView.f153213m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
