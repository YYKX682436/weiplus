package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class u2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159654d;

    public u2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159654d = scanTranslationCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159654d;
        int i17 = scanTranslationCaptureUI.H;
        if (i17 == 3) {
            android.graphics.Bitmap bitmap = scanTranslationCaptureUI.f159364u;
            if (bitmap != null) {
                scanTranslationCaptureUI.c7(bitmap);
            }
            if (scanTranslationCaptureUI.I.equalsIgnoreCase("zh_CN")) {
                scanTranslationCaptureUI.f159358o.setImageResource(com.tencent.mm.R.raw.translation_result_chinese_highlighted);
            } else {
                scanTranslationCaptureUI.f159358o.setImageResource(com.tencent.mm.R.raw.translation_result_english_highlighted);
            }
            scanTranslationCaptureUI.H = 2;
            scanTranslationCaptureUI.N.f59751j++;
        } else if (i17 == 2) {
            android.graphics.Bitmap bitmap2 = scanTranslationCaptureUI.f159365v;
            if (bitmap2 != null) {
                scanTranslationCaptureUI.c7(bitmap2);
            }
            if (scanTranslationCaptureUI.I.equalsIgnoreCase("zh_CN")) {
                scanTranslationCaptureUI.f159358o.setImageResource(com.tencent.mm.R.drawable.f482187b81);
            } else {
                scanTranslationCaptureUI.f159358o.setImageResource(com.tencent.mm.R.drawable.f482189b83);
            }
            scanTranslationCaptureUI.H = 3;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
