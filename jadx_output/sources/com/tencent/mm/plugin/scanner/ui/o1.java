package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanPassportUI f159600d;

    public o1(com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI) {
        this.f159600d = scanPassportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanPassportUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.scanner.ui.ScanPassportUI.f159343i;
        this.f159600d.T6();
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanPassportUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
