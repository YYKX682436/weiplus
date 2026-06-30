package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159602d;

    public o3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159602d = scanTranslationResultUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.G;
        this.f159602d.W6();
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
