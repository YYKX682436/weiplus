package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159564d;

    public i3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159564d = scanTranslationResultUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI.G;
        com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI = this.f159564d;
        scanTranslationResultUI.a7();
        db5.e1.t(scanTranslationResultUI.getContext(), scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.cen), scanTranslationResultUI.getResources().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.scanner.ui.h3(scanTranslationResultUI));
    }
}
