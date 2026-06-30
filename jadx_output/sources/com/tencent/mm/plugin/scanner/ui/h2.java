package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public class h2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159559d;

    public h2(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI) {
        this.f159559d = scanTranslationCaptureUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI = this.f159559d;
        zo.e.g(scanTranslationCaptureUI);
        scanTranslationCaptureUI.finish();
    }
}
