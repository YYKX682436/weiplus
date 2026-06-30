package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public class l2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159585d;

    public l2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159585d = scanTranslationCaptureUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.S;
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159585d;
        scanTranslationCaptureUI.T6();
        scanTranslationCaptureUI.finish();
        scanTranslationCaptureUI.overridePendingTransition(0, 0);
    }
}
