package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView f160009d;

    public x0(com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView scanTranslationMaskView) {
        this.f160009d = scanTranslationMaskView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView scanTranslationMaskView = this.f160009d;
        xy3.a scanCamera = scanTranslationMaskView.getScanCamera();
        if (scanCamera != null) {
            scanCamera.n(scanTranslationMaskView);
        }
        scanTranslationMaskView.A = (int) (java.lang.System.currentTimeMillis() - scanTranslationMaskView.f159919z[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
