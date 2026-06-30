package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes3.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.r1 f158989d;

    public q1(com.tencent.mm.plugin.scanner.model.r1 r1Var) {
        this.f158989d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/model/ScanInfoPageViewHelper$buildViewParams$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.model.u uVar = this.f158989d.f159000a;
        if (uVar != null) {
            ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) uVar).x7(12);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/model/ScanInfoPageViewHelper$buildViewParams$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
