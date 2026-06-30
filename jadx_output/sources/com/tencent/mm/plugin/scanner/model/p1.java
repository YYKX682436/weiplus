package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes3.dex */
public final class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.r1 f158974d;

    public p1(com.tencent.mm.plugin.scanner.model.r1 r1Var) {
        this.f158974d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/model/ScanInfoPageViewHelper$buildViewParams$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.model.u uVar = this.f158974d.f159000a;
        if (uVar != null) {
            ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) uVar).x7(12);
        }
        com.tencent.mm.plugin.scanner.model.h2.o(6, false, -1, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/model/ScanInfoPageViewHelper$buildViewParams$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
