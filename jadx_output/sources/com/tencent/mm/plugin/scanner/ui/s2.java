package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159630d;

    public s2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159630d = scanTranslationCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159630d;
        scanTranslationCaptureUI.f159352f.n(scanTranslationCaptureUI);
        scanTranslationCaptureUI.N.f59746e = (int) (java.lang.System.currentTimeMillis() - scanTranslationCaptureUI.P[0]);
        scanTranslationCaptureUI.N.f59745d = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
