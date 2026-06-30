package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public class n2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159595d;

    public n2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159595d = scanTranslationCaptureUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159595d;
        scanTranslationCaptureUI.B = true;
        scanTranslationCaptureUI.finish();
    }
}
