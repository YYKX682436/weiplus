package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159813d;

    public x0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159813d = productUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ProductUI.V6(this.f159813d);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
