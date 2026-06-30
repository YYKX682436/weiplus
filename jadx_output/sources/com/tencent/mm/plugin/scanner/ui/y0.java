package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159818d;

    public y0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159818d = productUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159818d;
        e04.n3 n3Var = productUI.f159319q;
        if (n3Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_certificationurl)) {
            productUI.X6(10002, productUI.f159319q.field_certificationurl);
            productUI.g7(productUI.f159319q.field_certificationurl);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
