package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159591d;

    public m3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159591d = scanTranslationResultUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.T6(this.f159591d);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
